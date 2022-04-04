package Dao;

import Conexion.Conexion;
import Modelo.Administrador;
import Modelo.Transportista;
import Modelo.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Andre Mujica
 **/
public class DBUsuarioDAO implements UsuarioDAO {

    private final Conexion conn = Conexion.getInstance();

    @Override
    public Usuario exists(String usuario, String contrasenia) throws UserException {
        PreparedStatement ps;
        ResultSet rs;
        Usuario user = null;

        try {
            ps = conn.getConn().prepareStatement("select idUsuario,nombres,apellidos,correo,DNI,tipoUsuario from Tbl_Usuario where usuario =? and contrasenia =?");
            ps.setString(1, usuario);
            ps.setString(2, contrasenia);
            rs = ps.executeQuery();

            if(rs.next()){ //Existe el usuario
                int tipo = rs.getInt(6);

                if(tipo == 2){ //Transportista
                    TransportistaDAO cons = new DBTransportistaDAO();
                    user = new Transportista(rs.getInt(1), usuario, contrasenia, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), tipo, cons.estado(rs.getInt(1)));
                }
                else{
                    user = new Administrador(rs.getInt(1), usuario, contrasenia, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), tipo);
                }
            }
            else{
                throw new UserException("No existen un usuario con las credenciales.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            conn.desconectar();
        }


        return user;
    }

    @Override
    public int leerIdUsuario(String username) {
        PreparedStatement ps;
        ResultSet rs;
        int key = 0;

        try {
            ps = conn.getConn().prepareStatement("select idUsuario from Tbl_Usuario where usuario = ?");
            ps.setString(1, username);

            rs = ps.executeQuery();

            if(rs.next()){
                key = rs.getInt(1);
            }
            else{
                System.out.println("No existe un Trabajador con ese usuario");
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally{
            conn.desconectar();
        }

        return key;
    }

    @Override
    public void existsByUsername(String username) throws UserException {
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conn.getConn().prepareStatement("SELECT COUNT(*) FROM Tbl_Usuario where usuario = ?");
            ps.setString(1, username);

            rs = ps.executeQuery();
            rs.next();

            if(rs.getInt(1) == 1){
                throw new UserException("Ya existe un Trabajador con ese nombre de usuario");
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally{
            conn.desconectar();
        }

    }

    @Override
    public void existsByEmail(String email) throws UserException {
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conn.getConn().prepareStatement("SELECT COUNT(*) FROM Tbl_Usuario where correo = ?");
            ps.setString(1, email);

            rs = ps.executeQuery();
            rs.next();

            if(rs.getInt(1) == 1){
                throw new UserException("Ya existe un usuario registrado con el correo.");
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally{
            conn.desconectar();
        }

    }

    @Override
    public void crear(Usuario usuario) throws UserException {
        PreparedStatement ps;

        try {
            ps = conn.getConn().prepareStatement("INSERT INTO Tbl_Usuario(usuario,contrasenia,nombres,apellidos,correo,DNI,tipoUsuario) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getContrasenia());
            ps.setString(3, usuario.getNombres());
            ps.setString(4, usuario.getApellidos());
            ps.setString(5, usuario.getCorreo());
            ps.setString(6, usuario.getDNI());
            ps.setInt(7, usuario.getIdTipo());

            if(ps.executeUpdate() > 0){
                usuario.setIdUsuario(this.leerIdUsuario(usuario.getUsuario()));
            } else{
                throw new UserException("El usuario ya se encuentra registrado.");
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally{
            conn.desconectar();
        }

    }

    @Override
    public Usuario obtener(int id) {
        return null;
    }

    @Override
    public boolean actualizar(Usuario usuario) {
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        return false;
    }
}

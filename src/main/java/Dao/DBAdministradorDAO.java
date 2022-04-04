package Dao;

import Conexion.Conexion;
import Modelo.Administrador;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Andre Mujica
 **/
public class DBAdministradorDAO implements IRepositorio<Administrador> {

    private final Conexion conn = Conexion.getInstance();

    @Override
    public void crear(Administrador administrador) throws UserException {
        PreparedStatement ps;

        try {
            ps = conn.getConn().prepareStatement("insert into Tbl_Administrador(idUsuario) values(?)");
            ps.setInt(1, administrador.getIdUsuario());

            if(ps.executeUpdate() <= 0){
                throw new UserException("Error al crear el administrador");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            conn.desconectar();
        }
    }

    @Override
    public Administrador obtener(int id) {
        return null;
    }

    @Override
    public boolean actualizar(Administrador administrador) {
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        return false;
    }
}

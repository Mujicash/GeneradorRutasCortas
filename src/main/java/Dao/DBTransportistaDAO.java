package Dao;

import Conexion.Conexion;
import Modelo.Transportista;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * @author Andre Mujica
 **/
public class DBTransportistaDAO implements TransportistaDAO {

    private final Conexion conn = Conexion.getInstance();

    @Override
    public boolean estado(int idUsuario) {
        PreparedStatement ps;
        ResultSet rs;
        boolean habilitado = false;

        try{
            ps = conn.getConn().prepareStatement("select if(habilitado, 'true','false') from Tbl_Transportista where idUsuario = ?");
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();

            if(rs.next()){
                habilitado = rs.getBoolean(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            conn.desconectar();
        }

        return habilitado;
    }


    @Override
    public void crear(Transportista transportista) throws UserException {
        PreparedStatement ps;

        try {
            ps = conn.getConn().prepareStatement("insert into Tbl_Transportista(idUsuario,habilitado) values(?,?)");
            ps.setInt(1, transportista.getIdUsuario());
            ps.setBoolean(2, transportista.isHabilitado());

            if(ps.executeUpdate() < 0){
                throw new UserException("Error al registrar el transportista");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            conn.desconectar();
        }
    }

    @Override
    public Transportista obtener(int id) {
        return null;
    }

    @Override
    public boolean actualizar(Transportista transportista) {
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        return false;
    }
}

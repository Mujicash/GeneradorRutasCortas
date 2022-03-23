package Dao;

import Conexion.Conexion;

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


}

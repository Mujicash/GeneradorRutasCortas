
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author andre
 */
public class Conexion {
    
    public static Conexion instance; //Singleton
    private Connection conn;
    
    private Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //driver
            //conn = DriverManager.getConnection("jdbc:mysql://8.12.17.20:3306/Proyecto", "root", "rootxd");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Proyecto", "root", "2701");
            System.out.println("conexion exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized static Conexion getInstance(){
        
        if(instance == null){
            instance = new Conexion();
        }
        
        return instance;
    }

    public Connection getConn() {
        return conn;
    }
    
    public void desconectar(){
        instance = null;
    }
    
    
    public static void main(String[] args) {
        Conexion conn = Conexion.getInstance();
    }
}

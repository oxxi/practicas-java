/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetePrincipal;
import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Oxxi
 */
public class ConexionDB {
    
    public static Connection getConexion(){
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String server = "jdbc:mysql://localhost/mamepsa";
            String usuario = "root";
            String password = "";
            conexion = DriverManager.getConnection(server,usuario,password);
        } catch (ClassCastException e) {
            conexion = null;
            JOptionPane.showMessageDialog(null, "Error en el Controlador \n"+e);
        }catch(SQLException ex){
            conexion = null;
            JOptionPane.showMessageDialog(null, "Error en la consulta \n"+ex);
        }finally{
             return conexion;
        }
       
    }
}

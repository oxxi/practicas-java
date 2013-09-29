package paquetePrincipal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexionDB {
	
	@SuppressWarnings("finally")
	public static Connection getConnection(){
		Connection conexion = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String server = "jdbc:mysql://localhost/mamepsa";
			String usuario = "root";
			String password="";
			conexion = DriverManager.getConnection(server,usuario,password);
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e,"Error en el Driver "+e.getMessage(),JOptionPane.ERROR_MESSAGE);
			conexion = null;
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null, "Error en la Conexion " +ex.getMessage());
		}finally{
			return conexion;
		}
	}
	
	
}
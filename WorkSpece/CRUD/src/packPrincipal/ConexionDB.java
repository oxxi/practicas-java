package packPrincipal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexionDB {
	@SuppressWarnings("finally")
	public static Connection getConexion(){
		Connection conexion = null;
		try {
			//com.microsoft.sqlserver.jdbc.SQLServerDriver 
			//oracle.jdbc.OracleDriver
			Class.forName("com.mysql.jdbc.Driver");
			String server ="jdbc:mysql://localhost/";
			String usuario = "root";
			String password = "";
			conexion = DriverManager.getConnection(server,usuario,password);
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Error en el conector "+e.getMessage());
		} catch(SQLException ex){
			JOptionPane.showMessageDialog(null, "Erro al conectar "+ex.getMessage());
		}finally{
		return conexion;
		}
	}
}

package paquetePrincipal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Statement st = null;
		String consulta;
		Connection conn = ConexionDB.getConnection();
		if (conn!=null) {
			JOptionPane.showMessageDialog(null, "Se realizo la Conexion");
		}
		//crear el helper de consultas
		try {
			st = conn.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al crear el Statement "+e.getMessage());
		}
		//consulta insert
		try {
			consulta = "INSERT INTO `trabajadores` VALUES ('111-D','Jose','Ramos','12000',";
			consulta +="'2012-05-11');";
			System.out.println(consulta);
			st.executeUpdate(consulta);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta "+e.getMessage());
		}
	}
}

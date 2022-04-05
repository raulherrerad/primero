package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	public static Connection conectarBD() {
		
		// Parametros para la conexion a BD
				String user = "root";
				String password = "admin";
				String url = "jdbc:mysql://localhost:3306/campeonatogt3";
				// Conexion para acceder a BD
				Connection con = null;

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					// Nos conectamos a la Base de Datos
					con = DriverManager.getConnection(url, user, password);

				} catch (SQLException | ClassNotFoundException e) {

					e.printStackTrace();
				}

				return con;
	}
}

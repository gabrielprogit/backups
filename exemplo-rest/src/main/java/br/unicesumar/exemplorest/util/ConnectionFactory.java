package br.unicesumar.exemplorest.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static Connection conn;
	
	private ConnectionFactory() {
	}
	
	public static Connection openConnection() {
		try {
			if (conn == null || conn.isClosed()) {
				conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/4sads","postgres","unicesumar");
			}
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

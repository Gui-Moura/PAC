package br.com.atividade.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingleConnection {

	private static String url = "jdbc:mysql://127.0.0.1:3306/pac";
	private static String user = "root";
	private static String password = "";
	private static Connection connection = null;

	static {
		conectar();
	}

	public static void conectar() {

		try {
			if (connection == null) {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
				System.out.println("Conectado");
			}	
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("não conectou");
		}
	}

	public static Connection getConnection() {
		return connection;
	}

}

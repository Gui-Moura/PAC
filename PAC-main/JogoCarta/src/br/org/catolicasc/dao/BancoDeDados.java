package br.org.catolicasc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;

public class BancoDeDados {
	
	//private static Conexao db = null;
		private static Connection con = null; // RECEBE PARAMETROS P/ SE CONECTAR COM BD

		private static String user = null;
		private static String passwd = null;
		private static boolean conectado = false;

		public static boolean validaUser(JTextPane txtUsuario, JPasswordField txtSenha) {
			System.out.println(txtUsuario.getText());
			System.out.println(new String(txtSenha.getPassword()));

			user = txtUsuario.getText();
			passwd = new String(txtSenha.getPassword());

			//getInstance();

			try {
				// DRIVER
				Class.forName("com.mysql.jdbc.Driver");
				// ENDERECO DA BASE DE DADOS
				con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/endereco?useSSL=false", user, passwd); // localhost:3306
				
				conectado = true;
				JOptionPane.showMessageDialog(null, "Conectado");
				
			} catch (ClassNotFoundException e) {
				System.out.println("Erro");
				JOptionPane.showMessageDialog(null, "Erro ao conectar no Banco de Dados");
				((Throwable) e).printStackTrace();
				
				conectado = false;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return conectado;
		}

		// CONEXAO
		public static Connection getConnection() {

			return con;

		}

	}



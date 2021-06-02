package br.org.catolicasc.main;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.org.catolicasc.dao.BancoDeDados;
import br.org.catolicasc.view2.Login;

public class ProgramaPrincipal {
	
	private Connection con;
	private BancoDeDados banco;
	
	public ProgramaPrincipal() {
		con = banco.getConnection();
	}
	
	public  void teste(){
		try {
			String sql = "Select * from Cargo";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.executeQuery();
			
		}
			catch (SQLException e) {

				System.out.println("Falha ao cadastrar estado");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

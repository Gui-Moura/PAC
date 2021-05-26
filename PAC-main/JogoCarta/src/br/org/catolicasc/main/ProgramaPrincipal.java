package br.org.catolicasc.main;

import java.awt.EventQueue;

import br.org.catolicasc.view2.Login;

public class ProgramaPrincipal {
	
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

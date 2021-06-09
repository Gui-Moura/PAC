package br.com.atividade.main;

import java.awt.EventQueue;

import br.org.catolicasc.view2.Login;
import br.org.catolicasc.view2.Menu;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// CHAMA MENU PRINCIPAL
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}

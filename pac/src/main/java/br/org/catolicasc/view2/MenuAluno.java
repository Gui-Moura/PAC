package br.org.catolicasc.view2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class MenuAluno {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public MenuAluno() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		int auxNivel = 5;
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 215, 0));
		frame.setBounds(100, 100, 540, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 0, 522, 44);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPac = new JLabel("PAC");
		lblPac.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPac.setForeground(new Color(255, 215, 0));
		lblPac.setBackground(new Color(255, 215, 0));
		lblPac.setBounds(10, 19, 46, 14);
		panel.add(lblPac);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(255, 215, 0));
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBackground(new Color(255, 215, 0));
		lblNome.setBounds(383, 19, 76, 14);
		panel.add(lblNome);
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login = new Login();
				login.frame.setVisible(true);
				frame.dispose();
			}
		});
		lblSair.setForeground(new Color(255, 215, 0));
		lblSair.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSair.setBackground(new Color(255, 215, 0));
		lblSair.setBounds(466, 19, 46, 14);
		panel.add(lblSair);
		
		JLabel lblNvel = new JLabel("N\u00EDvel 01");
		lblNvel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNvel.setBounds(80, 94, 46, 14);
		frame.getContentPane().add(lblNvel);
		
		JLabel lblSul = new JLabel("Sul");
		lblSul.setHorizontalAlignment(SwingConstants.CENTER);
		lblSul.setBounds(80, 226, 46, 14);
		frame.getContentPane().add(lblSul);
		
		JLabel lblSudeste = new JLabel("Sudeste");
		lblSudeste.setHorizontalAlignment(SwingConstants.CENTER);
		lblSudeste.setBounds(224, 226, 46, 14);
		frame.getContentPane().add(lblSudeste);
		
		JLabel lblNvel_2 = new JLabel("N\u00EDvel 03");
		lblNvel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNvel_2.setBounds(386, 94, 46, 14);
		frame.getContentPane().add(lblNvel_2);
		
		JLabel lblCentrooeste = new JLabel("Centro-oeste");
		lblCentrooeste.setHorizontalAlignment(SwingConstants.CENTER);
		lblCentrooeste.setBounds(386, 226, 66, 14);
		frame.getContentPane().add(lblCentrooeste);
		
		JLabel lblNvel_3 = new JLabel("N\u00EDvel 04");
		lblNvel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNvel_3.setBounds(137, 306, 46, 14);
		frame.getContentPane().add(lblNvel_3);
		
		JLabel lblNvel_4 = new JLabel("N\u00EDvel 05");
		lblNvel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNvel_4.setBounds(342, 306, 46, 14);
		frame.getContentPane().add(lblNvel_4);
		
		JLabel lblNorte = new JLabel("Norte");
		lblNorte.setHorizontalAlignment(SwingConstants.CENTER);
		lblNorte.setBounds(137, 432, 46, 14);
		frame.getContentPane().add(lblNorte);
		
		JLabel lblNordeste = new JLabel("Nordeste");
		lblNordeste.setHorizontalAlignment(SwingConstants.CENTER);
		lblNordeste.setBounds(342, 432, 66, 14);
		frame.getContentPane().add(lblNordeste);
		
		JButton btnNordeste = new JButton("New button");
		btnNordeste.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Jogo jogo =  new Jogo();
				jogo.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNordeste.setEnabled(false);
		btnNordeste.setIcon(new ImageIcon("C:\\Users\\gui08\\Pictures\\mapa-nordeste.png"));
		btnNordeste.setBounds(310, 337, 107, 84);
		frame.getContentPane().add(btnNordeste);
		
		JButton btnNorte = new JButton("New button");
		btnNorte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Jogo jogo =  new Jogo();
				jogo.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNorte.setEnabled(false);
		btnNorte.setIcon(new ImageIcon("C:\\Users\\gui08\\Pictures\\mapa-norte.png"));
		btnNorte.setBounds(106, 337, 107, 84);
		frame.getContentPane().add(btnNorte);
		
		JButton btnSul = new JButton("New button");
		btnSul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Jogo jogo =  new Jogo();
				jogo.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSul.setBounds(42, 131, 107, 84);
		frame.getContentPane().add(btnSul);
		btnSul.setIcon(new ImageIcon("C:\\Users\\gui08\\Pictures\\mapa-sul.png"));
		
		JButton btnSudeste = new JButton("New button");
		btnSudeste.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Jogo jogo =  new Jogo();
				jogo.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSudeste.setEnabled(false);
		btnSudeste.setBounds(200, 131, 107, 84);
		frame.getContentPane().add(btnSudeste);
		btnSudeste.setIcon(new ImageIcon("C:\\Users\\gui08\\Pictures\\mapa-sudeste2.png"));
		
		
		JButton btnCentroOeste = new JButton("New button");
		btnCentroOeste.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Jogo jogo =  new Jogo();
				jogo.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCentroOeste.setEnabled(false);
		btnCentroOeste.setIcon(new ImageIcon("C:\\Users\\gui08\\Pictures\\mapa-centrooeste2.png"));
		btnCentroOeste.setBounds(353, 131, 107, 84);
		frame.getContentPane().add(btnCentroOeste);
		
		JLabel lblNvel_1 = new JLabel("N\u00EDvel 02");
		lblNvel_1.setBounds(224, 94, 46, 14);
		frame.getContentPane().add(lblNvel_1);
		lblNvel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		if(auxNivel == 2) {
			btnSudeste.setEnabled(true);
		}else if(auxNivel == 3) {
			btnCentroOeste.setEnabled(true);
			btnSudeste.setEnabled(true);
		}else if(auxNivel == 4){
			btnNorte.setEnabled(true);
			btnCentroOeste.setEnabled(true);
			btnSudeste.setEnabled(true);
		}else if(auxNivel == 5) {
			btnNordeste.setEnabled(true);
			btnNorte.setEnabled(true);
			btnCentroOeste.setEnabled(true);
			btnSudeste.setEnabled(true);
			
		}
	}
}

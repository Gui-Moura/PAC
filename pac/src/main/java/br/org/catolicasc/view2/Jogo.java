package br.org.catolicasc.view2;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import br.org.catolicasc.view2.Login;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class Jogo {
	
	public JFrame frame;

	/**
	 * Create the application.
	 */
	public Jogo() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 215, 0));
		frame.setBounds(100, 100, 540, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(220, 20, 60));
		panel_1.setBounds(0, 0, 534, 44);
		frame.getContentPane().add(panel_1);
		
		JLabel lblPac = new JLabel("PAC");
		lblPac.setForeground(new Color(255, 215, 0));
		lblPac.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPac.setBackground(new Color(255, 215, 0));
		lblPac.setBounds(10, 19, 46, 14);
		panel_1.add(lblPac);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(255, 215, 0));
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBackground(new Color(255, 215, 0));
		lblNome.setBounds(392, 19, 76, 14);
		panel_1.add(lblNome);
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login = new Login();
				login.frame.setVisible(true);
			}
		});
		lblSair.setForeground(new Color(255, 215, 0));
		lblSair.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSair.setBackground(new Color(255, 215, 0));
		lblSair.setBounds(478, 19, 46, 14);
		panel_1.add(lblSair);
		
		JLabel lblNewLabel = new JLabel("Nivel 1");
		lblNewLabel.setBounds(96, 136, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardEstado cardEstado = new CardEstado();
				cardEstado.frame.setVisible(true);
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\gui08\\Pictures\\pr.png"));
		lblNewLabel_1.setBounds(337, 92, 140, 102);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardEstado cardEstado = new CardEstado();
				cardEstado.frame.setVisible(true);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\gui08\\Pictures\\sc.png"));
		lblNewLabel_2.setBounds(367, 205, 116, 83);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardEstado cardEstado = new CardEstado();
				cardEstado.frame.setVisible(true);
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\gui08\\Pictures\\rs.png"));
		lblNewLabel_3.setBounds(252, 270, 175, 165);
		frame.getContentPane().add(lblNewLabel_3);
	}
}

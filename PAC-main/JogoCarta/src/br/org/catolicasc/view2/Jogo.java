package br.org.catolicasc.view2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Jogo extends JFrame{
	
	public Jogo() {
		setTitle("PAC");
		setSize(540,516);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		getContentPane().setLayout(null);
		setVisible(true);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(130, 175, 10, 10);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(250, 185, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(230, 260, 89, 23);
		getContentPane().add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(146, 336, 135, 20);
		getContentPane().add(textPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(220, 20, 60));
		panel_1.setBounds(0, 0, 434, 44);
		getContentPane().add(panel_1);
		
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
		lblNome.setBounds(313, 20, 76, 14);
		panel_1.add(lblNome);
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.setForeground(new Color(255, 215, 0));
		lblSair.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSair.setBackground(new Color(255, 215, 0));
		lblSair.setBounds(378, 20, 46, 14);
		panel_1.add(lblSair);
		
		
	
		}
		
	
	public static void main (String []args) {
		new Jogo();
	}
}

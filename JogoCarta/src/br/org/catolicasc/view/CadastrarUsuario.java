package br.org.catolicasc.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarUsuario extends JFrame{
	
	public CadastrarUsuario() {
		setTitle("PAC");
		setSize(1024,728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		getContentPane().setLayout(null);
		setVisible(true);
		
		int i = 1;
		
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
		
		if(i == 2) {
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(230, 336, 89, 23);
		getContentPane().add(btnNewButton_1);
	
		}
		
	}
	public static void main (String []args) {
		new CadastrarUsuario();
	}
}

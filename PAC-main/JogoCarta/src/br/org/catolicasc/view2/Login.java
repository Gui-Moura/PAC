package br.org.catolicasc.view2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	public JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 165, 0));
		frame.setBounds(100, 100, 540, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(92, 75, 259, 123);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Senha");
		passwordField.setBounds(29, 75, 198, 20);
		panel.add(passwordField);
		
		textField = new JTextField();
		textField.setToolTipText("Nome\r\n");
		textField.setBounds(29, 32, 198, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(192, 39, 69, 25);
		frame.getContentPane().add(lblLogin);
		
		JButton btnEntrar = new JButton("Iniciar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("@professor")) {
					MenuProfessor professor = new MenuProfessor();
					professor.frame.setVisible(true);
					frame.dispose();
					
				}else if(textField.getText().equals("@aluno")) {
					Avatar avatar = new Avatar();
					avatar.frame.setVisible(true);
					frame.dispose();
			}else {
				JOptionPane.showMessageDialog(null, "Usuário inválido");
			}
			}
		});
		btnEntrar.setBounds(178, 213, 89, 23);
		frame.getContentPane().add(btnEntrar);
	}
}

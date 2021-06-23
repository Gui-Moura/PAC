package br.org.catolicasc.view2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import br.com.atividade.dao.SingleConnection;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {
	
	private Connection connection;

	// CONEXAO
	public Login() {
		connection = SingleConnection.getConnection();
		initialize();
	}

	public JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;
	private JButton btnNewButton;

	
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
		panel.setBounds(126, 152, 259, 123);
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
		lblLogin.setBounds(226, 116, 69, 25);
		frame.getContentPane().add(lblLogin);
		
		JButton btnEntrar = new JButton("Iniciar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 	String userName = textField.getText();
	                String password = passwordField.getText();
	                try {
	                	String insertFuncao = ("Select nm_usuario, senha from usuario where nm_usuario=? and senha=?");
	        			PreparedStatement ps = connection.prepareStatement(insertFuncao);	           

	                    ps.setString(1, userName);
	                    ps.setString(2, password);
	                    ResultSet rs = ps.executeQuery();
	                    if (rs.next()) {	                    	
	                       // frame.dispose();
	                        //CadastrarUsuario cadUsuario = new CadastrarUsuario();
	                        //menu.setTitle("Welcome");
	                        //cadUsuario.frame.setVisible(true);
	                        if(userName.contains("@professor")) {
	        					MenuProfessor professor = new MenuProfessor();
	        					professor.frame.setVisible(true);
	        					frame.dispose();
	        					
	        				}else if(userName.contains("@aluno")) {
	        					Avatar avatar = new Avatar();
	        					avatar.frame.setVisible(true);
	        					frame.dispose();
	        			}
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Usuario ou Senha inválidos");
	                    }
	                } catch (SQLException sqlException) {
	                    sqlException.printStackTrace();
	                }
	                
				/* else {
				JOptionPane.showMessageDialog(null, "Usu�rio inv�lido");
			}*/
			}
		});
		btnEntrar.setBounds(212, 290, 89, 23);
		frame.getContentPane().add(btnEntrar);
		
		btnNewButton = new JButton("Cadastre-se");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CadastrarUsuarioNovo cadastrarUsuarioNovo = new CadastrarUsuarioNovo();
				cadastrarUsuarioNovo.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(206, 369, 110, 23);
		frame.getContentPane().add(btnNewButton);
	}
}

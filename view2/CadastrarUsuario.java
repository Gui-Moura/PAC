package br.org.catolicasc.view2;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import br.com.atividade.controller.FuncaoController;
import br.com.atividade.dao.FuncaoDao;
import br.com.atividade.dao.SingleConnection;
import br.org.catolicasc.view2.Login;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;


public class CadastrarUsuario {
	
	String aux;
	private Connection connection;
	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private String radioText = "";
	public String radio = "@";
	private JTextField textField_1;
	
	public CadastrarUsuario() {
		connection = SingleConnection.getConnection();
		initialize();
	}

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
				frame.dispose();
			}
		});
		lblSair.setForeground(new Color(255, 215, 0));
		lblSair.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSair.setBackground(new Color(255, 215, 0));
		lblSair.setBounds(478, 19, 46, 14);
		panel_1.add(lblSair);

		JLabel lblNewLabel = new JLabel("Nome de Usuario");
		lblNewLabel.setBounds(47, 129, 109, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(47, 200, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(47, 154, 420, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(47, 296, 420, 20);
		frame.getContentPane().add(textField_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(47, 225, 420, 20);
		frame.getContentPane().add(passwordField);
		
		
		
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aux = textField.getText() + "@" + textField_1.getText();
				System.out.println(textField_1.getText());
				if(textField_1.getText().replaceAll("[^a-zA-Z0-9]", "").equals("Professor") || (textField_1.getText().replaceAll("[^a-zA-Z0-9]", "").equals("Aluno")) || textField_1.getText().replaceAll("[^a-zA-Z0-9]", "").equals("professor") || (textField_1.getText().replaceAll("[^a-zA-Z0-9]", "").equals("aluno")) ) {
					System.out.println(aux);
					try {
	                	String insertFuncao = ("Select nm_usuario from usuario where nm_usuario=?");
	        			PreparedStatement ps = connection.prepareStatement(insertFuncao);	           

	                    ps.setString(1, aux);
	                    ResultSet rs = ps.executeQuery();
	                    if (rs.next()) {	               
	                    	JOptionPane.showMessageDialog(null, "Nome de usuário ja está sendo utilizado em mesma função");
	                    } else {	                   	
	                    	FuncaoDao funcaoDao = new FuncaoDao();
	    					funcaoDao.cadUsuario(FuncaoController.cadUsuario(textField, passwordField, textField_1));
	                        //JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
	                       
	                    }
	                } catch (SQLException sqlException) {
	                    sqlException.printStackTrace();
	                }		
	                   
				}else {
					
				JOptionPane.showMessageDialog(null, "Impossível cadastrar!!! Função Inválida");
				}
			}
			
		});
		btnNewButton.setBounds(378, 404, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Função");
		lblNewLabel_2.setBounds(47, 271, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cadastrar Usuario");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(196, 80, 180, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("* Professor ou Aluno");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 9));
		lblNewLabel_4.setBounds(47, 327, 161, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuProfessor menuProfessor = new MenuProfessor();
				menuProfessor.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(47, 404, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
	




package br.org.catolicasc.view2;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import br.com.atividade.controller.FuncaoController;
import br.com.atividade.dao.FuncaoDao;
import br.org.catolicasc.view2.Login;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;


public class CadastrarUsuario {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private String radioText = "";

	/**
	 * Create the application.
	 */
	public CadastrarUsuario() {
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

		JLabel lblNewLabel = new JLabel("Nome de Usuario");
		lblNewLabel.setBounds(88, 128, 109, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(88, 236, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(88, 169, 147, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(88, 272, 147, 20);
		frame.getContentPane().add(passwordField);

		JRadioButton rbProfessor = new JRadioButton("Professor");
		rbProfessor.setBounds(88, 333, 109, 23);
		frame.getContentPane().add(rbProfessor);

		JRadioButton rbAluno = new JRadioButton("Aluno");
		rbAluno.setBounds(230, 333, 109, 23);
		frame.getContentPane().add(rbAluno);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rbProfessor);
		bg.add(rbAluno);

		//rbAluno.setSelected(true);

		if (rbProfessor.isSelected()) {
			radioText = "@professor";
			rbProfessor.setSelected(true);
			//rbAluno.setSelected(false);
		}else{
			rbAluno.setSelected(true);
			radioText = "@aluno";
		}

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FuncaoDao funcaoDao = new FuncaoDao();
				funcaoDao.cadUsuario(FuncaoController.cadUsuario(textField, passwordField, radioText));
			}
		});
		
		btnNewButton.setBounds(378, 379, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}	



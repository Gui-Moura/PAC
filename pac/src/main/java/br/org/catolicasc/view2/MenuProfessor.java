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

public class MenuProfessor {

	public JFrame frame;


	/**
	 * Create the application.
	 */
	public MenuProfessor() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 0, 524, 44);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPac = new JLabel("PAC");
		lblPac.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPac.setForeground(new Color(255, 215, 0));
		lblPac.setBackground(new Color(255, 215, 0));
		lblPac.setBounds(10, 19, 46, 14);
		panel.add(lblPac);
		
		JLabel lblProfessor = new JLabel("Professor");
		lblProfessor.setForeground(new Color(255, 215, 0));
		lblProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProfessor.setBackground(new Color(255, 215, 0));
		lblProfessor.setBounds(382, 19, 76, 14);
		panel.add(lblProfessor);
		
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
		lblSair.setBounds(468, 19, 46, 14);
		panel.add(lblSair);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
		
				
			}
		
		);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(59, 226, 185, 72);
		frame.getContentPane().add(panel_1);
		
		JLabel lblRelatrioDeUso = new JLabel("Relat\u00F3rio de uso e desempenho");
		lblRelatrioDeUso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RelatorioDesempenho relatorioDesempenho = new RelatorioDesempenho();
					relatorioDesempenho.frame.setVisible(true);
					frame.dispose();
				}
			}
		);
		lblRelatrioDeUso.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelatrioDeUso.setBounds(10, 28, 165, 23);
		panel_1.add(lblRelatrioDeUso);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(323, 226, 118, 72);
		frame.getContentPane().add(panel_2);
		
		JLabel lblCadastroDeAlunos = new JLabel("Cadastro de alunos");
		lblCadastroDeAlunos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CadastrarUsuario cadastrarUsuario = new CadastrarUsuario();
				cadastrarUsuario.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		lblCadastroDeAlunos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeAlunos.setBounds(0, 31, 121, 14);
		panel_2.add(lblCadastroDeAlunos);
		
		JLabel lblBemvindoOAmbiente = new JLabel("Bem-vindo o ambiente do professor");
		lblBemvindoOAmbiente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblBemvindoOAmbiente.setBounds(100, 126, 341, 27);
		frame.getContentPane().add(lblBemvindoOAmbiente);
	}
}

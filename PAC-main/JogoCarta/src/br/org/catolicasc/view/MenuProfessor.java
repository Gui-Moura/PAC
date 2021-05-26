package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MenuProfessor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuProfessor window = new MenuProfessor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 0, 434, 44);
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
		lblProfessor.setBounds(311, 19, 76, 14);
		panel.add(lblProfessor);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(46, 123, 185, 72);
		frame.getContentPane().add(panel_1);
		
		JLabel lblRelatrioDeUso = new JLabel("Relat\u00F3rio de uso e desempenho");
		lblRelatrioDeUso.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelatrioDeUso.setBounds(10, 28, 165, 23);
		panel_1.add(lblRelatrioDeUso);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(260, 123, 118, 72);
		frame.getContentPane().add(panel_2);
		
		JLabel lblCadastroDeAlunos = new JLabel("Cadastro de alunos");
		lblCadastroDeAlunos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeAlunos.setBounds(0, 31, 121, 14);
		panel_2.add(lblCadastroDeAlunos);
		
		JLabel lblBemvindoOAmbiente = new JLabel("Bem-vindo o ambiente do professor");
		lblBemvindoOAmbiente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblBemvindoOAmbiente.setBounds(58, 72, 341, 27);
		frame.getContentPane().add(lblBemvindoOAmbiente);
	}

}

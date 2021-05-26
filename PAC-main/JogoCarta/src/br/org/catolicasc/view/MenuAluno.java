package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MenuAluno {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAluno window = new MenuAluno();
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
	public MenuAluno() {
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
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(255, 215, 0));
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBackground(new Color(255, 215, 0));
		lblNome.setBounds(313, 20, 76, 14);
		panel.add(lblNome);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(80, 80, 84, 44);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNvel = new JLabel("N\u00EDvel 01");
		lblNvel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNvel.setBounds(100, 55, 46, 14);
		frame.getContentPane().add(lblNvel);
		
		JLabel lblSul = new JLabel("Sul");
		lblSul.setHorizontalAlignment(SwingConstants.CENTER);
		lblSul.setBounds(100, 130, 46, 14);
		frame.getContentPane().add(lblSul);
		
		JLabel lblNvel_1 = new JLabel("N\u00EDvel 02");
		lblNvel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNvel_1.setBounds(213, 55, 46, 14);
		frame.getContentPane().add(lblNvel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(193, 80, 84, 44);
		frame.getContentPane().add(panel_2);
		
		JLabel lblSudeste = new JLabel("Sudeste");
		lblSudeste.setHorizontalAlignment(SwingConstants.CENTER);
		lblSudeste.setBounds(213, 130, 46, 14);
		frame.getContentPane().add(lblSudeste);
		
		JLabel lblNvel_2 = new JLabel("N\u00EDvel 03");
		lblNvel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNvel_2.setBounds(324, 55, 46, 14);
		frame.getContentPane().add(lblNvel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(304, 80, 84, 44);
		frame.getContentPane().add(panel_3);
		
		JLabel lblCentrooeste = new JLabel("Centro-oeste");
		lblCentrooeste.setHorizontalAlignment(SwingConstants.CENTER);
		lblCentrooeste.setBounds(314, 130, 66, 14);
		frame.getContentPane().add(lblCentrooeste);
		
		JLabel lblNvel_3 = new JLabel("N\u00EDvel 04");
		lblNvel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNvel_3.setBounds(152, 161, 46, 14);
		frame.getContentPane().add(lblNvel_3);
		
		JLabel lblNvel_4 = new JLabel("N\u00EDvel 05");
		lblNvel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNvel_4.setBounds(263, 161, 46, 14);
		frame.getContentPane().add(lblNvel_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.ORANGE);
		panel_4.setBounds(132, 186, 84, 44);
		frame.getContentPane().add(panel_4);
		
		JLabel lblNorte = new JLabel("Norte");
		lblNorte.setHorizontalAlignment(SwingConstants.CENTER);
		lblNorte.setBounds(152, 236, 46, 14);
		frame.getContentPane().add(lblNorte);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.ORANGE);
		panel_5.setBounds(243, 186, 84, 44);
		frame.getContentPane().add(panel_5);
		
		JLabel lblNordeste = new JLabel("Nordeste");
		lblNordeste.setHorizontalAlignment(SwingConstants.CENTER);
		lblNordeste.setBounds(253, 236, 66, 14);
		frame.getContentPane().add(lblNordeste);
	}

}

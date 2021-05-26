package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Avatar {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Avatar window = new Avatar();
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
	public Avatar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 215, 0));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(108, 93, 95, 90);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMenino = new JLabel("Menino");
		lblMenino.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenino.setBounds(26, 65, 46, 14);
		panel.add(lblMenino);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(256, 93, 95, 90);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMenina = new JLabel("Menina");
		lblMenina.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenina.setBounds(24, 65, 46, 14);
		panel_1.add(lblMenina);
		
		JLabel lblEscolhaUmAvatar = new JLabel("Escolha um avatar");
		lblEscolhaUmAvatar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblEscolhaUmAvatar.setBounds(136, 46, 174, 27);
		frame.getContentPane().add(lblEscolhaUmAvatar);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

package br.org.catolicasc.view2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Avatar {

	public JFrame frame;

	
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
		
		JLabel lblEscolhaUmAvatar = new JLabel("Escolha um avatar");
		lblEscolhaUmAvatar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblEscolhaUmAvatar.setBounds(169, 64, 174, 27);
		frame.getContentPane().add(lblEscolhaUmAvatar);
		
		JLabel lblMenino = new JLabel("Menino");
		lblMenino.setBounds(136, 310, 46, 14);
		frame.getContentPane().add(lblMenino);
		lblMenino.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JLabel lblMenina = new JLabel("Menina");
		lblMenina.setBounds(335, 310, 46, 14);
		frame.getContentPane().add(lblMenina);
		lblMenina.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuAluno aluno = new MenuAluno();
				aluno.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\gui08\\Pictures\\delivery-boy.png"));
		btnNewButton.setBounds(98, 142, 115, 107);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuAluno aluno = new MenuAluno();
				aluno.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\gui08\\Pictures\\girl (1).png"));
		btnNewButton_1.setBounds(307, 142, 115, 107);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100, 540, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

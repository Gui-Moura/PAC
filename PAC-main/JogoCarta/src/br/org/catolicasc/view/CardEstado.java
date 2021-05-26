package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class CardEstado {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardEstado window = new CardEstado();
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
	public CardEstado() {
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
		panel.setBackground(Color.ORANGE);
		panel.setBounds(21, 21, 388, 218);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEstado.setBounds(198, 11, 46, 14);
		panel.add(lblEstado);
		
		JLabel lblRegio = new JLabel("Popula\u00E7\u00E3o");
		lblRegio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRegio.setBounds(198, 93, 77, 14);
		panel.add(lblRegio);
		
		JLabel label = new JLabel("Regi\u00E3o");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(198, 56, 46, 14);
		panel.add(label);
		
		JLabel lblClima = new JLabel("Clima");
		lblClima.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClima.setBounds(198, 129, 77, 14);
		panel.add(lblClima);
		
		JLabel lblGovernador = new JLabel("Governador");
		lblGovernador.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGovernador.setBounds(198, 166, 77, 14);
		panel.add(lblGovernador);
		
		JLabel lblEstado_1 = new JLabel("ESTADO");
		lblEstado_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEstado_1.setBounds(198, 31, 77, 14);
		panel.add(lblEstado_1);
		
		JLabel lblRegio_1 = new JLabel("REGI\u00C3O");
		lblRegio_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRegio_1.setBounds(198, 72, 87, 14);
		panel.add(lblRegio_1);
		
		JLabel lblPopulao = new JLabel("POPULA\u00C7\u00C3O");
		lblPopulao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPopulao.setBounds(198, 114, 77, 14);
		panel.add(lblPopulao);
		
		JLabel lblClima_1 = new JLabel("CLIMA");
		lblClima_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClima_1.setBounds(198, 141, 77, 14);
		panel.add(lblClima_1);
		
		JLabel lblGovernador_1 = new JLabel("GOVERNADOR");
		lblGovernador_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGovernador_1.setBounds(198, 180, 118, 14);
		panel.add(lblGovernador_1);
	}

}

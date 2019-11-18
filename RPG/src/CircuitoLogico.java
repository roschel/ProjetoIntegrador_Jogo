import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.io.Console;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import java.awt.Dimension;

public class CircuitoLogico extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircuitoLogico frame = new CircuitoLogico();
					frame.setVisible(true);
					frame.setAlwaysOnTop(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	// RESPOSTA DO EXERCICIO
	// S = ((AC)'+B+D)' + (ACD)' * C
	public CircuitoLogico() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 726, 726);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 708, 679);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setMaximumSize(new Dimension(32782, 32767));
		tabbedPane.addTab("Exemplo desafio 6", null, panel, null);
		
		JLabel lblPortaAnd = new JLabel("Tabela Portas Lógicas");
		lblPortaAnd.setBounds(252, 13, 211, 16);
		lblPortaAnd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortaAnd.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblPortaAnd);

		
		JLabel label = new JLabel("");
		label.setBounds(12, 42, 679, 607);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		panel.setLayout(null);
		
		ImageIcon img = new ImageIcon(CircuitoLogico.class.getResource("/Imagens/PortasLogicas.jpg"));
		img.setImage(img.getImage().getScaledInstance(label.getWidth(),label.getHeight(), 1));
		label.setIcon(img);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setEnabled(false);
		tabbedPane.addTab("Desafio 6", null, panel_1, null);
		panel_1.setLayout(null);		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(98, 139, 481, 317);
		panel_1.add(lblNewLabel);
		
		ImageIcon circuito = new ImageIcon(CircuitoLogico.class.getResource("/Imagens/Circuito logico.jpg"));
		circuito.setImage(circuito.getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), 1));
		lblNewLabel.setIcon(circuito);
			

	}
}

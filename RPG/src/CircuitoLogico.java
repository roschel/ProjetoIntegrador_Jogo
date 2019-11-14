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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 629, 395);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Exemplo desafio 6", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblPortaNand = new JLabel("Porta NAND");
		lblPortaNand.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPortaNand.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortaNand.setBounds(12, 23, 81, 16);
		panel.add(lblPortaNand);
		
		JLabel lblPortaNand_1 = new JLabel("");
		lblPortaNand_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortaNand_1.setIcon(new ImageIcon("C:\\Users\\joaom\\Desktop\\porta and.jpg"));
		lblPortaNand_1.setBounds(46, 65, 250, 170);
		panel.add(lblPortaNand_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setEnabled(false);
		tabbedPane.addTab("Desafio 6", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Um elemento barrado também pode ser expresso por apóstrofo. Exemplo A' = A barrado");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(12, 13, 600, 28);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(63, 87, 507, 172);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\joaom\\Pictures\\Circuito logico.jpg"));
	
		

		List alternativas = new ArrayList();

		// Declarando opções de resposta
		alternativas.add("S = ((A*C)'+B+D)' + (A*C*D)' * C"); // resposta correta
		alternativas.add("S = A*C+B+D + (A+C+D)' * C'");
		alternativas.add("S = (A+C)'+B*D' + (A*C'+D) * C");
		alternativas.add("S = (A*C)'*(B*D) + (A+C*D)' + C'");
		alternativas.add("S = ((A*C)'+B+D)' + (A*C*D)'");

		Collections.shuffle(alternativas);

		System.out.println("funcionou!");

	}
}

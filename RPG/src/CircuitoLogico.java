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
		lblPortaNand.setBounds(85, 186, 81, 16);
		panel.add(lblPortaNand);
		
		JLabel lblPortaNand_1 = new JLabel("");
		lblPortaNand_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortaNand_1.setBounds(68, 215, 118, 86);
		ImageIcon portaNAND = new ImageIcon(CircuitoLogico.class.getResource("/Imagens/porta nand.jpg"));
		portaNAND.setImage(portaNAND.getImage().getScaledInstance(lblPortaNand_1.getWidth(),lblPortaNand_1.getHeight(), 1));
		lblPortaNand_1.setIcon(portaNAND);
		panel.add(lblPortaNand_1);
		
		JLabel lblSadaCab = new JLabel("Saída: D=(A*B)'");
		lblSadaCab.setHorizontalAlignment(SwingConstants.CENTER);
		lblSadaCab.setBounds(68, 313, 118, 16);
		panel.add(lblSadaCab);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(68, 42, 118, 86);
		ImageIcon portaAND = new ImageIcon(CircuitoLogico.class.getResource("/Imagens/porta and2.jpg"));
		portaAND.setImage(portaAND.getImage().getScaledInstance(label.getWidth(),label.getHeight(), 1));
		label.setIcon(portaAND);
		panel.add(label);
		
		JLabel lblPortaAnd = new JLabel("Porta AND");
		lblPortaAnd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortaAnd.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPortaAnd.setBounds(86, 13, 81, 16);
		panel.add(lblPortaAnd);
		
		JLabel lblSadaDab = new JLabel("Saída: C=A*B");
		lblSadaDab.setHorizontalAlignment(SwingConstants.CENTER);
		lblSadaDab.setBounds(68, 140, 118, 16);
		panel.add(lblSadaDab);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(221, 42, 118, 86);
		ImageIcon portaOR = new ImageIcon(CircuitoLogico.class.getResource("/Imagens/porta OU.jpg"));
		portaOR.setImage(portaOR.getImage().getScaledInstance(label_1.getWidth(),label_1.getHeight(), 1));
		label_1.setIcon(portaOR);
		panel.add(label_1);
		
		JLabel lblPortaOr = new JLabel("Porta OR");
		lblPortaOr.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortaOr.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPortaOr.setBounds(239, 13, 81, 16);
		panel.add(lblPortaOr);
		
		JLabel lblSadaCab_1 = new JLabel("Saída: C=A+B");
		lblSadaCab_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSadaCab_1.setBounds(221, 140, 118, 16);
		panel.add(lblSadaCab_1);
		
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
		lblNewLabel_1.setBounds(63, 87, 511, 191);
		panel_1.add(lblNewLabel_1);
		ImageIcon circuito = new ImageIcon(CircuitoLogico.class.getResource("/Imagens/Circuito logico.jpg"));
		circuito.setImage(circuito.getImage().getScaledInstance(
				lblNewLabel_1.getWidth(), 
				lblNewLabel_1.getHeight(), 
				1));
		lblNewLabel_1.setIcon(circuito);
	
		

		List alternativas = new ArrayList();

		// Declarando opções de resposta
		alternativas.add("S = ((A*C)'+B+D)' + (A*C*D)' * C"); // resposta correta
		alternativas.add("S = A*C+B+D + (A+C+D)' * C'");
		alternativas.add("S = (A+C)'+B*D' + (A*C'+D) * C");
		alternativas.add("S = (A*C)'*(B*D) + (A+C*D)' + C'");
		alternativas.add("S = ((A*C)'+B+D)' + (A*C*D)'");

		Collections.shuffle(alternativas);

		//System.out.println("funcionou!");

	}
}

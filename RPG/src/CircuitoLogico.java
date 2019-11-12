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
		setBounds(100, 100, 958, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(34, 26, 482, 175);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("D:\\joaom\\Pictures\\Circuito logico.jpg"));
		// labFotoMembros.setIcon(new
		// ImageIcon(image.getScaledInstance(labFotoMembros.getWidth(),labFotoMembros.getHeight(),
		// Image.SCALE_DEFAULT)));

		JRadioButton rdbtnA = new JRadioButton("A");
		buttonGroup.add(rdbtnA);
		rdbtnA.setBounds(599, 43, 248, 25);
		contentPane.add(rdbtnA);

		JRadioButton rdbtnB = new JRadioButton("B");
		buttonGroup.add(rdbtnB);
		rdbtnB.setBounds(599, 73, 248, 25);
		contentPane.add(rdbtnB);

		JRadioButton rdbtnC = new JRadioButton("C");
		buttonGroup.add(rdbtnC);
		rdbtnC.setBounds(599, 103, 248, 25);
		contentPane.add(rdbtnC);

		JRadioButton rdbtnD = new JRadioButton("D");
		buttonGroup.add(rdbtnD);
		rdbtnD.setBounds(599, 133, 248, 25);
		contentPane.add(rdbtnD);

		JRadioButton rdbtnE = new JRadioButton("E");
		buttonGroup.add(rdbtnE);
		rdbtnE.setBounds(599, 163, 248, 25);
		contentPane.add(rdbtnE);

		JLabel lblUmElementoBarrado = new JLabel(
				"Um elemento barrado também pode ser expresso por apóstrofo. Exemplo A' = A barrado");
		lblUmElementoBarrado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUmElementoBarrado.setBounds(34, 13, 658, 16);
		contentPane.add(lblUmElementoBarrado);

		JLabel lblParabnsVocAcertou = new JLabel("Parabéns, você acertou!");
		lblParabnsVocAcertou.setVisible(false);
		lblParabnsVocAcertou.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblParabnsVocAcertou.setBackground(Color.GREEN);
		lblParabnsVocAcertou.setOpaque(true);
		lblParabnsVocAcertou.setHorizontalAlignment(SwingConstants.CENTER);
		lblParabnsVocAcertou.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblParabnsVocAcertou.setBounds(599, 252, 187, 25);
		contentPane.add(lblParabnsVocAcertou);

		JLabel lblVocErrouTente = new JLabel("Você errou, tente novamente.");
		lblVocErrouTente.setVisible(false);
		lblVocErrouTente.setOpaque(true);
		lblVocErrouTente.setHorizontalAlignment(SwingConstants.CENTER);
		lblVocErrouTente.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVocErrouTente.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblVocErrouTente.setBackground(Color.RED);
		lblVocErrouTente.setBounds(599, 290, 224, 25);
		contentPane.add(lblVocErrouTente);

		List alternativas = new ArrayList();

		// Declarando opções de resposta
		alternativas.add("S = ((A*C)'+B+D)' + (A*C*D)' * C"); // resposta correta
		alternativas.add("S = A*C+B+D + (A+C+D)' * C'");
		alternativas.add("S = (A+C)'+B*D' + (A*C'+D) * C");
		alternativas.add("S = (A*C)'*(B*D) + (A+C*D)' + C'");
		alternativas.add("S = ((A*C)'+B+D)' + (A*C*D)'");

		Collections.shuffle(alternativas);
		rdbtnA.setText("A) " + alternativas.get(0));
		rdbtnB.setText("B) " + alternativas.get(1));
		rdbtnC.setText("C) " + alternativas.get(2));
		rdbtnD.setText("D) " + alternativas.get(3));
		rdbtnE.setText("E) " + alternativas.get(4));

		JButton btnVerificarResposta = new JButton("Verificar Resposta");
		btnVerificarResposta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnA.isSelected() && alternativas.get(0).equals("S = ((A*C)'+B+D)' + (A*C*D)' * C")) {
					System.out.println("Acertou");
				}
				if (rdbtnB.isSelected() && alternativas.get(1).equals("S = ((A*C)'+B+D)' + (A*C*D)' * C")) {
					System.out.println("Acertou");
				}
				if (rdbtnC.isSelected() && alternativas.get(2).equals("S = ((A*C)'+B+D)' + (A*C*D)' * C")) {
					System.out.println("Acertou");
				}
				if (rdbtnD.isSelected() && alternativas.get(3).equals("S = ((A*C)'+B+D)' + (A*C*D)' * C")) {
					System.out.println("Acertou");
				}
				if (rdbtnE.isSelected() && alternativas.get(4).equals("S = ((A*C)'+B+D)' + (A*C*D)' * C")) {
					System.out.println("Acertou");
				}
			}
		});
		btnVerificarResposta.setBounds(599, 197, 155, 25);
		contentPane.add(btnVerificarResposta);

		System.out.println("funcionou!");

	}
}

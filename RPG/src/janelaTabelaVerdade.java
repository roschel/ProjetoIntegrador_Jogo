
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class janelaTabelaVerdade {

	private JFrame frame;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaTabelaVerdade window = new janelaTabelaVerdade();
					window.frame.setVisible(true);
					window.frame.setAlwaysOnTop(true);
                                        window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public janelaTabelaVerdade() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 483, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblA = new JLabel("A");
		lblA.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblA.setOpaque(true);
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBackground(Color.WHITE);
		lblA.setBounds(12, 42, 27, 24);
		frame.getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setOpaque(true);
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblB.setBackground(Color.WHITE);
		lblB.setBounds(40, 42, 27, 24);
		frame.getContentPane().add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setOpaque(true);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblC.setBackground(Color.WHITE);
		lblC.setBounds(69, 42, 27, 24);
		frame.getContentPane().add(lblC);
		
		JLabel lblS = new JLabel("S");
		lblS.setOpaque(true);
		lblS.setHorizontalAlignment(SwingConstants.CENTER);
		lblS.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblS.setBackground(Color.WHITE);
		lblS.setBounds(101, 42, 27, 24);
		frame.getContentPane().add(lblS);
		
		textField_24 = new JTextField();
		textField_24.setPreferredSize(new Dimension(8, 16));
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setColumns(10);
		textField_24.setBounds(101, 69, 27, 24);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setPreferredSize(new Dimension(8, 16));
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setColumns(10);
		textField_25.setBounds(101, 95, 27, 24);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setPreferredSize(new Dimension(8, 16));
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setColumns(10);
		textField_26.setBounds(101, 122, 27, 24);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setPreferredSize(new Dimension(8, 16));
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setColumns(10);
		textField_27.setBounds(101, 148, 27, 24);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setPreferredSize(new Dimension(8, 16));
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setColumns(10);
		textField_28.setBounds(101, 174, 27, 24);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setPreferredSize(new Dimension(8, 16));
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setColumns(10);
		textField_29.setBounds(101, 199, 27, 24);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setPreferredSize(new Dimension(8, 16));
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setColumns(10);
		textField_30.setBounds(101, 226, 27, 24);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setPreferredSize(new Dimension(8, 16));
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setColumns(10);
		textField_31.setBounds(101, 253, 27, 24);
		frame.getContentPane().add(textField_31);
		
		JLabel lblSabac = new JLabel("S=AB+A'C");
		lblSabac.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSabac.setBounds(30, 13, 85, 16);
		frame.getContentPane().add(lblSabac);
		
		JLabel label = new JLabel("0");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(Color.WHITE);
		label.setBounds(69, 69, 27, 24);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("0");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(40, 69, 27, 24);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("0");
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(12, 69, 27, 24);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("0");
		label_3.setOpaque(true);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(12, 95, 27, 24);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("0");
		label_4.setOpaque(true);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(40, 95, 27, 24);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("1");
		label_5.setOpaque(true);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(69, 95, 27, 24);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("0");
		label_6.setOpaque(true);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(12, 122, 27, 24);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("1");
		label_7.setOpaque(true);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBackground(Color.WHITE);
		label_7.setBounds(40, 122, 27, 24);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("0");
		label_8.setOpaque(true);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(69, 122, 27, 24);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("0");
		label_9.setOpaque(true);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBackground(Color.WHITE);
		label_9.setBounds(12, 148, 27, 24);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("1");
		label_10.setOpaque(true);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(40, 148, 27, 24);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("1");
		label_11.setOpaque(true);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(69, 148, 27, 24);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("1");
		label_12.setOpaque(true);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBackground(Color.WHITE);
		label_12.setBounds(12, 174, 27, 24);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("0");
		label_13.setOpaque(true);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBackground(Color.WHITE);
		label_13.setBounds(40, 174, 27, 24);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("0");
		label_14.setOpaque(true);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBackground(Color.WHITE);
		label_14.setBounds(69, 174, 27, 24);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("1");
		label_15.setOpaque(true);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBackground(Color.WHITE);
		label_15.setBounds(12, 199, 27, 24);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("0");
		label_16.setOpaque(true);
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBackground(Color.WHITE);
		label_16.setBounds(40, 199, 27, 24);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("1");
		label_17.setOpaque(true);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBackground(Color.WHITE);
		label_17.setBounds(69, 199, 27, 24);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("1");
		label_18.setOpaque(true);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setBackground(Color.WHITE);
		label_18.setBounds(12, 226, 27, 24);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("1");
		label_19.setOpaque(true);
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setBackground(Color.WHITE);
		label_19.setBounds(40, 226, 27, 24);
		frame.getContentPane().add(label_19);
		
		JLabel label_20 = new JLabel("0");
		label_20.setOpaque(true);
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setBackground(Color.WHITE);
		label_20.setBounds(69, 226, 27, 24);
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("1");
		label_21.setOpaque(true);
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setBackground(Color.WHITE);
		label_21.setBounds(12, 253, 27, 24);
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("1");
		label_22.setOpaque(true);
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setBackground(Color.WHITE);
		label_22.setBounds(40, 253, 27, 24);
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("1");
		label_23.setOpaque(true);
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setBackground(Color.WHITE);
		label_23.setBounds(69, 253, 27, 24);
		frame.getContentPane().add(label_23);
		
		JButton btnVerificarResposta = new JButton("Verificar resposta");
		btnVerificarResposta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnVerificarResposta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField_24.getText().equalsIgnoreCase("0")) {
					textField_24.setBackground(Color.green);
				}else {
					textField_24.setBackground(Color.red);
				}
				
				if (textField_25.getText().equalsIgnoreCase("1")) {
					textField_25.setBackground(Color.green);
				}else {
					textField_25.setBackground(Color.red);
				}
				
				if (textField_26.getText().equalsIgnoreCase("0")) {
					textField_26.setBackground(Color.green);
				}else {
					textField_26.setBackground(Color.red);
				}
				
				if (textField_27.getText().equalsIgnoreCase("1")) {
					textField_27.setBackground(Color.green);
				}else {
					textField_27.setBackground(Color.red);
				}
				
				if (textField_28.getText().equalsIgnoreCase("0")) {
					textField_28.setBackground(Color.green);
				}else {
					textField_28.setBackground(Color.red);
				}
				
				if (textField_29.getText().equalsIgnoreCase("0")) {
					textField_29.setBackground(Color.green);
				}else {
					textField_29.setBackground(Color.red);
				}
				
				if (textField_30.getText().equalsIgnoreCase("1")) {
					textField_30.setBackground(Color.green);
				}else {
					textField_30.setBackground(Color.red);
				}
				
				if (textField_31.getText().equalsIgnoreCase("1")) {
					textField_31.setBackground(Color.green);
				}else {
					textField_31.setBackground(Color.red);
				}
			}
		});
		
		btnVerificarResposta.setBounds(140, 42, 152, 24);
		frame.getContentPane().add(btnVerificarResposta);
	}
}

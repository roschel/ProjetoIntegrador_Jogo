
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
import java.util.Scanner;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

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
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
					window.frame.setAlwaysOnTop(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	/**
	 * Create the application.
	 */
	
	static int contador=1;
	
	public janelaTabelaVerdade() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 427, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblA = new JLabel("A");
		lblA.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblA.setOpaque(true);
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBackground(Color.WHITE);
		lblA.setBounds(51, 80, 27, 24);
		frame.getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setOpaque(true);
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblB.setBackground(Color.WHITE);
		lblB.setBounds(79, 80, 27, 24);
		frame.getContentPane().add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setOpaque(true);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblC.setBackground(Color.WHITE);
		lblC.setBounds(108, 80, 27, 24);
		frame.getContentPane().add(lblC);
		
		JLabel lblS = new JLabel("S");
		lblS.setOpaque(true);
		lblS.setHorizontalAlignment(SwingConstants.CENTER);
		lblS.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblS.setBackground(Color.WHITE);
		lblS.setBounds(140, 80, 27, 24);
		frame.getContentPane().add(lblS);
		
		textField_24 = new JTextField();
		textField_24.setPreferredSize(new Dimension(8, 16));
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setColumns(10);
		textField_24.setBounds(140, 107, 27, 24);
		frame.getContentPane().add(textField_24);
		
		
		textField_25 = new JTextField();
		textField_25.setPreferredSize(new Dimension(8, 16));
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setColumns(10);
		textField_25.setBounds(140, 133, 27, 24);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setPreferredSize(new Dimension(8, 16));
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setColumns(10);
		textField_26.setBounds(140, 160, 27, 24);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setPreferredSize(new Dimension(8, 16));
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setColumns(10);
		textField_27.setBounds(140, 186, 27, 24);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setPreferredSize(new Dimension(8, 16));
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setColumns(10);
		textField_28.setBounds(140, 212, 27, 24);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setPreferredSize(new Dimension(8, 16));
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setColumns(10);
		textField_29.setBounds(140, 237, 27, 24);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setPreferredSize(new Dimension(8, 16));
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setColumns(10);
		textField_30.setBounds(140, 264, 27, 24);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setPreferredSize(new Dimension(8, 16));
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setColumns(10);
		textField_31.setBounds(140, 291, 27, 24);
		frame.getContentPane().add(textField_31);
		
		JLabel lblSabac = new JLabel("S=AB+A'C");
		lblSabac.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSabac.setBounds(71, 51, 85, 16);
		frame.getContentPane().add(lblSabac);
		
		JLabel label = new JLabel("0");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(Color.WHITE);
		label.setBounds(108, 107, 27, 24);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("0");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(79, 107, 27, 24);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("0");
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(51, 107, 27, 24);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("0");
		label_3.setOpaque(true);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(51, 133, 27, 24);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("0");
		label_4.setOpaque(true);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(79, 133, 27, 24);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("1");
		label_5.setOpaque(true);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(108, 133, 27, 24);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("0");
		label_6.setOpaque(true);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(51, 160, 27, 24);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("1");
		label_7.setOpaque(true);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBackground(Color.WHITE);
		label_7.setBounds(79, 160, 27, 24);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("0");
		label_8.setOpaque(true);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(108, 160, 27, 24);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("0");
		label_9.setOpaque(true);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBackground(Color.WHITE);
		label_9.setBounds(51, 186, 27, 24);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("1");
		label_10.setOpaque(true);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(79, 186, 27, 24);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("1");
		label_11.setOpaque(true);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(108, 186, 27, 24);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("1");
		label_12.setOpaque(true);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBackground(Color.WHITE);
		label_12.setBounds(51, 212, 27, 24);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("0");
		label_13.setOpaque(true);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBackground(Color.WHITE);
		label_13.setBounds(79, 212, 27, 24);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("0");
		label_14.setOpaque(true);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBackground(Color.WHITE);
		label_14.setBounds(108, 212, 27, 24);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("1");
		label_15.setOpaque(true);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBackground(Color.WHITE);
		label_15.setBounds(51, 237, 27, 24);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("0");
		label_16.setOpaque(true);
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBackground(Color.WHITE);
		label_16.setBounds(79, 237, 27, 24);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("1");
		label_17.setOpaque(true);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBackground(Color.WHITE);
		label_17.setBounds(108, 237, 27, 24);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("1");
		label_18.setOpaque(true);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setBackground(Color.WHITE);
		label_18.setBounds(51, 264, 27, 24);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("1");
		label_19.setOpaque(true);
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setBackground(Color.WHITE);
		label_19.setBounds(79, 264, 27, 24);
		frame.getContentPane().add(label_19);
		
		JLabel label_20 = new JLabel("0");
		label_20.setOpaque(true);
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setBackground(Color.WHITE);
		label_20.setBounds(108, 264, 27, 24);
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("1");
		label_21.setOpaque(true);
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setBackground(Color.WHITE);
		label_21.setBounds(51, 291, 27, 24);
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("1");
		label_22.setOpaque(true);
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setBackground(Color.WHITE);
		label_22.setBounds(79, 291, 27, 24);
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("1");
		label_23.setOpaque(true);
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setBackground(Color.WHITE);
		label_23.setBounds(108, 291, 27, 24);
		frame.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setOpaque(true);
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_24.setBackground(Color.WHITE);
		label_24.setBounds(310, 84, 56, 20);
		frame.getContentPane().add(label_24);
		
		JButton btnVerificarResposta = new JButton("Verificar resposta");
		btnVerificarResposta.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVerificarResposta.setEnabled(false);
		btnVerificarResposta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		label_24.setText(String.valueOf(contador));
		
		JButton btnTentarNovamente = new JButton("Tentar novamente");
		btnTentarNovamente.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTentarNovamente.setVisible(false);
		btnTentarNovamente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnVerificarResposta.setEnabled(true);
				btnTentarNovamente.setVisible(false);
			
			}
		});
		btnTentarNovamente.setBounds(218, 342, 152, 25);
		frame.getContentPane().add(btnTentarNovamente);
		
		
		
		JLabel lblVocErrou = new JLabel("Você errou!");
		lblVocErrou.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVocErrou.setOpaque(true);
		lblVocErrou.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblVocErrou.setBackground(Color.RED);
		lblVocErrou.setHorizontalAlignment(SwingConstants.CENTER);
		lblVocErrou.setBounds(218, 266, 155, 20);
		lblVocErrou.setVisible(false);
		frame.getContentPane().add(lblVocErrou);
		
		JLabel lblParabnsVocAcertou = new JLabel("Parabéns você acertou!");
		lblParabnsVocAcertou.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblParabnsVocAcertou.setOpaque(true);
		lblParabnsVocAcertou.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblParabnsVocAcertou.setHorizontalAlignment(SwingConstants.CENTER);
		lblParabnsVocAcertou.setBackground(Color.GREEN);
		lblParabnsVocAcertou.setBounds(218, 49, 178, 20);
		lblParabnsVocAcertou.setVisible(false);
		frame.getContentPane().add(lblParabnsVocAcertou);
		
		JButton btnVerExemplo = new JButton("Ver exemplo");
		btnVerExemplo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVerExemplo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Scanner sc = new Scanner(System.in);
				String opcao;
				
				frame.setVisible(false);
				
				rpg.exemploTabelaVerdade();
				
				System.out.println("Gostaria de tentar novamente?");
				opcao=sc.next();
				
				switch (opcao) {
				case "Sim":
				case "s":
				case "sim":
					frame.setVisible(true);
					btnVerificarResposta.setEnabled(true);
					btnTentarNovamente.setVisible(false);
					btnTentarNovamente.setVisible(false);
					btnVerExemplo.setVisible(false);
					lblParabnsVocAcertou.setVisible(false);
					lblVocErrou.setVisible(false);
					break;

				default:
					System.out.println("Entrada inválida");
					break;
				}
				
			}
		});
		btnVerExemplo.setVisible(false);
		btnVerExemplo.setBounds(218, 299, 135, 25);
		frame.getContentPane().add(btnVerExemplo);
		
		
		
		
		
		
		//Ao clicar no botão verificar resposta, ele irá verificar cada resposta dada pelo jogador.
		btnVerificarResposta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int verificadorDeResposta=0;
				
				
				
				
				
				
				//contador de respostas corretas
				if (textField_24.getText().equalsIgnoreCase("0")) {
					verificadorDeResposta++;
					if (textField_25.getText().equalsIgnoreCase("1")) {
						verificadorDeResposta++;
						if (textField_26.getText().equalsIgnoreCase("0")) {
							verificadorDeResposta++;
							if (textField_27.getText().equalsIgnoreCase("1")) {
								verificadorDeResposta++;
								if (textField_28.getText().equalsIgnoreCase("0")) {
									verificadorDeResposta++;
									if (textField_29.getText().equalsIgnoreCase("0")) {
										verificadorDeResposta++;
										if (textField_30.getText().equalsIgnoreCase("1")) {
											verificadorDeResposta++;
											if (textField_31.getText().equalsIgnoreCase("1")) {
												verificadorDeResposta++;
											}
										}
									}
								}
							}
						}
					}
				}
				
				
				
				//caso o jogador tenha acertado a tabela verdade, todas as respostas ficarão verdes.
				if (verificadorDeResposta==8) {
					
					textField_24.setBackground(Color.green);
					textField_25.setBackground(Color.green);
					textField_26.setBackground(Color.green);
					textField_27.setBackground(Color.green);
					textField_28.setBackground(Color.green);
					textField_29.setBackground(Color.green);
					textField_30.setBackground(Color.green);
					textField_31.setBackground(Color.green);
					
					lblParabnsVocAcertou.setVisible(true);
					
					
				//caso o jogador não acerte a tabela verdade, todas as respostas ficarão vermelhas e botões para tentar novamente ou ver exemplo irão aparecer.
				}else {
					
					btnVerificarResposta.setEnabled(false);
					
					btnTentarNovamente.setVisible(true);
					btnVerExemplo.setVisible(true);
					lblVocErrou.setVisible(true);
					
					
					
					
					
					contador++;
					label_24.setText(String.valueOf(contador));
					textField_24.setBackground(Color.red);
					textField_25.setBackground(Color.red);
					textField_26.setBackground(Color.red);
					textField_27.setBackground(Color.red);
					textField_28.setBackground(Color.red);
					textField_29.setBackground(Color.red);
					textField_30.setBackground(Color.red);
					textField_31.setBackground(Color.red);
				}
			}
		});
		
		btnVerificarResposta.setBounds(40, 342, 152, 24);
		frame.getContentPane().add(btnVerificarResposta);
		
		JLabel lblDadaAExpresso = new JLabel("Dada a expressão lógica abaixo, resolva a \r\ntabela verdade:");
		lblDadaAExpresso.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDadaAExpresso.setBounds(12, 13, 410, 32);
		frame.getContentPane().add(lblDadaAExpresso);
		
		JLabel lblTentativa = new JLabel("Tentativa:");
		lblTentativa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTentativa.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTentativa.setBounds(219, 84, 79, 20);
		frame.getContentPane().add(lblTentativa);
		
		JLabel label_25 = new JLabel("");
		label_25.setOpaque(true);
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_25.setBackground(Color.WHITE);
		label_25.setBounds(310, 111, 56, 20);
		frame.getContentPane().add(label_25);
		
		JLabel lblPontos = new JLabel("Pontos:");
		lblPontos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPontos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPontos.setBounds(219, 111, 79, 20);
		frame.getContentPane().add(lblPontos);

		
		
	}
}

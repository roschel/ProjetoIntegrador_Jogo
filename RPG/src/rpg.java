import java.util.List;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class rpg {

	// *****JOÃO******

	// Pontuação
	static int pontuacao(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
		int soma;

		soma = a + b + c + d + e + f + g + h + i + j;

		return soma;
	}

	// EXERCÍCIO 1
	static int fExemploDesafio01() {

		int desafio1 = 0;
		String entradaDesafio1 = "";

		boolean loopDesafio1 = true, loopDesafio555555 = true;

		System.out.println("\n**--- 1º DESAFIO ---**\n\n"
				+ "Para converter um número binário para um número decimal, é necessário:\n"
				+ "Utilizar a tabela de potências de 2:\n" + "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
				+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
				+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
				+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n");
		while (loopDesafio1) {
			System.out.print("Preparado para ir para o jogo?\n"
					+ "Digite 's' [sim] para entrar no desafio ou 'n' [não] para ver novamente o exemplo.\n"
					+ "De uma resposta: ");
			entradaDesafio1 = sc.next();

			if (entradaDesafio1.equalsIgnoreCase("s")) {
				System.out.println(" ");
				desafio1 = fdesafio01();
				loopDesafio1 = false;
			} else {
				System.out.println("\nPara converter um número binário para um número decimal, é necessário:\n"
						+ "Utilizar a tabela de potências de 2:\n"
						+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
						+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
						+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
						+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n");
			}
		}
		return desafio1;
	}

	static void fFeedbackPositivoDesafio1() {
		System.out.println("Parabéns! Você povavelmente fez isto:\n" + "-----* Resolução do desafio *-----\n"
				+ "1*128 + 1*64 + 0*32 + 1*16 + 0*8 + 1*4 + 1*2+ 1*1 = 215\n");
	}

	static int fdesafio01() {
		Scanner sc = new Scanner(System.in);

		// Declarando variáveis
		int nota1 = 0, contador = 0;
		boolean saidaLoop = true;
		String resposta = "";
		List alternativas = new ArrayList();

		// Declarando opções de resposta
		alternativas.add("215"); // resposta correta
		alternativas.add("1010");
		alternativas.add("33");
		alternativas.add("982");
		alternativas.add("76");

		do {

			Collections.shuffle(alternativas);
			System.out.println("Dado o número binário 11010111, converta em número decimal.");
			System.out.println("a) " + alternativas.get(0));
			System.out.println("b) " + alternativas.get(1));
			System.out.println("c) " + alternativas.get(2));
			System.out.println("d) " + alternativas.get(3));
			System.out.println("e) " + alternativas.get(4));
			System.out.print("Escolha uma alternativa: ");
			resposta = sc.next();

			switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals("215") && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(0).equals("215") && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(0).equals("215") && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador==3) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + nota1 + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n\n");
						System.out.println("\nPara converter um número binário para um número decimal, é necessário:\n"
								+ "Utilizar a tabela de potências de 2:\n"
								+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
								+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
								+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
								+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n");
					}
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("215") && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(1).equals("215") && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(1).equals("215") && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador==3) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + nota1 + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n\n");
						System.out.println("\nPara converter um número binário para um número decimal, é necessário:\n"
								+ "Utilizar a tabela de potências de 2:\n"
								+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
								+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
								+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
								+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n");
					}
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("215") && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(2).equals("215") && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(2).equals("215") && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador==3) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + nota1 + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n\n");
						System.out.println("\nPara converter um número binário para um número decimal, é necessário:\n"
								+ "Utilizar a tabela de potências de 2:\n"
								+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
								+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
								+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
								+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n");
					}
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("215") && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(3).equals("215") && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(3).equals("215") && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador==3) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + nota1 + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n\n");
						System.out.println("\nPara converter um número binário para um número decimal, é necessário:\n"
								+ "Utilizar a tabela de potências de 2:\n"
								+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
								+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
								+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
								+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n");
					}
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("215") && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(4).equals("215") && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(4).equals("215") && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador==3) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + nota1 + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n\n");
						System.out.println("\nPara converter um número binário para um número decimal, é necessário:\n"
								+ "Utilizar a tabela de potências de 2:\n"
								+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
								+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
								+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
								+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n");
					}
				}
				break;

			default:
				break;
			}

		} while (saidaLoop && contador != 3);

		if (contador == 3 && nota1 == 0) {
			System.out.println("Você não acertou em nenhuma das 3 tentativas.");
			System.out.println("Sua pontuação no desafio é: " + nota1 + " pontos");
			nota1 = 0;
		}

		return nota1;
	}

	// EXERCÍCIO 4
	static void exemploTabelaVerdade() {

		System.out.println("\n" + "\n\nTabela verdade é um dispositivo utilizado no estudo da\r\n"
				+ "lógica matemática. Com o uso desta tabela é possível definir o valor\r\n"
				+ "lógico de uma proposição, isto é, saber quando uma sentença é\r\n"
				+ "verdadeira ou falsa. Em lógica, as proposições representam\r\n"
				+ "pensamentos completos e indicam afirmações de fatos ou ideias.\r\n" + ""
				+ "A montagem da tabela se da de forma que:"
				+ "Os elementos A, B e C se modificam conforme sua potência. Ou seja:\r\n" + "2^2 2^1 2^0\r\n"
				+ "4    2    1\r\n" + "" + "Significa que o elemento A se alterna a cada 4 repetições.\r\n"
				+ "O elemento B se alterna a cada 2 repetições." + "O elemento C se alterna a cada 1 repetição.\r\n"
				+ "" + "A | B | C | S\r\n" + "0 | 0 | 0 | S1\r\n" + "0 | 0 | 1 | S2\r\n" + "0 | 1 | 0 | S3\r\n"
				+ "0 | 1 | 1 | S4\r\n" + "1 | 0 | 0 | S5\r\n" + "1 | 0 | 1 | S6\r\n" + "1 | 1 | 0 | S7\r\n"
				+ "1 | 1 | 1 | S8\r\n");

		System.out.println("");

	}

	static int fDesafio04(String nome, String time) {

		System.out.println("\n**--- 4º DESAFIO ---**\n" + nome + " o próximo jogo será entre " + time + " e Vitória.");

		exemploTabelaVerdade();
		// Declarando variáveis
		int nota1 = 0, contador = 0;
		boolean saidaLoop = true;
		String a = "\n" + "   A | B | C | S\n" + "   0 | 0 | 0 | 0\r\n" + "   0 | 0 | 1 | 1\r\n"
				+ "   0 | 1 | 0 | 0\r\n" + "   0 | 1 | 1 | 1\r\n" + "   1 | 0 | 0 | 0\r\n" + "   1 | 0 | 1 | 0\r\n"
				+ "   1 | 1 | 0 | 1\r\n" + "   1 | 1 | 1 | 1\r\n";
		// a = resposta certa
		String b = "\n" + "   A | B | C | S\n" + "   0 | 0 | 0 | 1\r\n" + "   0 | 0 | 1 | 1\r\n"
				+ "   0 | 1 | 0 | 0\r\n" + "   0 | 1 | 1 | 0\r\n" + "   1 | 0 | 0 | 1\r\n" + "   1 | 0 | 1 | 1\r\n"
				+ "   1 | 1 | 0 | 0\r\n" + "   1 | 1 | 1 | 1\r\n";

		String c = "\n" + "   A | B | C | S\n" + "   0 | 0 | 0 | 1\r\n" + "   0 | 0 | 1 | 0\r\n"
				+ "   0 | 1 | 0 | 0\r\n" + "   0 | 1 | 1 | 1\r\n" + "   1 | 0 | 0 | 1\r\n" + "   1 | 0 | 1 | 0\r\n"
				+ "   1 | 1 | 0 | 0\r\n" + "   1 | 1 | 1 | 1\r\n";

		String d = "\n" + "   A | B | C | S\n" + "   0 | 0 | 0 | 1\r\n" + "   0 | 0 | 1 | 1\r\n"
				+ "   0 | 1 | 0 | 1\r\n" + "   0 | 1 | 1 | 1\r\n" + "   1 | 0 | 0 | 1\r\n" + "   1 | 0 | 1 | 1\r\n"
				+ "   1 | 1 | 0 | 0\r\n" + "   1 | 1 | 1 | 0\r\n";

		String e = "\n" + "   A | B | C | S\n" + "   0 | 0 | 0 | 0\r\n" + "   0 | 0 | 1 | 1\r\n"
				+ "   0 | 1 | 0 | 1\r\n" + "   0 | 1 | 1 | 0\r\n" + "   1 | 0 | 0 | 0\r\n" + "   1 | 0 | 1 | 1\r\n"
				+ "   1 | 1 | 0 | 1\r\n" + "   1 | 1 | 1 | 1\r\n";
		String resposta = "";

		List alternativas = new ArrayList();

		// Declarando opções de resposta
		alternativas.add(a); // resposta correta
		alternativas.add(b);
		alternativas.add(c);
		alternativas.add(d);
		alternativas.add(e);

		do {

			Collections.shuffle(alternativas);
			System.out.println("Dada a equação S = AB + A'C, qual tabela verdade representa a equação?");
			System.out.println("a) " + alternativas.get(0));
			System.out.println("b) " + alternativas.get(1));
			System.out.println("c) " + alternativas.get(2));
			System.out.println("d) " + alternativas.get(3));
			System.out.println("e) " + alternativas.get(4) + "\n");

			System.out.print("Escolha uma alternativa: ");
			resposta = sc.next();

			switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals(a) && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(0).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(0).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Resposta errada, infelizmente você errou as 3 tentativas e não marcou pontos.\n");

						System.out.println("");
					}else {
						System.out.println("Resposta errada, tente novamente.\n");
						System.out.println("\n" + "\n\nTabela verdade é um dispositivo utilizado no estudo da\r\n"
								+ "lógica matemática. Com o uso desta tabela é possível definir o valor\r\n"
								+ "lógico de uma proposição, isto é, saber quando uma sentença é\r\n"
								+ "verdadeira ou falsa. Em lógica, as proposições representam\r\n"
								+ "pensamentos completos e indicam afirmações de fatos ou ideias.\r\n" + ""
								+ "A montagem da tabela se da de forma que:"
								+ "Os elementos A, B e C se modificam conforme sua potência. Ou seja:\r\n"
								+ "2^2 2^1 2^0\r\n" + "4    2    1\r\n" + ""
								+ "Significa que o elemento A se alterna a cada 4 repetições.\r\n"
								+ "O elemento B se alterna a cada 2 repetições."
								+ "O elemento C se alterna a cada 1 repetição.\r\n" + "" + "A | B | C | S\r\n"
								+ "0 | 0 | 0 | S1\r\n" + "0 | 0 | 1 | S2\r\n" + "0 | 1 | 0 | S3\r\n"
								+ "0 | 1 | 1 | S4\r\n" + "1 | 0 | 0 | S5\r\n" + "1 | 0 | 1 | S6\r\n"
								+ "1 | 1 | 0 | S7\r\n" + "1 | 1 | 1 | S8\r\n");

						System.out.println("");
					}
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals(a) && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(1).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(1).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Resposta errada, infelizmente você errou as 3 tentativas e não marcou pontos.\n");

						System.out.println("");
					}else {
						System.out.println("Resposta errada, tente novamente.\n");
						System.out.println("\n" + "\n\nTabela verdade é um dispositivo utilizado no estudo da\r\n"
								+ "lógica matemática. Com o uso desta tabela é possível definir o valor\r\n"
								+ "lógico de uma proposição, isto é, saber quando uma sentença é\r\n"
								+ "verdadeira ou falsa. Em lógica, as proposições representam\r\n"
								+ "pensamentos completos e indicam afirmações de fatos ou ideias.\r\n" + ""
								+ "A montagem da tabela se da de forma que:"
								+ "Os elementos A, B e C se modificam conforme sua potência. Ou seja:\r\n"
								+ "2^2 2^1 2^0\r\n" + "4    2    1\r\n" + ""
								+ "Significa que o elemento A se alterna a cada 4 repetições.\r\n"
								+ "O elemento B se alterna a cada 2 repetições."
								+ "O elemento C se alterna a cada 1 repetição.\r\n" + "" + "A | B | C | S\r\n"
								+ "0 | 0 | 0 | S1\r\n" + "0 | 0 | 1 | S2\r\n" + "0 | 1 | 0 | S3\r\n"
								+ "0 | 1 | 1 | S4\r\n" + "1 | 0 | 0 | S5\r\n" + "1 | 0 | 1 | S6\r\n"
								+ "1 | 1 | 0 | S7\r\n" + "1 | 1 | 1 | S8\r\n");

						System.out.println("");
					}
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals(a) && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(2).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(2).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Resposta errada, infelizmente você errou as 3 tentativas e não marcou pontos.\n");

						System.out.println("");
					}else {
						System.out.println("Resposta errada, tente novamente.\n");
						System.out.println("\n" + "\n\nTabela verdade é um dispositivo utilizado no estudo da\r\n"
								+ "lógica matemática. Com o uso desta tabela é possível definir o valor\r\n"
								+ "lógico de uma proposição, isto é, saber quando uma sentença é\r\n"
								+ "verdadeira ou falsa. Em lógica, as proposições representam\r\n"
								+ "pensamentos completos e indicam afirmações de fatos ou ideias.\r\n" + ""
								+ "A montagem da tabela se da de forma que:"
								+ "Os elementos A, B e C se modificam conforme sua potência. Ou seja:\r\n"
								+ "2^2 2^1 2^0\r\n" + "4    2    1\r\n" + ""
								+ "Significa que o elemento A se alterna a cada 4 repetições.\r\n"
								+ "O elemento B se alterna a cada 2 repetições."
								+ "O elemento C se alterna a cada 1 repetição.\r\n" + "" + "A | B | C | S\r\n"
								+ "0 | 0 | 0 | S1\r\n" + "0 | 0 | 1 | S2\r\n" + "0 | 1 | 0 | S3\r\n"
								+ "0 | 1 | 1 | S4\r\n" + "1 | 0 | 0 | S5\r\n" + "1 | 0 | 1 | S6\r\n"
								+ "1 | 1 | 0 | S7\r\n" + "1 | 1 | 1 | S8\r\n");

						System.out.println("");
					}
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals(a) && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(3).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(3).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Resposta errada, infelizmente você errou as 3 tentativas e não marcou pontos.\n");

						System.out.println("");
					}else {
						System.out.println("Resposta errada, tente novamente.\n");
						System.out.println("\n" + "\n\nTabela verdade é um dispositivo utilizado no estudo da\r\n"
								+ "lógica matemática. Com o uso desta tabela é possível definir o valor\r\n"
								+ "lógico de uma proposição, isto é, saber quando uma sentença é\r\n"
								+ "verdadeira ou falsa. Em lógica, as proposições representam\r\n"
								+ "pensamentos completos e indicam afirmações de fatos ou ideias.\r\n" + ""
								+ "A montagem da tabela se da de forma que:"
								+ "Os elementos A, B e C se modificam conforme sua potência. Ou seja:\r\n"
								+ "2^2 2^1 2^0\r\n" + "4    2    1\r\n" + ""
								+ "Significa que o elemento A se alterna a cada 4 repetições.\r\n"
								+ "O elemento B se alterna a cada 2 repetições."
								+ "O elemento C se alterna a cada 1 repetição.\r\n" + "" + "A | B | C | S\r\n"
								+ "0 | 0 | 0 | S1\r\n" + "0 | 0 | 1 | S2\r\n" + "0 | 1 | 0 | S3\r\n"
								+ "0 | 1 | 1 | S4\r\n" + "1 | 0 | 0 | S5\r\n" + "1 | 0 | 1 | S6\r\n"
								+ "1 | 1 | 0 | S7\r\n" + "1 | 1 | 1 | S8\r\n");

						System.out.println("");
					}
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals(a) && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(4).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(4).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Resposta errada, infelizmente você errou as 3 tentativas e não marcou pontos.\n");

						System.out.println("");
					}else {
						System.out.println("Resposta errada, tente novamente.\n");
						System.out.println("\n" + "\n\nTabela verdade é um dispositivo utilizado no estudo da\r\n"
								+ "lógica matemática. Com o uso desta tabela é possível definir o valor\r\n"
								+ "lógico de uma proposição, isto é, saber quando uma sentença é\r\n"
								+ "verdadeira ou falsa. Em lógica, as proposições representam\r\n"
								+ "pensamentos completos e indicam afirmações de fatos ou ideias.\r\n" + ""
								+ "A montagem da tabela se da de forma que:"
								+ "Os elementos A, B e C se modificam conforme sua potência. Ou seja:\r\n"
								+ "2^2 2^1 2^0\r\n" + "4    2    1\r\n" + ""
								+ "Significa que o elemento A se alterna a cada 4 repetições.\r\n"
								+ "O elemento B se alterna a cada 2 repetições."
								+ "O elemento C se alterna a cada 1 repetição.\r\n" + "" + "A | B | C | S\r\n"
								+ "0 | 0 | 0 | S1\r\n" + "0 | 0 | 1 | S2\r\n" + "0 | 1 | 0 | S3\r\n"
								+ "0 | 1 | 1 | S4\r\n" + "1 | 0 | 0 | S5\r\n" + "1 | 0 | 1 | S6\r\n"
								+ "1 | 1 | 0 | S7\r\n" + "1 | 1 | 1 | S8\r\n");

						System.out.println("");
					}
				}
				break;

			default:
				break;
			}

		} while (saidaLoop && contador != 3);

		if (contador == 3 && nota1 == 0) {
			System.out.println("Você não acertou em nenhuma das 3 tentativas.");
			System.out.println("Sua pontuação neste desafio é: " + nota1 + " pontos");
			nota1 = 0;
		}

		return nota1;
	}

	// EXERCICIO 6
	static void exemploExercicio6() {
		System.out.println("\n\nPortas ou circuitos lógicos são dispositivos que operam e\r\n"
				+ "trabalham com um ou mais sinais lógicos de entrada para\r\n"
				+ "produzir uma e somente uma saída, dependente da função\r\n" + "implementada no circuito\n");

		System.out.println(
				"Para resolver o próximo desafio, iremos te mostrar uma tabela com todas as portas lógicas conhecidas e suas saídas.\r\n"
						+ "Através da tabela, você estará apto a resolver o desafio.\n");

		System.out.println("");

	}

	static int fDesafio06(String nome, String time) {
		System.out.println("\n**--- 6º DESAFIO ---**\n" + nome + " o próximo jogo será entre " + time + " e Vitória.");
		exemploExercicio6();
		// Declarando variáveis
		int nota1 = 0, contador = 0;
		boolean saidaLoop = true;
		String a = "S = ((AC)'+B+D)' + (ACD)' * C"; // resposta correta
		String b = "S = A*C+B+D + (A+C+D)' * C'";
		String c = "S = (A+C)'+B*D' + (A*C'+D) * C";
		String d = "S = (A*C)'*(B*D) + (A+C*D)' + C'";
		String e = "S = ((A*C)'+B+D)' + (A*C*D)'";
		String resposta = "";

		do {
			System.out.println("Para visualizar a tabela digite [exemplo].\n");
			resposta = sc.next();
			if (resposta.equalsIgnoreCase("exemplo")) {
				CircuitoLogico.main(null);
				saidaLoop = false;
			} else {
				System.out.println("Para visualizar a tabela digite [exemplo].\n");
			}

		} while (saidaLoop);
		saidaLoop = true;

		List alternativas = new ArrayList();

		// Declarando opções de resposta
		alternativas.add(a);
		alternativas.add(b);
		alternativas.add(c);
		alternativas.add(d);
		alternativas.add(e);

		do {

			Collections.shuffle(alternativas);
			System.out.println("Dado o circuito lógico apresentado, qual expressão representa sua saída?");
			System.out.println("a) " + alternativas.get(0));
			System.out.println("b) " + alternativas.get(1));
			System.out.println("c) " + alternativas.get(2));
			System.out.println("d) " + alternativas.get(3));
			System.out.println("e) " + alternativas.get(4) + "\n");

			System.out.print("Escolha uma alternativa ou digite [ajuda] para ver o circuito lógico novamente: ");
			resposta = sc.next();

			switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals(a) && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(0).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(0).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador==3) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + nota1 + " pontos.\n");
					}else {
						System.out.println("Resposta errada, tente novamente.\n");
						contador++;
						exemploExercicio6();
						CircuitoLogico.main(null);
					}
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals(a) && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(1).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(1).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador==3) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + nota1 + " pontos.\n");
					}else {
						System.out.println("Resposta errada, tente novamente.\n");
						contador++;
						exemploExercicio6();
						CircuitoLogico.main(null);
					}
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals(a) && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(2).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(2).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador==3) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + nota1 + " pontos.\n");
					}else {
						System.out.println("Resposta errada, tente novamente.\n");
						contador++;
						exemploExercicio6();
						CircuitoLogico.main(null);
					}
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals(a) && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(3).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(3).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador==3) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + nota1 + " pontos.\n");
					}else {
						System.out.println("Resposta errada, tente novamente.\n");
						contador++;
						exemploExercicio6();
						CircuitoLogico.main(null);
					}
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals(a) && contador == 0) {
					contador = 1;
					nota1 = 3;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(4).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else if (alternativas.get(4).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Você acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
					// fFeedbackPositivoDesafio1();
				} else {
					contador++;
					if (contador==3) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + nota1 + " pontos.\n");
					}else {
						System.out.println("Resposta errada, tente novamente.\n");
						contador++;
						exemploExercicio6();
						CircuitoLogico.main(null);
					}
				}
				break;

			case "ajuda":
				CircuitoLogico.main(null);

			default:
				break;
			}

		} while (saidaLoop && contador != 3);

		if (contador == 3 && nota1 == 0) {
			System.out.println("Você não acertou em nenhuma das 3 tentativas.");
			System.out.println("Sua pontuação no campeonato é: " + nota1 + " pontos");
			nota1 = 0;
		}

		return nota1;
	}

	// PROXIMO DESAFIO
	static void proximoDesafio() {
		boolean saida = true;
		do {
			System.out.println("Digite [proximo] para ir para próximo desafio.");
			String x = input.next();

			if (x.equalsIgnoreCase("proximo")) {
				saida = false;
			}

		} while (saida);
		System.out.println(" ");
	}

	// ******DANILO******//
	static Scanner input = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	static void introdução() {
		// trata-se da parte onde apresentaremos o objetivo do jogo//

		System.out.println("Welcome to the PRO SOCCER LEAGUE!\n" + "\n" + "\n");

		System.out.println("                                        \r\n"
				+ "                     -=                 \r\n" + "                   #@@@%                \r\n"
				+ "                   *@@@@ .              \r\n" + "                    #@%%@@@@@+.         \r\n"
				+ "                   @@%%%%%%@@@@@*       \r\n" + "                   @@%%%%%%@= :=@@      \r\n"
				+ "                   *@%%%%%%@     %@.    \r\n" + "                    @@%%%%%@     :@*    \r\n"
				+ "                     +%%%%%@=           \r\n" + "                     :%%%%%@%           \r\n"
				+ "                  #@@@%%%%@@-           \r\n" + "      .==.       @@@**@%%@#:            \r\n"
				+ "     *@@@@+    +@@@   @@@@              \r\n" + "     *@@@@+   @@@#    @@@=              \r\n"
				+ "      :+-    @@%.     *@@               \r\n" + "       .**@@@@.       +@@               \r\n"
				+ "        -+++#*         @@*              \r\n" + "                       #@@              \r\n"
				+ "                        %@              \r\n" + "                         @%             \r\n"
				+ "                       *@@@:            \r\n" + "                       =:   \n" + "\n");

		System.out.println("O Pro Soccer League, tem como objetivo realizar a integração entre o jogador e o técnico,\n"
				+ "os quais juntos visam superar desafios propostos pelos criadores, baseados na matéria de"
				+ " Conceitos da Computação\n"
				+ "objetivando alcançar grandes resultados ao final da temporada ou semestre.\n"
				+ "Sendo o principal deles fornecer um novo mecanismo de ensino para o professor e de aprendizado para o aluno.\n");
	}

	static String nomejogador() {
		String nome;

		System.out.println("Para iniciarmos o jogo é necessário que escolha o nome do seu jogador.\n");

		System.out.print("Digite o nome do seu jogador, sem ser composto: ");
		nome = input.next();
		System.out.println("\n");

		return nome;
	}

	static String nometime(String nome) {
		String time;

		System.out.println("Para iniciarmos o jogo é necessário que escolha o nome do seu time.\n");

		System.out.print(nome + " digite o nome do seu time, sem composto: ");
		time = input.next();
		System.out.println("\n");

		return time;
	}

	static void historiadesafio1(String nome, String time) {

		System.out.println("Inicia-se a temporada!!\n" + "Já chegamos ao nosso primeiro jogo!\n" + nome
				+ " o primeiro adversário do " + time + " será o Íbis, de Pernambuco\n"
				+ "Para vencê-lo você terá que estudar a estratégia passada pelo treinador\n"
				+ "e resolver o seguinte desafio acerca de números binários.\n" + "\n");
	}

	// EXERCÍCIO 3
	static void exdesafio3() {
		System.out.println(
				"Para realizar a multiplicação de números binários você, você deverá utilizar-se das tabelas abaixo:\n"
						+ "0 x 0 = 0				0 + 0 = 0\n" + "1 x 0 = 0				0 + 1 = 1\n"
						+ "0 x 1 = 0				1 + 0 = 1\n" + "1 x 1 = 1				1 + 1 = 0 e sobe 1\n");

		System.out.println("Por exemplo, a seguinte multiplicação, ficaria da seguinte forma:\n" + "   11\n" + "  x11\n"
				+ "-----\n" + "11 11\n" + "  11+\n" + "------\n" + " 1001\n\n");
	}

	static int fdesafio3(String nome, String time) {

		int contador = 0, ponto = 3;

		String resposta;

		System.out.print("**--- 3º Desafio ---**\n\n");
		System.out.println(nome + " o 3º jogo será entre " + time + " e Criciúma.");

		exdesafio3();

		boolean acertou = false;

		List alternativas = new ArrayList();

		alternativas.add("10000010"); // resposta correta
		alternativas.add("10101010");
		alternativas.add("11100010");
		alternativas.add("10111010");
		alternativas.add("10111110");

		do {
			contador++;
			System.out.println("\n");
			
			System.out.print("Para vencer a terceira partida, você terá que acertar\n"
					+ "a seguinte multiplicação de números binários.\n" + "\n");
			
			System.out.print("1101 x 1010\n" + "\n");

			Collections.shuffle(alternativas);
			System.out.println("A resposta correta é:");
			System.out.println("a) " + alternativas.get(0));
			System.out.println("b) " + alternativas.get(1));
			System.out.println("c) " + alternativas.get(2));
			System.out.println("d) " + alternativas.get(3));
			System.out.println("e) " + alternativas.get(4));

			System.out.print("Escolha uma alternativa: ");
			resposta = input.next();

			switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals("10000010")) {
					System.out.println("Resposta correta! Você acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s).\n");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n");
						exdesafio3();
					}
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("10000010")) {
					System.out.println("Resposta correta! Você acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s).\n");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n");
						exdesafio3();
					}
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("10000010")) {
					System.out.println("Resposta correta! Você acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s).\n");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n");
						exdesafio3();
					}
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("10000010")) {
					System.out.println("Resposta correta! Você acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s).\n");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n");
						exdesafio3();
					}
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("10000010")) {
					System.out.println("Resposta correta! Você acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s).\n");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n");
						exdesafio3();
					}
				}
				break;
			default:
				System.out.println("Escolha inválida!");
			}

		} while (!acertou && contador != 3);

		if (contador == 3 && ponto == 0) {
			System.out.println("Você errou as três tentativas\n");
			System.out.print("Você somou " + ponto + " pontos.\n");
			ponto = 0;
		}

		return ponto;
	}

	// EXERCÍCIO 5
	static void historiadesafio5(String nome, String time) {
		System.out.print("**--- 5º Desafio ---**\n\n");

		System.out.println(nome + " já chegamos ao nosso quinto jogo.\n" + "O próximo adversário do " + time
				+ " será o Goiás\n" + "Para vencê-lo você terá que estudar a estratégia passada pelo treinador\n"
				+ "e simplicar a expressão booleana que será apresentada.\n" + "\n");
	}

	static void exdesafio5() {
		System.out.println(
				"Para realizar a simplicação da expressão booleana que será apresentada, utilize-se dos seguintes postulados e propriedades: \n"
						+ "Postulados: \n" + "A . 0 = 0      A + O = A      A + 1 = 1      A . 1 = A\n"
						+ "A + A' = 1     A . A' = 0     A + A = A      A . A = A\n" + "Propriedade Distributiva:\n"
						+ "A. (B +) = A . B + A . C\n" + "Propriedade Comutativa:\n"
						+ "A + B = B + A         A . B = B . A\n" + "Propriedade Associativa:\n"
						+ "(A + B) + C = A + (B + C)        (A . B) . C = A . (B . C)\n" + "Teorema de De Morgan:\n"
						+ "A' . B' . C' = (A+B+C)'          (A' + B' + C' = (A.B.C)'\n");

		System.out.println("Por exemplo, a simplificação da expressão A + A.B, ficaria da seguinte forma:\n"
				+ "A + A.B =\n" + "A . (1 + B) = \n" + "A . 1 = \n" + "A\n"
				+ "Neste caso foram utilizados a propriedade distributiva e o postulado de adição.\n");
	}

	static void feedbacknegativo() {

		System.out.println("Você errou, verifique novamente o exemplo dado anteriormente.\n");
		exdesafio5();

	}

	static int fdesafio5() {

		int contador = 0, ponto = 3;

		String resposta;

		exdesafio5();

		boolean acertou = false;

		List alternativas = new ArrayList();

		alternativas.add("A"); // resposta correta
		alternativas.add("A.B'");
		alternativas.add("A.C'");
		alternativas.add("A'");
		alternativas.add("A'.B'");

		do {
			contador++;
			System.out.println("\n");
			
			System.out.print("Para vencer a quinta partida, você terá que simplificar\n"
					+ "a seguinte expressão booleana.\n" + "\n");
			
			System.out.print("A.B.C + A.C' + A.B\n" + "\n");

			Collections.shuffle(alternativas);
			System.out.println("A resposta correta é:");
			System.out.println("a) " + alternativas.get(0));
			System.out.println("b) " + alternativas.get(1));
			System.out.println("c) " + alternativas.get(2));
			System.out.println("d) " + alternativas.get(3));
			System.out.println("e) " + alternativas.get(4));

			System.out.print("Escolha uma alternativa: ");
			resposta = input.next();

			switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals("A")) {
					System.out.println("Resposta correta! Você acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s)\n");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n");
						feedbacknegativo();
						ponto--;
					}
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("A")) {
					System.out.println("Resposta correta! Você acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s)\n");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n");
						feedbacknegativo();
						ponto--;
					}
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("A")) {
					System.out.println("Resposta correta! Você acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s)\n");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n");
						feedbacknegativo();
						ponto--;
					}
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("A")) {
					System.out.println("Resposta correta! Você acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s)\n");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n");
						feedbacknegativo();
						ponto--;
					}
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("A")) {
					System.out.println("Resposta correta! Você acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s)\n");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!\n");
						feedbacknegativo();
						ponto--;
					}
				}
				break;
			default:
				System.out.println("Escolha inválida!");
			}

		} while (!acertou && contador != 3);

		if (contador == 3 && ponto == 0) {
			System.out.println("Você errou as três tentativas");
			System.out.print("Você somou " + ponto + " pontos.");
			ponto = 0;
		}

		return ponto;
	}

	// EXERCICIO 9
	static void historiadesafio7(String nome, String time) {

		System.out.println("\n***---9º DESAFIO---***\n\n" + nome + " o próximo jogo do " + time
				+ " será contra o Vasco\n" + "Para vencê-lo você terá que estudar a estratégia passada pelo treinador\n"
				+ "e através do mapa de Karnaugh apresentado mostrar a expressão booleana simplicada.\n" + "\n");
	}

	static void exdesafio7() {
		System.out.println(
				"Para apresentar uma expressão booleana simplicada através do Mapa de Karnaugh é necessário verificar qual das váriaveis\n"
						+ "não varia entre 0 e 1, após realizar os enlaces referentes aos número 1, para não errarmos devemos seguir as seguintes dicas:\n"
						+ "\n" + "1) Fazer primeiro os enlaces com maior número de células, pois caso\n"
						+ "contrário corremos o risco de fazermos agrupamentos que poderiam\n"
						+ "ser substituídos por um maiorse não vejamos.\n" + "\n"
						+ "2) Verificar se em cada enlace existe pelo menos uma célula que\r\n"
						+ "pertença a apenas um enlace, pois corremos o risco de fazermos\r\n"
						+ "enlaces redundantes, ou seja, enlaces perfeitamente dispensáveis.\r\n");

		String[][] MapaKarnaugh = { { "1  1  0  1" }, { "1  1  0  1" }, { "1  1  0  1" }, { "1  1  1  1" } };

		System.out.println("AB|CD\n" + "   00 01 11 10\n" + "00" + " " + MapaKarnaugh[0][0] + "\n" + "01" + " "
				+ MapaKarnaugh[1][0] + "\n" + "11" + " " + MapaKarnaugh[2][0] + "\n" + "10" + " " + MapaKarnaugh[3][0]
				+ "\n");

		System.out.println("");

		System.out.println("Neste caso a resposta correta seria: S = AB' + C' + D'\n");
	}

	static void feedbacknegativoDesafio7() {

		System.out.println("\nVocê errou, verifique novamente o exemplo dado anteriormente.");

		String[][] MapaKarnaugh = { { " 1  1  0  1" }, { " 1  1  0  1" }, { " 1  1  0  1" }, { " 1  1  1  1" } };

		System.out.println("AB|CD\n" + "   00 01 11 10\n" + "00" + " " + MapaKarnaugh[0][0] + "\n" + "01" + " "
				+ MapaKarnaugh[1][0] + "\n" + "11" + " " + MapaKarnaugh[2][0] + "\n" + "10" + " " + MapaKarnaugh[3][0]
				+ "\n" + "");

		System.out.println("");

		System.out.println("Neste caso a resposta correta seria: S = AB' + C' + D'\n");

	}

	static int fdesafio7() {

		int contador = 0, ponto = 3;

		String resposta;

		boolean acertou = false;

		List alternativas = new ArrayList();

		alternativas.add("B'D'+BC'+A'BD+AB'"); // resposta correta
		alternativas.add("AB' + C' + D");
		alternativas.add("AC' + D + B");
		alternativas.add("A' + BC + D");
		alternativas.add("A'B' + C + D");

		do {
			System.out.println("\n");

			System.out.print(
					"Para vencer a nona partida, você terá que demonstrar a expressão booleana simplicada através\n"
							+ "do Mapa de Karnaugh apresentado.\n" + "\n");

			String[][] MapaKarnaugh2 = { { "1  0  0  1" }, { "1  1  1  0" }, { "1  1  0  0" }, { "1  1  1  1" } };

			System.out.println("AB|CD\n" + "   00 01 11 10\n" + "00" + " " + MapaKarnaugh2[0][0] + "\n" + "01" + " "
					+ MapaKarnaugh2[1][0] + "\n" + "11" + " " + MapaKarnaugh2[2][0] + "\n" + "10" + " "
					+ MapaKarnaugh2[3][0] + "\n" + "");

			System.out.println("");

			contador++;

			Collections.shuffle(alternativas);
			System.out.println("A resposta correta é:");
			System.out.println("a) " + alternativas.get(0));
			System.out.println("b) " + alternativas.get(1));
			System.out.println("c) " + alternativas.get(2));
			System.out.println("d) " + alternativas.get(3));
			System.out.println("e) " + alternativas.get(4));

			System.out.print("Escolha uma alternativa: ");
			resposta = input.next();

			switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals("B'D'+BC'+A'BD+AB'")) {
					System.out
							.println("Resposta correta! " + contador + "ª tentativa, você fez " + ponto + " ponto(s)");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!");
						feedbacknegativoDesafio7();
						ponto--;
					}
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("B'D'+BC'+A'BD+AB'")) {
					System.out
							.println("Resposta correta! " + contador + "ª tentativa , você fez " + ponto + " ponto(s)");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!");
						feedbacknegativoDesafio7();
						ponto--;
					}
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("B'D'+BC'+A'BD+AB'")) {
					System.out
							.println("Resposta correta! " + contador + "ª tentativa , você fez " + ponto + " ponto(s)");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!");
						feedbacknegativoDesafio7();
						ponto--;
					}
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("B'D'+BC'+A'BD+AB'")) {
					System.out
							.println("Resposta correta! " + contador + "ª tentativa , você fez " + ponto + " ponto(s)");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!");
						feedbacknegativoDesafio7();
						ponto--;
					}
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("B'D'+BC'+A'BD+AB'")) {
					System.out
							.println("Resposta correta! " + contador + "ª tentativa , você fez " + ponto + " ponto(s)");
					acertou = true;
				} else {
					ponto--;
					if (ponto==0) {
						System.out.println("Você errou as três tentativas\n");
						System.out.print("Você somou " + ponto + " pontos.\n");
					}else {
						System.out.println("Resposta incorreta!");
						feedbacknegativoDesafio7();
						ponto--;
					}
				}
				break;
			default:
				System.out.println("Escolha inválida!");
			}

		} while (!acertou && contador != 3);

		if (contador == 3 && ponto == 0) {
			System.out.println("Você errou as três tentativas");
			System.out.print("Você somou " + ponto + " pontos.");
			ponto = 0;
		}

		return ponto;
	}

	// EXERCICIO 7
	static int ex9(String nome, String time) {

		List alternativas = new ArrayList();
		int i = 0;
		int contN = 0;
		int ponto = 3;
		String n1;
		boolean saida = true;

		alternativas.add("XY|Z\n" + "   0 1\n" + "00|0 0\n" + "01|0 0\n" + "11|1 1\n" + "10|0 1\n" + "S=XY+XZ\n"); // resposta
																													// correta

		alternativas.add("XY|Z\n" + "   0 1\n" + "00|1 0\n" + "01|1 0\n" + "11|1 1\n" + "10|0 1\n" + "S=XZ\n");

		alternativas.add("XY|Z\n" + "   0 1\n" + "00|0 1\n" + "01|0 1\n" + "11|1 1\n" + "10|0 1\n" + "S=XY\n");

		alternativas.add("XY|Z\n" + "   0 1\n" + "00|0 0\n" + "01|1 0\n" + "11|1 1\n" + "10|1 1\n" + "S=X\n");

		alternativas.add("XY|Z\n" + "   0 1\n" + "00|0 0\n" + "01|0 0\n" + "11|1 1\n" + "10|1 1\n" + "S=XY'\n");

		System.out.println("** DESAFIO 7 ** \n" + "\n" + nome + " o próximo jogo do " + time
				+ " será contra o Bragantino.\n"
				+ "Para vencê-lo você terá que estudar a estratégia passada pelo treinador\n"
				+ "e preencher o Mapa de Karnaugh, através da expressão booleana que será apresentada.\n" + "\n"
				+ " Um pouco mais abaixo tem alguns exemplos para te auxiliar na resolução do esquema. Boa sorte!!! \n"
				+ "\n");

		System.out.println(
				"0a088WMMMMMMM@MMM@MMM@M@M@MWMMMMMMMMMMMMMMMMM@MMM@M@M@M@M@MMM@MMMMMMM@MMMMMMMMMMMMMMM@M@@B@MWB@Z080Z\r\n"
						+ "Za2882:,...................i.........................................................:..:r:.ZaX0aZaa\r\n"
						+ "0a0ZM..2 .0ii;;,i,;;;:;,:,;X7.i:r;;iri;r772XXrr:r:.SSX7r7iXXSXSXaa2X2ZZXXX272X22ZXX7S2Z2ZaB..S.@BZ8a\r\n"
						+ "ZZa0M...iMWWB@W@W@BWB@W@@@WBBMWMW@B@B@BWBB0B0WB@M@.M@BBWBW0B0BZ0Z8Z08B8WBW0B0B8B8B8B800080BM...M0ZaZ\r\n"
						+ "0a88M.:MMZ8Z8Z8Z0Z8Z8Z0Z8Z8Z8@MMM88Z8a8Z0Z8Z8Z88MS.MBZZZ8Z8ZZZ8a8ZZa8a8aZZ8Z8ZZaZa0Z8Z8aZa08MW.@BZ8a\r\n"
						+ "aZZ8@..M88Z8ZZZZZZZZZZaZ28a8Mi...MZZZ00B8088aZZ0Wa M88aZZZZZX8Z0a8ZZX2XaSBBW222Z2ZZ8aZ2ZaZa0B8.M88Z8\r\n"
						+ "0a8ZM..M8a8aZaZ28aZaZZ8Z8Z8Br.a..M8Z802@MZaaaa8ZMS.@BZ0Z0a8Z0@M@@Z8a8a8BZ.2.X08aZa8aZZ8ZZZ8ZWZ.MB88a\r\n"
						+ "ZZaZW.;MZ8Z8aZa8Z8ZZZ0ZZZZZB2i..0@Z00M....X0Z0Z0WX.M00ZZZ8Z0M,..X@Z8Z88Wr. .M0aZaZ2ZZ8Z0ZZa8BB.M08aZ\r\n"
						+ "Z28Z@,.@0Z8Z8a8Z8a8Z8a8ZZa8ZBWMMBaZZ0....MWa88ZZM;.@BZ8ZZZ0B:.B,.@82ZZW..20.808ZZaZaZ2ZZ8Z8Z@2.MBZ8a\r\n"
						+ "ZZZ8W:.@80Z8ZZZ0a8Z8a8aZZZa8Z8ZZZZZZ8ZMM.rB0BW80@7 M0ZaZa8ZW.i..;M0ZSZZB@MWWa0ZZZ8Z8aZZZa8Z0@S.MZZZZ\r\n"
						+ "Z2ZZW;:MMMM@@WM@W0@00ZZZ8ZZa8ZZZZaZaZa88BZ0Br.S@Mr.M0a8ZZaZa@M0MM.M80a8aZZ0Z8a8Z0W@MMW@B@BM@MW.MBZZa\r\n"
						+ "aZZ8WX.......:...r,r80ZZa88MMM8Z2aZZa8aZ2Z0:.i..@r.M88aZ2Z2ZB; .2..MZ82Z2ZaZaZZ0ai...i.........M08ZZ\r\n"
						+ "ZaZZ@;.,........ira.;W0aZ80...8ZZ2aS2Sa2a2W..;..M:.M82aSa2aS8a..M@..MZ82ZaZZ8a0M.ia.,:i:..:....WBZ8a\r\n"
						+ "ZZZZW:.MMM@@0@W@WW@.,MMMBW..B..MZZaaaZSS2Z2BS.7M@i.Maa2Z2a28ZM..M@@..MZZ2a2Z2Z8M 2MM@MWM@MWMMM.W8ZZZ\r\n"
						+ "8a8ZM..MW80aaa0Z0WM.;M..Z@.i..rBZ2a28S2S82a20BW8@,.M0XXXS72SZM..MZMB.;MaZ2aaZaB@.ZM00Z8Z0Z08MW.MBa82\r\n"
						+ "ZZZ8@:.M08ZM00BMBX:.....;MWa:@M82ZaZaSSZZ2SZa88B@;.M0BaZZZaZaM..WSX0r.aMaZZ08M@M.r00@MMMBMZ08@.W00ZZ\r\n"
						+ "8Z8ZMi......MW:...r..@MrMZ88B.0ZZZZaaXaZZXZaB0;;2..;..X@0aZ2aM..M222@:..XZ80X..,........M..... 0WZ8Z\r\n"
						+ "ZZZBM..M0MM ...rBM@. .MM88Z8@.iBZ0Z0aZ802ZZMr.:2Wi.MZr..00S2ZM..WZa887..@M8..SW: X@MZ. .M MMMM.8M0ZZ\r\n"
						+ "Za02a..@@a. ZWMMB0M.,..@0a8ZM..@00aiM@BaZZ@:.ZBZM,.M0BM..W8a0@..@aZS0@M...rZ@@....MZ@BWM0.M0@M.@;aBa\r\n"
						+ "a0W....M0X;.@MZa8BM..M.ZBZa8@..MZW2..;.S808.8B20Br.M88ZM..W88M.208aZaW..@..MBX.M..@0Z20Ma.M0BW M SBZ\r\n"
						+ "8aM....M0WW.M@. .MM..@..Ma00M.8008M@. .M807.MZ8ZWi.@8SZ@;.MZB@.002ZaZ8X...00M..M..MB..:M2.M8W@.@.ZWZ\r\n"
						+ "ZZBX...MZB8.BB8200@..M.008BM..@0a@...M.0Z0Z.2@88B7.MaZ0M..@Z0Z.MZ22Z2Z0@Z@8ZZX.M..M0ZZZ@S.M08M.M.X08\r\n"
						+ "8a00M..MWBM.B8000ZM...i@00Mr.WWZ8ZraM0B2ZZ0:.SW0Mr.@0WM..W0aM..M8X2ZZXa2aX22Z@....M88Z0BX.M0BM.2B80Z\r\n"
						+ "8aZBM..MZ8W.a0aZa8M. WM0WX  7MZZaZZ8aa2a2a20S..i8X.WX;..W0a8M..MZaSZS22Z2aSZZ0W;.i@8aZZ@,.@B0M S@BZa\r\n"
						+ "0Z8ZM..,....WZ8aZZM..@BBM@..a8aaZ2aaZ2a2aZM@MWX.,. ...2WZ2ZZM.;8ZX20MZBB0Za2Za0M.;WaZaZ8Z....,.XMZ8a\r\n"
						+ "ZZZ0M..M@@0@8ZaZa8M..M0B..;MWZ2aaaSa22XS8,...Z8WWr.MWZ2Z2Z20S.WZZ8B..MB.i022SZaM.iB0aZZ80MBWWM.S@8aZ\r\n"
						+ "02ZZM. MWZ0Z8Z8Z8ZM..M@..@..@aaaaaZ2Zaaa;.Xr 7BZWr.@Z2Z2Za8@.,MZ8Z00...iW2Z2Za8W..MZ8a8aZZ08WM.rMZ8a\r\n"
						+ "8ZZ0M..MMMW@WM@@WMM..M0i...0BZaa2aZZ2WMM7...:@S0M2.MZ0aZa8Z8.8ZaSZZ.....X0Z8aaaM..MMMMMM@MMWWM.i@ZZZ\r\n"
						+ "0a8ZM..X.............M0W8;WS28@BBB@@M...M0X8@Z,.:i.@MM@ZZaB..WZZZa0,W@MXXZZaa2aW............;7.iM88a\r\n"
						+ "aaa0Mi.M;;r;;i:7...7B0Z0ZWBr.......... .MZaZZaaa.. .X..MZB@M@0ZZaZZBZ8a0ZZSZaZa0BX,:...:i:.rS@.rM0ZZ\r\n"
						+ "8a8ZM;.@MBWBWW@BM@@B8aZaZZ80WZr.....XB8@8Z8ZaSa8M0.a.  M@0...B82ZaZaaSZ2ZZ@Z8Z0a0WWBMWMW@B@B@M ;MZ0a\r\n"
						+ "ZZa8@X.MZ0Z8Z8Z8Z0Z8aZ2ZaZa8Z0BMWM@W0WBZM@02aaZ8Za.MXSM@r..8 28Z2Z2aaa28Z8.MM0i0Z8Z8a8Z8Z8Z08M.SW0ZZ\r\n"
						+ "0aZZWX.M0aZZZZZZ8aZZ8Z8ZZaZaB@M@M8Z2aZB.,W.;0Z8a0S.BMW00X.:..W8aZZ8ZZaZZ8B..7.2BZaZZZa8ZZaZa0M.rMZ8a\r\n"
						+ "ZZZ8B2.M88aZaZZZa8ZZZZZZaZZBX....B8ZaZWM...@8ZZZZZ.@ZZZ8ZWX8M0ZZa8aZaZaZZW@. .Z0ZZaZaZZZaZZ88M.X@0aZ\r\n"
						+ "0aZZM2.MBaZaZaZaZZZa8aZZZ28Br..8..@aZZ0..Z:.aZZa0Z.B8aZZ8Z0Z8ZZaZZZaZa8Z0B..M2.70aZZZaZa8aZZBM.SMZ0a\r\n"
						+ "ZaZ0@r M08Z8Z8a8a8aZZ8a8aZa8WS...W8Za8SiM@@BZZaZ80.W88a8S2a0aZa8Z0Z8a8Z8a8aM0WB0a8a8a8ZZZZZZ0M.ZBZZZ\r\n"
						+ "0aZZMX.MM80ZZZ8a8Z0Z8Z8Z0Z8Z0BMMMZ8Z8Z0B0Z8Z8ZZZB8.W0a8Z8Z0Z080808080ZZZ8ZBZ0Z0ZZa8Z8Z0Z0Z00M@.a@aZZ\r\n"
						+ "Z8Z0Wa.i.MWW8WBB0W0B8B0W000W000BBW0WWWBW0@@MW@@MMM.M@MWM@M@M@M@M@M@MB@W@@MMM@MMM@MMMMMMMMMMM.:.aW0Z8\r\n"
						+ "0a8Z@2.@..02aX2SXrS2ZXSi727rXZ2rX;r;;i77S;irrri:7;.7X7;:;i::,:i.....;:i.....,.............r..8.SM8Za\r\n"
						+ "ZZaZ8M:....,,..,...:7;;:.2;;ia;;ii,;...Xr....,...........................:..ir.::i:;...::;;raXZWZZ2Z");

		do {
			String seguir = "Aceito";
			String recusa = "Sair";
			System.out.println("\n" + "Digite ACEITO para começar o desafio");
			String resposta = ler.next();

			if (resposta.equalsIgnoreCase(seguir)) {

				do {
					// EXEMPLO
					System.out.println("\n\n         EXEMPLO\n"
							+ "Para preencher o Mapa de Karnaugh através de uma expressão booleana, assuma que a entrada NÃO barrada representa 1\n"
							+ "e a entrada barrada representa 0.\n" + "\n"
							+ "Dessa forma, a expressão booleana S = xy + xy, representada no Mapa de Karnaugh ficaria da seguinte forma:"
							+ "\n" + "X|Y\n" + "    0   1\n" + "0 | 0 | 0\n" + "1 | 0 | 1\n" + "\n"
							+ "Sendo que neste caso, a expressão simplicada seria s = xy.");

					System.out.print("Para vencer a NONA partida, você terá que acertar\n"
							+ "qual Mapa de Karnaugh esta preenchido corretamente e qual a expressão booleana simplicada.\n"
							+ "\n");

					contN++;
					Collections.shuffle(alternativas);

					System.out.println("\n" + "RESPONDA \n"
							+ "Levando-se em consideração a expressão booleana XZ + XYZ', qual Mapa de Karnaugh esta preenchido corretamente\n"
							+ "e qual a expressão booleana que o mesmo apresenta?" + "\n" + "\n" + "\n" + "a) "
							+ alternativas.get(0) + "\n" + "b) " + alternativas.get(1) + "\n" + "c) "
							+ alternativas.get(2) + "\n" + "d) " + alternativas.get(3) + "\n" + "e) "
							+ alternativas.get(4) + "\n" + "\n" + "RESPOSTA: ");
					n1 = ler.next();

					System.out.println("");
					switch (n1) {
					case "a":
					case "A":
						if (alternativas.get(0).equals("XY|Z" + "   0 1\n" + "00|0 0\n" + "01|0 0\n" + "11|1 1\n"
								+ "10|0 1\n" + "S=XY+XZ\n")) {
							System.out.println(
									"       ....      ..   .     ...                                                                     \r\n"
											+ "                                                                                                    \r\n"
											+ "    ....              .    ..     ...                                                               \r\n"
											+ "   .    ..               .    ..       .                                                            \r\n"
											+ "  ,       .               ..    ..        ..                                                        \r\n"
											+ "           ...              ..    .  ..,.,......                                                    \r\n"
											+ ".             ..              .    .,.   .      ...                                                 \r\n"
											+ "                ..             .   .       .        ..                                              \r\n"
											+ "  .                ..           . . ,..      .          ...                                         \r\n"
											+ "   ..                ..         ..  ...,..     .           ...                                      \r\n"
											+ "     ..                ..       ..      ..,,.   .             ...                                   \r\n"
											+ "       ...               .   ......         .,,. .               ...                                \r\n"
											+ "          ...            ....       ..          ..,,,               ...                             \r\n"
											+ "             .     ........           ..           ..:,.               . .                          \r\n"
											+ "              .  ....      ..           ..             .,,.              .:..                       \r\n"
											+ "               ,..            ...         ..              .:,          ,..   ...                    \r\n"
											+ "             ..                   ..        ..              ...                 ..                  \r\n"
											+ "       . . .. .                      ..        .               :   ;zYi:.         ..                \r\n"
											+ "   ...    ..   .                       ..       ..          CMMMv 0MMMMMMMMM8       ..              \r\n"
											+ "         ..     ..                       ..       ..     ..CMMMMi MMMMMMMMMMM$.,      ..            \r\n"
											+ "         .        .                        ..       . ,.,      .  .@MMMz:       ..,.    .           \r\n"
											+ "         .         ...                      ..     ...     ...      v.             ...   .          \r\n"
											+ "         ..           .                          .:.  .,,..           .               :   .         \r\n"
											+ "          .             ..                      .7  ,:.                :.              7.           \r\n"
											+ "           ..             .       . . .      .C 6..,.               .   .:.             EQY         \r\n"
											+ "            ..             ...              QMM: ,.                 .     .i.           :MMMQ       \r\n"
											+ "             ...            ...            WMMM6 .                  .       ::          .M@MM#      \r\n"
											+ "           .   ..              ..         SMMMM@                   YMI        :,        ,M#@MMZ     \r\n"
											+ "        ..       ..              .       .MMMMM@                ;WMMMMM@1      .:       QM@#MMM:    \r\n"
											+ "       .           .              .      MMMMMM@ ::,..       .6MMM###@@MMM@:     i   ...@MMM@MMM    \r\n"
											+ "      .             ..             .    iMMMMMMv ,. . .,:..:$MM##$#$##@@@MMMM7..,,::     vMMMMMM;   \r\n"
											+ "     .                ..            .   BMMMMM;  .,.      YMM@$#$#$@#@@@@M@MMMM    :      .MMMMM#   \r\n"
											+ "    .                  ..           .   MMMMM:  . .,.      MM##$####@@@@@@MMMM      i       MMMMM   \r\n"
											+ "   .                    ..           . ,:tv,   ...  .:.    ;M@###@@@@@@M@MMMMQ      .,   .  .vii,   \r\n"
											+ "  ,                      ..    ....  . ., Yt ,,....   ,,    MM@@@@@@@@M@MMMMM       .,..,... i$.:.  \r\n"
											+ "  .                       .  ..        czY;A,:,,....   .,.   MMM@M@MMMMMMMMM7       .,.....,.vv,Y:  \r\n"
											+ "                          ...          :oY;2i::,,.... .  .,  nMMMMMMMMMMMMM@       .:.....,,,7Yit,  \r\n"
											+ "                           .           .C7;Ivi::,:,.....  .,  MMMMMMMMMMMMM    ..,.,.....,,:,zicn.  \r\n"
											+ "  .                       .             YvYC2iii:,:,,.....  ..:            ...,...,...,,,,::cS;7t   \r\n"
											+ "  ..                     ..           . ,7;;ICi;ii::,,,.... ,,              i. ....,.,,::::i2Xct;   \r\n"
											+ "   ..                   ..            .  ;;icUci;ii::,,,,..i:.,.......,.... .i:...,,,,:,:,,1z;Y7.   \r\n"
											+ "     .                 . .            .   ;i:vIY,,,:::::.,;:...,.,............i;...,.,...ibSivY,    \r\n"
											+ "       ..           ...  .        ... .   ,ii.8M#I7i,...,7:,::.,,..,,.,.,,,,,,,v. ...:76@MMiiv:     \r\n"
											+ "         ...      ..     ..    ...       . .:.EMMMMM@#QQW:,iii...:::,::::::::ii: 8MMMMMMMMM;,: .    \r\n"
											+ "             .  .         .   .          .  . CMMMMMMMMMM7,i7: .;;iiiiiiiiiii;;. MMMMMMMMMM..       \r\n"
											+ "             ....          ..            .    .MMMMMMM@MMMtiv ,C77cYvYvYvYcY;i1..MMMMMMMMMI         \r\n"
											+ "          ...    .        . ..           .      @MMMMMMMMMMQ  CY7Y7Y7YX77YYi.tM SMMMMMMMM:          \r\n"
											+ "         .        .     ..    ..         .       iMMMMMMMMM; C:ii;i;;;i;ii,:QM@ MMMMMMM2   .        \r\n"
											+ "       ..          .  ..        .        .         :MMMMMM: $Mz:;i;i;i;i;vY#MM7 MMMMM7    .         \r\n"
											+ "      .            . .           ..     ..            YMM.  2Y.,:i:i:i:i::. :E CMMo      .          \r\n"
											+ "     .             ..              .    .                 ..  . . . . . ...           ..            \r\n"
											+ "    .              .                ..  .          .....   ,     . . ... .   ..      .              \r\n"
											+ "   ..             .                  ...      ..,,..  .   .,          .      ,.   ..                \r\n"
											+ "   .              .                   ..    .:..     .     :         .       :  ..                  \r\n"
											+ "  .              .                    .   ,:.       ..    .:        ..      :. .                    \r\n"
											+ "  .              .                    .  i.         .      i       ...     .,.                      \r\n"
											+ "  .             .                    ...i           .      :  ...     . . ..                        \r\n"
											+ "  .             .                    ..:           ..... . :.        .    .                         \r\n"
											+ "  .            .                    ..,      .. .     .    :         .   ..                         \r\n"
											+ "  .            .                   ...   ...          .    :.        .  ..                          \r\n"
											+ "  .           .                  ...,  ..             .    ,.       .  ..                           \r\n"
											+ "   .         .                 ....:.                .     :       .  .                             \r\n"
											+ "    .      ..                .,.  :,                .      :       ,,.                              \r\n"
											+ "     .   .               .....   .:               ..       i     .,..                               \r\n"
											+ "      ...       . .....          i.              ..       .,   .:,  .                               \r\n"
											+ "     ...     ,..                .:              .         ,. ,,:.  .                                \r\n"
											+ "   ..  .   ..                   i               .         i,:...  ..                                \r\n"
											+ "  .    .  .                     :              ...       :,    .  .                                 \r\n"
											+ "        ..                     ,v             .     .   .i      ...                                 \r\n"
											+ "                               : .                      ..                                          ");
							System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n");
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					case "b":
					case "B":
						if (alternativas.get(1).equals("XY|Z\n" + "   0 1\n" + "00|0 0\n" + "01|0 0\n" + "11|1 1\n"
								+ "10|0 1\n" + "S=XY+XZ\n")) {
							System.out.println(
									"       ....      ..   .     ...                                                                     \r\n"
											+ "                                                                                                    \r\n"
											+ "    ....              .    ..     ...                                                               \r\n"
											+ "   .    ..               .    ..       .                                                            \r\n"
											+ "  ,       .               ..    ..        ..                                                        \r\n"
											+ "           ...              ..    .  ..,.,......                                                    \r\n"
											+ ".             ..              .    .,.   .      ...                                                 \r\n"
											+ "                ..             .   .       .        ..                                              \r\n"
											+ "  .                ..           . . ,..      .          ...                                         \r\n"
											+ "   ..                ..         ..  ...,..     .           ...                                      \r\n"
											+ "     ..                ..       ..      ..,,.   .             ...                                   \r\n"
											+ "       ...               .   ......         .,,. .               ...                                \r\n"
											+ "          ...            ....       ..          ..,,,               ...                             \r\n"
											+ "             .     ........           ..           ..:,.               . .                          \r\n"
											+ "              .  ....      ..           ..             .,,.              .:..                       \r\n"
											+ "               ,..            ...         ..              .:,          ,..   ...                    \r\n"
											+ "             ..                   ..        ..              ...                 ..                  \r\n"
											+ "       . . .. .                      ..        .               :   ;zYi:.         ..                \r\n"
											+ "   ...    ..   .                       ..       ..          CMMMv 0MMMMMMMMM8       ..              \r\n"
											+ "         ..     ..                       ..       ..     ..CMMMMi MMMMMMMMMMM$.,      ..            \r\n"
											+ "         .        .                        ..       . ,.,      .  .@MMMz:       ..,.    .           \r\n"
											+ "         .         ...                      ..     ...     ...      v.             ...   .          \r\n"
											+ "         ..           .                          .:.  .,,..           .               :   .         \r\n"
											+ "          .             ..                      .7  ,:.                :.              7.           \r\n"
											+ "           ..             .       . . .      .C 6..,.               .   .:.             EQY         \r\n"
											+ "            ..             ...              QMM: ,.                 .     .i.           :MMMQ       \r\n"
											+ "             ...            ...            WMMM6 .                  .       ::          .M@MM#      \r\n"
											+ "           .   ..              ..         SMMMM@                   YMI        :,        ,M#@MMZ     \r\n"
											+ "        ..       ..              .       .MMMMM@                ;WMMMMM@1      .:       QM@#MMM:    \r\n"
											+ "       .           .              .      MMMMMM@ ::,..       .6MMM###@@MMM@:     i   ...@MMM@MMM    \r\n"
											+ "      .             ..             .    iMMMMMMv ,. . .,:..:$MM##$#$##@@@MMMM7..,,::     vMMMMMM;   \r\n"
											+ "     .                ..            .   BMMMMM;  .,.      YMM@$#$#$@#@@@@M@MMMM    :      .MMMMM#   \r\n"
											+ "    .                  ..           .   MMMMM:  . .,.      MM##$####@@@@@@MMMM      i       MMMMM   \r\n"
											+ "   .                    ..           . ,:tv,   ...  .:.    ;M@###@@@@@@M@MMMMQ      .,   .  .vii,   \r\n"
											+ "  ,                      ..    ....  . ., Yt ,,....   ,,    MM@@@@@@@@M@MMMMM       .,..,... i$.:.  \r\n"
											+ "  .                       .  ..        czY;A,:,,....   .,.   MMM@M@MMMMMMMMM7       .,.....,.vv,Y:  \r\n"
											+ "                          ...          :oY;2i::,,.... .  .,  nMMMMMMMMMMMMM@       .:.....,,,7Yit,  \r\n"
											+ "                           .           .C7;Ivi::,:,.....  .,  MMMMMMMMMMMMM    ..,.,.....,,:,zicn.  \r\n"
											+ "  .                       .             YvYC2iii:,:,,.....  ..:            ...,...,...,,,,::cS;7t   \r\n"
											+ "  ..                     ..           . ,7;;ICi;ii::,,,.... ,,              i. ....,.,,::::i2Xct;   \r\n"
											+ "   ..                   ..            .  ;;icUci;ii::,,,,..i:.,.......,.... .i:...,,,,:,:,,1z;Y7.   \r\n"
											+ "     .                 . .            .   ;i:vIY,,,:::::.,;:...,.,............i;...,.,...ibSivY,    \r\n"
											+ "       ..           ...  .        ... .   ,ii.8M#I7i,...,7:,::.,,..,,.,.,,,,,,,v. ...:76@MMiiv:     \r\n"
											+ "         ...      ..     ..    ...       . .:.EMMMMM@#QQW:,iii...:::,::::::::ii: 8MMMMMMMMM;,: .    \r\n"
											+ "             .  .         .   .          .  . CMMMMMMMMMM7,i7: .;;iiiiiiiiiii;;. MMMMMMMMMM..       \r\n"
											+ "             ....          ..            .    .MMMMMMM@MMMtiv ,C77cYvYvYvYcY;i1..MMMMMMMMMI         \r\n"
											+ "          ...    .        . ..           .      @MMMMMMMMMMQ  CY7Y7Y7YX77YYi.tM SMMMMMMMM:          \r\n"
											+ "         .        .     ..    ..         .       iMMMMMMMMM; C:ii;i;;;i;ii,:QM@ MMMMMMM2   .        \r\n"
											+ "       ..          .  ..        .        .         :MMMMMM: $Mz:;i;i;i;i;vY#MM7 MMMMM7    .         \r\n"
											+ "      .            . .           ..     ..            YMM.  2Y.,:i:i:i:i::. :E CMMo      .          \r\n"
											+ "     .             ..              .    .                 ..  . . . . . ...           ..            \r\n"
											+ "    .              .                ..  .          .....   ,     . . ... .   ..      .              \r\n"
											+ "   ..             .                  ...      ..,,..  .   .,          .      ,.   ..                \r\n"
											+ "   .              .                   ..    .:..     .     :         .       :  ..                  \r\n"
											+ "  .              .                    .   ,:.       ..    .:        ..      :. .                    \r\n"
											+ "  .              .                    .  i.         .      i       ...     .,.                      \r\n"
											+ "  .             .                    ...i           .      :  ...     . . ..                        \r\n"
											+ "  .             .                    ..:           ..... . :.        .    .                         \r\n"
											+ "  .            .                    ..,      .. .     .    :         .   ..                         \r\n"
											+ "  .            .                   ...   ...          .    :.        .  ..                          \r\n"
											+ "  .           .                  ...,  ..             .    ,.       .  ..                           \r\n"
											+ "   .         .                 ....:.                .     :       .  .                             \r\n"
											+ "    .      ..                .,.  :,                .      :       ,,.                              \r\n"
											+ "     .   .               .....   .:               ..       i     .,..                               \r\n"
											+ "      ...       . .....          i.              ..       .,   .:,  .                               \r\n"
											+ "     ...     ,..                .:              .         ,. ,,:.  .                                \r\n"
											+ "   ..  .   ..                   i               .         i,:...  ..                                \r\n"
											+ "  .    .  .                     :              ...       :,    .  .                                 \r\n"
											+ "        ..                     ,v             .     .   .i      ...                                 \r\n"
											+ "                               : .                      ..                                          ");
							System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n");
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					case "c":
					case "C":
						if (alternativas.get(2).equals("XY|Z\n" + "   0 1\n" + "00|0 0\n" + "01|0 0\n" + "11|1 1\n"
								+ "10|0 1\n" + "S=XY+XZ\n")) {
							System.out.println(
									"       ....      ..   .     ...                                                                     \r\n"
											+ "                                                                                                    \r\n"
											+ "    ....              .    ..     ...                                                               \r\n"
											+ "   .    ..               .    ..       .                                                            \r\n"
											+ "  ,       .               ..    ..        ..                                                        \r\n"
											+ "           ...              ..    .  ..,.,......                                                    \r\n"
											+ ".             ..              .    .,.   .      ...                                                 \r\n"
											+ "                ..             .   .       .        ..                                              \r\n"
											+ "  .                ..           . . ,..      .          ...                                         \r\n"
											+ "   ..                ..         ..  ...,..     .           ...                                      \r\n"
											+ "     ..                ..       ..      ..,,.   .             ...                                   \r\n"
											+ "       ...               .   ......         .,,. .               ...                                \r\n"
											+ "          ...            ....       ..          ..,,,               ...                             \r\n"
											+ "             .     ........           ..           ..:,.               . .                          \r\n"
											+ "              .  ....      ..           ..             .,,.              .:..                       \r\n"
											+ "               ,..            ...         ..              .:,          ,..   ...                    \r\n"
											+ "             ..                   ..        ..              ...                 ..                  \r\n"
											+ "       . . .. .                      ..        .               :   ;zYi:.         ..                \r\n"
											+ "   ...    ..   .                       ..       ..          CMMMv 0MMMMMMMMM8       ..              \r\n"
											+ "         ..     ..                       ..       ..     ..CMMMMi MMMMMMMMMMM$.,      ..            \r\n"
											+ "         .        .                        ..       . ,.,      .  .@MMMz:       ..,.    .           \r\n"
											+ "         .         ...                      ..     ...     ...      v.             ...   .          \r\n"
											+ "         ..           .                          .:.  .,,..           .               :   .         \r\n"
											+ "          .             ..                      .7  ,:.                :.              7.           \r\n"
											+ "           ..             .       . . .      .C 6..,.               .   .:.             EQY         \r\n"
											+ "            ..             ...              QMM: ,.                 .     .i.           :MMMQ       \r\n"
											+ "             ...            ...            WMMM6 .                  .       ::          .M@MM#      \r\n"
											+ "           .   ..              ..         SMMMM@                   YMI        :,        ,M#@MMZ     \r\n"
											+ "        ..       ..              .       .MMMMM@                ;WMMMMM@1      .:       QM@#MMM:    \r\n"
											+ "       .           .              .      MMMMMM@ ::,..       .6MMM###@@MMM@:     i   ...@MMM@MMM    \r\n"
											+ "      .             ..             .    iMMMMMMv ,. . .,:..:$MM##$#$##@@@MMMM7..,,::     vMMMMMM;   \r\n"
											+ "     .                ..            .   BMMMMM;  .,.      YMM@$#$#$@#@@@@M@MMMM    :      .MMMMM#   \r\n"
											+ "    .                  ..           .   MMMMM:  . .,.      MM##$####@@@@@@MMMM      i       MMMMM   \r\n"
											+ "   .                    ..           . ,:tv,   ...  .:.    ;M@###@@@@@@M@MMMMQ      .,   .  .vii,   \r\n"
											+ "  ,                      ..    ....  . ., Yt ,,....   ,,    MM@@@@@@@@M@MMMMM       .,..,... i$.:.  \r\n"
											+ "  .                       .  ..        czY;A,:,,....   .,.   MMM@M@MMMMMMMMM7       .,.....,.vv,Y:  \r\n"
											+ "                          ...          :oY;2i::,,.... .  .,  nMMMMMMMMMMMMM@       .:.....,,,7Yit,  \r\n"
											+ "                           .           .C7;Ivi::,:,.....  .,  MMMMMMMMMMMMM    ..,.,.....,,:,zicn.  \r\n"
											+ "  .                       .             YvYC2iii:,:,,.....  ..:            ...,...,...,,,,::cS;7t   \r\n"
											+ "  ..                     ..           . ,7;;ICi;ii::,,,.... ,,              i. ....,.,,::::i2Xct;   \r\n"
											+ "   ..                   ..            .  ;;icUci;ii::,,,,..i:.,.......,.... .i:...,,,,:,:,,1z;Y7.   \r\n"
											+ "     .                 . .            .   ;i:vIY,,,:::::.,;:...,.,............i;...,.,...ibSivY,    \r\n"
											+ "       ..           ...  .        ... .   ,ii.8M#I7i,...,7:,::.,,..,,.,.,,,,,,,v. ...:76@MMiiv:     \r\n"
											+ "         ...      ..     ..    ...       . .:.EMMMMM@#QQW:,iii...:::,::::::::ii: 8MMMMMMMMM;,: .    \r\n"
											+ "             .  .         .   .          .  . CMMMMMMMMMM7,i7: .;;iiiiiiiiiii;;. MMMMMMMMMM..       \r\n"
											+ "             ....          ..            .    .MMMMMMM@MMMtiv ,C77cYvYvYvYcY;i1..MMMMMMMMMI         \r\n"
											+ "          ...    .        . ..           .      @MMMMMMMMMMQ  CY7Y7Y7YX77YYi.tM SMMMMMMMM:          \r\n"
											+ "         .        .     ..    ..         .       iMMMMMMMMM; C:ii;i;;;i;ii,:QM@ MMMMMMM2   .        \r\n"
											+ "       ..          .  ..        .        .         :MMMMMM: $Mz:;i;i;i;i;vY#MM7 MMMMM7    .         \r\n"
											+ "      .            . .           ..     ..            YMM.  2Y.,:i:i:i:i::. :E CMMo      .          \r\n"
											+ "     .             ..              .    .                 ..  . . . . . ...           ..            \r\n"
											+ "    .              .                ..  .          .....   ,     . . ... .   ..      .              \r\n"
											+ "   ..             .                  ...      ..,,..  .   .,          .      ,.   ..                \r\n"
											+ "   .              .                   ..    .:..     .     :         .       :  ..                  \r\n"
											+ "  .              .                    .   ,:.       ..    .:        ..      :. .                    \r\n"
											+ "  .              .                    .  i.         .      i       ...     .,.                      \r\n"
											+ "  .             .                    ...i           .      :  ...     . . ..                        \r\n"
											+ "  .             .                    ..:           ..... . :.        .    .                         \r\n"
											+ "  .            .                    ..,      .. .     .    :         .   ..                         \r\n"
											+ "  .            .                   ...   ...          .    :.        .  ..                          \r\n"
											+ "  .           .                  ...,  ..             .    ,.       .  ..                           \r\n"
											+ "   .         .                 ....:.                .     :       .  .                             \r\n"
											+ "    .      ..                .,.  :,                .      :       ,,.                              \r\n"
											+ "     .   .               .....   .:               ..       i     .,..                               \r\n"
											+ "      ...       . .....          i.              ..       .,   .:,  .                               \r\n"
											+ "     ...     ,..                .:              .         ,. ,,:.  .                                \r\n"
											+ "   ..  .   ..                   i               .         i,:...  ..                                \r\n"
											+ "  .    .  .                     :              ...       :,    .  .                                 \r\n"
											+ "        ..                     ,v             .     .   .i      ...                                 \r\n"
											+ "                               : .                      ..                                          ");
							System.out.println("\n" + "GolaAaAaço!!! Você acertou na " + contN + "ª tentativa e marcou "
									+ ponto + " ponto(s). \n");
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					case "d":
					case "D":
						if (alternativas.get(3).equals("XY|Z\n" + "   0 1\n" + "00|0 0\n" + "01|0 0\n" + "11|1 1\n"
								+ "10|0 1\n" + "S=XY+XZ\n")) {
							System.out.println(
									"       ....      ..   .     ...                                                                     \r\n"
											+ "                                                                                                    \r\n"
											+ "    ....              .    ..     ...                                                               \r\n"
											+ "   .    ..               .    ..       .                                                            \r\n"
											+ "  ,       .               ..    ..        ..                                                        \r\n"
											+ "           ...              ..    .  ..,.,......                                                    \r\n"
											+ ".             ..              .    .,.   .      ...                                                 \r\n"
											+ "                ..             .   .       .        ..                                              \r\n"
											+ "  .                ..           . . ,..      .          ...                                         \r\n"
											+ "   ..                ..         ..  ...,..     .           ...                                      \r\n"
											+ "     ..                ..       ..      ..,,.   .             ...                                   \r\n"
											+ "       ...               .   ......         .,,. .               ...                                \r\n"
											+ "          ...            ....       ..          ..,,,               ...                             \r\n"
											+ "             .     ........           ..           ..:,.               . .                          \r\n"
											+ "              .  ....      ..           ..             .,,.              .:..                       \r\n"
											+ "               ,..            ...         ..              .:,          ,..   ...                    \r\n"
											+ "             ..                   ..        ..              ...                 ..                  \r\n"
											+ "       . . .. .                      ..        .               :   ;zYi:.         ..                \r\n"
											+ "   ...    ..   .                       ..       ..          CMMMv 0MMMMMMMMM8       ..              \r\n"
											+ "         ..     ..                       ..       ..     ..CMMMMi MMMMMMMMMMM$.,      ..            \r\n"
											+ "         .        .                        ..       . ,.,      .  .@MMMz:       ..,.    .           \r\n"
											+ "         .         ...                      ..     ...     ...      v.             ...   .          \r\n"
											+ "         ..           .                          .:.  .,,..           .               :   .         \r\n"
											+ "          .             ..                      .7  ,:.                :.              7.           \r\n"
											+ "           ..             .       . . .      .C 6..,.               .   .:.             EQY         \r\n"
											+ "            ..             ...              QMM: ,.                 .     .i.           :MMMQ       \r\n"
											+ "             ...            ...            WMMM6 .                  .       ::          .M@MM#      \r\n"
											+ "           .   ..              ..         SMMMM@                   YMI        :,        ,M#@MMZ     \r\n"
											+ "        ..       ..              .       .MMMMM@                ;WMMMMM@1      .:       QM@#MMM:    \r\n"
											+ "       .           .              .      MMMMMM@ ::,..       .6MMM###@@MMM@:     i   ...@MMM@MMM    \r\n"
											+ "      .             ..             .    iMMMMMMv ,. . .,:..:$MM##$#$##@@@MMMM7..,,::     vMMMMMM;   \r\n"
											+ "     .                ..            .   BMMMMM;  .,.      YMM@$#$#$@#@@@@M@MMMM    :      .MMMMM#   \r\n"
											+ "    .                  ..           .   MMMMM:  . .,.      MM##$####@@@@@@MMMM      i       MMMMM   \r\n"
											+ "   .                    ..           . ,:tv,   ...  .:.    ;M@###@@@@@@M@MMMMQ      .,   .  .vii,   \r\n"
											+ "  ,                      ..    ....  . ., Yt ,,....   ,,    MM@@@@@@@@M@MMMMM       .,..,... i$.:.  \r\n"
											+ "  .                       .  ..        czY;A,:,,....   .,.   MMM@M@MMMMMMMMM7       .,.....,.vv,Y:  \r\n"
											+ "                          ...          :oY;2i::,,.... .  .,  nMMMMMMMMMMMMM@       .:.....,,,7Yit,  \r\n"
											+ "                           .           .C7;Ivi::,:,.....  .,  MMMMMMMMMMMMM    ..,.,.....,,:,zicn.  \r\n"
											+ "  .                       .             YvYC2iii:,:,,.....  ..:            ...,...,...,,,,::cS;7t   \r\n"
											+ "  ..                     ..           . ,7;;ICi;ii::,,,.... ,,              i. ....,.,,::::i2Xct;   \r\n"
											+ "   ..                   ..            .  ;;icUci;ii::,,,,..i:.,.......,.... .i:...,,,,:,:,,1z;Y7.   \r\n"
											+ "     .                 . .            .   ;i:vIY,,,:::::.,;:...,.,............i;...,.,...ibSivY,    \r\n"
											+ "       ..           ...  .        ... .   ,ii.8M#I7i,...,7:,::.,,..,,.,.,,,,,,,v. ...:76@MMiiv:     \r\n"
											+ "         ...      ..     ..    ...       . .:.EMMMMM@#QQW:,iii...:::,::::::::ii: 8MMMMMMMMM;,: .    \r\n"
											+ "             .  .         .   .          .  . CMMMMMMMMMM7,i7: .;;iiiiiiiiiii;;. MMMMMMMMMM..       \r\n"
											+ "             ....          ..            .    .MMMMMMM@MMMtiv ,C77cYvYvYvYcY;i1..MMMMMMMMMI         \r\n"
											+ "          ...    .        . ..           .      @MMMMMMMMMMQ  CY7Y7Y7YX77YYi.tM SMMMMMMMM:          \r\n"
											+ "         .        .     ..    ..         .       iMMMMMMMMM; C:ii;i;;;i;ii,:QM@ MMMMMMM2   .        \r\n"
											+ "       ..          .  ..        .        .         :MMMMMM: $Mz:;i;i;i;i;vY#MM7 MMMMM7    .         \r\n"
											+ "      .            . .           ..     ..            YMM.  2Y.,:i:i:i:i::. :E CMMo      .          \r\n"
											+ "     .             ..              .    .                 ..  . . . . . ...           ..            \r\n"
											+ "    .              .                ..  .          .....   ,     . . ... .   ..      .              \r\n"
											+ "   ..             .                  ...      ..,,..  .   .,          .      ,.   ..                \r\n"
											+ "   .              .                   ..    .:..     .     :         .       :  ..                  \r\n"
											+ "  .              .                    .   ,:.       ..    .:        ..      :. .                    \r\n"
											+ "  .              .                    .  i.         .      i       ...     .,.                      \r\n"
											+ "  .             .                    ...i           .      :  ...     . . ..                        \r\n"
											+ "  .             .                    ..:           ..... . :.        .    .                         \r\n"
											+ "  .            .                    ..,      .. .     .    :         .   ..                         \r\n"
											+ "  .            .                   ...   ...          .    :.        .  ..                          \r\n"
											+ "  .           .                  ...,  ..             .    ,.       .  ..                           \r\n"
											+ "   .         .                 ....:.                .     :       .  .                             \r\n"
											+ "    .      ..                .,.  :,                .      :       ,,.                              \r\n"
											+ "     .   .               .....   .:               ..       i     .,..                               \r\n"
											+ "      ...       . .....          i.              ..       .,   .:,  .                               \r\n"
											+ "     ...     ,..                .:              .         ,. ,,:.  .                                \r\n"
											+ "   ..  .   ..                   i               .         i,:...  ..                                \r\n"
											+ "  .    .  .                     :              ...       :,    .  .                                 \r\n"
											+ "        ..                     ,v             .     .   .i      ...                                 \r\n"
											+ "                               : .                      ..                                          ");
							System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n");
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					case "e":
					case "E":
						if (alternativas.get(4).equals("XY|Z\n" + "   0 1\n" + "00|0 0\n" + "01|0 0\n" + "11|1 1\n"
								+ "10|0 1\n" + "S=XY+XZ")) {
							System.out.println(
									"       ....      ..   .     ...                                                                     \r\n"
											+ "                                                                                                    \r\n"
											+ "    ....              .    ..     ...                                                               \r\n"
											+ "   .    ..               .    ..       .                                                            \r\n"
											+ "  ,       .               ..    ..        ..                                                        \r\n"
											+ "           ...              ..    .  ..,.,......                                                    \r\n"
											+ ".             ..              .    .,.   .      ...                                                 \r\n"
											+ "                ..             .   .       .        ..                                              \r\n"
											+ "  .                ..           . . ,..      .          ...                                         \r\n"
											+ "   ..                ..         ..  ...,..     .           ...                                      \r\n"
											+ "     ..                ..       ..      ..,,.   .             ...                                   \r\n"
											+ "       ...               .   ......         .,,. .               ...                                \r\n"
											+ "          ...            ....       ..          ..,,,               ...                             \r\n"
											+ "             .     ........           ..           ..:,.               . .                          \r\n"
											+ "              .  ....      ..           ..             .,,.              .:..                       \r\n"
											+ "               ,..            ...         ..              .:,          ,..   ...                    \r\n"
											+ "             ..                   ..        ..              ...                 ..                  \r\n"
											+ "       . . .. .                      ..        .               :   ;zYi:.         ..                \r\n"
											+ "   ...    ..   .                       ..       ..          CMMMv 0MMMMMMMMM8       ..              \r\n"
											+ "         ..     ..                       ..       ..     ..CMMMMi MMMMMMMMMMM$.,      ..            \r\n"
											+ "         .        .                        ..       . ,.,      .  .@MMMz:       ..,.    .           \r\n"
											+ "         .         ...                      ..     ...     ...      v.             ...   .          \r\n"
											+ "         ..           .                          .:.  .,,..           .               :   .         \r\n"
											+ "          .             ..                      .7  ,:.                :.              7.           \r\n"
											+ "           ..             .       . . .      .C 6..,.               .   .:.             EQY         \r\n"
											+ "            ..             ...              QMM: ,.                 .     .i.           :MMMQ       \r\n"
											+ "             ...            ...            WMMM6 .                  .       ::          .M@MM#      \r\n"
											+ "           .   ..              ..         SMMMM@                   YMI        :,        ,M#@MMZ     \r\n"
											+ "        ..       ..              .       .MMMMM@                ;WMMMMM@1      .:       QM@#MMM:    \r\n"
											+ "       .           .              .      MMMMMM@ ::,..       .6MMM###@@MMM@:     i   ...@MMM@MMM    \r\n"
											+ "      .             ..             .    iMMMMMMv ,. . .,:..:$MM##$#$##@@@MMMM7..,,::     vMMMMMM;   \r\n"
											+ "     .                ..            .   BMMMMM;  .,.      YMM@$#$#$@#@@@@M@MMMM    :      .MMMMM#   \r\n"
											+ "    .                  ..           .   MMMMM:  . .,.      MM##$####@@@@@@MMMM      i       MMMMM   \r\n"
											+ "   .                    ..           . ,:tv,   ...  .:.    ;M@###@@@@@@M@MMMMQ      .,   .  .vii,   \r\n"
											+ "  ,                      ..    ....  . ., Yt ,,....   ,,    MM@@@@@@@@M@MMMMM       .,..,... i$.:.  \r\n"
											+ "  .                       .  ..        czY;A,:,,....   .,.   MMM@M@MMMMMMMMM7       .,.....,.vv,Y:  \r\n"
											+ "                          ...          :oY;2i::,,.... .  .,  nMMMMMMMMMMMMM@       .:.....,,,7Yit,  \r\n"
											+ "                           .           .C7;Ivi::,:,.....  .,  MMMMMMMMMMMMM    ..,.,.....,,:,zicn.  \r\n"
											+ "  .                       .             YvYC2iii:,:,,.....  ..:            ...,...,...,,,,::cS;7t   \r\n"
											+ "  ..                     ..           . ,7;;ICi;ii::,,,.... ,,              i. ....,.,,::::i2Xct;   \r\n"
											+ "   ..                   ..            .  ;;icUci;ii::,,,,..i:.,.......,.... .i:...,,,,:,:,,1z;Y7.   \r\n"
											+ "     .                 . .            .   ;i:vIY,,,:::::.,;:...,.,............i;...,.,...ibSivY,    \r\n"
											+ "       ..           ...  .        ... .   ,ii.8M#I7i,...,7:,::.,,..,,.,.,,,,,,,v. ...:76@MMiiv:     \r\n"
											+ "         ...      ..     ..    ...       . .:.EMMMMM@#QQW:,iii...:::,::::::::ii: 8MMMMMMMMM;,: .    \r\n"
											+ "             .  .         .   .          .  . CMMMMMMMMMM7,i7: .;;iiiiiiiiiii;;. MMMMMMMMMM..       \r\n"
											+ "             ....          ..            .    .MMMMMMM@MMMtiv ,C77cYvYvYvYcY;i1..MMMMMMMMMI         \r\n"
											+ "          ...    .        . ..           .      @MMMMMMMMMMQ  CY7Y7Y7YX77YYi.tM SMMMMMMMM:          \r\n"
											+ "         .        .     ..    ..         .       iMMMMMMMMM; C:ii;i;;;i;ii,:QM@ MMMMMMM2   .        \r\n"
											+ "       ..          .  ..        .        .         :MMMMMM: $Mz:;i;i;i;i;vY#MM7 MMMMM7    .         \r\n"
											+ "      .            . .           ..     ..            YMM.  2Y.,:i:i:i:i::. :E CMMo      .          \r\n"
											+ "     .             ..              .    .                 ..  . . . . . ...           ..            \r\n"
											+ "    .              .                ..  .          .....   ,     . . ... .   ..      .              \r\n"
											+ "   ..             .                  ...      ..,,..  .   .,          .      ,.   ..                \r\n"
											+ "   .              .                   ..    .:..     .     :         .       :  ..                  \r\n"
											+ "  .              .                    .   ,:.       ..    .:        ..      :. .                    \r\n"
											+ "  .              .                    .  i.         .      i       ...     .,.                      \r\n"
											+ "  .             .                    ...i           .      :  ...     . . ..                        \r\n"
											+ "  .             .                    ..:           ..... . :.        .    .                         \r\n"
											+ "  .            .                    ..,      .. .     .    :         .   ..                         \r\n"
											+ "  .            .                   ...   ...          .    :.        .  ..                          \r\n"
											+ "  .           .                  ...,  ..             .    ,.       .  ..                           \r\n"
											+ "   .         .                 ....:.                .     :       .  .                             \r\n"
											+ "    .      ..                .,.  :,                .      :       ,,.                              \r\n"
											+ "     .   .               .....   .:               ..       i     .,..                               \r\n"
											+ "      ...       . .....          i.              ..       .,   .:,  .                               \r\n"
											+ "     ...     ,..                .:              .         ,. ,,:.  .                                \r\n"
											+ "   ..  .   ..                   i               .         i,:...  ..                                \r\n"
											+ "  .    .  .                     :              ...       :,    .  .                                 \r\n"
											+ "        ..                     ,v             .     .   .i      ...                                 \r\n"
											+ "                               : .                      ..                                          ");
							System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n");
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					}

					if (contN == 1 && (!(n1.equals(alternativas)) && saida)) {
						System.out.println("Olha o exemplo novamente. Talvez você não tenha entendido! \n" + "\n"
								+ "Digite NOVO para ver o exemplo novamente e ter uma nova tentativa.");
						String seguir6 = ler.next();
						System.out.println("\n");
					}
					if (contN == 2 && (!(n1.equals(alternativas)) && saida)) {
						System.out.println("Você tem uma última chance. Olhe o exemplo novamente. !!ATENÇÃO!! \n" + "\n"
								+ "Digite NOVO para ver o exemplo novamente e ter uma nova tentativa.");
						String seguir7 = ler.next();
						System.out.println("");
					}
					if (contN == 3 && (!(n1.equals(alternativas)) && saida)) {
						System.out.println("\r\n"
								+ "                                                                  ..;i,.                            \r\n"
								+ "                                                             1WMMMMMMMMMMMMb                        \r\n"
								+ "                                                         ,ZbnnMMMMMMMMMMMMMMM;                      \r\n"
								+ "                                                      1Mt$$QQ$@@$#@@@##@@@$$MME                     \r\n"
								+ "                                                      MEi8$EB#$$#B$E$##$@$$@MMMM.                   \r\n"
								+ "                                                      MUUWWBE0W##@$$#@##@M@$##@MMi                  \r\n"
								+ "                                                    .Z#bQWBW$Q$#@#@@@@@##$#WE9$@M0                  \r\n"
								+ "                                                   :M#bB$#WWQB$@$@@@$$W##@Qz$BA@MMi                 \r\n"
								+ "                                                   X$B$EozSzE0$WBB$Q$$####M@@@M99MM                 \r\n"
								+ "                                                   EQBC:iCovA@W00Q0W#$$#b$MMM@@M0MMt                \r\n"
								+ "                                                 .AA2;.,2Q$C1##EE80B$EQ06oW@MMMMMMMM                \r\n"
								+ "                                               .:vi,...YYZIii1WQb0WBQ0ZIv::v7z$MMMM8                \r\n"
								+ "                                              ,::.  ..ivCYvi:C#B06UnZb61nX;...:oMMM                 \r\n"
								+ "                                            .ii,...,,;X7i::YvIIC;;i;;Y161;,i6c  z8C                 \r\n"
								+ "                                    . ..  .:;ii,,,ii;ii,. ,b8vviv;YcX7v,.i90X,i;iz.                 \r\n"
								+ "                                  :. :,::i;;:::i:ii;i::;,:.nAYccv7SAv,..iES,.:CIA:                  \r\n"
								+ "                                 ..   ,YnY;:ii;ii:;i::;i;v.IE7Y7oSY..itIAXi::izYi                   \r\n"
								+ "                             ..,.  .    .Ycv;Ycci;iv;i;c,i.CWboY:..iCtSUc7Sv;1CY                    \r\n"
								+ "                         ...,.      ...   itSCC;vv7CS;;;.:,.;;,..iY;i;YCnXciv2b                     \r\n"
								+ "                       ...           ...   .c9UtXzn68S;viXc;,.,YS827iviivYCXtU.                     \r\n"
								+ "                      .                ....  .co0QEE0Q2Yi;1C7tI22o12Et:,i;z86                       \r\n"
								+ "                   ;:          .         ...   .C0QWWMM#v,ctoA2onUoCo8o;inzt                        \r\n"
								+ "                  CC        . .           ..,..,i,;6@MM@:,7YYcS1CvCzz96tbW6.                        \r\n"
								+ "                 .i      . ... . .          .,..,77vYCc  .i;ccv117cC12Y2#v                          \r\n"
								+ "                 .  ..:...,,... .            ...,.UMi;Q:,.:iv;i;CYSEE2UQ.                           \r\n"
								+ "                  .  ,...,...... .            ,..,.Q@$Mt,.:;ii::.v$QYv1                             \r\n"
								+ "                . . ....... .i,........        .. ..vbMU;,ii:,:,.Yo. ,                              \r\n"
								+ "               .:,,i......,::i.,.... .....   . .;.i1;vvzn;;;:,::.Xtc.::                             \r\n"
								+ "               i..::......;:. :,....         .. zt1:7;;Xnvvii,:,ivcv:,;                             \r\n"
								+ "              ,i.. .......,..::,....          ,  .  .i,AcY;i,,,,;;:ii:::                            \r\n"
								+ "              z.,,. ...::,..:i:..     iii.       X111.:7CYYi:,,,17i:i::;.                           \r\n"
								+ "              C.,,.,...    .        v$87;;Cv     t2n@t tc7;;,,.:Uzvi:::ii                           \r\n"
								+ "              C ...,:....   ,:..:, v@6t:i,vC2;    ,.1@i77Yci:,.,9o7i:,:,i.                          \r\n"
								+ "             .c....,,,:::,iov.,:.. BIbiviSv7CzX    ib$CYYYi;i, ,Iz7c:,,:,i                          \r\n"
								+ "              :::..,ii;ii:C7 ii .  EInv7nXcv;;0    iMXvcc;;ii, :WU7cv::ii,:                         \r\n"
								+ "               i,,.,,:,:,,;Y:i ;.  iW6AEc.i9#@i     2Yiv;;i:i, iBbYYYi,:::,:                        \r\n"
								+ "               :,...,.,,,.:i;Y:,... .b$;b#@Bt       iX;;vii,:. i#6SYY;:,ii:,:                       \r\n"
								+ "               .,,.,.,.,.    :;. ...   ,i,          n6;;;;:,...;@AntYYi:iYi::i                      \r\n"
								+ "                ,....... ,QUIoE$i ...               YvXYYi:..,,,MI1tCvYi:iYi:ii                     \r\n"
								+ "                ........ ;MMMMMMMU  .. ... .           Y7i.,,i. EbC1CXv;i:iv:ii:                    \r\n"
								+ "                ........ .Yiii;;ZM8 ...,,......         ,::ii:,,W$ItnXCv;ii;;:ii                    \r\n"
								+ "                .:......  . ..  .:Yv.  :i.:i.:           .v;i,nMMMUSCnt7;;i;iiic,                   \r\n"
								+ "                 :,..... nM@@@@#@#@@MB, . :;i....... ..   ;Y;:ZbM#9o2tSXc;;ii:;Y;                   \r\n"
								+ "                 ,,..... 1@QEW#@M@@MMMME..i; .i.........  ,Ci.  8@9UooCS77v;::iY:                   \r\n"
								+ "                  i...... . ...,::ii7z$Mz,Y. i.,,.:...:.   i:;XSUBQUUoz11YY;i,,vi                   \r\n"
								+ "                  ,:................ .,;v7;.i..i.;:, ::,   ::A@#X760UIoot17ci:.CY.                  \r\n"
								+ "                   ,......,...,.,,,,,.:iYYY;;.v,c:i..::..  .tUt ;vioQ66zSnScvY;YC                   \r\n"
								+ "                   .,,.,.......,.,,:,:,i;YYY;v:iYi,.,:,:,.  7M   vvi;b0b2IoX7bQ9                    \r\n"
								+ "                   .:.,.. . ..,.,.,::::,,i7Y7i;:.,;;77Xcv.  @S     ..,SbbIItCE$.                    \r\n"
								+ "                   .,... . ...,,...,:i:. ,ii;Y;;  .:iXC1vY YM          ;b$WEC:                      \r\n"
								+ "                    ,.. ..  . ..,...,,:.  ,...ivv       IM bW            ..                         \r\n"
								+ "                    .. . . .   ..,..  ,i.  :i,.,ii  ..  Q0 #i                                       \r\n"
								+ "                    ..  ....    .....  .i.  .;7iii.  . iM;Y,                                        \r\n"
								+ "                   ..  ....:,.   .....   .    .i;vi:   MA,$                                         \r\n"
								+ "                    .  .:. .:,.  .....    .      .,ii  Z: $c                                        \r\n"
								+ "                   ... ...  ...   ....                  U ..                                        \r\n"
								+ "                   ..  .    ....   ....         .      .M1.                                         \r\n"
								+ "                   ,.  .      ...   ...         .,...  SUEi                                         \r\n"
								+ "                  ...  ..     ....   ....           . .Q C,                                         \r\n"
								+ "                   ,.  ...     ..,.  .....             E i:                                         \r\n"
								+ "                  .,. ..  ..    ....  ... .      .... Y@.Z:                                         ");
						System.out.println("\n" + "Você errou as três tentativas!! \n"
								+ "Acho que você não entendeu a jogada! Infelizmente não marcou pontos nessa rodada! \n"
								+ "Tente a próxima! \n" + "Digite PRÓXIMO para ir para o próximo desafio.");
						String prox = ler.next();
					}
				} while (contN != 3 && saida);
			}
			if (resposta.equalsIgnoreCase(recusa)) {
				System.out.println("Você saiu do jogo");
				break;
			} else if (!(resposta.equalsIgnoreCase(seguir))) {
				System.out.println("Inválido");
				loop = false;
			}

		} while (contN != 3 && saida);

		return ponto;
	}

	// ******PAULO******//
	static Scanner ler = new Scanner(System.in);
	private static int resultado;

	// EXERCÍCIO 2
	static int ex2(String nome, String time) {

		List numeros = new ArrayList();
		int i = 0;
		int contN = 0;
		int ponto = 3;
		String n1;
		boolean saida = true;

		numeros.add("1110011");
		numeros.add("1101011");
		numeros.add("101010");
		numeros.add("1010011"); // resposta certa
		numeros.add("101101");
		System.out.println("** DESAFIO 2 ** \n" + "\n" + nome
				+ " estamos com um pequeno problema tático. Precisamos fazer um ajuste para tentar vencer a partida e marcar alguns pontos.\n"
				+ "Para ajudar a equipe ganhar o campeonato, que tal entender o esquema? \n"
				+ "O problema tático está relacionado com operação de números binários, mais precisamente adição (soma). \n"
				+ "Vamos ajudar o time!!! \n" + "A partida será entre " + time + " e " + "Chapecoense.\n"
				+ "Um pouco mais abaixo tem alguns exemplos para te auxiliar na resolução do esquema. Boa sorte!!! \n"
				+ "\n");

		System.out.println(
				"0a088WMMMMMMM@MMM@MMM@M@M@MWMMMMMMMMMMMMMMMMM@MMM@M@M@M@M@MMM@MMMMMMM@MMMMMMMMMMMMMMM@M@@B@MWB@Z080Z\r\n"
						+ "Za2882:,...................i.........................................................:..:r:.ZaX0aZaa\r\n"
						+ "0a0ZM..2 .0ii;;,i,;;;:;,:,;X7.i:r;;iri;r772XXrr:r:.SSX7r7iXXSXSXaa2X2ZZXXX272X22ZXX7S2Z2ZaB..S.@BZ8a\r\n"
						+ "ZZa0M...iMWWB@W@W@BWB@W@@@WBBMWMW@B@B@BWBB0B0WB@M@.M@BBWBW0B0BZ0Z8Z08B8WBW0B0B8B8B8B800080BM...M0ZaZ\r\n"
						+ "0a88M.:MMZ8Z8Z8Z0Z8Z8Z0Z8Z8Z8@MMM88Z8a8Z0Z8Z8Z88MS.MBZZZ8Z8ZZZ8a8ZZa8a8aZZ8Z8ZZaZa0Z8Z8aZa08MW.@BZ8a\r\n"
						+ "aZZ8@..M88Z8ZZZZZZZZZZaZ28a8Mi...MZZZ00B8088aZZ0Wa M88aZZZZZX8Z0a8ZZX2XaSBBW222Z2ZZ8aZ2ZaZa0B8.M88Z8\r\n"
						+ "0a8ZM..M8a8aZaZ28aZaZZ8Z8Z8Br.a..M8Z802@MZaaaa8ZMS.@BZ0Z0a8Z0@M@@Z8a8a8BZ.2.X08aZa8aZZ8ZZZ8ZWZ.MB88a\r\n"
						+ "ZZaZW.;MZ8Z8aZa8Z8ZZZ0ZZZZZB2i..0@Z00M....X0Z0Z0WX.M00ZZZ8Z0M,..X@Z8Z88Wr. .M0aZaZ2ZZ8Z0ZZa8BB.M08aZ\r\n"
						+ "Z28Z@,.@0Z8Z8a8Z8a8Z8a8ZZa8ZBWMMBaZZ0....MWa88ZZM;.@BZ8ZZZ0B:.B,.@82ZZW..20.808ZZaZaZ2ZZ8Z8Z@2.MBZ8a\r\n"
						+ "ZZZ8W:.@80Z8ZZZ0a8Z8a8aZZZa8Z8ZZZZZZ8ZMM.rB0BW80@7 M0ZaZa8ZW.i..;M0ZSZZB@MWWa0ZZZ8Z8aZZZa8Z0@S.MZZZZ\r\n"
						+ "Z2ZZW;:MMMM@@WM@W0@00ZZZ8ZZa8ZZZZaZaZa88BZ0Br.S@Mr.M0a8ZZaZa@M0MM.M80a8aZZ0Z8a8Z0W@MMW@B@BM@MW.MBZZa\r\n"
						+ "aZZ8WX.......:...r,r80ZZa88MMM8Z2aZZa8aZ2Z0:.i..@r.M88aZ2Z2ZB; .2..MZ82Z2ZaZaZZ0ai...i.........M08ZZ\r\n"
						+ "ZaZZ@;.,........ira.;W0aZ80...8ZZ2aS2Sa2a2W..;..M:.M82aSa2aS8a..M@..MZ82ZaZZ8a0M.ia.,:i:..:....WBZ8a\r\n"
						+ "ZZZZW:.MMM@@0@W@WW@.,MMMBW..B..MZZaaaZSS2Z2BS.7M@i.Maa2Z2a28ZM..M@@..MZZ2a2Z2Z8M 2MM@MWM@MWMMM.W8ZZZ\r\n"
						+ "8a8ZM..MW80aaa0Z0WM.;M..Z@.i..rBZ2a28S2S82a20BW8@,.M0XXXS72SZM..MZMB.;MaZ2aaZaB@.ZM00Z8Z0Z08MW.MBa82\r\n"
						+ "ZZZ8@:.M08ZM00BMBX:.....;MWa:@M82ZaZaSSZZ2SZa88B@;.M0BaZZZaZaM..WSX0r.aMaZZ08M@M.r00@MMMBMZ08@.W00ZZ\r\n"
						+ "8Z8ZMi......MW:...r..@MrMZ88B.0ZZZZaaXaZZXZaB0;;2..;..X@0aZ2aM..M222@:..XZ80X..,........M..... 0WZ8Z\r\n"
						+ "ZZZBM..M0MM ...rBM@. .MM88Z8@.iBZ0Z0aZ802ZZMr.:2Wi.MZr..00S2ZM..WZa887..@M8..SW: X@MZ. .M MMMM.8M0ZZ\r\n"
						+ "Za02a..@@a. ZWMMB0M.,..@0a8ZM..@00aiM@BaZZ@:.ZBZM,.M0BM..W8a0@..@aZS0@M...rZ@@....MZ@BWM0.M0@M.@;aBa\r\n"
						+ "a0W....M0X;.@MZa8BM..M.ZBZa8@..MZW2..;.S808.8B20Br.M88ZM..W88M.208aZaW..@..MBX.M..@0Z20Ma.M0BW M SBZ\r\n"
						+ "8aM....M0WW.M@. .MM..@..Ma00M.8008M@. .M807.MZ8ZWi.@8SZ@;.MZB@.002ZaZ8X...00M..M..MB..:M2.M8W@.@.ZWZ\r\n"
						+ "ZZBX...MZB8.BB8200@..M.008BM..@0a@...M.0Z0Z.2@88B7.MaZ0M..@Z0Z.MZ22Z2Z0@Z@8ZZX.M..M0ZZZ@S.M08M.M.X08\r\n"
						+ "8a00M..MWBM.B8000ZM...i@00Mr.WWZ8ZraM0B2ZZ0:.SW0Mr.@0WM..W0aM..M8X2ZZXa2aX22Z@....M88Z0BX.M0BM.2B80Z\r\n"
						+ "8aZBM..MZ8W.a0aZa8M. WM0WX  7MZZaZZ8aa2a2a20S..i8X.WX;..W0a8M..MZaSZS22Z2aSZZ0W;.i@8aZZ@,.@B0M S@BZa\r\n"
						+ "0Z8ZM..,....WZ8aZZM..@BBM@..a8aaZ2aaZ2a2aZM@MWX.,. ...2WZ2ZZM.;8ZX20MZBB0Za2Za0M.;WaZaZ8Z....,.XMZ8a\r\n"
						+ "ZZZ0M..M@@0@8ZaZa8M..M0B..;MWZ2aaaSa22XS8,...Z8WWr.MWZ2Z2Z20S.WZZ8B..MB.i022SZaM.iB0aZZ80MBWWM.S@8aZ\r\n"
						+ "02ZZM. MWZ0Z8Z8Z8ZM..M@..@..@aaaaaZ2Zaaa;.Xr 7BZWr.@Z2Z2Za8@.,MZ8Z00...iW2Z2Za8W..MZ8a8aZZ08WM.rMZ8a\r\n"
						+ "8ZZ0M..MMMW@WM@@WMM..M0i...0BZaa2aZZ2WMM7...:@S0M2.MZ0aZa8Z8.8ZaSZZ.....X0Z8aaaM..MMMMMM@MMWWM.i@ZZZ\r\n"
						+ "0a8ZM..X.............M0W8;WS28@BBB@@M...M0X8@Z,.:i.@MM@ZZaB..WZZZa0,W@MXXZZaa2aW............;7.iM88a\r\n"
						+ "aaa0Mi.M;;r;;i:7...7B0Z0ZWBr.......... .MZaZZaaa.. .X..MZB@M@0ZZaZZBZ8a0ZZSZaZa0BX,:...:i:.rS@.rM0ZZ\r\n"
						+ "8a8ZM;.@MBWBWW@BM@@B8aZaZZ80WZr.....XB8@8Z8ZaSa8M0.a.  M@0...B82ZaZaaSZ2ZZ@Z8Z0a0WWBMWMW@B@B@M ;MZ0a\r\n"
						+ "ZZa8@X.MZ0Z8Z8Z8Z0Z8aZ2ZaZa8Z0BMWM@W0WBZM@02aaZ8Za.MXSM@r..8 28Z2Z2aaa28Z8.MM0i0Z8Z8a8Z8Z8Z08M.SW0ZZ\r\n"
						+ "0aZZWX.M0aZZZZZZ8aZZ8Z8ZZaZaB@M@M8Z2aZB.,W.;0Z8a0S.BMW00X.:..W8aZZ8ZZaZZ8B..7.2BZaZZZa8ZZaZa0M.rMZ8a\r\n"
						+ "ZZZ8B2.M88aZaZZZa8ZZZZZZaZZBX....B8ZaZWM...@8ZZZZZ.@ZZZ8ZWX8M0ZZa8aZaZaZZW@. .Z0ZZaZaZZZaZZ88M.X@0aZ\r\n"
						+ "0aZZM2.MBaZaZaZaZZZa8aZZZ28Br..8..@aZZ0..Z:.aZZa0Z.B8aZZ8Z0Z8ZZaZZZaZa8Z0B..M2.70aZZZaZa8aZZBM.SMZ0a\r\n"
						+ "ZaZ0@r M08Z8Z8a8a8aZZ8a8aZa8WS...W8Za8SiM@@BZZaZ80.W88a8S2a0aZa8Z0Z8a8Z8a8aM0WB0a8a8a8ZZZZZZ0M.ZBZZZ\r\n"
						+ "0aZZMX.MM80ZZZ8a8Z0Z8Z8Z0Z8Z0BMMMZ8Z8Z0B0Z8Z8ZZZB8.W0a8Z8Z0Z080808080ZZZ8ZBZ0Z0ZZa8Z8Z0Z0Z00M@.a@aZZ\r\n"
						+ "Z8Z0Wa.i.MWW8WBB0W0B8B0W000W000BBW0WWWBW0@@MW@@MMM.M@MWM@M@M@M@M@M@MB@W@@MMM@MMM@MMMMMMMMMMM.:.aW0Z8\r\n"
						+ "0a8Z@2.@..02aX2SXrS2ZXSi727rXZ2rX;r;;i77S;irrri:7;.7X7;:;i::,:i.....;:i.....,.............r..8.SM8Za\r\n"
						+ "ZZaZ8M:....,,..,...:7;;:.2;;ia;;ii,;...Xr....,...........................:..ir.::i:;...::;;raXZWZZ2Z");

		String resposta = "Aceito";
		System.out.println("\n" + "Digite ACEITO para começar o desafio");
		String seguir = ler.next();

		if (seguir.equalsIgnoreCase(resposta)) {

			System.out.println("\n"
					+ "                A soma de binários tem regras simples e praticamente iguais as regras de \n"
					+ "               adição de números decimais, a única diferença é que quando somado 1 + 1 o \n"
					+ "               resultado é igual a 0 e tem o resto igual a 1, sempre emprestando para o  \n"
					+ "               próximo número do cálculo. \n" + "\n");

			do {
				// EXEMPLO
				System.out.println("					         **EXEMPLO** \n " + "\n"
						+ "					            SOMA | RESTO \n"
						+ "					   0 + 0 =   0   |  0 \n" + "					   0 + 1 =   1   |  0 \n"
						+ "					   1 + 0 =   1   |  0 \n" + "					   1 + 1 =   0   |  1 \n"
						+ "\n" + "					 **-Exemplos resolvidos-** \n" + "\n"
						+ "				       a) 111            b)111 \n"
						+ "				          0101             1110 \n"
						+ "				         + 011            + 111 \n"
						+ "				         ------          -------\n"
						+ "			 	          1000            10101");
				contN++;
				Collections.shuffle(numeros);

				System.out.println("\n" + "RESPONDA \n" + "Qual é o resultado da seguinte soma de números binários: \n"
						+ "\n" + "                    110110 + 11101 \n" + "\n" + "a) " + numeros.get(0) + "\n" + "b) "
						+ numeros.get(1) + "\n" + "c) " + numeros.get(2) + "\n" + "d) " + numeros.get(3) + "\n" + "e) "
						+ numeros.get(4) + "\n" + "\n" + "RESPOSTA: ");
				n1 = ler.next();

				System.out.println("");
				switch (n1) {
				case "a":
				case "A":
					if (numeros.get(0).equals("1010011")) {
						System.out.println(
								"       ....      ..   .     ...                                                                     \r\n"
										+ "                                                                                                    \r\n"
										+ "    ....              .    ..     ...                                                               \r\n"
										+ "   .    ..               .    ..       .                                                            \r\n"
										+ "  ,       .               ..    ..        ..                                                        \r\n"
										+ "           ...              ..    .  ..,.,......                                                    \r\n"
										+ ".             ..              .    .,.   .      ...                                                 \r\n"
										+ "                ..             .   .       .        ..                                              \r\n"
										+ "  .                ..           . . ,..      .          ...                                         \r\n"
										+ "   ..                ..         ..  ...,..     .           ...                                      \r\n"
										+ "     ..                ..       ..      ..,,.   .             ...                                   \r\n"
										+ "       ...               .   ......         .,,. .               ...                                \r\n"
										+ "          ...            ....       ..          ..,,,               ...                             \r\n"
										+ "             .     ........           ..           ..:,.               . .                          \r\n"
										+ "              .  ....      ..           ..             .,,.              .:..                       \r\n"
										+ "               ,..            ...         ..              .:,          ,..   ...                    \r\n"
										+ "             ..                   ..        ..              ...                 ..                  \r\n"
										+ "       . . .. .                      ..        .               :   ;zYi:.         ..                \r\n"
										+ "   ...    ..   .                       ..       ..          CMMMv 0MMMMMMMMM8       ..              \r\n"
										+ "         ..     ..                       ..       ..     ..CMMMMi MMMMMMMMMMM$.,      ..            \r\n"
										+ "         .        .                        ..       . ,.,      .  .@MMMz:       ..,.    .           \r\n"
										+ "         .         ...                      ..     ...     ...      v.             ...   .          \r\n"
										+ "         ..           .                          .:.  .,,..           .               :   .         \r\n"
										+ "          .             ..                      .7  ,:.                :.              7.           \r\n"
										+ "           ..             .       . . .      .C 6..,.               .   .:.             EQY         \r\n"
										+ "            ..             ...              QMM: ,.                 .     .i.           :MMMQ       \r\n"
										+ "             ...            ...            WMMM6 .                  .       ::          .M@MM#      \r\n"
										+ "           .   ..              ..         SMMMM@                   YMI        :,        ,M#@MMZ     \r\n"
										+ "        ..       ..              .       .MMMMM@                ;WMMMMM@1      .:       QM@#MMM:    \r\n"
										+ "       .           .              .      MMMMMM@ ::,..       .6MMM###@@MMM@:     i   ...@MMM@MMM    \r\n"
										+ "      .             ..             .    iMMMMMMv ,. . .,:..:$MM##$#$##@@@MMMM7..,,::     vMMMMMM;   \r\n"
										+ "     .                ..            .   BMMMMM;  .,.      YMM@$#$#$@#@@@@M@MMMM    :      .MMMMM#   \r\n"
										+ "    .                  ..           .   MMMMM:  . .,.      MM##$####@@@@@@MMMM      i       MMMMM   \r\n"
										+ "   .                    ..           . ,:tv,   ...  .:.    ;M@###@@@@@@M@MMMMQ      .,   .  .vii,   \r\n"
										+ "  ,                      ..    ....  . ., Yt ,,....   ,,    MM@@@@@@@@M@MMMMM       .,..,... i$.:.  \r\n"
										+ "  .                       .  ..        czY;A,:,,....   .,.   MMM@M@MMMMMMMMM7       .,.....,.vv,Y:  \r\n"
										+ "                          ...          :oY;2i::,,.... .  .,  nMMMMMMMMMMMMM@       .:.....,,,7Yit,  \r\n"
										+ "                           .           .C7;Ivi::,:,.....  .,  MMMMMMMMMMMMM    ..,.,.....,,:,zicn.  \r\n"
										+ "  .                       .             YvYC2iii:,:,,.....  ..:            ...,...,...,,,,::cS;7t   \r\n"
										+ "  ..                     ..           . ,7;;ICi;ii::,,,.... ,,              i. ....,.,,::::i2Xct;   \r\n"
										+ "   ..                   ..            .  ;;icUci;ii::,,,,..i:.,.......,.... .i:...,,,,:,:,,1z;Y7.   \r\n"
										+ "     .                 . .            .   ;i:vIY,,,:::::.,;:...,.,............i;...,.,...ibSivY,    \r\n"
										+ "       ..           ...  .        ... .   ,ii.8M#I7i,...,7:,::.,,..,,.,.,,,,,,,v. ...:76@MMiiv:     \r\n"
										+ "         ...      ..     ..    ...       . .:.EMMMMM@#QQW:,iii...:::,::::::::ii: 8MMMMMMMMM;,: .    \r\n"
										+ "             .  .         .   .          .  . CMMMMMMMMMM7,i7: .;;iiiiiiiiiii;;. MMMMMMMMMM..       \r\n"
										+ "             ....          ..            .    .MMMMMMM@MMMtiv ,C77cYvYvYvYcY;i1..MMMMMMMMMI         \r\n"
										+ "          ...    .        . ..           .      @MMMMMMMMMMQ  CY7Y7Y7YX77YYi.tM SMMMMMMMM:          \r\n"
										+ "         .        .     ..    ..         .       iMMMMMMMMM; C:ii;i;;;i;ii,:QM@ MMMMMMM2   .        \r\n"
										+ "       ..          .  ..        .        .         :MMMMMM: $Mz:;i;i;i;i;vY#MM7 MMMMM7    .         \r\n"
										+ "      .            . .           ..     ..            YMM.  2Y.,:i:i:i:i::. :E CMMo      .          \r\n"
										+ "     .             ..              .    .                 ..  . . . . . ...           ..            \r\n"
										+ "    .              .                ..  .          .....   ,     . . ... .   ..      .              \r\n"
										+ "   ..             .                  ...      ..,,..  .   .,          .      ,.   ..                \r\n"
										+ "   .              .                   ..    .:..     .     :         .       :  ..                  \r\n"
										+ "  .              .                    .   ,:.       ..    .:        ..      :. .                    \r\n"
										+ "  .              .                    .  i.         .      i       ...     .,.                      \r\n"
										+ "  .             .                    ...i           .      :  ...     . . ..                        \r\n"
										+ "  .             .                    ..:           ..... . :.        .    .                         \r\n"
										+ "  .            .                    ..,      .. .     .    :         .   ..                         \r\n"
										+ "  .            .                   ...   ...          .    :.        .  ..                          \r\n"
										+ "  .           .                  ...,  ..             .    ,.       .  ..                           \r\n"
										+ "   .         .                 ....:.                .     :       .  .                             \r\n"
										+ "    .      ..                .,.  :,                .      :       ,,.                              \r\n"
										+ "     .   .               .....   .:               ..       i     .,..                               \r\n"
										+ "      ...       . .....          i.              ..       .,   .:,  .                               \r\n"
										+ "     ...     ,..                .:              .         ,. ,,:.  .                                \r\n"
										+ "   ..  .   ..                   i               .         i,:...  ..                                \r\n"
										+ "  .    .  .                     :              ...       :,    .  .                                 \r\n"
										+ "        ..                     ,v             .     .   .i      ...                                 \r\n"
										+ "                               : .                      ..                                          ");
						System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN + "ª tentativa e marcou "
								+ ponto + " ponto(s). \n" + "\n");
						saida = false;
					} else {
						ponto--;
						System.out.println("RESPOSTA ERRADA");
					}
					break;
				case "b":
				case "B":
					if (numeros.get(1).equals("1010011")) {
						System.out.println(
								"       ....      ..   .     ...                                                                     \r\n"
										+ "                                                                                                    \r\n"
										+ "    ....              .    ..     ...                                                               \r\n"
										+ "   .    ..               .    ..       .                                                            \r\n"
										+ "  ,       .               ..    ..        ..                                                        \r\n"
										+ "           ...              ..    .  ..,.,......                                                    \r\n"
										+ ".             ..              .    .,.   .      ...                                                 \r\n"
										+ "                ..             .   .       .        ..                                              \r\n"
										+ "  .                ..           . . ,..      .          ...                                         \r\n"
										+ "   ..                ..         ..  ...,..     .           ...                                      \r\n"
										+ "     ..                ..       ..      ..,,.   .             ...                                   \r\n"
										+ "       ...               .   ......         .,,. .               ...                                \r\n"
										+ "          ...            ....       ..          ..,,,               ...                             \r\n"
										+ "             .     ........           ..           ..:,.               . .                          \r\n"
										+ "              .  ....      ..           ..             .,,.              .:..                       \r\n"
										+ "               ,..            ...         ..              .:,          ,..   ...                    \r\n"
										+ "             ..                   ..        ..              ...                 ..                  \r\n"
										+ "       . . .. .                      ..        .               :   ;zYi:.         ..                \r\n"
										+ "   ...    ..   .                       ..       ..          CMMMv 0MMMMMMMMM8       ..              \r\n"
										+ "         ..     ..                       ..       ..     ..CMMMMi MMMMMMMMMMM$.,      ..            \r\n"
										+ "         .        .                        ..       . ,.,      .  .@MMMz:       ..,.    .           \r\n"
										+ "         .         ...                      ..     ...     ...      v.             ...   .          \r\n"
										+ "         ..           .                          .:.  .,,..           .               :   .         \r\n"
										+ "          .             ..                      .7  ,:.                :.              7.           \r\n"
										+ "           ..             .       . . .      .C 6..,.               .   .:.             EQY         \r\n"
										+ "            ..             ...              QMM: ,.                 .     .i.           :MMMQ       \r\n"
										+ "             ...            ...            WMMM6 .                  .       ::          .M@MM#      \r\n"
										+ "           .   ..              ..         SMMMM@                   YMI        :,        ,M#@MMZ     \r\n"
										+ "        ..       ..              .       .MMMMM@                ;WMMMMM@1      .:       QM@#MMM:    \r\n"
										+ "       .           .              .      MMMMMM@ ::,..       .6MMM###@@MMM@:     i   ...@MMM@MMM    \r\n"
										+ "      .             ..             .    iMMMMMMv ,. . .,:..:$MM##$#$##@@@MMMM7..,,::     vMMMMMM;   \r\n"
										+ "     .                ..            .   BMMMMM;  .,.      YMM@$#$#$@#@@@@M@MMMM    :      .MMMMM#   \r\n"
										+ "    .                  ..           .   MMMMM:  . .,.      MM##$####@@@@@@MMMM      i       MMMMM   \r\n"
										+ "   .                    ..           . ,:tv,   ...  .:.    ;M@###@@@@@@M@MMMMQ      .,   .  .vii,   \r\n"
										+ "  ,                      ..    ....  . ., Yt ,,....   ,,    MM@@@@@@@@M@MMMMM       .,..,... i$.:.  \r\n"
										+ "  .                       .  ..        czY;A,:,,....   .,.   MMM@M@MMMMMMMMM7       .,.....,.vv,Y:  \r\n"
										+ "                          ...          :oY;2i::,,.... .  .,  nMMMMMMMMMMMMM@       .:.....,,,7Yit,  \r\n"
										+ "                           .           .C7;Ivi::,:,.....  .,  MMMMMMMMMMMMM    ..,.,.....,,:,zicn.  \r\n"
										+ "  .                       .             YvYC2iii:,:,,.....  ..:            ...,...,...,,,,::cS;7t   \r\n"
										+ "  ..                     ..           . ,7;;ICi;ii::,,,.... ,,              i. ....,.,,::::i2Xct;   \r\n"
										+ "   ..                   ..            .  ;;icUci;ii::,,,,..i:.,.......,.... .i:...,,,,:,:,,1z;Y7.   \r\n"
										+ "     .                 . .            .   ;i:vIY,,,:::::.,;:...,.,............i;...,.,...ibSivY,    \r\n"
										+ "       ..           ...  .        ... .   ,ii.8M#I7i,...,7:,::.,,..,,.,.,,,,,,,v. ...:76@MMiiv:     \r\n"
										+ "         ...      ..     ..    ...       . .:.EMMMMM@#QQW:,iii...:::,::::::::ii: 8MMMMMMMMM;,: .    \r\n"
										+ "             .  .         .   .          .  . CMMMMMMMMMM7,i7: .;;iiiiiiiiiii;;. MMMMMMMMMM..       \r\n"
										+ "             ....          ..            .    .MMMMMMM@MMMtiv ,C77cYvYvYvYcY;i1..MMMMMMMMMI         \r\n"
										+ "          ...    .        . ..           .      @MMMMMMMMMMQ  CY7Y7Y7YX77YYi.tM SMMMMMMMM:          \r\n"
										+ "         .        .     ..    ..         .       iMMMMMMMMM; C:ii;i;;;i;ii,:QM@ MMMMMMM2   .        \r\n"
										+ "       ..          .  ..        .        .         :MMMMMM: $Mz:;i;i;i;i;vY#MM7 MMMMM7    .         \r\n"
										+ "      .            . .           ..     ..            YMM.  2Y.,:i:i:i:i::. :E CMMo      .          \r\n"
										+ "     .             ..              .    .                 ..  . . . . . ...           ..            \r\n"
										+ "    .              .                ..  .          .....   ,     . . ... .   ..      .              \r\n"
										+ "   ..             .                  ...      ..,,..  .   .,          .      ,.   ..                \r\n"
										+ "   .              .                   ..    .:..     .     :         .       :  ..                  \r\n"
										+ "  .              .                    .   ,:.       ..    .:        ..      :. .                    \r\n"
										+ "  .              .                    .  i.         .      i       ...     .,.                      \r\n"
										+ "  .             .                    ...i           .      :  ...     . . ..                        \r\n"
										+ "  .             .                    ..:           ..... . :.        .    .                         \r\n"
										+ "  .            .                    ..,      .. .     .    :         .   ..                         \r\n"
										+ "  .            .                   ...   ...          .    :.        .  ..                          \r\n"
										+ "  .           .                  ...,  ..             .    ,.       .  ..                           \r\n"
										+ "   .         .                 ....:.                .     :       .  .                             \r\n"
										+ "    .      ..                .,.  :,                .      :       ,,.                              \r\n"
										+ "     .   .               .....   .:               ..       i     .,..                               \r\n"
										+ "      ...       . .....          i.              ..       .,   .:,  .                               \r\n"
										+ "     ...     ,..                .:              .         ,. ,,:.  .                                \r\n"
										+ "   ..  .   ..                   i               .         i,:...  ..                                \r\n"
										+ "  .    .  .                     :              ...       :,    .  .                                 \r\n"
										+ "        ..                     ,v             .     .   .i      ...                                 \r\n"
										+ "                               : .                      ..                                          ");
						System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN + "ª tentativa e marcou "
								+ ponto + " ponto(s). \n" + "\n");
						saida = false;
					} else {
						ponto--;
						System.out.println("RESPOSTA ERRADA");
					}
					break;
				case "c":
				case "C":
					if (numeros.get(2).equals("1010011")) {
						System.out.println(
								"       ....      ..   .     ...                                                                     \r\n"
										+ "                                                                                                    \r\n"
										+ "    ....              .    ..     ...                                                               \r\n"
										+ "   .    ..               .    ..       .                                                            \r\n"
										+ "  ,       .               ..    ..        ..                                                        \r\n"
										+ "           ...              ..    .  ..,.,......                                                    \r\n"
										+ ".             ..              .    .,.   .      ...                                                 \r\n"
										+ "                ..             .   .       .        ..                                              \r\n"
										+ "  .                ..           . . ,..      .          ...                                         \r\n"
										+ "   ..                ..         ..  ...,..     .           ...                                      \r\n"
										+ "     ..                ..       ..      ..,,.   .             ...                                   \r\n"
										+ "       ...               .   ......         .,,. .               ...                                \r\n"
										+ "          ...            ....       ..          ..,,,               ...                             \r\n"
										+ "             .     ........           ..           ..:,.               . .                          \r\n"
										+ "              .  ....      ..           ..             .,,.              .:..                       \r\n"
										+ "               ,..            ...         ..              .:,          ,..   ...                    \r\n"
										+ "             ..                   ..        ..              ...                 ..                  \r\n"
										+ "       . . .. .                      ..        .               :   ;zYi:.         ..                \r\n"
										+ "   ...    ..   .                       ..       ..          CMMMv 0MMMMMMMMM8       ..              \r\n"
										+ "         ..     ..                       ..       ..     ..CMMMMi MMMMMMMMMMM$.,      ..            \r\n"
										+ "         .        .                        ..       . ,.,      .  .@MMMz:       ..,.    .           \r\n"
										+ "         .         ...                      ..     ...     ...      v.             ...   .          \r\n"
										+ "         ..           .                          .:.  .,,..           .               :   .         \r\n"
										+ "          .             ..                      .7  ,:.                :.              7.           \r\n"
										+ "           ..             .       . . .      .C 6..,.               .   .:.             EQY         \r\n"
										+ "            ..             ...              QMM: ,.                 .     .i.           :MMMQ       \r\n"
										+ "             ...            ...            WMMM6 .                  .       ::          .M@MM#      \r\n"
										+ "           .   ..              ..         SMMMM@                   YMI        :,        ,M#@MMZ     \r\n"
										+ "        ..       ..              .       .MMMMM@                ;WMMMMM@1      .:       QM@#MMM:    \r\n"
										+ "       .           .              .      MMMMMM@ ::,..       .6MMM###@@MMM@:     i   ...@MMM@MMM    \r\n"
										+ "      .             ..             .    iMMMMMMv ,. . .,:..:$MM##$#$##@@@MMMM7..,,::     vMMMMMM;   \r\n"
										+ "     .                ..            .   BMMMMM;  .,.      YMM@$#$#$@#@@@@M@MMMM    :      .MMMMM#   \r\n"
										+ "    .                  ..           .   MMMMM:  . .,.      MM##$####@@@@@@MMMM      i       MMMMM   \r\n"
										+ "   .                    ..           . ,:tv,   ...  .:.    ;M@###@@@@@@M@MMMMQ      .,   .  .vii,   \r\n"
										+ "  ,                      ..    ....  . ., Yt ,,....   ,,    MM@@@@@@@@M@MMMMM       .,..,... i$.:.  \r\n"
										+ "  .                       .  ..        czY;A,:,,....   .,.   MMM@M@MMMMMMMMM7       .,.....,.vv,Y:  \r\n"
										+ "                          ...          :oY;2i::,,.... .  .,  nMMMMMMMMMMMMM@       .:.....,,,7Yit,  \r\n"
										+ "                           .           .C7;Ivi::,:,.....  .,  MMMMMMMMMMMMM    ..,.,.....,,:,zicn.  \r\n"
										+ "  .                       .             YvYC2iii:,:,,.....  ..:            ...,...,...,,,,::cS;7t   \r\n"
										+ "  ..                     ..           . ,7;;ICi;ii::,,,.... ,,              i. ....,.,,::::i2Xct;   \r\n"
										+ "   ..                   ..            .  ;;icUci;ii::,,,,..i:.,.......,.... .i:...,,,,:,:,,1z;Y7.   \r\n"
										+ "     .                 . .            .   ;i:vIY,,,:::::.,;:...,.,............i;...,.,...ibSivY,    \r\n"
										+ "       ..           ...  .        ... .   ,ii.8M#I7i,...,7:,::.,,..,,.,.,,,,,,,v. ...:76@MMiiv:     \r\n"
										+ "         ...      ..     ..    ...       . .:.EMMMMM@#QQW:,iii...:::,::::::::ii: 8MMMMMMMMM;,: .    \r\n"
										+ "             .  .         .   .          .  . CMMMMMMMMMM7,i7: .;;iiiiiiiiiii;;. MMMMMMMMMM..       \r\n"
										+ "             ....          ..            .    .MMMMMMM@MMMtiv ,C77cYvYvYvYcY;i1..MMMMMMMMMI         \r\n"
										+ "          ...    .        . ..           .      @MMMMMMMMMMQ  CY7Y7Y7YX77YYi.tM SMMMMMMMM:          \r\n"
										+ "         .        .     ..    ..         .       iMMMMMMMMM; C:ii;i;;;i;ii,:QM@ MMMMMMM2   .        \r\n"
										+ "       ..          .  ..        .        .         :MMMMMM: $Mz:;i;i;i;i;vY#MM7 MMMMM7    .         \r\n"
										+ "      .            . .           ..     ..            YMM.  2Y.,:i:i:i:i::. :E CMMo      .          \r\n"
										+ "     .             ..              .    .                 ..  . . . . . ...           ..            \r\n"
										+ "    .              .                ..  .          .....   ,     . . ... .   ..      .              \r\n"
										+ "   ..             .                  ...      ..,,..  .   .,          .      ,.   ..                \r\n"
										+ "   .              .                   ..    .:..     .     :         .       :  ..                  \r\n"
										+ "  .              .                    .   ,:.       ..    .:        ..      :. .                    \r\n"
										+ "  .              .                    .  i.         .      i       ...     .,.                      \r\n"
										+ "  .             .                    ...i           .      :  ...     . . ..                        \r\n"
										+ "  .             .                    ..:           ..... . :.        .    .                         \r\n"
										+ "  .            .                    ..,      .. .     .    :         .   ..                         \r\n"
										+ "  .            .                   ...   ...          .    :.        .  ..                          \r\n"
										+ "  .           .                  ...,  ..             .    ,.       .  ..                           \r\n"
										+ "   .         .                 ....:.                .     :       .  .                             \r\n"
										+ "    .      ..                .,.  :,                .      :       ,,.                              \r\n"
										+ "     .   .               .....   .:               ..       i     .,..                               \r\n"
										+ "      ...       . .....          i.              ..       .,   .:,  .                               \r\n"
										+ "     ...     ,..                .:              .         ,. ,,:.  .                                \r\n"
										+ "   ..  .   ..                   i               .         i,:...  ..                                \r\n"
										+ "  .    .  .                     :              ...       :,    .  .                                 \r\n"
										+ "        ..                     ,v             .     .   .i      ...                                 \r\n"
										+ "                               : .                      ..                                          ");
						System.out.println("\n" + "GolaAaAaço!!! Você acertou na " + contN + "ª tentativa e marcou "
								+ ponto + " ponto(s). \n" + "\n");
						saida = false;
					} else {
						ponto--;
						System.out.println("RESPOSTA ERRADA");
					}
					break;
				case "d":
				case "D":
					if (numeros.get(3).equals("1010011")) {
						System.out.println(
								"       ....      ..   .     ...                                                                     \r\n"
										+ "                                                                                                    \r\n"
										+ "    ....              .    ..     ...                                                               \r\n"
										+ "   .    ..               .    ..       .                                                            \r\n"
										+ "  ,       .               ..    ..        ..                                                        \r\n"
										+ "           ...              ..    .  ..,.,......                                                    \r\n"
										+ ".             ..              .    .,.   .      ...                                                 \r\n"
										+ "                ..             .   .       .        ..                                              \r\n"
										+ "  .                ..           . . ,..      .          ...                                         \r\n"
										+ "   ..                ..         ..  ...,..     .           ...                                      \r\n"
										+ "     ..                ..       ..      ..,,.   .             ...                                   \r\n"
										+ "       ...               .   ......         .,,. .               ...                                \r\n"
										+ "          ...            ....       ..          ..,,,               ...                             \r\n"
										+ "             .     ........           ..           ..:,.               . .                          \r\n"
										+ "              .  ....      ..           ..             .,,.              .:..                       \r\n"
										+ "               ,..            ...         ..              .:,          ,..   ...                    \r\n"
										+ "             ..                   ..        ..              ...                 ..                  \r\n"
										+ "       . . .. .                      ..        .               :   ;zYi:.         ..                \r\n"
										+ "   ...    ..   .                       ..       ..          CMMMv 0MMMMMMMMM8       ..              \r\n"
										+ "         ..     ..                       ..       ..     ..CMMMMi MMMMMMMMMMM$.,      ..            \r\n"
										+ "         .        .                        ..       . ,.,      .  .@MMMz:       ..,.    .           \r\n"
										+ "         .         ...                      ..     ...     ...      v.             ...   .          \r\n"
										+ "         ..           .                          .:.  .,,..           .               :   .         \r\n"
										+ "          .             ..                      .7  ,:.                :.              7.           \r\n"
										+ "           ..             .       . . .      .C 6..,.               .   .:.             EQY         \r\n"
										+ "            ..             ...              QMM: ,.                 .     .i.           :MMMQ       \r\n"
										+ "             ...            ...            WMMM6 .                  .       ::          .M@MM#      \r\n"
										+ "           .   ..              ..         SMMMM@                   YMI        :,        ,M#@MMZ     \r\n"
										+ "        ..       ..              .       .MMMMM@                ;WMMMMM@1      .:       QM@#MMM:    \r\n"
										+ "       .           .              .      MMMMMM@ ::,..       .6MMM###@@MMM@:     i   ...@MMM@MMM    \r\n"
										+ "      .             ..             .    iMMMMMMv ,. . .,:..:$MM##$#$##@@@MMMM7..,,::     vMMMMMM;   \r\n"
										+ "     .                ..            .   BMMMMM;  .,.      YMM@$#$#$@#@@@@M@MMMM    :      .MMMMM#   \r\n"
										+ "    .                  ..           .   MMMMM:  . .,.      MM##$####@@@@@@MMMM      i       MMMMM   \r\n"
										+ "   .                    ..           . ,:tv,   ...  .:.    ;M@###@@@@@@M@MMMMQ      .,   .  .vii,   \r\n"
										+ "  ,                      ..    ....  . ., Yt ,,....   ,,    MM@@@@@@@@M@MMMMM       .,..,... i$.:.  \r\n"
										+ "  .                       .  ..        czY;A,:,,....   .,.   MMM@M@MMMMMMMMM7       .,.....,.vv,Y:  \r\n"
										+ "                          ...          :oY;2i::,,.... .  .,  nMMMMMMMMMMMMM@       .:.....,,,7Yit,  \r\n"
										+ "                           .           .C7;Ivi::,:,.....  .,  MMMMMMMMMMMMM    ..,.,.....,,:,zicn.  \r\n"
										+ "  .                       .             YvYC2iii:,:,,.....  ..:            ...,...,...,,,,::cS;7t   \r\n"
										+ "  ..                     ..           . ,7;;ICi;ii::,,,.... ,,              i. ....,.,,::::i2Xct;   \r\n"
										+ "   ..                   ..            .  ;;icUci;ii::,,,,..i:.,.......,.... .i:...,,,,:,:,,1z;Y7.   \r\n"
										+ "     .                 . .            .   ;i:vIY,,,:::::.,;:...,.,............i;...,.,...ibSivY,    \r\n"
										+ "       ..           ...  .        ... .   ,ii.8M#I7i,...,7:,::.,,..,,.,.,,,,,,,v. ...:76@MMiiv:     \r\n"
										+ "         ...      ..     ..    ...       . .:.EMMMMM@#QQW:,iii...:::,::::::::ii: 8MMMMMMMMM;,: .    \r\n"
										+ "             .  .         .   .          .  . CMMMMMMMMMM7,i7: .;;iiiiiiiiiii;;. MMMMMMMMMM..       \r\n"
										+ "             ....          ..            .    .MMMMMMM@MMMtiv ,C77cYvYvYvYcY;i1..MMMMMMMMMI         \r\n"
										+ "          ...    .        . ..           .      @MMMMMMMMMMQ  CY7Y7Y7YX77YYi.tM SMMMMMMMM:          \r\n"
										+ "         .        .     ..    ..         .       iMMMMMMMMM; C:ii;i;;;i;ii,:QM@ MMMMMMM2   .        \r\n"
										+ "       ..          .  ..        .        .         :MMMMMM: $Mz:;i;i;i;i;vY#MM7 MMMMM7    .         \r\n"
										+ "      .            . .           ..     ..            YMM.  2Y.,:i:i:i:i::. :E CMMo      .          \r\n"
										+ "     .             ..              .    .                 ..  . . . . . ...           ..            \r\n"
										+ "    .              .                ..  .          .....   ,     . . ... .   ..      .              \r\n"
										+ "   ..             .                  ...      ..,,..  .   .,          .      ,.   ..                \r\n"
										+ "   .              .                   ..    .:..     .     :         .       :  ..                  \r\n"
										+ "  .              .                    .   ,:.       ..    .:        ..      :. .                    \r\n"
										+ "  .              .                    .  i.         .      i       ...     .,.                      \r\n"
										+ "  .             .                    ...i           .      :  ...     . . ..                        \r\n"
										+ "  .             .                    ..:           ..... . :.        .    .                         \r\n"
										+ "  .            .                    ..,      .. .     .    :         .   ..                         \r\n"
										+ "  .            .                   ...   ...          .    :.        .  ..                          \r\n"
										+ "  .           .                  ...,  ..             .    ,.       .  ..                           \r\n"
										+ "   .         .                 ....:.                .     :       .  .                             \r\n"
										+ "    .      ..                .,.  :,                .      :       ,,.                              \r\n"
										+ "     .   .               .....   .:               ..       i     .,..                               \r\n"
										+ "      ...       . .....          i.              ..       .,   .:,  .                               \r\n"
										+ "     ...     ,..                .:              .         ,. ,,:.  .                                \r\n"
										+ "   ..  .   ..                   i               .         i,:...  ..                                \r\n"
										+ "  .    .  .                     :              ...       :,    .  .                                 \r\n"
										+ "        ..                     ,v             .     .   .i      ...                                 \r\n"
										+ "                               : .                      ..                                          ");
						System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN + "ª tentativa e marcou "
								+ ponto + " ponto(s). \n" + "\n");
						saida = false;
					} else {
						ponto--;
						System.out.println("RESPOSTA ERRADA");
					}
					break;
				case "e":
				case "E":
					if (numeros.get(4).equals("1010011")) {
						System.out.println(
								"       ....      ..   .     ...                                                                     \r\n"
										+ "                                                                                                    \r\n"
										+ "    ....              .    ..     ...                                                               \r\n"
										+ "   .    ..               .    ..       .                                                            \r\n"
										+ "  ,       .               ..    ..        ..                                                        \r\n"
										+ "           ...              ..    .  ..,.,......                                                    \r\n"
										+ ".             ..              .    .,.   .      ...                                                 \r\n"
										+ "                ..             .   .       .        ..                                              \r\n"
										+ "  .                ..           . . ,..      .          ...                                         \r\n"
										+ "   ..                ..         ..  ...,..     .           ...                                      \r\n"
										+ "     ..                ..       ..      ..,,.   .             ...                                   \r\n"
										+ "       ...               .   ......         .,,. .               ...                                \r\n"
										+ "          ...            ....       ..          ..,,,               ...                             \r\n"
										+ "             .     ........           ..           ..:,.               . .                          \r\n"
										+ "              .  ....      ..           ..             .,,.              .:..                       \r\n"
										+ "               ,..            ...         ..              .:,          ,..   ...                    \r\n"
										+ "             ..                   ..        ..              ...                 ..                  \r\n"
										+ "       . . .. .                      ..        .               :   ;zYi:.         ..                \r\n"
										+ "   ...    ..   .                       ..       ..          CMMMv 0MMMMMMMMM8       ..              \r\n"
										+ "         ..     ..                       ..       ..     ..CMMMMi MMMMMMMMMMM$.,      ..            \r\n"
										+ "         .        .                        ..       . ,.,      .  .@MMMz:       ..,.    .           \r\n"
										+ "         .         ...                      ..     ...     ...      v.             ...   .          \r\n"
										+ "         ..           .                          .:.  .,,..           .               :   .         \r\n"
										+ "          .             ..                      .7  ,:.                :.              7.           \r\n"
										+ "           ..             .       . . .      .C 6..,.               .   .:.             EQY         \r\n"
										+ "            ..             ...              QMM: ,.                 .     .i.           :MMMQ       \r\n"
										+ "             ...            ...            WMMM6 .                  .       ::          .M@MM#      \r\n"
										+ "           .   ..              ..         SMMMM@                   YMI        :,        ,M#@MMZ     \r\n"
										+ "        ..       ..              .       .MMMMM@                ;WMMMMM@1      .:       QM@#MMM:    \r\n"
										+ "       .           .              .      MMMMMM@ ::,..       .6MMM###@@MMM@:     i   ...@MMM@MMM    \r\n"
										+ "      .             ..             .    iMMMMMMv ,. . .,:..:$MM##$#$##@@@MMMM7..,,::     vMMMMMM;   \r\n"
										+ "     .                ..            .   BMMMMM;  .,.      YMM@$#$#$@#@@@@M@MMMM    :      .MMMMM#   \r\n"
										+ "    .                  ..           .   MMMMM:  . .,.      MM##$####@@@@@@MMMM      i       MMMMM   \r\n"
										+ "   .                    ..           . ,:tv,   ...  .:.    ;M@###@@@@@@M@MMMMQ      .,   .  .vii,   \r\n"
										+ "  ,                      ..    ....  . ., Yt ,,....   ,,    MM@@@@@@@@M@MMMMM       .,..,... i$.:.  \r\n"
										+ "  .                       .  ..        czY;A,:,,....   .,.   MMM@M@MMMMMMMMM7       .,.....,.vv,Y:  \r\n"
										+ "                          ...          :oY;2i::,,.... .  .,  nMMMMMMMMMMMMM@       .:.....,,,7Yit,  \r\n"
										+ "                           .           .C7;Ivi::,:,.....  .,  MMMMMMMMMMMMM    ..,.,.....,,:,zicn.  \r\n"
										+ "  .                       .             YvYC2iii:,:,,.....  ..:            ...,...,...,,,,::cS;7t   \r\n"
										+ "  ..                     ..           . ,7;;ICi;ii::,,,.... ,,              i. ....,.,,::::i2Xct;   \r\n"
										+ "   ..                   ..            .  ;;icUci;ii::,,,,..i:.,.......,.... .i:...,,,,:,:,,1z;Y7.   \r\n"
										+ "     .                 . .            .   ;i:vIY,,,:::::.,;:...,.,............i;...,.,...ibSivY,    \r\n"
										+ "       ..           ...  .        ... .   ,ii.8M#I7i,...,7:,::.,,..,,.,.,,,,,,,v. ...:76@MMiiv:     \r\n"
										+ "         ...      ..     ..    ...       . .:.EMMMMM@#QQW:,iii...:::,::::::::ii: 8MMMMMMMMM;,: .    \r\n"
										+ "             .  .         .   .          .  . CMMMMMMMMMM7,i7: .;;iiiiiiiiiii;;. MMMMMMMMMM..       \r\n"
										+ "             ....          ..            .    .MMMMMMM@MMMtiv ,C77cYvYvYvYcY;i1..MMMMMMMMMI         \r\n"
										+ "          ...    .        . ..           .      @MMMMMMMMMMQ  CY7Y7Y7YX77YYi.tM SMMMMMMMM:          \r\n"
										+ "         .        .     ..    ..         .       iMMMMMMMMM; C:ii;i;;;i;ii,:QM@ MMMMMMM2   .        \r\n"
										+ "       ..          .  ..        .        .         :MMMMMM: $Mz:;i;i;i;i;vY#MM7 MMMMM7    .         \r\n"
										+ "      .            . .           ..     ..            YMM.  2Y.,:i:i:i:i::. :E CMMo      .          \r\n"
										+ "     .             ..              .    .                 ..  . . . . . ...           ..            \r\n"
										+ "    .              .                ..  .          .....   ,     . . ... .   ..      .              \r\n"
										+ "   ..             .                  ...      ..,,..  .   .,          .      ,.   ..                \r\n"
										+ "   .              .                   ..    .:..     .     :         .       :  ..                  \r\n"
										+ "  .              .                    .   ,:.       ..    .:        ..      :. .                    \r\n"
										+ "  .              .                    .  i.         .      i       ...     .,.                      \r\n"
										+ "  .             .                    ...i           .      :  ...     . . ..                        \r\n"
										+ "  .             .                    ..:           ..... . :.        .    .                         \r\n"
										+ "  .            .                    ..,      .. .     .    :         .   ..                         \r\n"
										+ "  .            .                   ...   ...          .    :.        .  ..                          \r\n"
										+ "  .           .                  ...,  ..             .    ,.       .  ..                           \r\n"
										+ "   .         .                 ....:.                .     :       .  .                             \r\n"
										+ "    .      ..                .,.  :,                .      :       ,,.                              \r\n"
										+ "     .   .               .....   .:               ..       i     .,..                               \r\n"
										+ "      ...       . .....          i.              ..       .,   .:,  .                               \r\n"
										+ "     ...     ,..                .:              .         ,. ,,:.  .                                \r\n"
										+ "   ..  .   ..                   i               .         i,:...  ..                                \r\n"
										+ "  .    .  .                     :              ...       :,    .  .                                 \r\n"
										+ "        ..                     ,v             .     .   .i      ...                                 \r\n"
										+ "                               : .                      ..                                          ");
						System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN + "ª tentativa e marcou "
								+ ponto + " ponto(s). \n" + "\n");
						saida = false;
					} else {
						ponto--;
						System.out.println("RESPOSTA ERRADA");
						break;
					}
				}

				if (contN == 1 && (!(n1.equals(numeros)) && saida)) {
					System.out.println("Olha o exemplo novamente. Talvez você não tenha entendido! \n" + "\n"
							+ "Digite NOVO para ver o exemplo novamente e ter uma nova tentativa.");
					String seguir6 = ler.next();
					System.out.println("\n");
				}
				if (contN == 2 && (!(n1.equals(numeros)) && saida)) {
					System.out.println("Você tem uma última chance. Olhe o exemplo novamente. !!ATENÇÃO!! \n" + "\n"
							+ "Digite NOVO para ver o exemplo novamente e ter uma nova tentativa.");
					String seguir7 = ler.next();
					System.out.println("");
				}
				if (contN == 3 && (!(n1.equals(numeros)) && saida)) {
					System.out.println("\r\n"
							+ "                                                                  ..;i,.                            \r\n"
							+ "                                                             1WMMMMMMMMMMMMb                        \r\n"
							+ "                                                         ,ZbnnMMMMMMMMMMMMMMM;                      \r\n"
							+ "                                                      1Mt$$QQ$@@$#@@@##@@@$$MME                     \r\n"
							+ "                                                      MEi8$EB#$$#B$E$##$@$$@MMMM.                   \r\n"
							+ "                                                      MUUWWBE0W##@$$#@##@M@$##@MMi                  \r\n"
							+ "                                                    .Z#bQWBW$Q$#@#@@@@@##$#WE9$@M0                  \r\n"
							+ "                                                   :M#bB$#WWQB$@$@@@$$W##@Qz$BA@MMi                 \r\n"
							+ "                                                   X$B$EozSzE0$WBB$Q$$####M@@@M99MM                 \r\n"
							+ "                                                   EQBC:iCovA@W00Q0W#$$#b$MMM@@M0MMt                \r\n"
							+ "                                                 .AA2;.,2Q$C1##EE80B$EQ06oW@MMMMMMMM                \r\n"
							+ "                                               .:vi,...YYZIii1WQb0WBQ0ZIv::v7z$MMMM8                \r\n"
							+ "                                              ,::.  ..ivCYvi:C#B06UnZb61nX;...:oMMM                 \r\n"
							+ "                                            .ii,...,,;X7i::YvIIC;;i;;Y161;,i6c  z8C                 \r\n"
							+ "                                    . ..  .:;ii,,,ii;ii,. ,b8vviv;YcX7v,.i90X,i;iz.                 \r\n"
							+ "                                  :. :,::i;;:::i:ii;i::;,:.nAYccv7SAv,..iES,.:CIA:                  \r\n"
							+ "                                 ..   ,YnY;:ii;ii:;i::;i;v.IE7Y7oSY..itIAXi::izYi                   \r\n"
							+ "                             ..,.  .    .Ycv;Ycci;iv;i;c,i.CWboY:..iCtSUc7Sv;1CY                    \r\n"
							+ "                         ...,.      ...   itSCC;vv7CS;;;.:,.;;,..iY;i;YCnXciv2b                     \r\n"
							+ "                       ...           ...   .c9UtXzn68S;viXc;,.,YS827iviivYCXtU.                     \r\n"
							+ "                      .                ....  .co0QEE0Q2Yi;1C7tI22o12Et:,i;z86                       \r\n"
							+ "                   ;:          .         ...   .C0QWWMM#v,ctoA2onUoCo8o;inzt                        \r\n"
							+ "                  CC        . .           ..,..,i,;6@MM@:,7YYcS1CvCzz96tbW6.                        \r\n"
							+ "                 .i      . ... . .          .,..,77vYCc  .i;ccv117cC12Y2#v                          \r\n"
							+ "                 .  ..:...,,... .            ...,.UMi;Q:,.:iv;i;CYSEE2UQ.                           \r\n"
							+ "                  .  ,...,...... .            ,..,.Q@$Mt,.:;ii::.v$QYv1                             \r\n"
							+ "                . . ....... .i,........        .. ..vbMU;,ii:,:,.Yo. ,                              \r\n"
							+ "               .:,,i......,::i.,.... .....   . .;.i1;vvzn;;;:,::.Xtc.::                             \r\n"
							+ "               i..::......;:. :,....         .. zt1:7;;Xnvvii,:,ivcv:,;                             \r\n"
							+ "              ,i.. .......,..::,....          ,  .  .i,AcY;i,,,,;;:ii:::                            \r\n"
							+ "              z.,,. ...::,..:i:..     iii.       X111.:7CYYi:,,,17i:i::;.                           \r\n"
							+ "              C.,,.,...    .        v$87;;Cv     t2n@t tc7;;,,.:Uzvi:::ii                           \r\n"
							+ "              C ...,:....   ,:..:, v@6t:i,vC2;    ,.1@i77Yci:,.,9o7i:,:,i.                          \r\n"
							+ "             .c....,,,:::,iov.,:.. BIbiviSv7CzX    ib$CYYYi;i, ,Iz7c:,,:,i                          \r\n"
							+ "              :::..,ii;ii:C7 ii .  EInv7nXcv;;0    iMXvcc;;ii, :WU7cv::ii,:                         \r\n"
							+ "               i,,.,,:,:,,;Y:i ;.  iW6AEc.i9#@i     2Yiv;;i:i, iBbYYYi,:::,:                        \r\n"
							+ "               :,...,.,,,.:i;Y:,... .b$;b#@Bt       iX;;vii,:. i#6SYY;:,ii:,:                       \r\n"
							+ "               .,,.,.,.,.    :;. ...   ,i,          n6;;;;:,...;@AntYYi:iYi::i                      \r\n"
							+ "                ,....... ,QUIoE$i ...               YvXYYi:..,,,MI1tCvYi:iYi:ii                     \r\n"
							+ "                ........ ;MMMMMMMU  .. ... .           Y7i.,,i. EbC1CXv;i:iv:ii:                    \r\n"
							+ "                ........ .Yiii;;ZM8 ...,,......         ,::ii:,,W$ItnXCv;ii;;:ii                    \r\n"
							+ "                .:......  . ..  .:Yv.  :i.:i.:           .v;i,nMMMUSCnt7;;i;iiic,                   \r\n"
							+ "                 :,..... nM@@@@#@#@@MB, . :;i....... ..   ;Y;:ZbM#9o2tSXc;;ii:;Y;                   \r\n"
							+ "                 ,,..... 1@QEW#@M@@MMMME..i; .i.........  ,Ci.  8@9UooCS77v;::iY:                   \r\n"
							+ "                  i...... . ...,::ii7z$Mz,Y. i.,,.:...:.   i:;XSUBQUUoz11YY;i,,vi                   \r\n"
							+ "                  ,:................ .,;v7;.i..i.;:, ::,   ::A@#X760UIoot17ci:.CY.                  \r\n"
							+ "                   ,......,...,.,,,,,.:iYYY;;.v,c:i..::..  .tUt ;vioQ66zSnScvY;YC                   \r\n"
							+ "                   .,,.,.......,.,,:,:,i;YYY;v:iYi,.,:,:,.  7M   vvi;b0b2IoX7bQ9                    \r\n"
							+ "                   .:.,.. . ..,.,.,::::,,i7Y7i;:.,;;77Xcv.  @S     ..,SbbIItCE$.                    \r\n"
							+ "                   .,... . ...,,...,:i:. ,ii;Y;;  .:iXC1vY YM          ;b$WEC:                      \r\n"
							+ "                    ,.. ..  . ..,...,,:.  ,...ivv       IM bW            ..                         \r\n"
							+ "                    .. . . .   ..,..  ,i.  :i,.,ii  ..  Q0 #i                                       \r\n"
							+ "                    ..  ....    .....  .i.  .;7iii.  . iM;Y,                                        \r\n"
							+ "                   ..  ....:,.   .....   .    .i;vi:   MA,$                                         \r\n"
							+ "                    .  .:. .:,.  .....    .      .,ii  Z: $c                                        \r\n"
							+ "                   ... ...  ...   ....                  U ..                                        \r\n"
							+ "                   ..  .    ....   ....         .      .M1.                                         \r\n"
							+ "                   ,.  .      ...   ...         .,...  SUEi                                         \r\n"
							+ "                  ...  ..     ....   ....           . .Q C,                                         \r\n"
							+ "                   ,.  ...     ..,.  .....             E i:                                         \r\n"
							+ "                  .,. ..  ..    ....  ... .      .... Y@.Z:                                         ");
					System.out.println("\n" + "Você errou as três tentativas!! \n"
							+ "Acho que você não entendeu a jogada! Infelizmente não marcou pontos nessa rodada! \n"
							+ "Tente a próxima!");
				}
			} while (contN != 3 && saida);
		}
		return ponto;
	}

	// EXERCÍCIO 8
	static int ex8(String nome, String time) {

		List numeros = new ArrayList();
		int i = 0;
		int contN = 0;
		int ponto = 3;
		String n1;
		boolean saida = true, loop;

		numeros.add("S = A'.B'.C + B'.C' + A.B.C'");
		numeros.add("S = A.B'.C + A.B.C + A'.B.C' + A.B'.C'");
		numeros.add("S = A'.B'.C' + A.B.C' + A'.B'.C");
		numeros.add("S = A'.B'.C' + A'.B.C + A.B'.C + A.B.C"); // resposta certa
		numeros.add("S = A.B.C' + A.B'.C' + A.B.C + A.B");
		System.out.println(
				"** DESAFIO 8 ** \n" + "\n" + nome + " o próximo jogo do " + time + " será contra o Internacional.");

		do {
			String seguir = "Aceito";
			String recusa = "Sair";
			System.out.println("\n" + "Digite ACEITO para começar o desafio");
			String resposta = ler.next();

			if (resposta.equalsIgnoreCase(seguir)) {

				do {
					// EXEMPLO
					System.out.println("\n"
							+ " Para chegar a expressão booleana através de uma tabela verdade, é necessário \n"
							+ "que você entenda que representamos na expressão apenas as entradas que tem saidas \n"
							+ "igual a 1 e ignoramos as entradas cuja saida seja igual a 0. \n" + "\n"
							+ "                     Dada a tabela verdade abaixo, indique a expressão booleana que a \n"
							+ "                    represente. Para resolver, utilize a soma dos produtos!" + "\n");

					System.out.println("					    **TABELA VERDADE** \n " + "\n"
							+ "					      A | B | C | S \n"
							+ "		                             --------------- \n"
							+ "					      0 | 0 | 0 | 1 \n" + "					      0 | 0 | 1 | 0 \n"
							+ "					      0 | 1 | 0 | 0 \n" + "					      0 | 1 | 1 | 1 \n"
							+ "					      1 | 0 | 0 | 0 \n" + "					      1 | 0 | 1 | 1 \n"
							+ "					      1 | 1 | 0 | 0 \n" + "					      1 | 1 | 1 | 1 \n"
							+ "\n");
					contN++;
					Collections.shuffle(numeros);

					System.out.println("\n" + "RESPONDA \n"
							+ "Qual é a expressão booleana que representa a tabela verdade acima? \n" + "\n" + "a) "
							+ numeros.get(0) + "\n" + "\n" + "b) " + numeros.get(1) + "\n" + "\n" + "c) "
							+ numeros.get(2) + "\n" + "\n" + "d) " + numeros.get(3) + "\n" + "\n" + "e) "
							+ numeros.get(4) + "\n" + "\n" + "RESPOSTA: ");
					n1 = ler.next();

					System.out.println("");
					switch (n1) {
					case "a":
					case "A":
						if (numeros.get(0).equals("S = A'.B'.C' + A'.B.C + A.B'.C + A.B.C")) {
							System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n");
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					case "b":
					case "B":
						if (numeros.get(1).equals("S = A'.B'.C' + A'.B.C + A.B'.C + A.B.C")) {
							System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n");
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					case "c":
					case "C":
						if (numeros.get(2).equals("S = A'.B'.C' + A'.B.C + A.B'.C + A.B.C")) {
							System.out.println("\n" + "GolaAaAaço!!! Você acertou na " + contN + "ª tentativa e marcou "
									+ ponto + " ponto(s). \n");
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					case "d":
					case "D":
						if (numeros.get(3).equals("S = A'.B'.C' + A'.B.C + A.B'.C + A.B.C")) {
							System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n");
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					case "e":
					case "E":
						if (numeros.get(4).equals("S = A'.B'.C' + A'.B.C + A.B'.C + A.B.C")) {
							System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n");
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
							break;
						}
					}

					if (contN == 1 && (!(n1.equals(numeros)) && saida)) {
						System.out.println("Olhe a tabela novamente. Talvez você não tenha entendido! \n" + "\n"
								+ "Digite NOVO para ver a tabela e ter uma nova tentativa.");
						String seguir6 = ler.next();
						System.out.println("\n");
					}
					if (contN == 2 && (!(n1.equals(numeros)) && saida)) {
						System.out.println(
								"Você tem uma última chance. Olhe a tabela mais uma vez e tente novamente. !!ATENÇÃO!! \n"
										+ "\n" + "Digite NOVO para ver a tabela e ter uma nova tentativa.");
						String seguir7 = ler.next();
						System.out.println("");
					}
					if (contN == 3 && (!(n1.equals(numeros)) && saida)) {
						System.out.println("\n" + "Você errou as três tentativas!! \n"
								+ "Acho que você não entendeu a tabela! Infelizmente não marcou pontos nessa rodada! \n");
					}
				} while (contN != 3 && saida);
			} else {
				System.out.println("Inválido");
				loop = false;
			}

		} while (contN != 3 && saida);

		return ponto;
	}

	// EXERCICIO 10
	private static boolean loop;

	static int ex10(String nome, String time) {

		int i = 0;
		int contN = 0;
		int ponto = 6;
		String n1 = null;
		boolean saida = true;
		int l1, l2, l3, l4;

		List opcao = new ArrayList();

		opcao.add("S = A' + B'"); // resposta certa
		opcao.add("S = A.B' + C");
		opcao.add("S = A' + B.C'");
		opcao.add("S = A'.B");
		opcao.add("S = A.B.C'");

		int vetor1[] = { 11, 11, 00, 11 };
		/*
		 * RESPOSTA CERTA TABELA VERDADE** ** MAPA DE KARNAUGH**\n " +
		 * "                                                   ____ C\n" +
		 * "	A | B | C | S                               A B | 0 | 1\n" +
		 * "	---------------                            -------------\n" +
		 * "	0 | 0 | 0 | 1                               0 0 | 1 | 1  \n" +
		 * "	0 | 0 | 1 | 1                               0 1 | 1 | 1  \n" +
		 * "	0 | 1 | 0 | 1                               1 1 | 0 | 0  \n" +
		 * "	0 | 1 | 1 | 1                               1 0 | 1 | 1  \n" +
		 * "	1 | 0 | 0 | 1 \n" + "	1 | 0 | 1 | 1 \n" +
		 * "	1 | 1 | 0 | 0                          ** EXPRESSÃO BOOLEANA ** \n" +
		 * "	1 | 1 | 1 | 0                          S = A'+ B' \n"
		 */

		System.out.println("**--- 10º DESAFIO ---** \n" + "\n" + "QUE TRABALHÃO, " + nome + "!!\n"
				+ "Já estamos no último jogo que será " + time + " Vs Fortaleza\n"
				+ "Um pouco mais abaixo tem uma explicação sobre oque precisamos fazer. Boa sorte!!! \n" + "\n");

		do {
			String seguir = "Aceito";
			String recusa = "Sair";
			System.out.println("\n" + "Digite ACEITO para começar o desafio");
			String resposta = ler.next();

			if (resposta.equalsIgnoreCase(seguir)) {

				System.out.println("\n" + "	Percebi que temos algumas lacunas a serem preenchidas.\n"
						+ "	Tivemos a necessidade de substituir alguns jogadores machucados.\n" + "\n"
						+ "	Os novos jogadores precisam entender o esquema que estamos seguindo. Você pode ajudá-los preenchendo\n"
						+ "um MAPA DE KARNAUGH. Se conseguir preencher da maneira correta, será necessário indicar a expressão\n"
						+ "booleana que o represente. Que tal?" + "\n"
						+ "	Caso você consiga resolver esse desafio, iremos marcar alguns pontos e chegar mais próximos da classificação.\n"
						+ "	Mas fique tranquilo, abaixo tem um exemplo de como deve ser resolvido.\n" + "\n");

				do {
					// EXEMPLO
					System.out.println(
							"	O Mapa de Karnaugh é preenchido de acordo com as saídas da tabela verdade. Deve-se preencher seus\n"
									+ "espaços corretamente para se obter a forma mais simplificada da expressão booleana."
									+ "\n" + "	LEMBRE-SE:\n"
									+ "	Para conseguir a expressão simplificada através do mapa de karnaugh, existe algumas regras, você deve agrupar \n"
									+ "os numéros 1s sempre em grupos pares. Caso não seja possível, você pode utilizar um único 1 sozinho, mas, nunca \n"
									+ "fazer agrupamentos ímpares.\n"
									+ "	Deve-se lembrar também que destacamos sempre as entradas que não varia no conjunto.\n");
					System.out.println("			******** EXEMPLO ********\n" + "\n"
							+ "      **TABELA VERDADE**                        ** MAPA DE KARNAUGH**\n "
							+ "                                                   ____ C\n"
							+ "	A | B | C | S                               A B | 0 | 1\n"
							+ "	---------------                            -------------\n"
							+ "	0 | 0 | 0 | 1                               0 0 | 1 | 0  \n"
							+ "	0 | 0 | 1 | 0                               0 1 | 0 | 1  \n"
							+ "	0 | 1 | 0 | 0                               1 1 | 0 | 1  \n"
							+ "	0 | 1 | 1 | 1                               1 0 | 0 | 1  \n" + "	1 | 0 | 0 | 0 \n"
							+ "	1 | 0 | 1 | 1 \n"
							+ "	1 | 1 | 0 | 0                          ** EXPRESSÃO BOOLEANA ** \n"
							+ "	1 | 1 | 1 | 1                          S = A'.B'.C' + B.C + A.C\n" + "\n"
							+ "	Na hora de preencher a tabela responda da seguinte for: \n"
							+ "**Primeiro digite os elementos da 1º linha. No caso do exemplo seria quando (A,B e C = 0) e quando \n"
							+ "(A e B forem igual a 0 e C igual a 1). A RESPOSTA DA 1ª LINHA É: 10; \n"
							+ "**Depois vem a 2ª linha. A RESPOSTA É: 01; \n"
							+ "**Siga dessa maneira até responder todas as linhas do mapa. \n" + "\n");

					System.out.print(
							"Agora que você já sabe como preencher o mapa e como conseguir a expressão booleana simplificada,\n"
									+ "vamos ajudar os jogaroes substitutos!\n");

					contN++;
					System.out.println("\n" + "RESPONDA \n"
							+ "De acordo com a tabela verdade a seguir, digite a sequência conforme solicitado para preencher o mapa. \n"
							+ "\n" + "      **TABELA VERDADE**                        ** MAPA DE KARNAUGH**\n "
							+ "                                                   ____ C\n"
							+ "	A | B | C | S                               A B | 0 | 1\n"
							+ "	---------------                            -------------\n"
							+ "	0 | 0 | 0 | 1                               0 0 | ? | ?  \n"
							+ "	0 | 0 | 1 | 1                               0 1 | ? | ?  \n"
							+ "	0 | 1 | 0 | 1                               1 1 | ? | ?  \n"
							+ "	0 | 1 | 1 | 1                               1 0 | ? | ?  \n" + "	1 | 0 | 0 | 1 \n"
							+ "	1 | 0 | 1 | 1 \n" + "	1 | 1 | 0 | 0 \n" + "	1 | 1 | 1 | 0 \n" + "\n");

					System.out.println("Responda a sequência conforme solicitado: \n" + "Resultado da 1ª linha: ");
					l1 = ler.nextInt();
					System.out.println("Resultado da 2ª linha: ");
					l2 = ler.nextInt();
					System.out.println("Resultado da 3ª linha: ");
					l3 = ler.nextInt();
					System.out.println("Resultado da 4ª linha: ");
					l4 = ler.nextInt();

					System.out.println("");
					if (l1 == vetor1[0] && l2 == vetor1[1] && l3 == vetor1[2] && l4 == vetor1[3] && contN <= 3) {
						contN--;
						// System.out.println("\n" +
						// "GoolaAaAaço!!! Você acertou na " + contN + "ª tentativa e marcou " + ponto +
						// " ponto(s). \n" +
						// "\n"); //+
						// "Digite PRÓXIMO para ir para o próximo desafio.");
						// String prox = ler.next();
						System.out.println(
								"Parabéns, você conseguiu preencher o mapa! \n" + "Provavelmente você fez isso: \n"
										+ "** MAPA DE KARNAUGH**\\n \" +				           \r\n" + " ____ C \n"
										+ " A B | 0 | 1 \n" + "------------- \n" + " 0 0 | 1 | 1  \n"
										+ " 0 1 | 1 | 1  \n" + " 1 1 | 0 | 0  \n" + " 1 0 | 1 | 1  \n" + "\n");
						do {

							contN++;
							Collections.shuffle(opcao);

							System.out.println(
									" Legal, você já conseguiu ajudar a maioria dos jogadores mas, ainda falta uma parte, lembra? \n"
											+ "Para completar o desafio, indique a expressão booleana que representa o mapa acima: \n"
											+ "\n");
							System.out.print("RESPONDA \n"
									+ "Qual é a expressão booleana que representa a tabela verdade acima? \n" + "\n"
									+ "a) " + opcao.get(0) + "\n" + "b) " + opcao.get(1) + "\n" + "c) " + opcao.get(2)
									+ "\n" + "d) " + opcao.get(3) + "\n" + "e) " + opcao.get(4) + "\n" + "\n"
									+ "RESPOSTA: ");
							n1 = ler.next();
							System.out.println("");
							switch (n1) {
							case "a":
							case "A":
								if (opcao.get(0).equals("S = A' + B'")) {
									System.out.println("\n" + "GoolaAaAaço!!! Você acertou. Precisou de " + contN
											+ " tentativas para finalizar. \n" + "Marcou " + ponto + " ponto(s). \n");
									saida = false;
								} else {
									ponto--;
									System.out.println("RESPOSTA ERRADA");
								}
								break;
							case "b":
							case "B":
								if (opcao.get(1).equals("S = A' + B'")) {

									System.out.println("\n" + "GoolaAaAaço!!! Você acertou. Precisou de " + contN
											+ " tentativas para finalizar. \n" + "Marcou " + ponto + " ponto(s). \n");
									saida = false;
								} else {
									ponto--;
									System.out.println("RESPOSTA ERRADA");
								}
								break;
							case "c":
							case "C":
								if (opcao.get(2).equals("S = A' + B'")) {
									System.out.println("\n" + "GoolaAaAaço!!! Você acertou. Precisou de " + contN
											+ " tentativas para finalizar. \n" + "Marcou " + ponto + " ponto(s). \n");
									saida = false;
								} else {
									ponto--;
									System.out.println("RESPOSTA ERRADA");
								}
								break;
							case "d":
							case "D":
								if (opcao.get(3).equals("S = A' + B'")) {
									System.out.println("\n" + "GoolaAaAaço!!! Você acertou. Precisou de " + contN
											+ " tentativas para finalizar. \n" + "Marcou " + ponto + " ponto(s). \n");
									saida = false;
								} else {
									ponto--;
									System.out.println("RESPOSTA ERRADA");
								}
								break;
							case "e":
							case "E":
								if (opcao.get(4).equals("S = A' + B'")) {
									System.out.println("\n" + "GoolaAaAaço!!! Você acertou. Precisou de " + contN
											+ " tentativas para finalizar. \n" + "Marcou " + ponto + " ponto(s). \n");
									saida = false;
								} else {
									ponto--;
									System.out.println("RESPOSTA ERRADA");
									break;
								}
							}

							if (contN == 1 && (!(n1.equals(opcao)) && saida)) {
								System.out.println("Olhe o mapa novamente. Talvez você não tenha entendido! \n");
								System.out.println("			******** EXEMPLO ********\n" + "\n"
										+ "      **TABELA VERDADE**                        ** MAPA DE KARNAUGH**\n "
										+ "                                                   ____ C\n"
										+ "	A | B | C | S                               A B | 0 | 1\n"
										+ "	---------------                            -------------\n"
										+ "	0 | 0 | 0 | 1                               0 0 | 1 | 0  \n"
										+ "	0 | 0 | 1 | 0                               0 1 | 0 | 1  \n"
										+ "	0 | 1 | 0 | 0                               1 1 | 0 | 1  \n"
										+ "	0 | 1 | 1 | 1                               1 0 | 0 | 1  \n"
										+ "	1 | 0 | 0 | 0 \n" + "	1 | 0 | 1 | 1 \n"
										+ "	1 | 1 | 0 | 0                          ** EXPRESSÃO BOOLEANA ** \n"
										+ "	1 | 1 | 1 | 1                          S = A'.B'.C' + B.C + A.C\n"
										+ "Digite NOVO para ver a tabela e ter uma nova tentativa.");
								String seguir6 = ler.next();
								System.out.println("\n");
							}

							if (contN == 2 && (!(n1.equals(opcao)) && saida)) {
								System.out.println("Olhe o mapa novamente. Talvez você não tenha entendido! \n");
								System.out.println("			******** EXEMPLO ********\n" + "\n"
										+ "      **TABELA VERDADE**                        ** MAPA DE KARNAUGH**\n "
										+ "                                                   ____ C\n"
										+ "	A | B | C | S                               A B | 0 | 1\n"
										+ "	---------------                            -------------\n"
										+ "	0 | 0 | 0 | 1                               0 0 | 1 | 0  \n"
										+ "	0 | 0 | 1 | 0                               0 1 | 0 | 1  \n"
										+ "	0 | 1 | 0 | 0                               1 1 | 0 | 1  \n"
										+ "	0 | 1 | 1 | 1                               1 0 | 0 | 1  \n"
										+ "	1 | 0 | 0 | 0 \n" + "	1 | 0 | 1 | 1 \n"
										+ "	1 | 1 | 0 | 0                          ** EXPRESSÃO BOOLEANA ** \n"
										+ "	1 | 1 | 1 | 1                          S = A'.B'.C' + B.C + A.C\n"
										+ "Digite NOVO para ver a tabela e ter uma nova tentativa.");
								String seguir6 = ler.next();
								System.out.println("\n");
							}
							if (contN == 3 && (!(n1.equals(opcao)) && saida)) {
								System.out.println(
										"Você tem outra chance. Olhe mapa mais uma vez e tente novamente. !!ATENÇÃO!! \n");
								System.out.println("			******** EXEMPLO ********\n" + "\n"
										+ "      **TABELA VERDADE**                        ** MAPA DE KARNAUGH**\n "
										+ "                                                   ____ C\n"
										+ "	A | B | C | S                               A B | 0 | 1\n"
										+ "	---------------                            -------------\n"
										+ "	0 | 0 | 0 | 1                               0 0 | 1 | 0  \n"
										+ "	0 | 0 | 1 | 0                               0 1 | 0 | 1  \n"
										+ "	0 | 1 | 0 | 0                               1 1 | 0 | 1  \n"
										+ "	0 | 1 | 1 | 1                               1 0 | 0 | 1  \n"
										+ "	1 | 0 | 0 | 0 \n" + "	1 | 0 | 1 | 1 \n"
										+ "	1 | 1 | 0 | 0                          ** EXPRESSÃO BOOLEANA ** \n"
										+ "	1 | 1 | 1 | 1                          S = A'.B'.C' + B.C + A.C\n"
										+ "Digite NOVO para ver a tabela e ter uma nova tentativa.");
								String seguir7 = ler.next();
								System.out.println("");
							}
							if (contN == 4 && (!(n1.equals(opcao)) && saida)) {
								System.out.println("Hum..tem algo errado! Você esta olhando o mapa certo?. \n"
										+ "Olhe o mapa e tente novamente. !!ATENÇÃO!! \n");
								System.out.println("			******** EXEMPLO ********\n" + "\n"
										+ "      **TABELA VERDADE**                        ** MAPA DE KARNAUGH**\n "
										+ "                                                   ____ C\n"
										+ "	A | B | C | S                               A B | 0 | 1\n"
										+ "	---------------                            -------------\n"
										+ "	0 | 0 | 0 | 1                               0 0 | 1 | 0  \n"
										+ "	0 | 0 | 1 | 0                               0 1 | 0 | 1  \n"
										+ "	0 | 1 | 0 | 0                               1 1 | 0 | 1  \n"
										+ "	0 | 1 | 1 | 1                               1 0 | 0 | 1  \n"
										+ "	1 | 0 | 0 | 0 \n" + "	1 | 0 | 1 | 1 \n"
										+ "	1 | 1 | 0 | 0                          ** EXPRESSÃO BOOLEANA ** \n"
										+ "	1 | 1 | 1 | 1                          S = A'.B'.C' + B.C + A.C\n"
										+ "Digite NOVO para ver a tabela e ter uma nova tentativa.");
								String seguir7 = ler.next();
								System.out.println("");
							}
							if (contN == 5 && (!(n1.equals(opcao)) && saida)) {
								System.out.println(
										"Você tem uma última chance. Olhe o mapa mais uma vez e tente novamente. !!ATENÇÃO!! \n");
								System.out.println("			******** EXEMPLO ********\n" + "\n"
										+ "      **TABELA VERDADE**                        ** MAPA DE KARNAUGH**\n "
										+ "                                                   ____ C\n"
										+ "	A | B | C | S                               A B | 0 | 1\n"
										+ "	---------------                            -------------\n"
										+ "	0 | 0 | 0 | 1                               0 0 | 1 | 0  \n"
										+ "	0 | 0 | 1 | 0                               0 1 | 0 | 1  \n"
										+ "	0 | 1 | 0 | 0                               1 1 | 0 | 1  \n"
										+ "	0 | 1 | 1 | 1                               1 0 | 0 | 1  \n"
										+ "	1 | 0 | 0 | 0 \n" + "	1 | 0 | 1 | 1 \n"
										+ "	1 | 1 | 0 | 0                          ** EXPRESSÃO BOOLEANA ** \n"
										+ "	1 | 1 | 1 | 1                          S = A'.B'.C' + B.C + A.C\n"
										+ "Digite NOVO para ver a tabela e ter uma nova tentativa.");
								String seguir7 = ler.next();
								System.out.println("");
							}
						} while (contN < 6 && saida);
					}

					if (contN == 1 && (!(l1 == vetor1[0] && l2 == vetor1[1] && l3 == vetor1[2] && l4 == vetor1[3]))
							&& saida) {
						System.out.println("RESPOSTA ERRADA");
						ponto--;
						System.out.println("Olha o exemplo novamente. Talvez você não tenha entendido! \n" + "\n"
								+ "Digite NOVO para ver o exemplo novamente e ter uma nova tentativa.");
						String seguir6 = ler.next();
						System.out.println("\n");
					}
					if (contN == 2 && (!(l1 == vetor1[0] && l2 == vetor1[1] && l3 == vetor1[2] && l4 == vetor1[3]))
							&& saida) {
						System.out.println("RESPOSTA ERRADA");
						ponto--;
						System.out.println("Você tem uma última chance. Olhe o exemplo novamente. !!ATENÇÃO!! \n" + "\n"
								+ "Digite NOVO para ver o exemplo novamente e ter uma nova tentativa.");
						String seguir7 = ler.next();
						System.out.println("");
					}
					if (contN == 3
							&& (!(l1 == vetor1[0] && l2 == vetor1[1] && l3 == vetor1[2] && l4 == vetor1[3]) && saida)
							|| contN == 6 && (!(n1.equals(opcao)) && saida)) {

						System.out.println("\n" + "Você errou as três tentativas!! \n"
								+ "Acho que você não entendeu a jogada! Infelizmente não marcou pontos nessa rodada! \n"
								+ "Tente a próxima! \n" + "Digite PRÓXIMO para ir para o próximo desafio.");
						String prox = ler.next();
						break;
					}
				} while (contN < 3 && saida);
			}
			if (resposta.equalsIgnoreCase(recusa)) {
				System.out.println("Você saiu do jogo");
				break;
			} else if (!(resposta.equalsIgnoreCase(seguir))) {
				System.out.println("Inválido");
				loop = false;
			}

		} while (contN < 3 && saida);

		return ponto;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarando variáveis
		// variável op é a variável que vai dar a opção desejada no menu.
		int op;
		String name, clube;

		introdução();

		do {

			System.out.println("Menu: ");
			System.out.println("1-Créditos");
			System.out.println("2-Instruções");
			System.out.println("3-Jogar");
			System.out.println("4-Sair\n");

			System.out.print("Digite a opção desejada [1] [2] [3] [4]: \n");
			op = input.nextInt();

			switch (op) {
			case 1:
				// digitar os créditos do jogo
				System.out.println("\n**--- CRÉDITOS ---**\n\n" + "Criado e desenvolvido por:\n"
						+ "Danilo da Silva Ranéa\n" + "João Vitor Maldonado Roschel\n" + "Paulo Honorato\n\n"
						+ "Projeto Integrador 1 do Centro Universitário SENAC\n"
						+ "Tecnologia em Análise e Desenvolvimento de Sistemas.\n\n"
						+ "Professor orientador: Eduardo Takeo\n" + "Matéria escolhida: Conceitos de Computação\n\n");
				break;
			case 2:
				// digitar as instruções do jogo
				System.out.println("\n**--- INSTRUÇÕES ---**\n\n"
						+ "O PRO SOCCER LEAGUE, é um jogo interativo que busca fornecer as melhores condições\n"
						+ "de aprendizado aos seus jogadores, dessa forma, visando facilitar a sua experiência, siga as intruções abaixo:\n"
						+ "1) Ao ingressar no menu, escolha a opção 3 para jogar.\n"
						+ "2) Sempre antes de cada desafio apresentaremos uma explicação do mesmo, que o ajudará a solucionar o desafio,\n"
						+ "por isso, preste atenção sempre.\n" + "   Cada desafio terá 3 tentativas:\n"
						+ "   A 1ª tentativa vale 3 pontos,\n" + "   A 2ª tentativa vale 2 pontos,\n"
						+ "   A 3ª tentativa vale 1 ponto.\n"
						+ "3) Sempre ao errar o desafio proposto, o jogador receberá um feedback de onde deve melhorar.\n"
						+ "4) Ao final do jogo, o jogador receberá a sua pontuação e qual o resultado da sua temporada (Campeão;\n"
						+ "classificado para torneio internacional; manteve-se na primeira divisão; rebaixado. \n"
						+ "5) Tabela de pontuação:\n"
						+ "   O jogador que somar o maior número de pontos, dentro da faixa de 25 a 33 pontos será o campeão,\n"
						+ "   De 25 a 33 pontos - Zona de classificação para campeonato internacional,\n"
						+ "   De 20 a 24 pontos - Zona de classificação para campeonato interncaional de 2ª classe\n"
						+ "   De 11 a 19 pontos - Mantem-se na 1ª divisão\n"
						+ "   De 0 a 10 pontos - Zona de rebaixamento\n" + "\n");
				break;
			case 3:
				// ir para o jogo

				int pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3, pontuacaoDesafio4, pontuacaoDesafio5,
						pontuacaoDesafio6, pontuacaoDesafio7, pontuacaoDesafio8, pontuacaoDesafio9, pontuacaoDesafio10;
				int pontuacaoCampeonato;

				System.out.println("\nVamos jogar\n" + "\n");
				name = nomejogador();
				clube = nometime(name);
				historiadesafio1(name, clube);

				// ********DESAFIO 1**********
				pontuacaoDesafio1 = fExemploDesafio01();
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
				System.out.printf("Pontuação no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();

				// ********DESAFIO 2**********
				pontuacaoDesafio2 = ex2(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, 0, 0, 0, 0, 0, 0, 0, 0);
				System.out.printf("Pontuação no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();

				// ********DESAFIO 3**********
				pontuacaoDesafio3 = fdesafio3(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3, 0, 0, 0, 0, 0,
						0, 0);
				System.out.printf("Pontuação no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();

				// ********DESAFIO 4**********
				// janelaTabelaVerdade.main(null);
				pontuacaoDesafio4 = fDesafio04(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, 0, 0, 0, 0, 0, 0);
				System.out.printf("Pontuação no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();

				// ********DESAFIO 5**********
				historiadesafio5(name, clube);
				// exdesafio5();
				pontuacaoDesafio5 = fdesafio5();
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, pontuacaoDesafio5, 0, 0, 0, 0, 0);
				System.out.printf("Pontuação no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();

				// ********DESAFIO 6**********
				// exemploExercicio6();
				pontuacaoDesafio6 = fDesafio06(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, pontuacaoDesafio5, pontuacaoDesafio6, 0, 0, 0, 0);
				System.out.printf("Pontuação no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();

				// ********DESAFIO 7**********
				pontuacaoDesafio7 = ex9(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, pontuacaoDesafio5, pontuacaoDesafio6, pontuacaoDesafio7, 0, 0, 0);
				System.out.printf("Pontuação no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();

				// ********DESAFIO 8**********
				pontuacaoDesafio8 = ex8(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, pontuacaoDesafio5, pontuacaoDesafio6, pontuacaoDesafio7, pontuacaoDesafio8,
						0, 0);
				System.out.printf("Pontuação no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();

				// ********DESAFIO 9**********
				String n;
				pontuacaoDesafio9 = 0;
				historiadesafio7(name, clube);
				exdesafio7();
				System.out.println(
						"Você entendeu a explicação do desafio? Em caso positivo, responda Sim para que possamos dirigi-lo\n"
								+ "para o desafio. Em caso negativo, digite Não para que possamos repetir a explicação.");
				n = input.next();

				if (n.equalsIgnoreCase("Sim") || n.equalsIgnoreCase("s") || n.equalsIgnoreCase("SIM")
						|| n.equalsIgnoreCase("S")) {
					pontuacaoDesafio9 = fdesafio7();
				}
				if (n.equalsIgnoreCase("Não") || n.equalsIgnoreCase("n") || n.equalsIgnoreCase("NÃO")
						|| n.equalsIgnoreCase("N")) {
					exdesafio7();
					;
				}
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, pontuacaoDesafio5, pontuacaoDesafio6, pontuacaoDesafio7, pontuacaoDesafio8,
						pontuacaoDesafio9, 0);
				System.out.printf("Pontuação no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();

				// ********DESAFIO 10**********
				pontuacaoDesafio10 = ex10(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, pontuacaoDesafio5, pontuacaoDesafio6, pontuacaoDesafio7, pontuacaoDesafio8,
						pontuacaoDesafio9, pontuacaoDesafio10);
				System.out.printf("Pontuação no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);

				break;

			case 4:
				// Aqui é a saida do jogo.
				System.out.println("VOCÊ SAIU DO JOGO!");

				break;
			default:
				System.out.println("Opção inválida, tente novamente.\n");
			}

		} while (op != 3 && op != 4);

	}

}
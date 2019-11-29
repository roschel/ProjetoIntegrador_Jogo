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

import com.sun.org.apache.xpath.internal.axes.OneStepIterator;

public class rpg {

	// *****JOaO******

	// Pontuacao
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
				+ "Para converter um número binario para um número decimal, e necessario:\n"
				+ "Utilizar a tabela de potencias de 2:\n" + "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
				+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
				+ "Por exemplo, para um número binario 011, temos 3 bits. Logo, a conversao sera:\n"
				+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n");
		while (loopDesafio1) {
			System.out.print("Preparado para ir para o jogo?\n"
					+ "Digite 's' [sim] para entrar no desafio ou 'n' [nao] para ver novamente o exemplo.\n"
					+ "De uma resposta: ");
			entradaDesafio1 = sc.next();

			if (entradaDesafio1.equalsIgnoreCase("s") || entradaDesafio1.equalsIgnoreCase("sim")) {
				System.out.println(" ");
				desafio1 = fdesafio01();
				loopDesafio1 = false;
			} else {
				System.out.println("\nPara converter um número binario para um número decimal, e necessario:\n"
						+ "Utilizar a tabela de potencias de 2:\n"
						+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
						+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
						+ "Por exemplo, para um número binario 011, temos 3 bits. Logo, a conversao sera:\n"
						+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n");
			}
		}
		return desafio1;
	}

	static void fFeedbackPositivoDesafio1() {
		System.out.println("Parabens! Voce povavelmente fez isto:\n" + "-----* Resolucao do desafio *-----\n"
				+ "1*128 + 1*64 + 0*32 + 1*16 + 0*8 + 1*4 + 1*2+ 1*1 = 215\n");
	}

	static int fdesafio01() {
		Scanner sc = new Scanner(System.in);

		// Declarando variaveis
		int nota1 = 0, contador = 0;
		boolean saidaLoop = true;
		String resposta = "";
		List alternativas = new ArrayList();

		// Declarando opcoes de resposta
		alternativas.add("215"); // resposta correta
		alternativas.add("1010");
		alternativas.add("33");
		alternativas.add("982");
		alternativas.add("76");

		do {

			Collections.shuffle(alternativas);
			System.out.println("Dado o número binario 11010111, converta em número decimal.");
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(0).equals("215") && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(0).equals("215") && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n\n");
						System.out.println("\nPara converter um número binario para um número decimal, e necessario:\n"
								+ "Utilizar a tabela de potencias de 2:\n"
								+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
								+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
								+ "Por exemplo, para um número binario 011, temos 3 bits. Logo, a conversao sera:\n"
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(1).equals("215") && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(1).equals("215") && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n\n");
						System.out.println("\nPara converter um número binario para um número decimal, e necessario:\n"
								+ "Utilizar a tabela de potencias de 2:\n"
								+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
								+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
								+ "Por exemplo, para um número binario 011, temos 3 bits. Logo, a conversao sera:\n"
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(2).equals("215") && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(2).equals("215") && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n\n");
						System.out.println("\nPara converter um número binario para um número decimal, e necessario:\n"
								+ "Utilizar a tabela de potencias de 2:\n"
								+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
								+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
								+ "Por exemplo, para um número binario 011, temos 3 bits. Logo, a conversao sera:\n"
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(3).equals("215") && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(3).equals("215") && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n\n");
						System.out.println("\nPara converter um número binario para um número decimal, e necessario:\n"
								+ "Utilizar a tabela de potencias de 2:\n"
								+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
								+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
								+ "Por exemplo, para um número binario 011, temos 3 bits. Logo, a conversao sera:\n"
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(4).equals("215") && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(4).equals("215") && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n\n");
						System.out.println("\nPara converter um número binario para um número decimal, e necessario:\n"
								+ "Utilizar a tabela de potencias de 2:\n"
								+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
								+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
								+ "Por exemplo, para um número binario 011, temos 3 bits. Logo, a conversao sera:\n"
								+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n");
					}
				}
				break;

			default:
				break;
			}

		} while (saidaLoop && contador != 3);

		return nota1;
	}

	// EXERCÍCIO 4
	static void exemploTabelaVerdade() {

		System.out.println("\n\nTabela verdade e um dispositivo utilizado no estudo da\r\n"
				+ "lógica matematica. Com o uso desta tabela e possível definir o valor\r\n"
				+ "lógico de uma proposicao, isto e, saber quando uma sentenca e\r\n"
				+ "verdadeira ou falsa. Em lógica, as proposicoes representam\r\n"
				+ "pensamentos completos e indicam afirmacoes de fatos ou ideias.\r\n" + ""
				+ "A montagem da tabela se da de forma que:"
				+ "Os elementos A, B e C se modificam conforme sua potencia. Ou seja:\r\n" + "2^2 2^1 2^0\r\n"
				+ "4    2    1\r\n" + "" + "Significa que o elemento A se alterna a cada 4 repeticoes.\r\n"
				+ "O elemento B se alterna a cada 2 repeticoes." + "O elemento C se alterna a cada 1 repeticao.\r\n"
				+ "" + "A | B | C | S\r\n" + "0 | 0 | 0 | S1\r\n" + "0 | 0 | 1 | S2\r\n" + "0 | 1 | 0 | S3\r\n"
				+ "0 | 1 | 1 | S4\r\n" + "1 | 0 | 0 | S5\r\n" + "1 | 0 | 1 | S6\r\n" + "1 | 1 | 0 | S7\r\n"
				+ "1 | 1 | 1 | S8\r\n");

		System.out.println("");

	}

	static int fDesafio04(String nome, String time) {

		System.out.println("\n**--- 4º DESAFIO ---**\n" + nome + " o próximo jogo sera entre " + time + " e Vitória.");

		exemploTabelaVerdade();
		// Declarando variaveis
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

		// Declarando opcoes de resposta
		alternativas.add(a); // resposta correta
		alternativas.add(b);
		alternativas.add(c);
		alternativas.add(d);
		alternativas.add(e);

		do {

			Collections.shuffle(alternativas);
			System.out.println("Dada a equacao S = AB + A'C, qual tabela verdade representa a equacao?");
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(0).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(0).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta errada, tente novamente.\n");
						System.out.println("\n" + "\n\nTabela verdade e um dispositivo utilizado no estudo da\r\n"
								+ "lógica matematica. Com o uso desta tabela e possível definir o valor\r\n"
								+ "lógico de uma proposicao, isto e, saber quando uma sentenca e\r\n"
								+ "verdadeira ou falsa. Em lógica, as proposicoes representam\r\n"
								+ "pensamentos completos e indicam afirmacoes de fatos ou ideias.\r\n" + ""
								+ "A montagem da tabela se da de forma que:"
								+ "Os elementos A, B e C se modificam conforme sua potencia. Ou seja:\r\n"
								+ "2^2 2^1 2^0\r\n" + "4    2    1\r\n" + ""
								+ "Significa que o elemento A se alterna a cada 4 repeticoes.\r\n"
								+ "O elemento B se alterna a cada 2 repeticoes."
								+ "O elemento C se alterna a cada 1 repeticao.\r\n" + "" + "A | B | C | S\r\n"
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(1).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(1).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta errada, tente novamente.\n");
						System.out.println("\n" + "\n\nTabela verdade e um dispositivo utilizado no estudo da\r\n"
								+ "lógica matematica. Com o uso desta tabela e possível definir o valor\r\n"
								+ "lógico de uma proposicao, isto e, saber quando uma sentenca e\r\n"
								+ "verdadeira ou falsa. Em lógica, as proposicoes representam\r\n"
								+ "pensamentos completos e indicam afirmacoes de fatos ou ideias.\r\n" + ""
								+ "A montagem da tabela se da de forma que:"
								+ "Os elementos A, B e C se modificam conforme sua potencia. Ou seja:\r\n"
								+ "2^2 2^1 2^0\r\n" + "4    2    1\r\n" + ""
								+ "Significa que o elemento A se alterna a cada 4 repeticoes.\r\n"
								+ "O elemento B se alterna a cada 2 repeticoes."
								+ "O elemento C se alterna a cada 1 repeticao.\r\n" + "" + "A | B | C | S\r\n"
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(2).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(2).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta errada, tente novamente.\n");
						System.out.println("\n" + "\n\nTabela verdade e um dispositivo utilizado no estudo da\r\n"
								+ "lógica matematica. Com o uso desta tabela e possível definir o valor\r\n"
								+ "lógico de uma proposicao, isto e, saber quando uma sentenca e\r\n"
								+ "verdadeira ou falsa. Em lógica, as proposicoes representam\r\n"
								+ "pensamentos completos e indicam afirmacoes de fatos ou ideias.\r\n" + ""
								+ "A montagem da tabela se da de forma que:"
								+ "Os elementos A, B e C se modificam conforme sua potencia. Ou seja:\r\n"
								+ "2^2 2^1 2^0\r\n" + "4    2    1\r\n" + ""
								+ "Significa que o elemento A se alterna a cada 4 repeticoes.\r\n"
								+ "O elemento B se alterna a cada 2 repeticoes."
								+ "O elemento C se alterna a cada 1 repeticao.\r\n" + "" + "A | B | C | S\r\n"
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(3).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(3).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta errada, tente novamente.\n");
						System.out.println("\n" + "\n\nTabela verdade e um dispositivo utilizado no estudo da\r\n"
								+ "lógica matematica. Com o uso desta tabela e possível definir o valor\r\n"
								+ "lógico de uma proposicao, isto e, saber quando uma sentenca e\r\n"
								+ "verdadeira ou falsa. Em lógica, as proposicoes representam\r\n"
								+ "pensamentos completos e indicam afirmacoes de fatos ou ideias.\r\n" + ""
								+ "A montagem da tabela se da de forma que:"
								+ "Os elementos A, B e C se modificam conforme sua potencia. Ou seja:\r\n"
								+ "2^2 2^1 2^0\r\n" + "4    2    1\r\n" + ""
								+ "Significa que o elemento A se alterna a cada 4 repeticoes.\r\n"
								+ "O elemento B se alterna a cada 2 repeticoes."
								+ "O elemento C se alterna a cada 1 repeticao.\r\n" + "" + "A | B | C | S\r\n"
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(4).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(4).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta errada, tente novamente.\n");
						System.out.println("\n" + "\n\nTabela verdade e um dispositivo utilizado no estudo da\r\n"
								+ "lógica matematica. Com o uso desta tabela e possível definir o valor\r\n"
								+ "lógico de uma proposicao, isto e, saber quando uma sentenca e\r\n"
								+ "verdadeira ou falsa. Em lógica, as proposicoes representam\r\n"
								+ "pensamentos completos e indicam afirmacoes de fatos ou ideias.\r\n" + ""
								+ "A montagem da tabela se da de forma que:"
								+ "Os elementos A, B e C se modificam conforme sua potencia. Ou seja:\r\n"
								+ "2^2 2^1 2^0\r\n" + "4    2    1\r\n" + ""
								+ "Significa que o elemento A se alterna a cada 4 repeticoes.\r\n"
								+ "O elemento B se alterna a cada 2 repeticoes."
								+ "O elemento C se alterna a cada 1 repeticao.\r\n" + "" + "A | B | C | S\r\n"
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

		return nota1;
	}

	// EXERCICIO 6
	static void exemploExercicio6() {
		System.out.println("\n\nPortas ou circuitos lógicos sao dispositivos que operam e\r\n"
				+ "trabalham com um ou mais sinais lógicos de entrada para\r\n"
				+ "produzir uma e somente uma saída, dependente da funcao\r\n" + "implementada no circuito\n");

		System.out.println(
				"Para resolver o próximo desafio, iremos te mostrar uma tabela com todas as portas lógicas conhecidas e suas saídas.\r\n"
						+ "Atraves da tabela, voce estara apto a resolver o desafio.\n");

		System.out.println("");

	}

	static int fDesafio06(String nome, String time) {
		System.out.println("\n**--- 6º DESAFIO ---**\n" + nome + " o próximo jogo sera entre " + time + " e Vitória.");
		exemploExercicio6();
		// Declarando variaveis
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

		// Declarando opcoes de resposta
		alternativas.add(a);
		alternativas.add(b);
		alternativas.add(c);
		alternativas.add(d);
		alternativas.add(e);

		do {

			Collections.shuffle(alternativas);
			System.out.println("Dado o circuito lógico apresentado, qual expressao representa sua saída?");
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(0).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(0).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta errada, tente novamente.\n");
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(1).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(1).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta errada, tente novamente.\n");
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(2).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(2).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta errada, tente novamente.\n");
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(3).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(3).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta errada, tente novamente.\n");
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
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(4).equals(a) && contador == 1) {
					contador = 2;
					nota1 = 2;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else if (alternativas.get(4).equals(a) && contador == 2) {
					contador = 3;
					nota1 = 1;
					System.out.println(
							"Voce acertou na " + contador + "a tentativa e marcou " + nota1 + " ponto(s)!\r\n");
					saidaLoop = false;
				} else {
					contador++;
					if (contador == 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + nota1 + " pontos.\n");
					} else {
						System.out.println("Resposta errada, tente novamente.\n");
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

	// SITUAcaO NO CAMPEONATO
	static void situacaoCampeonato(int pontos) {
		if (pontos <= 10) {
			System.out.printf("VOCe FOI REBAIXADO!\n");
		} else if (pontos>=11 && pontos<=19){
			System.out.printf("VOCe CONSEGUIU SE MANTER NA PRIMEIRA DIVISaO!\n");
		}else if(pontos>=20 && pontos<=24) {
			System.out.printf("PARABeNS VOCe SE CLASSIFICOU PRO CAMPONATO INTERNACIONAL DE 2ª CLASSE!\n");
		}else if(pontos>=25) {
			System.out.printf("PARABeNS VOCe SE CLASSIFICOU PRO CAMPONATO INTERNACIONAL DE 1ª CLASSE!\n");
		}
	}



	// ******DANILO******//
	static Scanner input = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	static void introducao() {
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

		System.out.println("O Pro Soccer League, tem como objetivo realizar a integracao entre o jogador e o tecnico,\n"
				+ "os quais juntos visam superar desafios propostos pelos criadores, baseados na materia de"
				+ " Conceitos da Computacao\n"
				+ "objetivando alcancar grandes resultados ao final da temporada ou semestre.\n"
				+ "Sendo o principal deles fornecer um novo mecanismo de ensino para o professor e de aprendizado para o aluno.\n");
	}

	static String nomejogador() {
		String nome;

		System.out.println("Para iniciarmos o jogo e necessario que escolha o nome do seu jogador.\n");

		System.out.print("Digite o nome do seu jogador, sem ser composto: ");
		nome = input.next();
		System.out.println("\n");

		return nome;
	}

	static String nometime(String nome) {
		String time;

		System.out.println("Para iniciarmos o jogo e necessario que escolha o nome do seu time.\n");

		System.out.print(nome + " digite o nome do seu time, sem composto: ");
		time = input.next();
		System.out.println("\n");

		return time;
	}

	static void historiadesafio1(String nome, String time) {

		System.out.println("Inicia-se a temporada!!\n" + "Ja chegamos ao nosso primeiro jogo!\n" + nome
				+ " o primeiro adversario do " + time + " sera o Íbis, de Pernambuco\n"
				+ "Para vence-lo voce tera que estudar a estrategia passada pelo treinador\n"
				+ "e resolver o seguinte desafio acerca de números binarios.\n" + "\n");
	}

	// EXERCÍCIO 3
	static void exdesafio3() {
		System.out.println(
				"Para realizar a multiplicacao de números binarios voce, voce devera utilizar-se das tabelas abaixo:\n"
						+ "0 x 0 = 0				0 + 0 = 0\n" + "1 x 0 = 0				0 + 1 = 1\n"
						+ "0 x 1 = 0				1 + 0 = 1\n" + "1 x 1 = 1				1 + 1 = 0 e sobe 1\n");

		System.out.println("Por exemplo, a seguinte multiplicacao, ficaria da seguinte forma:\n" + "   11\n" + "  x11\n"
				+ "-----\n" + "11 11\n" + "  11+\n" + "------\n" + " 1001\n\n");
	}

	static int fdesafio3(String nome, String time) {

		int contador = 0, ponto = 3;

		String resposta;

		System.out.print("**--- 3º Desafio ---**\n\n");
		System.out.println(nome + " o 3º jogo sera entre " + time + " e Criciúma.");

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

			System.out.print("Para vencer a terceira partida, voce tera que acertar\n"
					+ "a seguinte multiplicacao de números binarios.\n" + "\n");

			System.out.print("1101 x 1010\n" + "\n");

			Collections.shuffle(alternativas);
			System.out.println("A resposta correta e:");
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
					System.out.println("Resposta correta! Voce acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s).\n");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n");
						exdesafio3();
					}
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("10000010")) {
					System.out.println("Resposta correta! Voce acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s).\n");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n");
						exdesafio3();
					}
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("10000010")) {
					System.out.println("Resposta correta! Voce acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s).\n");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n");
						exdesafio3();
					}
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("10000010")) {
					System.out.println("Resposta correta! Voce acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s).\n");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n");
						exdesafio3();
					}
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("10000010")) {
					System.out.println("Resposta correta! Voce acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s).\n");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n");
						exdesafio3();
					}
				}
				break;
			default:
				System.out.println("Escolha invalida!");
			}

		} while (!acertou && contador != 3);

		return ponto;
	}

	// EXERCÍCIO 5
	static void historiadesafio5(String nome, String time) {
		System.out.print("**--- 5º Desafio ---**\n\n");

		System.out.println(nome + " ja chegamos ao nosso quinto jogo.\n" + "O próximo adversario do " + time
				+ " sera o Goias\n" + "Para vence-lo voce tera que estudar a estrategia passada pelo treinador\n"
				+ "e simplicar a expressao booleana que sera apresentada.\n" + "\n");
	}

	static void exdesafio5() {
		System.out.println(
				"Para realizar a simplicacao da expressao booleana que sera apresentada, utilize-se dos seguintes postulados e propriedades: \n"
						+ "Postulados: \n" + "A . 0 = 0      A + O = A      A + 1 = 1      A . 1 = A\n"
						+ "A + A' = 1     A . A' = 0     A + A = A      A . A = A\n" + "Propriedade Distributiva:\n"
						+ "A. (B +) = A . B + A . C\n" + "Propriedade Comutativa:\n"
						+ "A + B = B + A         A . B = B . A\n" + "Propriedade Associativa:\n"
						+ "(A + B) + C = A + (B + C)        (A . B) . C = A . (B . C)\n" + "Teorema de De Morgan:\n"
						+ "A' . B' . C' = (A+B+C)'          (A' + B' + C' = (A.B.C)'\n");

		System.out.println("Por exemplo, a simplificacao da expressao A + A.B, ficaria da seguinte forma:\n"
				+ "A + A.B =\n" + "A . (1 + B) = \n" + "A . 1 = \n" + "A\n"
				+ "Neste caso foram utilizados a propriedade distributiva e o postulado de adicao.\n");
	}

	static void feedbacknegativo() {

		System.out.println("Voce errou, verifique novamente o exemplo dado anteriormente.\n");
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

			System.out.print("Para vencer a quinta partida, voce tera que simplificar\n"
					+ "a seguinte expressao booleana.\n" + "\n");

			System.out.print("A.B.C + A.C' + A.B\n" + "\n");

			Collections.shuffle(alternativas);
			System.out.println("A resposta correta e:");
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
					System.out.println("Resposta correta! Voce acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s)\n");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n");
						feedbacknegativo();
					}
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("A")) {
					System.out.println("Resposta correta! Voce acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s)\n");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n");
						feedbacknegativo();
					}
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("A")) {
					System.out.println("Resposta correta! Voce acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s)\n");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n");
						feedbacknegativo();
					}
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("A")) {
					System.out.println("Resposta correta! Voce acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s)\n");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n");
						feedbacknegativo();
					}
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("A")) {
					System.out.println("Resposta correta! Voce acertou na " + contador + "ª tentativa e marcou " + ponto
							+ " ponto(s)\n");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!\n");
						feedbacknegativo();
					}
				}
				break;
			default:
				System.out.println("Escolha invalida!");
			}

		} while (!acertou && contador != 3);

		return ponto;
	}

	// EXERCICIO 9
	static void historiadesafio7(String nome, String time) {

		System.out.println("\n***---9º DESAFIO---***\n\n" + nome + " o próximo jogo do " + time
				+ " sera contra o Vasco\n" + "Para vence-lo voce tera que estudar a estrategia passada pelo treinador\n"
				+ "e atraves do mapa de Karnaugh apresentado mostrar a expressao booleana simplicada.\n" + "\n");
	}

	static void exdesafio7() {
		System.out.println(
				"Para apresentar uma expressao booleana simplicada atraves do Mapa de Karnaugh e necessario verificar qual das variaveis\n"
						+ "nao varia entre 0 e 1, após realizar os enlaces referentes aos número 1, para nao errarmos devemos seguir as seguintes dicas:\n"
						+ "\n" + "1) Fazer primeiro os enlaces com maior número de celulas, pois caso\n"
						+ "contrario corremos o risco de fazermos agrupamentos que poderiam\n"
						+ "ser substituídos por um maiorse nao vejamos.\n" + "\n"
						+ "2) Verificar se em cada enlace existe pelo menos uma celula que\r\n"
						+ "pertenca a apenas um enlace, pois corremos o risco de fazermos\r\n"
						+ "enlaces redundantes, ou seja, enlaces perfeitamente dispensaveis.\r\n");

		String[][] MapaKarnaugh = { { "1  1  0  1" }, { "1  1  0  1" }, { "1  1  0  1" }, { "1  1  1  1" } };

		System.out.println("AB|CD\n" + "   00 01 11 10\n" + "00" + " " + MapaKarnaugh[0][0] + "\n" + "01" + " "
				+ MapaKarnaugh[1][0] + "\n" + "11" + " " + MapaKarnaugh[2][0] + "\n" + "10" + " " + MapaKarnaugh[3][0]
				+ "\n");

		System.out.println("");

		System.out.println("Neste caso a resposta correta seria: S = AB' + C' + D'\n");
	}

	static void feedbacknegativoDesafio7() {

		System.out.println("\nVoce errou, verifique novamente o exemplo dado anteriormente.");

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
					"Para vencer a nona partida, voce tera que demonstrar a expressao booleana simplicada atraves\n"
							+ "do Mapa de Karnaugh apresentado.\n" + "\n");

			String[][] MapaKarnaugh2 = { { "1  0  0  1" }, { "1  1  1  0" }, { "1  1  0  0" }, { "1  1  1  1" } };

			System.out.println("AB|CD\n" + "   00 01 11 10\n" + "00" + " " + MapaKarnaugh2[0][0] + "\n" + "01" + " "
					+ MapaKarnaugh2[1][0] + "\n" + "11" + " " + MapaKarnaugh2[2][0] + "\n" + "10" + " "
					+ MapaKarnaugh2[3][0] + "\n" + "");

			System.out.println("");

			contador++;

			Collections.shuffle(alternativas);
			System.out.println("A resposta correta e:");
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
							.println("Resposta correta! " + contador + "ª tentativa, voce fez " + ponto + " ponto(s)");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!");
						feedbacknegativoDesafio7();
					}
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("B'D'+BC'+A'BD+AB'")) {
					System.out
							.println("Resposta correta! " + contador + "ª tentativa , voce fez " + ponto + " ponto(s)");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!");
						feedbacknegativoDesafio7();
					}
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("B'D'+BC'+A'BD+AB'")) {
					System.out
							.println("Resposta correta! " + contador + "ª tentativa , voce fez " + ponto + " ponto(s)");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!");
						feedbacknegativoDesafio7();
					}
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("B'D'+BC'+A'BD+AB'")) {
					System.out
							.println("Resposta correta! " + contador + "ª tentativa , voce fez " + ponto + " ponto(s)");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!");
						feedbacknegativoDesafio7();
					}
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("B'D'+BC'+A'BD+AB'")) {
					System.out
							.println("Resposta correta! " + contador + "ª tentativa , voce fez " + ponto + " ponto(s)");
					acertou = true;
				} else {
					ponto--;
					if (contador >= 3) {
						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Voce somou " + ponto + " pontos.\n");
					} else {
						System.out.println("Resposta incorreta!");
						feedbacknegativoDesafio7();
					}
				}
				break;
			default:
				System.out.println("Escolha invalida!");
			}

		} while (!acertou && contador != 3);

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
				+ " sera contra o Bragantino.\n"
				+ "Para vence-lo voce tera que estudar a estrategia passada pelo treinador\n"
				+ "e preencher o Mapa de Karnaugh, atraves da expressao booleana que sera apresentada.\n" + "\n"
				+ " Um pouco mais abaixo tem alguns exemplos para te auxiliar na resolucao do esquema. Boa sorte!!! \n"
				+ "\n");

		do {
			String seguir = "Aceito";
			String recusa = "Sair";
			System.out.println("\n" + "Digite ACEITO para comecar o desafio");
			String resposta = ler.next();

			if (resposta.equalsIgnoreCase(seguir)) {

				do {
					// EXEMPLO
					System.out.println("\n\n         EXEMPLO\n"
							+ "Para preencher o Mapa de Karnaugh atraves de uma expressao booleana, assuma que a entrada NaO barrada representa 1\n"
							+ "e a entrada barrada representa 0.\n" + "\n"
							+ "Dessa forma, a expressao booleana S = xy + xy, representada no Mapa de Karnaugh ficaria da seguinte forma:"
							+ "\n" + "X|Y\n" + "    0   1\n" + "0 | 0 | 0\n" + "1 | 0 | 1\n" + "\n"
							+ "Sendo que neste caso, a expressao simplicada seria s = xy.");

					System.out.print("Para vencer a NONA partida, voce tera que acertar\n"
							+ "qual Mapa de Karnaugh esta preenchido corretamente e qual a expressao booleana simplicada.\n"
							+ "\n");

					contN++;
					Collections.shuffle(alternativas);

					System.out.println("\n" + "RESPONDA \n"
							+ "Levando-se em consideracao a expressao booleana XZ + XYZ', qual Mapa de Karnaugh esta preenchido corretamente\n"
							+ "e qual a expressao booleana que o mesmo apresenta?" + "\n" + "\n" + "\n" + "a) "
							+ alternativas.get(0) + "\n" + "b) " + alternativas.get(1) + "\n" + "c) "
							+ alternativas.get(2) + "\n" + "d) " + alternativas.get(3) + "\n" + "e) "
							+ alternativas.get(4) + "\n" + "\n" + "RESPOSTA: ");
					n1 = ler.next();

					System.out.println("");
					switch (n1) {
					case "a":
					case "A":
						if (alternativas.get(0).equals("XY|Z\n" + "   0 1\n" + "00|0 0\n" + "01|0 0\n" + "11|1 1\n"
								+ "10|0 1\n" + "S=XY+XZ\n")) {

							System.out.println("\n" + "GoolaAaAaco!!! Voce acertou na " + contN
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

							System.out.println("\n" + "GoolaAaAaco!!! Voce acertou na " + contN
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

							System.out.println("\n" + "GolaAaAaco!!! Voce acertou na " + contN + "ª tentativa e marcou "
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

							System.out.println("\n" + "GoolaAaAaco!!! Voce acertou na " + contN
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
								+ "10|0 1\n" + "S=XY+XZ\n")) {

							System.out.println("\n" + "GoolaAaAaco!!! Voce acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n");
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					}

					if (contN == 1 && (!(n1.equals(alternativas)) && saida)) {
						System.out.println("Olha o exemplo novamente. Talvez voce nao tenha entendido! \n" + "\n"
								+ "Digite NOVO para ver o exemplo novamente e ter uma nova tentativa.");
						String seguir6 = ler.next();
						System.out.println("\n");
					}
					if (contN == 2 && (!(n1.equals(alternativas)) && saida)) {
						System.out.println("Voce tem uma última chance. Olhe o exemplo novamente. !!ATENcaO!! \n" + "\n"
								+ "Digite NOVO para ver o exemplo novamente e ter uma nova tentativa.");
						String seguir7 = ler.next();
						System.out.println("");
					}
					if (contN == 3 && (!(n1.equals(alternativas)) && saida)) {

						System.out.println("Voce errou as tres tentativas\n");
						System.out.print("Sua pontuacao no desafio foi  " + ponto + " pontos.\n");
					}
				} while (contN != 3 && saida);
			}
			if (resposta.equalsIgnoreCase(recusa)) {
				System.out.println("Voce saiu do jogo");
				break;
			} else if (!(resposta.equalsIgnoreCase(seguir))) {
				System.out.println("Invalido");
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
				+ " estamos com um pequeno problema tatico. Precisamos fazer um ajuste para tentar vencer a partida e marcar alguns pontos.\n"
				+ "Para ajudar a equipe ganhar o campeonato, que tal entender o esquema? \n"
				+ "O problema tatico esta relacionado com operacao de números binarios, mais precisamente adicao (soma). \n"
				+ "Vamos ajudar o time!!! \n" + "A partida sera entre " + time + " e " + "Chapecoense.\n"
				+ "Um pouco mais abaixo tem alguns exemplos para te auxiliar na resolucao do esquema. Boa sorte!!! \n"
				+ "\n");

		String resposta = "Aceito";
		System.out.println("\n" + "Digite ACEITO para comecar o desafio");
		String seguir = ler.next();

		if (seguir.equalsIgnoreCase(resposta)) {

			System.out.println("\n"
					+ "                A soma de binarios tem regras simples e praticamente iguais as regras de \n"
					+ "               adicao de números decimais, a única diferenca e que quando somado 1 + 1 o \n"
					+ "               resultado e igual a 0 e tem o resto igual a 1, sempre emprestando para o  \n"
					+ "               próximo número do calculo. \n" + "\n");

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

				System.out.println("\n" + "RESPONDA \n" + "Qual e o resultado da seguinte soma de números binarios: \n"
						+ "\n" + "                    110110 + 11101 \n" + "\n" + "a) " + numeros.get(0) + "\n" + "b) "
						+ numeros.get(1) + "\n" + "c) " + numeros.get(2) + "\n" + "d) " + numeros.get(3) + "\n" + "e) "
						+ numeros.get(4) + "\n" + "\n" + "RESPOSTA: ");
				n1 = ler.next();

				System.out.println("");
				switch (n1) {
				case "a":
				case "A":
					if (numeros.get(0).equals("1010011")) {

						System.out.println("\n" + "GoolaAaAaco!!! Voce acertou na " + contN + "ª tentativa e marcou "
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

						System.out.println("\n" + "GoolaAaAaco!!! Voce acertou na " + contN + "ª tentativa e marcou "
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

						System.out.println("\n" + "GolaAaAaco!!! Voce acertou na " + contN + "ª tentativa e marcou "
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

						System.out.println("\n" + "GoolaAaAaco!!! Voce acertou na " + contN + "ª tentativa e marcou "
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

						System.out.println("\n" + "GoolaAaAaco!!! Voce acertou na " + contN + "ª tentativa e marcou "
								+ ponto + " ponto(s). \n" + "\n");
						saida = false;
					} else {
						ponto--;
						System.out.println("RESPOSTA ERRADA");
						break;
					}
				}

				if (contN == 1 && (!(n1.equals(numeros)) && saida)) {
					System.out.println("Olha o exemplo novamente. Talvez voce nao tenha entendido! \n" + "\n"
							+ "Digite NOVO para ver o exemplo novamente e ter uma nova tentativa.");
					String seguir6 = ler.next();
					System.out.println("\n");
				}
				if (contN == 2 && (!(n1.equals(numeros)) && saida)) {
					System.out.println("Voce tem uma última chance. Olhe o exemplo novamente. !!ATENcaO!! \n" + "\n"
							+ "Digite NOVO para ver o exemplo novamente e ter uma nova tentativa.");
					String seguir7 = ler.next();
					System.out.println("");
				}
				if (contN == 3 && (!(n1.equals(numeros)) && saida)) {

					System.out.println("\n" + "Voce errou as tres tentativas!! \n"
							+ "Acho que voce nao entendeu a jogada! Infelizmente nao marcou pontos nessa rodada! \n"
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
				"** DESAFIO 8 ** \n" + "\n" + nome + " o próximo jogo do " + time + " sera contra o Internacional.");

		do {
			String seguir = "Aceito";
			String recusa = "Sair";
			System.out.println("\n" + "Digite ACEITO para comecar o desafio");
			String resposta = ler.next();

			if (resposta.equalsIgnoreCase(seguir)) {

				do {
					// EXEMPLO
					System.out.println("\n"
							+ " Para chegar a expressao booleana atraves de uma tabela verdade, e necessario \n"
							+ "que voce entenda que representamos na expressao apenas as entradas que tem saidas \n"
							+ "igual a 1 e ignoramos as entradas cuja saida seja igual a 0. \n" + "\n"
							+ "                     Dada a tabela verdade abaixo, indique a expressao booleana que a \n"
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
							+ "Qual e a expressao booleana que representa a tabela verdade acima? \n" + "\n" + "a) "
							+ numeros.get(0) + "\n" + "\n" + "b) " + numeros.get(1) + "\n" + "\n" + "c) "
							+ numeros.get(2) + "\n" + "\n" + "d) " + numeros.get(3) + "\n" + "\n" + "e) "
							+ numeros.get(4) + "\n" + "\n" + "RESPOSTA: ");
					n1 = ler.next();

					System.out.println("");
					switch (n1) {
					case "a":
					case "A":
						if (numeros.get(0).equals("S = A'.B'.C' + A'.B.C + A.B'.C + A.B.C")) {
							System.out.println("\n" + "GoolaAaAaco!!! Voce acertou na " + contN
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
							System.out.println("\n" + "GoolaAaAaco!!! Voce acertou na " + contN
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
							System.out.println("\n" + "GolaAaAaco!!! Voce acertou na " + contN + "ª tentativa e marcou "
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
							System.out.println("\n" + "GoolaAaAaco!!! Voce acertou na " + contN
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
							System.out.println("\n" + "GoolaAaAaco!!! Voce acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n");
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
							break;
						}
					}

					if (contN == 1 && (!(n1.equals(numeros)) && saida)) {
						System.out.println("Olhe a tabela novamente. Talvez voce nao tenha entendido! \n" + "\n"
								+ "Digite NOVO para ver a tabela e ter uma nova tentativa.");
						String seguir6 = ler.next();
						System.out.println("\n");
					}
					if (contN == 2 && (!(n1.equals(numeros)) && saida)) {
						System.out.println(
								"Voce tem uma última chance. Olhe a tabela mais uma vez e tente novamente. !!ATENcaO!! \n"
										+ "\n" + "Digite NOVO para ver a tabela e ter uma nova tentativa.");
						String seguir7 = ler.next();
						System.out.println("");
					}
					if (contN == 3 && (!(n1.equals(numeros)) && saida)) {
						System.out.println("\n" + "Voce errou as tres tentativas!! \n"
								+ "Acho que voce nao entendeu a tabela! Infelizmente nao marcou pontos nessa rodada! \n");
					}
				} while (contN != 3 && saida);
			} else {
				System.out.println("Invalido");
				loop = false;
			}

		} while (contN != 3 && saida);

		return ponto;
	}

	// EXERCICIO 10
	private static boolean loop;
	private static char[] pontofinal;

	static int ex10(String nome, String time) {

		int i = 0;
		int contN = 0;
		int ponto = 3;
		int ponto2 = 3;
		int pontofinal = 0;
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
		 * "	1 | 1 | 0 | 0                          ** EXPRESSaO BOOLEANA ** \n" +
		 * "	1 | 1 | 1 | 0                          S = A'+ B' \n"
		 */

		System.out.println("**--- 10º DESAFIO ---** \n" + "\n" + "QUE TRABALHaO, " + nome + "!!\n"
				+ "Ja estamos no último jogo que sera " + time + " Vs Fortaleza\n"
				+ "Um pouco mais abaixo tem uma explicacao sobre oque precisamos fazer. Boa sorte!!! \n" + "\n");

		do {
			String seguir = "Aceito";
			String recusa = "Sair";
			System.out.println("\n" + "Digite ACEITO para comecar o desafio");
			String resposta = ler.next();

			if (resposta.equalsIgnoreCase(seguir)) {

				System.out.println("\n" + "	Percebi que temos algumas lacunas a serem preenchidas.\n"
						+ "	Tivemos a necessidade de substituir alguns jogadores machucados.\n" + "\n"
						+ "	Os novos jogadores precisam entender o esquema que estamos seguindo. Voce pode ajuda-los preenchendo\n"
						+ "um MAPA DE KARNAUGH. Se conseguir preencher da maneira correta, sera necessario indicar a expressao\n"
						+ "booleana que o represente. Que tal?" + "\n"
						+ "	Caso voce consiga resolver esse desafio, iremos marcar alguns pontos e chegar mais próximos da classificacao.\n"
						+ "	Mas fique tranquilo, abaixo tem um exemplo de como deve ser resolvido.\n" + "\n");

				do {
					// EXEMPLO
					System.out.println(
							"	O Mapa de Karnaugh e preenchido de acordo com as saídas da tabela verdade. Deve-se preencher seus\n"
									+ "espacos corretamente para se obter a forma mais simplificada da expressao booleana."
									+ "\n" + "	LEMBRE-SE:\n"
									+ "	Para conseguir a expressao simplificada atraves do mapa de karnaugh, existe algumas regras, voce deve agrupar \n"
									+ "os numeros 1s sempre em grupos pares. Caso nao seja possível, voce pode utilizar um único 1 sozinho, mas, nunca \n"
									+ "fazer agrupamentos ímpares.\n"
									+ "	Deve-se lembrar tambem que destacamos sempre as entradas que nao varia no conjunto.\n");
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
							+ "	1 | 1 | 0 | 0                          ** EXPRESSaO BOOLEANA ** \n"
							+ "	1 | 1 | 1 | 1                          S = A'.B'.C' + B.C + A.C\n" + "\n"
							+ "	Na hora de preencher a tabela responda da seguinte for: \n"
							+ "**Primeiro digite os elementos da 1º linha. No caso do exemplo seria quando (A,B e C = 0) e quando \n"
							+ "(A e B forem igual a 0 e C igual a 1). A RESPOSTA DA 1ª LINHA e: 10; \n"
							+ "**Depois vem a 2ª linha. A RESPOSTA e: 01; \n"
							+ "**Siga dessa maneira ate responder todas as linhas do mapa. \n" + "\n");

					System.out.print(
							"Agora que voce ja sabe como preencher o mapa e como conseguir a expressao booleana simplificada,\n"
									+ "vamos ajudar os jogaroes substitutos!\n");

					contN++;
					System.out.println("\n" + "RESPONDA \n"
							+ "De acordo com a tabela verdade a seguir, digite a sequencia conforme solicitado para preencher o mapa. \n"
							+ "\n" + "      **TABELA VERDADE**                        ** MAPA DE KARNAUGH**\n "
							+ "                                                   ____ C\n"
							+ "	A | B | C | S                               A B | 0 | 1\n"
							+ "	---------------                            -------------\n"
							+ "	0 | 0 | 0 | 1                               0 0 | ? | ?  \n"
							+ "	0 | 0 | 1 | 1                               0 1 | ? | ?  \n"
							+ "	0 | 1 | 0 | 1                               1 1 | ? | ?  \n"
							+ "	0 | 1 | 1 | 1                               1 0 | ? | ?  \n" + "	1 | 0 | 0 | 1 \n"
							+ "	1 | 0 | 1 | 1 \n" + "	1 | 1 | 0 | 0 \n" + "	1 | 1 | 1 | 0 \n" + "\n");

					System.out.println("Responda a sequencia conforme solicitado: \n" + "Resultado da 1ª linha: ");
					l1 = ler.nextInt();
					System.out.println("Resultado da 2ª linha: ");
					l2 = ler.nextInt();
					System.out.println("Resultado da 3ª linha: ");
					l3 = ler.nextInt();
					System.out.println("Resultado da 4ª linha: ");
					l4 = ler.nextInt();

					System.out.println("");
					if (l1 == vetor1[0] && l2 == vetor1[1] && l3 == vetor1[2] && l4 == vetor1[3] && contN <= 3) {
						// System.out.println("\n" +
						// "GoolaAaAaco!!! Voce acertou na " + contN + "ª tentativa e marcou " + ponto +
						// " ponto(s). \n" +
						// "\n"); //+
						// "Digite PRÓXIMO para ir para o próximo desafio.");
						// String prox = ler.next();
						System.out.println(
								"Parabens, voce conseguiu preencher o mapa! \n" + "Provavelmente voce fez isso: \n"
										+ "** MAPA DE KARNAUGH**\\n \" +				           \r\n" + " ____ C \n"
										+ " A B | 0 | 1 \n" + "------------- \n" + " 0 0 | 1 | 1  \n"
										+ " 0 1 | 1 | 1  \n" + " 1 1 | 0 | 0  \n" + " 1 0 | 1 | 1  \n" + "\n");
						System.out.println(
								" Legal, voce ja conseguiu ajudar a maioria dos jogadores mas, ainda falta uma parte, lembra? \n"
										+ "Para completar o desafio, indique a expressao booleana que representa o mapa acima: \n"
										+ "\n");
						System.out.println("\n" + "GoolaAaAaco!!! Voce acertou. Precisou de " + contN
								+ " tentativas para finalizar. \n" + "Marcou " + ponto + " ponto(s). \n");
						
						contN=1;
						do {
							Collections.shuffle(opcao);
							
							System.out.println("** MAPA DE KARNAUGH**\\n \" +				           \r\n" + " ____ C \n"
											+ " A B | 0 | 1 \n" + "------------- \n" + " 0 0 | 1 | 1  \n"
											+ " 0 1 | 1 | 1  \n" + " 1 1 | 0 | 0  \n" + " 1 0 | 1 | 1  \n" + "\n");
							System.out.print("RESPONDA \n"
									+ "Qual e a expressao booleana que representa a tabela verdade acima? \n" + "\n"
									+ "a) " + opcao.get(0) + "\n" + "b) " + opcao.get(1) + "\n" + "c) " + opcao.get(2)
									+ "\n" + "d) " + opcao.get(3) + "\n" + "e) " + opcao.get(4) + "\n" + "\n"
									+ "RESPOSTA: ");
							n1 = ler.next();
							System.out.println("");
							switch (n1) {
							case "a":
							case "A":
								if (opcao.get(0).equals("S = A' + B'")) {
									System.out.println("\n" + "GoolaAaAaco!!! Voce acertou. Precisou de " + contN
											+ " tentativas para finalizar. \n" + "Marcou " + ponto2 + " ponto(s). \n");
									saida = false;
								} else {
									ponto2--;
									System.out.println("RESPOSTA ERRADA");
								}
								break;
							case "b":
							case "B":
								if (opcao.get(1).equals("S = A' + B'")) {

									System.out.println("\n" + "GoolaAaAaco!!! Voce acertou. Precisou de " + contN
											+ " tentativas para finalizar. \n" + "Marcou " + ponto2 + " ponto(s). \n");
									saida = false;
								} else {
									ponto2--;
									System.out.println("RESPOSTA ERRADA");
								}
								break;
							case "c":
							case "C":
								if (opcao.get(2).equals("S = A' + B'")) {
									System.out.println("\n" + "GoolaAaAaco!!! Voce acertou. Precisou de " + contN
											+ " tentativas para finalizar. \n" + "Marcou " + ponto2 + " ponto(s). \n");
									saida = false;
								} else {
									ponto2--;
									System.out.println("RESPOSTA ERRADA");
								}
								break;
							case "d":
							case "D":
								if (opcao.get(3).equals("S = A' + B'")) {
									System.out.println("\n" + "GoolaAaAaco!!! Voce acertou. Precisou de " + contN
											+ " tentativas para finalizar. \n" + "Marcou " + ponto2 + " ponto(s). \n");
									saida = false;
								} else {
									ponto2--;
									System.out.println("RESPOSTA ERRADA");
								}
								break;
							case "e":
							case "E":
								if (opcao.get(4).equals("S = A' + B'")) {
									System.out.println("\n" + "GoolaAaAaco!!! Voce acertou. Precisou de " + contN
											+ " tentativas para finalizar. \n" + "Marcou " + ponto2 + " ponto(s). \n");
									saida = false;
								} else {
									ponto2--;
									System.out.println("RESPOSTA ERRADA");
									break;
								}
							}

							if (contN == 1 && (!(n1.equals(opcao)) && saida)) {
								
								System.out.println("Olhe o mapa novamente. Talvez voce nao tenha entendido! \n");
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
										+ "	1 | 1 | 0 | 0                          ** EXPRESSaO BOOLEANA ** \n"
										+ "	1 | 1 | 1 | 1                          S = A'.B'.C' + B.C + A.C\n"
										+ "Digite NOVO para ver a tabela e ter uma nova tentativa.");
								String seguir6 = ler.next();
								System.out.println("\n");
							}

							if (contN == 2 && (!(n1.equals(opcao)) && saida)) {
								
								System.out.println("Olhe o mapa novamente. Talvez voce nao tenha entendido! \n");
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
										+ "	1 | 1 | 0 | 0                          ** EXPRESSaO BOOLEANA ** \n"
										+ "	1 | 1 | 1 | 1                          S = A'.B'.C' + B.C + A.C\n"
										+ "Digite NOVO para ver a tabela e ter uma nova tentativa.");
								String seguir6 = ler.next();
								System.out.println("\n");
							}
							contN++;
						} while (contN <= 3 && saida);
					}

					if (contN == 1 && (!(l1 == vetor1[0] && l2 == vetor1[1] && l3 == vetor1[2] && l4 == vetor1[3]))
							&& saida) {
						System.out.println("RESPOSTA ERRADA");
						ponto--;
						System.out.println("Olha o exemplo novamente. Talvez voce nao tenha entendido! \n" + "\n"
								+ "Digite NOVO para ver o exemplo novamente e ter uma nova tentativa.");
						String seguir6 = ler.next();
						System.out.println("\n");
					}
					if (contN == 2 && (!(l1 == vetor1[0] && l2 == vetor1[1] && l3 == vetor1[2] && l4 == vetor1[3]))
							&& saida) {
						System.out.println("RESPOSTA ERRADA");
						ponto--;
						System.out.println("Voce tem uma última chance. Olhe o exemplo novamente. !!ATENcaO!! \n" + "\n"
								+ "Digite NOVO para ver o exemplo novamente e ter uma nova tentativa.");
						String seguir7 = ler.next();
						System.out.println("");
					}
					if (contN == 3 && (!(l1 == vetor1[0] && l2 == vetor1[1] && l3 == vetor1[2] && l4 == vetor1[3]) && saida)
							|| contN == 6 && (!(n1.equals(opcao)) && saida)) {
						ponto--;
						System.out.println("\n" + "Voce errou as tres tentativas!! \n"
								+ "Acho que voce nao entendeu a tabela! Talvez voce nao tenha marcado pontos nessa rodada! \n");
						saida=false;
						// break;
					}
					
				} while (contN <= 3 && saida);
			}
			if (resposta.equalsIgnoreCase(recusa)) {
				System.out.println("Voce saiu do jogo");
				break;
			} else if (!(resposta.equalsIgnoreCase(seguir))) {
				System.out.println("Invalido");
				loop = false;
			}

		} while (contN < 3 && saida);
		if (ponto==0) {
			ponto2=0;
		}
		pontofinal = ponto + ponto2;
		System.out.println(pontofinal);
		return pontofinal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarando variaveis
		// variavel op e a variavel que vai dar a opcao desejada no menu.
		int op;
		String name, clube;

		introducao();

		do {

			System.out.println("Menu: ");
			System.out.println("1-Creditos");
			System.out.println("2-Instrucoes");
			System.out.println("3-Jogar");
			System.out.println("4-Sair\n");

			System.out.print("Digite a opcao desejada [1] [2] [3] [4]: \n");
			op = input.nextInt();

			switch (op) {
			case 1:
				// digitar os creditos do jogo
				System.out.println("\n**--- CReDITOS ---**\n\n" + "Criado e desenvolvido por:\n"
						+ "Danilo da Silva Ranea\n" + "Joao Vitor Maldonado Roschel\n" + "Paulo Honorato\n\n"
						+ "Projeto Integrador 1 do Centro Universitario SENAC\n"
						+ "Tecnologia em Analise e Desenvolvimento de Sistemas.\n\n"
						+ "Professor orientador: Eduardo Takeo\n" + "Materia escolhida: Conceitos de Computacao\n\n");
				break;
			case 2:
				// digitar as instrucoes do jogo
				System.out.println("\n**--- INSTRUcoES ---**\n\n"
						+ "O PRO SOCCER LEAGUE, e um jogo interativo que busca fornecer as melhores condicoes\n"
						+ "de aprendizado aos seus jogadores, dessa forma, visando facilitar a sua experiencia, siga as intrucoes abaixo:\n"
						+ "1) Ao ingressar no menu, escolha a opcao 3 para jogar.\n"
						+ "2) Sempre antes de cada desafio apresentaremos uma explicacao do mesmo, que o ajudara a solucionar o desafio,\n"
						+ "por isso, preste atencao sempre.\n" + "   Cada desafio tera 3 tentativas:\n"
						+ "   A 1ª tentativa vale 3 pontos,\n" + "   A 2ª tentativa vale 2 pontos,\n"
						+ "   A 3ª tentativa vale 1 ponto.\n"
						+ "3) Sempre ao errar o desafio proposto, o jogador recebera um feedback de onde deve melhorar.\n"
						+ "4) Ao final do jogo, o jogador recebera a sua pontuacao e qual o resultado da sua temporada (Campeao;\n"
						+ "classificado para torneio internacional; manteve-se na primeira divisao; rebaixado. \n"
						+ "5) Tabela de pontuacao:\n"
						+ "   O jogador que somar o maior número de pontos, dentro da faixa de 25 a 33 pontos sera o campeao,\n"
						+ "   De 25 a 33 pontos - Zona de classificacao para campeonato internacional,\n"
						+ "   De 20 a 24 pontos - Zona de classificacao para campeonato interncaional de 2ª classe\n"
						+ "   De 11 a 19 pontos - Mantem-se na 1ª divisao\n"
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
				System.out.printf("Pontuacao no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();
    
				// ********DESAFIO 2**********
				pontuacaoDesafio2 = ex2(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, 0, 0, 0, 0, 0, 0, 0, 0);
				System.out.printf("Pontuacao no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();
    
				// ********DESAFIO 3**********
				pontuacaoDesafio3 = fdesafio3(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3, 0, 0, 0, 0, 0,
						0, 0);
				System.out.printf("Pontuacao no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();
    
				// ********DESAFIO 4**********
				// janelaTabelaVerdade.main(null);
				pontuacaoDesafio4 = fDesafio04(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, 0, 0, 0, 0, 0, 0);
				System.out.printf("Pontuacao no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();
    
				// ********DESAFIO 5**********
				historiadesafio5(name, clube);
				// exdesafio5();
				pontuacaoDesafio5 = fdesafio5();
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, pontuacaoDesafio5, 0, 0, 0, 0, 0);
				System.out.printf("Pontuacao no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();
    
				// ********DESAFIO 6**********
				// exemploExercicio6();
				pontuacaoDesafio6 = fDesafio06(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, pontuacaoDesafio5, pontuacaoDesafio6, 0, 0, 0, 0);
				System.out.printf("Pontuacao no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();
    
				// ********DESAFIO 7**********
				pontuacaoDesafio7 = ex9(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, pontuacaoDesafio5, pontuacaoDesafio6, pontuacaoDesafio7, 0, 0, 0);
				System.out.printf("Pontuacao no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();
    
				// ********DESAFIO 8**********
				pontuacaoDesafio8 = ex8(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, pontuacaoDesafio5, pontuacaoDesafio6, pontuacaoDesafio7, pontuacaoDesafio8,
						0, 0);
				System.out.printf("Pontuacao no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();
    
				// ********DESAFIO 9**********
				String n;
				pontuacaoDesafio9 = 0;
				historiadesafio7(name, clube);
				exdesafio7();
				System.out.println(
						"Voce entendeu a explicacao do desafio? Em caso positivo, responda Sim para que possamos dirigi-lo\n"
								+ "para o desafio. Em caso negativo, digite Nao para que possamos repetir a explicacao.");
				n = input.next();
    
				if (n.equalsIgnoreCase("Sim") || n.equalsIgnoreCase("s") || n.equalsIgnoreCase("SIM")
						|| n.equalsIgnoreCase("S")) {
					pontuacaoDesafio9 = fdesafio7();
				}
				if (n.equalsIgnoreCase("Nao") || n.equalsIgnoreCase("n") || n.equalsIgnoreCase("NaO")
						|| n.equalsIgnoreCase("N")) {
					exdesafio7();
					;
				}
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, pontuacaoDesafio5, pontuacaoDesafio6, pontuacaoDesafio7, pontuacaoDesafio8,
						pontuacaoDesafio9, 0);
				System.out.printf("Pontuacao no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				proximoDesafio();
    
				// ********DESAFIO 10**********
				pontuacaoDesafio10 = ex10(name, clube);
				pontuacaoCampeonato = pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3,
						pontuacaoDesafio4, pontuacaoDesafio5, pontuacaoDesafio6, pontuacaoDesafio7, pontuacaoDesafio8,
						pontuacaoDesafio9, pontuacaoDesafio10);
				System.out.printf("Pontuacao no campeonato: %d ponto(s)\r\n", pontuacaoCampeonato);
				
				situacaoCampeonato(pontuacaoCampeonato);

				break;

			case 4:
				// Aqui e a saida do jogo.
				System.out.println("VOCe SAIU DO JOGO!");

				break;
			default:
				System.out.println("Opcao invalida, tente novamente.\n");
			}

		} while (op != 3 && op != 4);

	}

}
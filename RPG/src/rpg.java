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

	
	
	
	
	//*****JOÃO******
	
	//Pontuação
	static int pontuacao(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
		int soma;

		
		soma=a+b+c+d+e+f+g+h+i+j;
		
		
		return soma;
	}
	
	
	
	
	
	//EXERCÍCIO 1
	static int fExemploDesafio01() {

		int desafio1=0;
		String entradaDesafio1 = "";

		boolean loopDesafio1 = true, loopDesafio555555 = true;

		System.out.println("Para converter um número binário para um número decimal, é necessário:\n"
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
				System.out.println(" ");
			}
		}
		return desafio1;
	}

	static void fFeedbackPositivoDesafio1() {
		System.out.println("Parabéns! Você povavelmente fez isto:\n" 
				+ "-----* Resolução do desafio *-----\n"
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
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 3;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else if (alternativas.get(0).equals("215") && contador == 1) {
					contador = 2;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 2;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else if (alternativas.get(0).equals("215") && contador == 2) {
					contador = 3;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 1;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else {
					System.out.println("Resposta errada, tente novamente.\n");
					contador++;
					System.out.println("---- FEEDBACK ----\n"
							+ "Vamos te ajudar! Aqui vai o exemplo de resolução novamente:");
					System.out.println("Para converter um número binário para um número decimal, é necessário:\n"
							+ "Utilizar a tabela de potências de 2:\n" + "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
							+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
							+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
							+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n"
							+ "\n"
							+ "Tente novamente!\n");
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("215") && contador == 0) {
					contador = 1;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 3;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else if (alternativas.get(1).equals("215") && contador == 1) {
					contador = 2;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 2;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else if (alternativas.get(1).equals("215") && contador == 2) {
					contador = 3;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 1;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else {
					System.out.println("Resposta errada, tente novamente.\n");
					contador++;
					System.out.println("---- FEEDBACK ----\n"
							+ "Vamos te ajudar! Aqui vai o exemplo de resolução novamente:");
					System.out.println("Para converter um número binário para um número decimal, é necessário:\n"
							+ "Utilizar a tabela de potências de 2:\n" + "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
							+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
							+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
							+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n"
							+ "\n"
							+ "Tente novamente!\n");
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("215") && contador == 0) {
					contador = 1;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 3;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else if (alternativas.get(2).equals("215") && contador == 1) {
					contador = 2;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 2;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else if (alternativas.get(2).equals("215") && contador == 2) {
					contador = 3;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 1;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else {
					System.out.println("Resposta errada, tente novamente.\n");
					contador++;
					System.out.println("---- FEEDBACK ----\n"
							+ "Vamos te ajudar! Aqui vai o exemplo de resolução novamente:");
					System.out.println("Para converter um número binário para um número decimal, é necessário:\n"
							+ "Utilizar a tabela de potências de 2:\n" + "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
							+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
							+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
							+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n"
							+ "\n"
							+ "Tente novamente!\n");
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("215") && contador == 0) {
					contador = 1;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 3;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else if (alternativas.get(3).equals("215") && contador == 1) {
					contador = 2;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 2;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else if (alternativas.get(3).equals("215") && contador == 2) {
					contador = 3;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 1;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else {
					System.out.println("Resposta errada, tente novamente.\n");
					contador++;
					System.out.println("---- FEEDBACK ----\n"
							+ "Vamos te ajudar! Aqui vai o exemplo de resolução novamente:");
					System.out.println("Para converter um número binário para um número decimal, é necessário:\n"
							+ "Utilizar a tabela de potências de 2:\n" + "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
							+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
							+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
							+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n"
							+ "\n"
							+ "Tente novamente!\n");
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("215") && contador == 0) {
					contador = 1;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 3;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else if (alternativas.get(4).equals("215") && contador == 1) {
					contador = 2;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 2;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else if (alternativas.get(4).equals("215") && contador == 2) {
					contador = 3;
					System.out.println("Você acertou na " + contador + "a tentativa!\r\n");
					nota1 = 1;
					saidaLoop = false;
					fFeedbackPositivoDesafio1();
				} else {
					System.out.println("Resposta errada, tente novamente.\n");
					contador++;
					System.out.println("---- FEEDBACK ----\n"
							+ "Vamos te ajudar! Aqui vai o exemplo de resolução novamente:");
					System.out.println("Para converter um número binário para um número decimal, é necessário:\n"
							+ "Utilizar a tabela de potências de 2:\n" + "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
							+ "    256   128   64   32   16    8    4    2    1.\n" + "\n"
							+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
							+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n"
							+ "\n"
							+ "Tente novamente!\n");
				}
				break;

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

	//EXERCÍCIO 4
	static void exemploTabelaVerdade() {
	
		
		System.out.println("Tabela verdade é um dispositivo utilizado no estudo da\r\n"
				+ "lógica matemática. Com o uso desta tabela é possível definir o valor\r\n"
				+ "lógico de uma proposição, isto é, saber quando uma sentença é\r\n"
				+ "verdadeira ou falsa. Em lógica, as proposições representam\r\n"
				+ "pensamentos completos e indicam afirmações de fatos ou ideias.\r\n" + ""
				+ "A montagem da tabela se da de forma que:"
				+ "Os elementos A, B e C se modificam conforme sua potência. Ou seja:\r\n" 
				+ "2^2 2^1 2^0\r\n" 
				+ "4    2    1\r\n"
				+ "" + "Significa que o elemento A se alterna a cada 4 repetições.\r\n"
				+ "O elemento B se alterna a cada 2 repetições." + "O elemento C se alterna a cada 1 repetição.\r\n" +""
				+ "A | B | C | S\r\n" 
				+ "0 | 0 | 0 | S1\r\n" 
				+ "0 | 0 | 1 | S2\r\n" 
				+ "0 | 1 | 0 | S3\r\n" 
				+ "0 | 1 | 1 | S4\r\n"
				+ "1 | 0 | 0 | S5\r\n" 
				+ "1 | 0 | 1 | S6\r\n" 
				+ "1 | 1 | 0 | S7\r\n" 
				+ "1 | 1 | 1 | S8\r\n");

		System.out.println("");
		
	}

	
	//EXERCICIO 6
	
	
	
	
	
	
	
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
				+ "Sendo o principal deles, fornecer um novo mecanismo de ensino para o professor e de aprendizado para o aluno.\n");
	}

	static String nomejogador() {
		String nome;

		System.out.println("Para iniciarmos o jogo é necessário que escolha o nome do seu jogador.\n");

		System.out.print("Digite o nome do seu jogador: ");
		nome = input.nextLine();
		input.nextLine();
		System.out.println("\n");

		return nome;
	}

	static String nometime() {
		String time;

		System.out.println("Para iniciarmos o jogo é necessário que escolha o nome do seu time.\n");

		System.out.print("Digite o nome do seu time, sem ser composto: ");
		time = input.next();
		System.out.println("\n");

		return time;
	}

	static void historiadesafio1() {

		System.out.println("Inicia-se a temporada!!\n" + "Já chegamos ao nosso primeiro jogo!\n"
				+ "O nosso primeiro adversário será o Íbis, de Pernambuco\n"
				+ "Para vencê-lo você terá que estudar a estratégia passada pelo treinador\n"
				+ "e resolver o seguinte desafio acerca de números binários.\n" + "\n");
	}

	//EXERCÍCIO 3
	static void exdesafio3() {
		System.out.println(
				"Para realizar a multiplicação de números binários você, você deverá utilizar-se das tabelas abaixo:\n"
						+ "0 x 0 = 0				0 + 0 = 0\n" + "1 x 0 = 0				0 + 1 = 1\n"
						+ "0 x 1 = 0				1 + 0 = 1\n" + "1 x 1 = 1				1 + 1 = 0 e sobe 1\n");

		System.out.println("Por exemplo, a seguinte multiplicação, ficaria da seguinte forma:\n" + "   11\n" + "  x11\n"
				+ "-----\n" + "11 11\n" + "  11+\n" + "------\n" + " 1001");
	}

	static int fdesafio3() {

		int contador = 0, ponto = 3;

		String resposta;

		System.out.print("3º Desafio.\n" + "\n");

		exdesafio3();
		System.out.println("\n");

		System.out.print("Para vencer a terceira partida, você terá que acertar\n"
				+ "a seguinte multiplicação de números binários.\n" + "\n");

		System.out.print("1101 x 1010\n" + "\n");

		boolean acertou = false;

		List alternativas = new ArrayList();

		alternativas.add("10000010"); // resposta correta
		alternativas.add("10101010");
		alternativas.add("11100010");
		alternativas.add("10111010");
		alternativas.add("10111110");

		do {
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
				if (alternativas.get(0).equals("10000010")) {
					System.out.println("Resposta correta! " + contador + "ª tentativa");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					ponto--;
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("10000010")) {
					System.out.println("Resposta correta! " + contador + "ª tentativa");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					ponto--;
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("10000010")) {
					System.out.println("Resposta correta! " + contador + "ª tentativa");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					ponto--;
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("10000010")) {
					System.out.println("Resposta correta! " + contador + "ª tentativa");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					ponto--;
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("10000010")) {
					System.out.println("Resposta correta! " + contador + "ª tentativa");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					ponto--;
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

		return contador;
	}

	//EXERCÍCIO 5
	static void historiadesafio5() {
		
		System.out.println("Já chegamos ao nosso quinto jogo\n"
				+ "O nosso primeiro adversário será o Goiás, do Estado de Goiás\n"
				+ "Para vencê-lo você terá que estudar a estratégia passada pelo treinador\n"
				+ "e simplicar a expressão booleana que será apresentada.\n"
				+ "\n");
		}
		
	static void exdesafio5() {
		System.out.println("Para realizar a simplicação da expressão booleana que será apresentada, utilize-se dos seguintes postulados e propriedades: \n"
				+ "Postulados: \n"
				+ "A . 0 = 0      A + O = A      A + 1 = 1      A . 1 = A\n"
				+ "A + A' = 1     A . A' = 0     A + A = A      A . A = A\n"
				+ "Propriedade Distributiva:\n"
				+ "A. (B +) = A . B + A . C\n"
				+ "Propriedade Comutativa:\n"
				+ "A + B = B + A         A . B = B . A\n"
				+ "Propriedade Associativa:\n"
				+ "(A + B) + C = A + (B + C)        (A . B) . C = A . (B . C)\n"
				+ "Teorema de De Morgan:\n"
				+ "A' . B' . C' = (A+B+C)'          (A' + B' + C' = (A.B.C)'\n");
		
		System.out.println("Por exemplo, a simplificação da expressão A + A.B, ficaria da seguinte forma:\n"
				+ "A + A.B =\n"
				+ "A . (1 + B) = \n"
				+ "A . 1 = \n"
				+ "A\n"
				+ "Neste caso foram utilizados a propriedade distributiva e o postulado de adição.\n");
	}
	
	static void feedbacknegativo() {
		
		System.out.println("Você errou, verifique novamente o exemplo dado anteriormente.");
		
		System.out.println("A simplificação da expressão A + A.B, ficaria da seguinte forma:\n"
				+ "A + A.B =\n"
				+ "A . (1 + B) = \n"
				+ "A . 1 = \n"
				+ "A\n"
				+ "Neste caso foram utilizados a propriedade distributiva e o postulado de adição.\n");
		
		
	}
	
	
	static int fdesafio5() {
		
		int contador=0, ponto=3;
		
		String resposta;
		
		System.out.print("5º Desafio.\n"
				+ "\n");
		
		exdesafio5();
		System.out.println("\n");
		
		System.out.print("Para vencer a quinta partida, você terá que simplificar\n"
				+ "a seguinte expressão booleana.\n"
				+ "\n");
		
		System.out.print("A.B.C + A.C' + A.B\n"
				+ "\n");
		
		boolean acertou = false;
		
		List alternativas = new ArrayList();
		
		alternativas.add("A"); // resposta correta
		alternativas.add("A.B'");
		alternativas.add("A.C'");
		alternativas.add("A'");
		alternativas.add("A'.B'");
		
		do {
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
			if (alternativas.get(0).equals("A")) {
			System.out.println("Resposta correta! " + contador + "ª tentativa");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			feedbacknegativo();
			ponto--;
			}
			break;
			case "b":
			case "B":
			if (alternativas.get(1).equals("A")) {
			System.out.println("Resposta correta! "  + contador + "ª tentativa");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			feedbacknegativo();
			ponto--;
			}
			break;
			case "c":
			case "C":
			if (alternativas.get(2).equals("A")) {
			System.out.println("Resposta correta! "  + contador + "ª tentativa");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			feedbacknegativo();
			ponto--;
			}
			break;
			case "d":
			case "D":
			if (alternativas.get(3).equals("A")) {
			System.out.println("Resposta correta! "  + contador + "ª tentativa");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			feedbacknegativo();
			ponto--;
			}
			break;
			case "e":
			case "E":
			if (alternativas.get(4).equals("A")) {
			System.out.println("Resposta correta! " + contador + "ª tentativa");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			feedbacknegativo();
			ponto--;
			}
			break;
			default:
			System.out.println("Escolha inválida!");
			}

		
		} while (!acertou && contador!=3);
		
		if (contador==3 && ponto==0) {
			System.out.println("Você errou as três tentativas");
			System.out.print("Você somou " + ponto + " pontos.");
			ponto=0;
		}
		
		return contador;
	}
	
	
	
	
	// ******PAULO******//
	static Scanner ler = new Scanner(System.in);
	private static int resultado;

	
	//EXERCÍCIO 2
	static int ex2() {

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
		System.out.println("** DESAFIO 2 ** \n" + "\n"
				+ " Estamos com um pequeno problema tático. Precisamos fazer um ajuste e tentar marcar alguns pontos pra \n"
				+ "ajudar a equipe ganhar o campeonato. Que tal entender um esquema? \n"
				+ " O problema tático está relacionado com operação de números binários, mais precisamente adição (soma). \n"
				+ " Vamos ajudar o time!!! \n" + "\n"
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
								+ ponto + " ponto(s). \n" + "\n" + "Digite PRÓXIMO para ir para o próximo desafio.");
						String prox1 = ler.next();
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
								+ ponto + " ponto(s). \n" + "\n" + "Digite PRÓXIMO para ir para o próximo desafio.");
						String prox2 = ler.next();
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
								+ ponto + " ponto(s). \n" + "\n" + "Digite PRÓXIMO para ir para o próximo desafio.");
						String prox3 = ler.next();
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
								+ ponto + " ponto(s). \n" + "\n" + "Digite PRÓXIMO para ir para o próximo desafio.");
						String prox4 = ler.next();
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
								+ ponto + " ponto(s). \n" + "\n" + "Digite PRÓXIMO para ir para o próximo desafio.");
						String prox5 = ler.next();
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
		return resultado;
	}

	//EXERCÍCIO 8
	static int ex8() {

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
		System.out.println("** DESAFIO 8 ** \n" + "\n" + "***********DISCURSO DO DESAFIO************");

		System.out.println("**********IMAGEM**********");

		do {
			String seguir = "Aceito";
			String recusa = "Sair";
			System.out.println("\n" + "Digite ACEITO para começar o desafio");
			String resposta = ler.next();

			if (resposta.equalsIgnoreCase(seguir)) {

				System.out.println("\n"
						+ " Para chegar a expressão booleana através de uma tabela verdade, é necessário \n"
						+ "que você entenda que representamos na expressão apenas as entradas que tem saidas \n"
						+ "igual a 1 e ignoramos as entradas cuja saida seja igual a 0. \n" + "\n"
						+ "                     Dada a tabela verdade abaixo, indique a expressão booleana que a \n"
						+ "                    represente. Para resolver, utilize a soma dos produtos!" + "\n");

				do {
					// EXEMPLO
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
							System.out.println("*************IMAGEM************");
							System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n" + "\n"
									+ "Digite PRÓXIMO para ir para o próximo desafio.");
							String prox1 = ler.next();
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					case "b":
					case "B":
						if (numeros.get(1).equals("S = A'.B'.C' + A'.B.C + A.B'.C + A.B.C")) {
							System.out.println("*************IMAGEM************");
							System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n" + "\n"
									+ "Digite PRÓXIMO para ir para o próximo desafio.");
							String prox2 = ler.next();
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					case "c":
					case "C":
						if (numeros.get(2).equals("S = A'.B'.C' + A'.B.C + A.B'.C + A.B.C")) {
							System.out.println("*************IMAGEM************");
							System.out.println("\n" + "GolaAaAaço!!! Você acertou na " + contN + "ª tentativa e marcou "
									+ ponto + " ponto(s). \n" + "\n"
									+ "Digite PRÓXIMO para ir para o próximo desafio.");
							String prox3 = ler.next();
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					case "d":
					case "D":
						if (numeros.get(3).equals("S = A'.B'.C' + A'.B.C + A.B'.C + A.B.C")) {
							System.out.println("*************IMAGEM************");
							System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n" + "\n"
									+ "Digite PRÓXIMO para ir para o próximo desafio.");
							String prox4 = ler.next();
							saida = false;
						} else {
							ponto--;
							System.out.println("RESPOSTA ERRADA");
						}
						break;
					case "e":
					case "E":
						if (numeros.get(4).equals("S = A'.B'.C' + A'.B.C + A.B'.C + A.B.C")) {
							System.out.println("*************IMAGEM************");
							System.out.println("\n" + "GoolaAaAaço!!! Você acertou na " + contN
									+ "ª tentativa e marcou " + ponto + " ponto(s). \n" + "\n"
									+ "Digite PRÓXIMO para ir para o próximo desafio.");
							String prox5 = ler.next();
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
						System.out.println("*************IMAGEM************");
						System.out.println("\n" + "Você errou as três tentativas!! \n"
								+ "Acho que você não entendeu a tabela! Infelizmente não marcou pontos nessa rodada! \n"
								+ "Tente a próxima! \n\" " + "Digite PRÓXIMO para ir para o próximo desafio.");
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

		return resultado;
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

			System.out.print("Digite a opção desejada: \n");
			op = input.nextInt();

			switch (op) {
			case 1:
				// digitar os créditos do jogo
				System.out.println("\nNós, os criadores do PRO SOCCER LEAGUE desejamos que sua experiência\n"
						+ "com o jogo tenha sido proveitosa e que tenha influenciado positivamente em seu aprendizado.\n"
						+ "\n");
				break;
			case 2:
				// digitar as instruções do jogo
				System.out.println(
						"\nO PRO SOCCER LEAGUE, é um jogo interativo que busca fornecer as melhores condições\n"
								+ "de aprendizado aos seus jogadores, dessa forma, visando facilitar a sua experiência, siga as intruções abaixo:\n"
								+ "1) Ao ingressar no menu, escolha a opção 3 para jogar.\n"
								+ "2) Sempre antes de cada desafio apresentaremos uma explicação do mesmo, que o ajudará a solucionar o desafio,\n"
								+ "por isso, preste atenção sempre.\n"
								+ "3) Sempre ao errar o desafio proposto, o jogador receberá um feedback de onde deve melhorar.\n"
								+ "4) Ao final do jogo, o jogador receberá a sua pontuação e qual o resultado da sua temporada (Campeão;\n"
								+ "classificado para torneio internacional; manteve-se na primeira divisão; rebaixado. \n"
								+ "\n");
				break;
			case 3:
				// ir para o jogo
				
				int pontuacaoDesafio1,pontuacaoDesafio2,pontuacaoDesafio3,pontuacaoDesafio4,pontuacaoDesafio5,pontuacaoDesafio6,pontuacaoDesafio7,pontuacaoDesafio8,pontuacaoDesafio9,pontuacaoDesafio10;
				int pontuacaoCampeonato;
				
				System.out.println("\nVamos jogar\n" + "\n");
				name = nomejogador();
				clube = nometime();
				historiadesafio1();
				
				//********DESAFIO 1**********
				pontuacaoDesafio1=fExemploDesafio01();
				pontuacaoCampeonato=pontuacao(pontuacaoDesafio1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
				System.out.printf("Pontuação no campeonato: %d\r\n",pontuacaoCampeonato);
				
				
				//********DESAFIO 2**********
				pontuacaoDesafio2=ex2();
				pontuacaoCampeonato=pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, 0, 0, 0, 0, 0, 0, 0, 0);
				System.out.printf("Pontuação no campeonato: %d\r\n",pontuacaoCampeonato);
				
				
				
				//********DESAFIO 3**********
				pontuacaoDesafio3 = fdesafio3();
				pontuacaoCampeonato=pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3, 0, 0, 0, 0, 0, 0, 0);
				System.out.printf("Pontuação no campeonato: %d\r\n",pontuacaoCampeonato);
				
				
				//********DESAFIO 4**********
				exemploTabelaVerdade();
				janelaTabelaVerdade.main(null);
				pontuacaoDesafio4=janelaTabelaVerdade.contador;
				pontuacaoCampeonato=pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3, pontuacaoDesafio4, 0, 0, 0, 0, 0, 0);
				System.out.printf("Pontuação no campeonato: %d\r\n",pontuacaoCampeonato);
				
				
				//********DESAFIO 5**********
				historiadesafio5();
				exdesafio5();
				pontuacaoDesafio5 = fdesafio5();
				pontuacaoCampeonato=pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3, pontuacaoDesafio4, pontuacaoDesafio5, 0, 0, 0, 0, 0);
				System.out.printf("Pontuação no campeonato: %d\r\n",pontuacaoCampeonato);
			
				
				
				//********DESAFIO 6**********
				
				
				
				
				//********DESAFIO 7**********
				
				
				
				
				
				
				//********DESAFIO 8**********
				pontuacaoDesafio8=ex8();
				pontuacaoCampeonato=pontuacao(pontuacaoDesafio1, pontuacaoDesafio2, pontuacaoDesafio3, pontuacaoDesafio4, pontuacaoDesafio5, 0, 0, pontuacaoDesafio8, 0, 0);
				System.out.printf("Pontuação no campeonato: %d\r\n",pontuacaoCampeonato);
				
				
				
				//********DESAFIO 9**********
				
				
				
				
				
				//********DESAFIO 10**********
				
				
				
				
				break;
				
			case 4:
				//Aqui é a saida do jogo.
				
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
			}

		} while (op != 3 && op != 4);

	}

}

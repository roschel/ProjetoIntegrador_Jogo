import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class rpg {

	static void fExemploDesafio01() {
		System.out.println("Para converter um número binário para um número decimal, é necessário:\n"
				+ "Utilizar a tabela de potências de 2:\n"
				+ "... 2^8   2^7   2^6  2^5  2^4  2^3  2^2  2^1  2^0.\n"
				+ "    256   128   64   32   16    8    4    2    1.\n"
				+ "\n"
				+ "Por exemplo, para um número binário 011, temos 3 bits. Logo, a conversão será:\n"
				+ "0*4 + 1*2 + 1*1 = 0 + 2 + 1 = 3\n");
	}
	
	static void fFeedbackPositivoDesafio1() {
		System.out.println("Parabéns! Você povavelmente fez isto:\n"
				+ "-----* Resolução do desafio *-----\n"
				+ "1*128 + 1*64 + 0*32 + 1*16 + 0*8 + 1*4 + 1*2+ 1*1\n");
	}
	
	static int fdesafio01 () {
		Scanner sc= new Scanner(System.in);
		
		//Declarando variáveis
		int nota1=0,contador=0;
		boolean saidaLoop=true;
		String resposta="";
		List alternativas = new ArrayList();
		
		
		//Declarando opções de resposta
		alternativas.add("215"); //resposta correta
		alternativas.add("1010");
		alternativas.add("33");
		alternativas.add("982");
		alternativas.add("76");
		
		
		do {
					
			Collections.shuffle(alternativas);
			System.out.println("Dado o número binário 11010111, converta em número decimal.");
			System.out.println("a) "+alternativas.get(0));
			System.out.println("b) "+alternativas.get(1));
			System.out.println("c) "+alternativas.get(2));
			System.out.println("d) "+alternativas.get(3));
			System.out.println("e) "+alternativas.get(4));
			System.out.print("Escolha uma alternativa: ");
			resposta=sc.next();
			
			
			switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals("215") && contador==0) {
					contador=1;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=3;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else if(alternativas.get(0).equals("215") && contador==1) {
					contador=2;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=2;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else if(alternativas.get(0).equals("215") && contador==2) {
					contador=3;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=1;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else {
					System.out.println("Resposta errada, tente novamente.\n");
					contador++;
					System.out.println("---- FEEDBACK ----");
					fExemploDesafio01();
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("215") && contador==0) {
					contador=1;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=3;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else if(alternativas.get(1).equals("215") && contador==1) {
					contador=2;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=2;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else if(alternativas.get(1).equals("215") && contador==2) {
					contador=3;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=1;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else {
					System.out.println("Resposta errada, tente novamente.\n");
					contador++;
					System.out.println("---- FEEDBACK ----");
					fExemploDesafio01();					
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("215") && contador==0) {
					contador=1;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=3;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else if(alternativas.get(2).equals("215") && contador==1) {
					contador=2;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=2;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else if(alternativas.get(2).equals("215") && contador==2) {
					contador=3;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=1;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else {
					System.out.println("Resposta errada, tente novamente.\n");
					contador++;
					System.out.println("---- FEEDBACK ----");
					fExemploDesafio01();
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("215") && contador==0) {
					contador=1;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=3;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else if(alternativas.get(3).equals("215") && contador==1) {
					contador=2;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=2;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else if(alternativas.get(3).equals("215") && contador==2) {
					contador=3;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=1;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else {
					System.out.println("Resposta errada, tente novamente.\n");
					contador++;
					System.out.println("---- FEEDBACK ----");
					fExemploDesafio01();
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("215") && contador==0) {
					contador=1;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=3;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else if(alternativas.get(4).equals("215") && contador==1) {
					contador=2;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=2;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else if(alternativas.get(4).equals("215") && contador==2) {
					contador=3;
					System.out.println("Você acertou na "+contador+"a tentativa!");
					nota1=1;
					System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos\n");
					saidaLoop=false;
					fFeedbackPositivoDesafio1();
				}else {
					System.out.println("Resposta errada, tente novamente.\n");
					contador++;
					System.out.println("---- FEEDBACK ----");
					fExemploDesafio01();
				}
				break;

			default:
				break;
			}
			
		} while (saidaLoop && contador!=3);
		
		if (contador==3 && nota1==0) {
			System.out.println("Você não acertou em nenhuma das 3 tentativas.");
			System.out.println("Sua pontuação no campeonato é: "+nota1+" pontos");
			nota1=0;
		}
				
		
		return nota1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Declarando variáveis
		int desafio1;
		String entradaDesafio1="";
		
		// boolean loopDesafio1 serve para que o while faça loop até o jogador decidir entrar no desafio.
		// caso contrário, ele ficará vendo o exemplo do desafio 1.
		boolean loopDesafio1=true, loopDesafio555555=true;
		
		
		fExemploDesafio01();
		
		
		while (loopDesafio1) {
			System.out.print("Preparado para ir para o jogo?\n"
					+ "Digite 's' [sim] para entre ou 'n' [não] para ver novamente o exemplo.\n"
					+ "De uma resposta: ");
			entradaDesafio1=sc.next();
			
			if (entradaDesafio1.equalsIgnoreCase("s")) {
				System.out.println(" ");
				desafio1=fdesafio01();
				loopDesafio1=false;
			}else {
				System.out.println(" ");
				fExemploDesafio01();
			}
		}
		
		
		while (loopDesafio555555) {
			System.out.print("Preparado para ir para o jogo?\n"
					+ "Digite 's' [sim] para entre ou 'n' [não] para ver novamente o exemplo.\n"
					+ "De uma resposta: ");
			entradaDesafio1=sc.next();
			
			if (entradaDesafio1.equalsIgnoreCase("s")) {
				System.out.println(" ");
				desafio1=fdesafio01();
				loopDesafio1=false;
			}else {
				System.out.println(" ");
				fExemploDesafio01();
			}
		}
		
		
		
		//janelaTabelaVerdade.main(args);
		
	}

}

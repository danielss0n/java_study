
import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String divisao = "\n---------------------------------------------\n";
		int pontos = 0; //pontua��o que soma ao longo do quiz
		int resposta; //respostas que o usuario vai enviar
		
		//array contendo as strings que s�o as perguntas
		String[] perguntas = {
				"Qual � o pa�s mais rico do mundo? (de acordo com o pib)\n",
				"Qual � o pa�s mais pobre do mundo? (de acordo com o pib)\n",
				"Qual � o pa�s mais populoso do mundo?\n",
				"Qual � o pa�s com mais poder militar do mundo?\n",
				"Qual � o maior p�is do mundo geogr�ficamente?\n",
		};
		
		//array contendo as strings que s�o as alternativas
		String[] alternativa = {
				"1 - Catar \n2 - China \n3 - Estados Unidos \n4 - Luxemburgo\n",
				"1 - Burundi \n2 - Serra Leoa \n3 - Som�lia \n4 - N�ger\n",
				"1 - Estados Unidos \n2 - China \n3 - Jap�o \n4 - R�ssia\n",
				"1 - �ndia \n2 - R�ssia \n3 - China \n4 - Estados Unidos\n",
				"1 - Canad� \n2 - Estados Unidos \n3 - China \n4 - R�ssia\n",
		};
				
		//array contendo as ints das op��es corretas que o usuario deve inserir 
		int[] corretas = {3, 1, 2, 4, 4, };
		
		System.out.println("(RESPONDA DIGITANDO O NUMERO DA ALTERNATIVA)");
		
		//loop que repete at� o numero de perguntas que voce inseriu
		
		for (int i = 0; i < perguntas.length; i++) {
				System.out.println("Pergunta "+(i+1)+": \n"); 
				System.out.println(perguntas[i]); //printa a pergunta do numero do i
				System.out.println(alternativa[i]); //printa a alternativa da mesma pergunta
		
				resposta = sc.nextInt();
								
				//pega a resposta e avalia se � a certa no array das respostas
				if(resposta==corretas[i]) {
					System.out.println("Voc� acertou!");
					System.out.println(divisao);
					pontos++; //adiciona um ponto
				} else {
					System.out.println("Voc� errou!\n");
					System.out.println(divisao);
				}
			}		
		
		System.out.println("Voce acabou o teste\n");
		System.out.println("RESULTADOS:");
		System.out.println("Voc� acertou "+pontos+" de "+perguntas.length); 

	}
}

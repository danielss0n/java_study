
import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String divisao = "\n---------------------------------------------\n";
		int pontos = 0; //pontuação que soma ao longo do quiz
		int resposta; //respostas que o usuario vai enviar
		
		//array contendo as strings que são as perguntas
		String[] perguntas = {
				"Qual é o país mais rico do mundo? (de acordo com o pib)\n",
				"Qual é o país mais pobre do mundo? (de acordo com o pib)\n",
				"Qual é o país mais populoso do mundo?\n",
				"Qual é o país com mais poder militar do mundo?\n",
				"Qual é o maior páis do mundo geográficamente?\n",
		};
		
		//array contendo as strings que são as alternativas
		String[] alternativa = {
				"1 - Catar \n2 - China \n3 - Estados Unidos \n4 - Luxemburgo\n",
				"1 - Burundi \n2 - Serra Leoa \n3 - Somália \n4 - Níger\n",
				"1 - Estados Unidos \n2 - China \n3 - Japão \n4 - Rússia\n",
				"1 - Índia \n2 - Rússia \n3 - China \n4 - Estados Unidos\n",
				"1 - Canadá \n2 - Estados Unidos \n3 - China \n4 - Rússia\n",
		};
				
		//array contendo as ints das opções corretas que o usuario deve inserir 
		int[] corretas = {3, 1, 2, 4, 4, };
		
		System.out.println("(RESPONDA DIGITANDO O NUMERO DA ALTERNATIVA)");
		
		//loop que repete até o numero de perguntas que voce inseriu
		
		for (int i = 0; i < perguntas.length; i++) {
				System.out.println("Pergunta "+(i+1)+": \n"); 
				System.out.println(perguntas[i]); //printa a pergunta do numero do i
				System.out.println(alternativa[i]); //printa a alternativa da mesma pergunta
		
				resposta = sc.nextInt();
								
				//pega a resposta e avalia se é a certa no array das respostas
				if(resposta==corretas[i]) {
					System.out.println("Você acertou!");
					System.out.println(divisao);
					pontos++; //adiciona um ponto
				} else {
					System.out.println("Você errou!\n");
					System.out.println(divisao);
				}
			}		
		
		System.out.println("Voce acabou o teste\n");
		System.out.println("RESULTADOS:");
		System.out.println("Você acertou "+pontos+" de "+perguntas.length); 

	}
}

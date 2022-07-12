package teste;

import java.util.Scanner;

public class a2 {
	
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int idade,qtdeidade = 0,qtde = 0;
		double peso,altura,media = 0;
		
		int x = 11;
		int y = 11;
		

		for(int j = 1;j<=y;j++){
			System.out.println("Digite a idade do jogador "+j);
			idade = dado.nextInt();
			System.out.println("Digite o peso do jogador ");
			peso = dado.nextDouble();
			System.out.println("Digite a altura do jogador ");
			altura = dado.nextDouble();
			media = idade/y;
		if(idade < 18){
			qtde = qtde +1;
		}
	}
			System.out.println("a quantidade de jogador com idade menor que 18 é "+qtde);
			System.out.println("a média das idades do jogadores de cada time "+media);
			}
}

				
		

	

package atividades2;

import java.util.Scanner;

class ativ_m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int kilowat;
			int salario;
			int custo;
			int total;

			System.out.println("digite o salario minimo");
			salario=sc.nextInt();
			System.out.println("digite quantos quilowats voce gastou");
			kilowat=sc.nextInt();
			
			custo = salario/6;
			total = kilowat*custo;
			System.out.println("cada quilowat custa: "+custo);
			System.out.println("o total custou: "+total);
			System.out.println("com desconto é: "+ (total*(1.18)-total));

	}

}

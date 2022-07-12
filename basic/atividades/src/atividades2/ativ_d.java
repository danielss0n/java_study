package atividades2;

import java.util.Scanner;

class ativ_d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int preco;
			
			System.out.println("digite o preço da gasolina");
			preco=sc.nextInt();
					
			System.out.println("o preço com acréssimo de 10% é: "+ preco*1.10);

	}

}

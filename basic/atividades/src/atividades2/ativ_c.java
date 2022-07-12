package atividades2;

import java.util.Scanner;

class ativ_c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int num1;
			int num2;
			int divisao;
			
			
			System.out.println("digite um número que não seje 0");
			num1=sc.nextInt();
			System.out.println("digite um número para dividir");
			num2=sc.nextInt();
		
	
			divisao=num1/num2;
			
			System.out.println("a divisão dos resultados é:"+ divisao);

	}

}

package atividades2;

import java.util.Scanner;

class ativ_c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int num1;
			int num2;
			int divisao;
			
			
			System.out.println("digite um n�mero que n�o seje 0");
			num1=sc.nextInt();
			System.out.println("digite um n�mero para dividir");
			num2=sc.nextInt();
		
	
			divisao=num1/num2;
			
			System.out.println("a divis�o dos resultados �:"+ divisao);

	}

}

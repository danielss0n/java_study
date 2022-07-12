package atividades2;

import java.util.Scanner;

class ativ_b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int num1;
			int num2;
			int num3;
			int num4;
			int num5;
			int soma;
			
			
			System.out.println("mande um número");
			num1=sc.nextInt();
			System.out.println("mande um outro número");
			num2=sc.nextInt();
			System.out.println("mande um outro número");
			num3=sc.nextInt();
			System.out.println("mande um outro número");
			num4=sc.nextInt();
			System.out.println("mande um outro número");
			num5=sc.nextInt();
	
			soma=(num1+num2+num3+num4+num5)/8;
			
			System.out.println("a soma dos resultados dividido por 8 é é:"+ soma);

	}

}

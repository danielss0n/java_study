package atividades2;

import java.util.Scanner;

class ativ_h {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			double salario;
			double conta1;
			double conta2;
			double conta1a;
			double conta2a;
						
			System.out.println("digite o seu salario: ");
			salario=sc.nextDouble();
			
			System.out.println("digite a conta 1: ");
			conta1=sc.nextDouble();
			
			System.out.println("digite a conta 2: ");
			conta2=sc.nextDouble();
			
			conta1a= conta1-1.05;
			conta2a= conta2-1.05;
			
			System.out.println(conta1a);
			System.out.println("No seu salário restará: " + (salario - conta1a - conta2a) );

	}
}

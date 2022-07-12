package atividades2;

import java.util.Scanner;

class ativ_f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int salario;
			int salariomin = 1200;
			int total;
			
			System.out.println("digite o seu salario");
			salario=sc.nextInt();
			
			total=salario/salariomin;
					
			System.out.println("o seu salário é: "+ total + " salarios minimos");

	}

}

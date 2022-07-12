package atividades2;

import java.util.Scanner;

class ativ_i {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int horas;
			int salariomin = 1200;
			int horasextras;
			int totalhoras;
			int totalhorasextras;
			
			System.out.println("digite quantas horas normais voce trabalhou");
			horas=sc.nextInt();
			System.out.println("digite quantas horas extras voce fez");
			horasextras=sc.nextInt();
			
			totalhoras = horas*(salariomin/6);
			totalhorasextras = horasextras*(salariomin/3);

			System.out.println("Voce trabalhou "+horas+" horas nesse mes e fez "+horasextras+" de hora extra. /n Seu salario é "+totalhoras+totalhorasextras);

	}

}

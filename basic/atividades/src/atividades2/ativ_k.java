package atividades2;

import java.util.Scanner;

class ativ_k {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int hora;
			int minuto;
			int segundo;
			
			System.out.println("digite uma quantia de horas:");
			hora=sc.nextInt();
			
			minuto=hora*60;
			segundo=minuto*60;
			
			System.out.println("As horas em minutos são: "+minuto+"\n Em minutos são: "+segundo);

	}

}

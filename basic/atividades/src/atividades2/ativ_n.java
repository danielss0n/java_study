package atividades2;

import java.util.Scanner;

class ativ_n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int quilo;
			double racaoporgato = 0.500;
			
			System.out.println("digite quantos quilos voce comprou ");
			quilo=sc.nextInt();
					
			System.out.println("Ap�s 5 dias, vai restar de ra��o: "+ (quilo-(racaoporgato*2*5)));
	}

}

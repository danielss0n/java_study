package atividades2;

import java.util.Scanner;

class ativ_l {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int custo;
			int ingresso;
			int total;
			
			System.out.println("digite o custo do show:");
			custo=sc.nextInt();
			System.out.println("digite o custo do ingresso:");
			ingresso=sc.nextInt();
					
			total = custo/ingresso;
	
			
			System.out.println("para alcançar o custo do show voce devera vender "+total+" ingressos");

	}

}

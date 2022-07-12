package atividades2;

import java.util.Scanner;

class ativ_j {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int dinheiro;
			double dolaraus = 3.14;
			double libra = 6.28;
			int bitcoin = 194521;
			
			System.out.println("digite o dinheiro a converter");
			dinheiro=sc.nextInt();
								
			System.out.println(dinheiro+"\n em dolar australiano é: "+ dinheiro/dolaraus
					+ "\n em libras esterlinas é: "+dinheiro/libra+
					"\n em bitcoin é: " + dinheiro/bitcoin);

	}

}

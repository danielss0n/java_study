package atividades2;

import java.util.Scanner;

class ativ_g {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int num;
						
			System.out.println("digite o numero que voce quer a tabuada");
			num=sc.nextInt();
			
			for (int i = 0; i < 11; i++) {
				  System.out.println(num+" x "+i+" = "+num*i+"\n");
			}
	}
}

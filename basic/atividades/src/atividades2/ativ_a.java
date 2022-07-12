package atividades2;

import java.util.Scanner;

class ativ_a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int num;
			int num1;
			int mul;
			
			System.out.println("mande um número");
			num=sc.nextInt();
			System.out.println("mande outro número");
			num1=sc.nextInt();
			
			mul=num*num1;
			
			System.out.println("a multiplicação dos resultados é:"+mul);

	}

}

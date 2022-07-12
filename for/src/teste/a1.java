package teste;

import java.util.Scanner;

public class a1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("digite um numero para ver sa tabuada: ");
		int numero = sc.nextInt();
		System.out.print("digite ate quanto a tabuada vai ir: ");
		int multi = sc.nextInt();
		
		for (int i = 0; i <= multi; i++) {
			  System.out.println(numero*i);
			}
	}
}

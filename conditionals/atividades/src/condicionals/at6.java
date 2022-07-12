package condicionals;

import java.util.Scanner;

public class at6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		
		System.out.println("digite o valor 1");
		num1=sc.nextInt();
		
		int result = num1%2;
		
		if(result==0) {
			System.out.println(num1+" é par");
		} else {
			System.out.println(num1+" é impar");
		}
		
	}
}
				
	


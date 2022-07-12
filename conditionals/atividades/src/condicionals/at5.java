package condicionals;

import java.util.Scanner;

public class at5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		
		
		
		System.out.println("digite o valor 1");
		num1=sc.nextInt();
		
		System.out.println("digite o valor 2");
		num2=sc.nextInt();
		
		System.out.println("digite o valor 3");
		num3=sc.nextInt();
		
		System.out.println("digite o valor 4");
		num4=sc.nextInt();
		
		if(num1>num2 && num2>num3) {
			System.out.println(num3 +","+ num2 +","+num1 +","+num4);
		} else {
			System.out.println("ordem crescente");

		}
		
	}
}
				
	


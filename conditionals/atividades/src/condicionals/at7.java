package condicionals;

import java.util.Scanner;

public class at7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		int I;
		
		System.out.println("digite o valor A");
		num1=sc.nextInt();
		
		System.out.println("digite o valor B");
		num2=sc.nextInt();
		
		System.out.println("digite o valor C");
		num3=sc.nextInt();
		
		System.out.println("digite o valor I");
		I=sc.nextInt();

		
		
		if(num1>3) {
			System.out.println(num3+","+num2+","+num1);
		}
		if(num2>num1&&num1>num3) {
			System.out.println(num3+","+num1+","+num2);
		}
		if(num3>num2 && num2>num1) {
			System.out.println(num1+","+num2+","+num3);
		}
		if(num2>num3 && num3>num1) {
			System.out.println(num1+","+num3+","+num2);
		}
		if(num1>num2 && num3>num2) {
			System.out.println(num2+","+num3+","+num1);
		}		
	}
}
				
	


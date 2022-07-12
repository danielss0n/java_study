package condicionals;

import java.util.Scanner;

public class at1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		
		
		System.out.println("digite sua nota 1");
		num1=sc.nextInt();
		
		System.out.println("digite sua nota 2");
		num2=sc.nextInt();
		
		System.out.println("digite sua nota 3");
		num3=sc.nextInt();
		
		int media = (num1+num2+num3)/3;

		System.out.println("a sua media é: "+ media);
		
		if(media>8) {
			System.out.println("voce tirou A");
		}
		if(media==7 && media<8) {
			System.out.println("voce tirou B");
		}
		if(media==6 && media<7) {
			System.out.println("voce tirou C");
		}
		if(media==5 && media<6) {
			System.out.println("voce tirou D");
		}
		if(media<5) {
			System.out.println("voce tirou E");
		}
	}

}

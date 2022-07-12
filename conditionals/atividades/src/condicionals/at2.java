package condicionals;

import java.util.Scanner;

public class at2 {

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
		
		int media_apro = 7;

		System.out.println("a sua media é: "+ media);
		
		if(media>7) {
			System.out.println("voce passou");
		}
		if(media<7 && media>=3) {
			System.out.println("voce ta em exame");
			System.out.println("para voce passar precisa tirar "+(media_apro-media-1));
		}
		if(media<3) {
			System.out.println("voce reprovou");
			System.out.println("para voce passar precisa tirar "+(media_apro-media-1));

		}
	}

}

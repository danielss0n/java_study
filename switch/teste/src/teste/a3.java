package teste;

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("informe quantos livros deseja comprar: ");
		int quantia = sc.nextInt();
		
		double desconto1 = (quantia*0.25)+7.50;
		double desconto2 = (quantia*0.50)+2.50;
		
		if(desconto1>desconto2) {
			System.out.println("desconto A: " + desconto1);
			System.out.println("desconto B: " + desconto2);
			System.out.println("desconto B é mais barato");
		} else if(desconto1==desconto2) {
			System.out.println("desconto A: " + desconto1);
			System.out.println("desconto B: " + desconto2);
			System.out.println("os descontos dão a mesma coisas");
		} else if(desconto1<desconto2) {
			System.out.println("desconto A: " + desconto1);
			System.out.println("desconto B: " + desconto2);
			System.out.println("desconto A é mais barato");
		}
		
	}

}

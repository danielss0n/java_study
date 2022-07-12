package teste;

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas peças voce fabrica");
		int pecasfabric = sc.nextInt();
		
		System.out.println("Digite o seu numero de operario");
		int num_operario = sc.nextInt();

		
		System.out.println("Digite seu sexo");
		int sexo = sc.nextInt();

		
		System.out.println("Digite quantas peças voce fabrica");

		int classe;
				double salariomin = 1200;

		
		if(pecasfabric <=30) {
			classe = 1;
			double salariomin2 = salariomin;
			
		} else if (pecasfabric > 30 && pecasfabric <= 50){
			classe = 2;
			double salariomin2 = salariomin+((pecasfabric-30)*0.3);
			System.out.println(salariomin2);


		} else if (pecasfabric > 50) {
			classe = 3;
			double salariomin2 = salariomin+((pecasfabric-30)*0.5);
			
		}
	}
}

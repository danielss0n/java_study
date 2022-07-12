package teste;

import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.print("informe o codigo do produto: ");
		int codigo = sc.nextInt();
		
		System.out.print("informe o peso do produto: ");
		int peso = sc.nextInt();
		
		System.out.print("informa o pais do produto (1,2,3): ");
		int pais = sc.nextInt();
		
		double impostoValue = 0;
		
		System.out.print("informa o preço do produto: ");
		double preco = sc.nextDouble();

		switch(codigo) {
		case 1:
			preco=preco*(peso*0.1);
			break;
		case 2:
			preco=preco*(peso*0.1);
			break;
		case 3:
			preco=preco*(peso*0.1);
			break;
		case 4:
			preco=preco*(peso*0.1);
			break;
		case 5:
			preco=preco*(peso*0.25);
			break;
		case 6:
			preco=preco*(peso*0.25);
			break;
		case 7:
			preco=preco*(peso*0.25);
			break;
		case 8:
			preco=preco*(peso*0.35);
			break;
		case 9:
			preco=preco*(peso*0.35);
			break;
		case 10:
			preco=preco*(peso*0.35);
			break;
			}
			if(pais==2) {
				preco=preco*1.15;
				impostoValue=preco*0.15;
			} else if(pais==3) {
				preco=preco*1.25;
				impostoValue=preco*0.25;
			}
			System.out.print(" peso do produto: "+peso);
			System.out.print(" preço do produto: "+preco);
			System.out.print(" imposto cobrado: "+ impostoValue);

		}
	}
	

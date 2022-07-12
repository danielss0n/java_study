package teste;

import java.util.Scanner;

public class a4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double preco = 99;
		System.out.print("informe 1 para comprar a vista (15% desconto), 2 para cheque (10% desconto), 3 parcelado em seis vezes, 4 parcelado em 12 vezes (8% acrescimo)");
		int escolha = sc.nextInt();

		if(escolha==1) {
			preco=preco*0.85;
			System.out.print("O preço total (com desconto) fica: "+preco);
		}
		if(escolha==2) {
			preco=preco*0.90;
			System.out.print("O preço total (com desconto) fica: "+preco);
		}
		if(escolha==3) {
			System.out.print("O preço de cada parcela fica: "+(preco/6));
			System.out.print("O preço total fica: "+preco);
		}
		if(escolha==4) {
			System.out.print("O preço de cada parcela fica: "+(preco/12));
			System.out.print("O preço total (com acrécimo) fica: "+(preco*1.08));
		
		}
	}
}

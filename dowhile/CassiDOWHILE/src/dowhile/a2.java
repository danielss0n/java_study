package dowhile;

import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cod, veic, aci, cont = 0, maior = 0, menor = 999999999;
		double mediaVeic, somaVeic = 0, mediaAci, somaAci = 0,indice;
		do {
			System.out.println("Codigo da cidade:");
			cod = sc.nextInt();

			System.out.println("n�mero de ve�culos de passeio:");
			veic = sc.nextInt();

			System.out.println("n�mero de acidentes de tr�nsito com v�timas");
			aci = sc.nextInt();
			
			indice = (aci/(double)veic)*100;
			
			if(indice>maior) {
				maior = (int) indice;
			}
			if(indice<menor) {
				menor = (int) indice;
			}
			
			somaVeic += veic;
			
			if(veic<2000) {
				somaAci += aci;
			}
			
			cont++;
		} while (cont < 5);
		mediaVeic = somaVeic / cont;
		mediaAci = somaAci / cont;
		
		System.out.println("Maior �ndice: "+maior
				+"%\nMenor �ndice: "+menor
				+"%\nMedia de ve�culos na cidade: "+mediaVeic
				+"\nMedia de acidentes nas cidades com menos de 2000 ve�culos: "+mediaAci);
		sc.close();

	}
}

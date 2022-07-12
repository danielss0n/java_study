package dowhile;

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero para ver se ele é primo: ");
		int num = sc.nextInt();
		
		do {
			System.out.println("Entre com um numero ");
			num = sc.nextInt();
			for (int i = 2; i <= num; i++) {
				String primo = "primo";
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						primo = "não primo";
					}
				}
				if (primo == "primo") {
					System.out.println(i);
				}
			}

		} while (num >= 1);
	}
}



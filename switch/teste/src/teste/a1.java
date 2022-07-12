package teste;

import java.util.Scanner;

public class a1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("qual seu salario: ");
		int salario = sc.nextInt();
		
		System.out.print("qual seu cargo: 1 para escrituario, 2 para secretario, 3 para caixa, 4 gerente, 5 para diretor");
		int cargo = sc.nextInt();
		
		switch(cargo) {
		case 1:
			System.out.print("seu novo salario com +50% é: " +(salario*1.50));
			break;
		case 2:
			System.out.print("seu novo salario com +35% é: " +(salario*1.35));
			break;
		case 3:
			System.out.print("seu novo salario com +20% é: " +(salario*1.20));
			break;
		case 4:
			System.out.print("seu novo salario com +10% é: " +(salario*1.10));
			break;
		case 5:
			System.out.print("seu novo salario com +0% é: " +salario);
			break;
		}
	}
}

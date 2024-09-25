package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		

		try {
			
			System.out.print("Digite o primeiro parâmetro: ");
			int parametroUm = sc.nextInt();
			System.out.print("Digite o segundo parâmetro: ");
			int parametroDois = sc.nextInt();
			
			if (parametroUm >= parametroDois) {
				throw new InputMismatchException();
			}
			else {
				for (int i = parametroUm; i < parametroDois; i++) {
					System.out.println("Imprimindo o número: " + i);
				}
			}
		} 
		catch (InputMismatchException e) {
			 System.out.println("O segundo parâmetro deve ser maior que o primeiro!!");
		}
		finally {
			sc.close();
		}

	}

}

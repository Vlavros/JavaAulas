package br.com.elaborata.exercicios.sobrecarga;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularJuros {
	/**
	 * Criar a classe principal que solicite o capital, a taxa e o periodo e
	 * depois mostre na tela o juros simples e o juros composto. Tratar as
	 * exceções desse programa: 20/11/2018
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double c = 0;
		float i = 0;
		int n = 0;

		do {
			try {
				
				System.out.println("Informe o capital: ");
				c = scanner.nextDouble();

				System.out.println("Informe a taxa de juros: ");
				i = scanner.nextFloat();

				System.out.println("Informe o número de períodos: ");
				n = scanner.nextInt();
				
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("Valor informado é inválido, tente novamente.");
				scanner.nextLine();
			}

		} while (true);

		scanner.close();

		Double simples = Juros.jurosSimples(c, i, n);
		Double composto = Juros.jurosCompostos(c, i, n);

		System.out.printf("A taxa de juros simples é: %.4f \n", simples);
		System.out.printf("A taxa de juros composto é: %.4f \n", composto);

	}
}

package br.com.elaborata.exercicios.sobrecarga;
import java.util.Scanner;

public class AreaTriangulo {
	
	/**
	 * Escreva um programa para calcular a área de um triângulo. O programa deve
	 * solicitar que o usuário digite a base e a altura do triângulo, efetuar o calculo da área e
	 * depois mostrar o resultado na tela. A fórmula para calcular a área de um triângulo é:
	 *	A = (Base x Altura) / 2.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a base do triâgulo: ");
		int base = scanner.nextInt();
		System.out.println("Entre com a altura do triâgulo: ");
		int altura = scanner.nextInt();
		System.out.println("A área do triângulo é " + ((base*altura)/2));
		
		scanner.close();
	}
}

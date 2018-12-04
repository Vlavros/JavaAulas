package br.com.elaborata.exemplos.area;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//FiguraGeometrica circulo = new Circulo();
		
		Map<Integer, FiguraGeometrica> map = new HashMap<Integer, FiguraGeometrica>();
		FiguraGeometrica figura;
		
		int opcao = 0;
		double linha = 0, altura = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Informe a forma geometrica desejada: ");
			System.out.println("1 - Circulo");
			System.out.println("2 - Quadrado");
			System.out.println("3 - Triangulo");
			System.out.println("4 - Sair");
			
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Informe o raio do circulo: ");
				linha = scanner.nextDouble();
				figura = new Circulo(linha);
				map.put(opcao, figura);
				break;
				
			case 2:
				System.out.println("Informe o tamanho dos lados do quadrado: ");
				linha = scanner.nextDouble();
				figura = new Quadrado(linha);
				map.put(opcao, figura);
				break;				
				
			case 3:
				System.out.println("Informe o comprimento do triangulo: ");
				linha = scanner.nextDouble();
				System.out.println("Informe a altura do triangulo: ");
				altura = linha = scanner.nextDouble();
				figura = new Triangulo(linha,altura);
				map.put(opcao, figura);				
				break;
				
			case 4:
				break;
				
			default:
				System.out.println("Opção inválida.");
				break;
			}
			
			
		} while (opcao != 4);
		
		scanner.close();
		
		/*
		for (Map.Entry<String, String> entry : map.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		*/
		
	}

}

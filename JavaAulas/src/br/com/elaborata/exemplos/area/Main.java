package br.com.elaborata.exemplos.area;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Map<Integer, List<FiguraGeometrica>> map = new LinkedHashMap<Integer, List<FiguraGeometrica>>();
		List<FiguraGeometrica> figura = null;

		int opcao = -1;
		double linha = 0, altura = 0;

		Scanner scanner = new Scanner(System.in);

		do {

			System.out.println("Informe a forma geometrica desejada: ");
			System.out.println("0 - Sair"); // para caso o menu cresça
			System.out.println("1 - Circulo");
			System.out.println("2 - Quadrado");
			System.out.println("3 - Triangulo");

			try {
				opcao = scanner.nextInt();
			} catch (Exception e) {
				scanner.nextLine();
				opcao = -1;
			};

			figura = map.get(opcao);
			if (figura == null)
				figura = new ArrayList<FiguraGeometrica>();
			
			
			switch (opcao) {
			case 1:
				System.out.println("Informe o raio do circulo: ");
				linha = scanner.nextDouble();
				figura.add(new Circulo(linha));
				map.put(opcao, figura);
				break;

			case 2:
				System.out.println("Informe o tamanho dos lados do quadrado: ");
				linha = scanner.nextDouble();
				figura.add(new Quadrado(linha));
				map.put(opcao, figura);
				break;

			case 3:
				System.out.println("Informe o comprimento do triangulo: ");
				linha = scanner.nextDouble();
				System.out.println("Informe a altura do triangulo: ");
				altura = scanner.nextDouble();
				figura.add(new Triangulo(linha, altura));
				map.put(opcao, figura);
				break;

			case 0:
				break;

			default:
				System.out.println("Opção inválida.");
				scanner.nextLine();
				break;
			}

		} while (opcao != 0);

		scanner.close();
		
		//System.out.println(map.entrySet());
		//Map.Entry

		//Map.Entry<Integer, List<FiguraGeometrica>> a = (Entry<Integer, List<FiguraGeometrica>>) map.entrySet();
		//System.out.println(a.getKey());

		for (Map.Entry<Integer, List<FiguraGeometrica>> entry : map.entrySet()) {
			System.out.print(entry.getKey());
			if (entry.getKey() == 1) {
				System.out.println(" - Circulo");
			} else if (entry.getKey() == 2) {
				System.out.println(" - Quadrado");
			} else if (entry.getKey() == 3) {
				System.out.println(" - Triangulo");
			}
			figura = entry.getValue();
			for (FiguraGeometrica f : figura) {
				System.out.println(f.mostrarFormula() + " = " + f.calcularArea());
			}

		}

	}

}

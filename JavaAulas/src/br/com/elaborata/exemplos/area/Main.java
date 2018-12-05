package br.com.elaborata.exemplos.area;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//FiguraGeometrica circulo = new Circulo();
		
		Map<Integer, ArrayList<FiguraGeometrica>> map = new HashMap<Integer, ArrayList<FiguraGeometrica>>();
		ArrayList<FiguraGeometrica> figura;
		
		/*
		figura = new ArrayList<FiguraGeometrica>();
		map.put(1, figura);
		figura = new ArrayList<FiguraGeometrica>();
		map.put(2, figura);
		figura = new ArrayList<FiguraGeometrica>();
		map.put(3, figura);
		*/
		
		figura = null;
		
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
			
			figura = map.get(opcao);
			if(figura == null) 	figura = new ArrayList<FiguraGeometrica>();
			
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
				figura.add(new Triangulo(linha,altura));
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
		
		for (Map.Entry<Integer, ArrayList<FiguraGeometrica>> entry : map.entrySet()) {
			System.out.print(entry.getKey());
			if(entry.getKey() == 1) {
				System.out.println(" - Circulo");
			} else if(entry.getKey() == 2) {
				System.out.println(" - Quadrado");
			} else if(entry.getKey() == 3) {
				System.out.println(" - Triangulo");
			}
			figura = entry.getValue();
			for(FiguraGeometrica f : figura) {
				System.out.print(f.mostrarFormula() + " = ");
				System.out.println(f.calcularArea());
			}
			
		}
		
	}

}

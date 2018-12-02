package br.com.elaborata.exemplos.listas;

import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(10);
		lista.add(20);
		lista.add(30);
		
		for (Integer i : lista) { //for iterator
			System.out.println(i);
		}
		
		System.out.println(lista.get(2));
	}

}

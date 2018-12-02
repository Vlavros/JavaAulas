package br.com.elaborata.exemplos.listas;

import java.util.LinkedList;

public class TesteLinkedList {

	public static void main(String[] args) {
		//Integer
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		lista.add(10);
		lista.add(20);
		lista.add(30);
		
		lista.addFirst(40);
		
		lista.addLast(5);
		
		for (Integer i : lista) { //for iterator
			System.out.println(i);
		}
		
		System.out.println(lista.get(2));
	}

}

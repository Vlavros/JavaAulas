package br.com.elaborata.exemplos.listas;

import java.util.ArrayList;
import java.util.Iterator;

public class TesteIterator {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(10);
		lista.add(20);
		lista.add(30);
		
		for (Iterator<Integer> it = lista.iterator(); it.hasNext();) {
			//int i = it.next();
			System.out.println(it.next());
			
		}
		
	}

}

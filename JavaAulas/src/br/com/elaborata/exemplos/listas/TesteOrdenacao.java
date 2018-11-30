package br.com.elaborata.exemplos.listas;

import java.util.ArrayList;
import java.util.Collections;

public class TesteOrdenacao {
	public static void main(String[] args) {
		ArrayList<String> stuff = new ArrayList<String>();
		
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vali");
		stuff.add("Aspenr");
		stuff.add("Telluride");
		
		System.out.println("Desordenado: " + stuff);
		
		Collections.sort(stuff); //Arrays.sort -> para array
		
		
		System.out.println("Ordenado: " + stuff);
		
	}
	
}

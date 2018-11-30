package br.com.elaborata.exemplos.listas;

import java.util.HashSet;
import java.util.Set;

public class TesteHasSet {

	public static void main(String[] args) {
		boolean[] ba = new boolean[5];
		Set s = new HashSet();
		ba[0] = s.add("a");
		ba[1] = s.add("a");
		ba[2] = s.add("b");
		ba[3] = s.add("a");
		ba[4] = s.add("c");
		
		//for (Object object : s) {
			System.out.println(s);
		//}
		
	}

}

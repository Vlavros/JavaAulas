package br.com.elaborata.exemplos.designpatterns;

public class Teste {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		Singleton g = Singleton.getInstance();
		
		s.setA(12);
		System.out.println(g.getA());
		
		s.setTesteString("Teste");
		s.teste();
		
		Singleton w = Singleton.getInstance();
		System.out.println(w.getA());
		
		
		//Singleton s2 = new Singleton();		
		//System.out.println(s2.getA());
				
		
	}

}

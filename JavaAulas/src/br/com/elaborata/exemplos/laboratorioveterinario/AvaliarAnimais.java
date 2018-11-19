package br.com.elaborata.exemplos.laboratorioveterinario;

public class AvaliarAnimais {
	
	public static void main(String[] args) {
		
		avaliarBicho(new Cao());
		System.out.println();
		avaliarBicho(new Gato());
		
	}
	
	public static void avaliarBicho(Animal animal) {
		if(animal instanceof Cao) {
			System.out.print("Som do cão: "); 
		} else if(animal instanceof Gato) {
			System.out.print("Som do gato: "); 
		} else {
			System.out.print("Som do animal não identificado: ");
		}
		
		System.out.println("Habito alimentar: " + animal.emitirSom());
		System.out.println("Habito alimentar: " + animal.habitoAlimentar());
	}
	
}

package br.com.elaborata.exemplos.laboratorioveterinario;

public class Gato extends Animal {

	@Override
	public String emitirSom() {
		return "Miado";
	}

	@Override
	public String habitoAlimentar() {
		return "3 vezes ao dia";
	}
	
	
}

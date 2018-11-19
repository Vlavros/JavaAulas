package br.com.elaborata.exemplos.laboratorioveterinario;

public class Cao extends Animal {

	@Override
	public String emitirSom() {
		return "Latido";
	}

	@Override
	public String habitoAlimentar() {
		return "5 vezes ao dia";
	}

}

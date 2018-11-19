package br.com.elaborata.exemplos.polimorfismo;

public class Subtracao extends OperacaoMatematica {

	@Override
	public double calcular(double valor1, double valor2) {
		return valor1 - valor2;
	}

}

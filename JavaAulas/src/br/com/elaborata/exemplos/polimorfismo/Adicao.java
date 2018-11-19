package br.com.elaborata.exemplos.polimorfismo;

public class Adicao extends OperacaoMatematica {
	
	public String var1;
	
	@Override
	public double calcular(double valor1, double valor2) {
		return valor1+valor2;
	}
	
	
}

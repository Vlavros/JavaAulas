package br.com.elaborata.exercicios.sobrecarga;

public class Juros {
	
	public static double jurosSimples(double c, float i, int n){
		return c + (c * (i/100) * n);
	}
		
	public static double jurosCompostos(double c, float i, int n){
		return c * Math.pow(1 + (i/100), n);
	}
	
}

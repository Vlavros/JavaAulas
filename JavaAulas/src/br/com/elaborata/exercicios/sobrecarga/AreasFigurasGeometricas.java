package br.com.elaborata.exercicios.sobrecarga;

public class AreasFigurasGeometricas {
	
	public static int calcularAreaQuadrado(int lado){
		return lado * lado;
	}
	
	public static float calcularAreaQuadrado(float lado){
		return lado * lado;
	}	
	
	public static Double calcularAreaQuadrado(Double lado){
		return lado * lado;
	}		
	
	public static Double calcularAreaCirculo(int raio) {
		return (raio * raio) * Math.PI;
	}
	
	public static Double calcularAreaCirculo(float raio) {
		return (raio * raio) * Math.PI;
	}	
	
	
	
}

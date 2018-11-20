package br.com.elaborata.exercicios.sobrecarga;

public class CalcularAreas {

	public static void main(String[] args) {
		
		int AreaQuadradoI = AreasFigurasGeometricas.calcularAreaQuadrado(20);
		
		float AreaQuadradoF = AreasFigurasGeometricas.calcularAreaQuadrado(20.1f);
		
		System.out.println("Área do quadrado de tamanho 20 é: " + AreaQuadradoI);
		
		System.out.println("Área do quadrado de tamanho 20 é: " + AreaQuadradoF);
		
		
	}

}

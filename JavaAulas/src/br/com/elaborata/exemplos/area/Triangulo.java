package br.com.elaborata.exemplos.area;

public class Triangulo extends FiguraGeometrica {
	
	private double altura;
	
	public Triangulo(double comprimento, double altura) {
		super(comprimento);
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (this.altura * super.getLinha())/2;
	}

}

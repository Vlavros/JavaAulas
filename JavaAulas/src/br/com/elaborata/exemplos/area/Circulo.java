package br.com.elaborata.exemplos.area;

public class Circulo extends FiguraGeometrica {

	public Circulo(double raio) {
		super(raio);
	}

	@Override
	public double calcularArea() {
		return Math.pow(Math.PI*super.getLinha(), 2);
	}

	@Override
	public String mostrarFormula() {
		return "(" + Math.PI + " x " + super.getLinha() + ") ^ 2";
	}

}

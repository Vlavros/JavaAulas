package br.com.elaborata.exemplos.area;

public class Quadrado extends FiguraGeometrica {

	public Quadrado(double lado) {
		super(lado);
		
	}

	@Override
	public double calcularArea() {
		return super.getLinha() * super.getLinha();
	}

}

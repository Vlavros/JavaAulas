package br.com.elaborata.exemplos.area;

public abstract class FiguraGeometrica {
	
	private double linha;
	
	public FiguraGeometrica(double linha) {
		this.setLinha(linha);
	}
	
	public abstract double calcularArea();

	public double getLinha() {
		return linha;
	}

	public void setLinha(double linha) {
		this.linha = linha;
	}
	
	
}

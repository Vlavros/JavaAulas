package br.com.elaborata.exercicios.locadoraveiculos;

public abstract class Veiculo {
	
	protected String marca;
	protected String modelo;
	protected Double precoLocacao;
	
	public Veiculo(String marca, String modelo, Double precoLocacao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precoLocacao = precoLocacao;
	}

	public abstract void reajustarPrecoLocacao();

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPrecoLocacao() {
		return precoLocacao;
	}

	public void setPrecoLocacao(Double precoLocacao) {
		this.precoLocacao = precoLocacao;
	}
	
	
	
}

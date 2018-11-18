package br.com.vlavros.exercicios.homework;

public class Processador {
	private String marca;
	private Double velocidade;

	public Processador(String marca, Double velocidade) {
		super();
		this.marca = marca;
		this.velocidade = velocidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}

}

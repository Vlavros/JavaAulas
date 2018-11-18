package br.com.vlavros.exercicios.homework;

public class Monitor {

	private String marca;
	private String modelo;
	private String tipo;
	private Double tamanho;
	
	public Monitor(String marca, String modelo, String tipo, Double tamanho) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.tamanho = tamanho;
	}

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}



}

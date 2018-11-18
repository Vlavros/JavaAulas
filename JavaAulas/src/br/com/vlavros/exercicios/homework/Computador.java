package br.com.vlavros.exercicios.homework;

public class Computador {
	private String marca;
	private String modelo;
	private Processador processador;
	private Monitor monitor;
	
	public Computador(String marca, String modelo, Processador processador, Monitor monitor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.processador = processador;
		this.monitor = monitor;
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

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
}

package br.com.vlavros.exercicios.homework;

public class Carro {
	// Atributos
	private String marca;
	private String modelo;
	private String cor;
	private Double valor;
	private Double valorFabrica;
	private Double capacidadeTanqueEmLitros;
	private Double quilometrosPorLitro;
	private final Double PERCDISTRIBUIDOR = 28.0;
	private final Double PERCIMPOSTO = 45.0;
	
	public Carro(String marca, String modelo, String cor, Double valorFabrica) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.valorFabrica = valorFabrica;
	}

	/**
	 * Entrada de dados Exercício 01 – Preço Consumidor O preço consumidor de um
	 * carro novo é a soma do custo de fábrica com a percentagem do distribuidor e
	 * dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do
	 * distribuidor seja de 28% e os impostos sobre o custo de fábrica seja de 45%,
	 * crie um programa que leia o custo de fábrica de um determinado carro e depois
	 * mostre na tela o preço consumidor.
	 */
	public Double calcularPrecoConsumidor() {
		if (this.valorFabrica != null && this.valorFabrica != 0) {
			return this.valorFabrica + (this.valorFabrica * (this.PERCDISTRIBUIDOR / 100))
					+ (this.valorFabrica * (this.PERCIMPOSTO / 100));
		} else {
			return 0.0;
		}
	}

	/**
	 * Exemplo do professor, capacidadeTanqueEmLitros * quilometrosPorLitro
	 * 
	 * @return
	 */
	public Double calcularAutonomia() {
		return this.capacidadeTanqueEmLitros * this.quilometrosPorLitro;
	}

	public Double getValorFabrica() {
		return valorFabrica;
	}

	public void setValorFabrica(Double valorFabrica) {
		this.valorFabrica = valorFabrica;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getCapacidadeTanqueEmLitros() {
		return capacidadeTanqueEmLitros;
	}

	public void setCapacidadeTanqueEmLitros(Double capacidadeTanqueEmLitros) {
		this.capacidadeTanqueEmLitros = capacidadeTanqueEmLitros;
	}

	public Double getQuilometrosPorLitro() {
		return quilometrosPorLitro;
	}

	public void setQuilometrosPorLitro(Double quilometrosPorLitro) {
		this.quilometrosPorLitro = quilometrosPorLitro;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}

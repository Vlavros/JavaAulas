package br.com.elaborata.exercicios.formulario.imc;

/**
 * Classifica��o IMC Criar um programa para mostrar na tela a classifica��o do
 * usu�rio de acordo com o �ndice de massa corporal. O IMC � calculado pela
 * f�rmula IMC = (PESO / ALTURA^2). O programa dever� solicitar ao usu�rio o
 * peso e a altura e mostrar na tela o �ndice calculado e a classifica��o de
 * acordo com a tabela abaixo.
 * 
 * @author Vlavros
 *
 */
public class IndiceMassaCorporal {

	private Double imc;
	private Double altura;
	private Double peso;
	private final String[] CLASSIFICACAO = { "Magro", "Normal", "Pre-Obeso", "Obeso" };
	
	public IndiceMassaCorporal(Double altura, Double peso) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.imc = calcularIMC();
	}
	
	public Double calcularIMC() {
		return this.peso/Math.pow(this.altura, 2);
	}
	
	public String getClassificacao() {
		if(this.imc != null) {
			if(this.imc < 18.5) {
				return CLASSIFICACAO[0];
			} else if(this.imc < 24.9) {
				return CLASSIFICACAO[1];
			} else if(this.imc < 29.9) {
				return CLASSIFICACAO[2];
			} else {
				return CLASSIFICACAO[3];
			}
		} else {
			return "Invalido";
		}
	}

	public Double getImc() {
		return imc;
	}

	public void setImc(Double imc) {
		this.imc = imc;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

}

package br.com.vlavros.exercicios.homework;

/**
 * Exercício 01 - Temperatura mínima e máxima Criar um programa que armazene
 * temperaturas num vetor e depois mostre na tela a menor e a maior temperatura.
 * As temperaturas que devem ser armazenadas no vetor estão relacionadas abaixo.
 * 27,8 26,9 24,7 26,9 25,8 27,6 23,0 21,2 29,1 25.4
 * 
 * @author Vlavros
 *
 */
public class Vetores {
	public static Double[] organizarVetor(Double[] vetor) {
		Double[] organizado = new Double[vetor.length];
		Integer posicao = null;
		for (int i = 0; i < organizado.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if(vetor[j] != null && (organizado[i] == null || vetor[j] <= organizado[i])) {
					organizado[i] = vetor[j];
					posicao = j;
				}
			}
			if(posicao != null) {
				vetor[posicao] = null;
			}
		}
		return organizado;
	}
	
	/**
	 * Retorna a posicao do vetor com o menor numero.
	 * @param vetor
	 * @return
	 */
	public static Integer posicaoMaiorVetor(Integer vetor[]) {
		Integer maior = null;
		Integer posicao = null;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null && (maior == null || vetor[i] > maior)) {
				maior = vetor[i];
				posicao = i;
			}
		}
		return posicao;		
	}

	public static Double menorVetor(Double[] vetor) {
		Double menor = null;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null && (menor == null || vetor[i] < menor)) {
				menor = vetor[i];
			}
		}
		return menor;
	}
	
	public static Integer menorVetor(Integer[] vetor) {
		Integer menor = null;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null && (menor == null || vetor[i] < menor)) {
				menor = vetor[i];
			}
		}
		return menor;
	}	

	public static Double maiorVetor(Double[] vetor) {
		Double maior = null;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null && (maior == null || vetor[i] > maior)) {
				maior = vetor[i];
			}
		}
		return maior;
	}
	
	public static void printVetor(Double[] vetor) {
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]); 
			if(i != vetor.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

}

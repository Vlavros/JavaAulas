package br.com.elaborata.exemplos.execoes;

public class TratamentoExcecoes {

	public static void main(String[] args) {

		//exemploEspecificoException();
		exemploGenericoException();

	}

	public static void exemploGenericoException() {
		int[] numeros = new int[2];

		try {
			numeros[0] = 10;
			numeros[1] = 0;
			//numeros[2] = 0;

			float result = numeros[0] / numeros[1];

			System.out.println(result);

		} catch (Exception e) {
			if (e instanceof ArithmeticException) {
				System.out.println("Divisão por zero.");
			} else {
				System.out.println("Ocorreu um erro.");
			}

		} finally {
			System.out.println("acabou");
		}		
	}
	
	public static void exemploEspecificoException() {
		int[] numeros = new int[2];

		try {
			numeros[0] = 10;
			numeros[1] = 0;
			//numeros[2] = 0;

			float result = numeros[0] / numeros[1];
			System.out.println(result);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida do vetor.");

		} catch (ArithmeticException e) {
			System.out.println("Operação aritmética inválida. Divisão por zero.");

		}
	}
}

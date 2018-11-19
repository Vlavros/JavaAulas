package br.com.elaborata.exemplos.polimorfismo;

public class Operacoes {

	public static void main(String[] args) {
		/*
		Adicao adicao1 = new Adicao();
		System.out.println(adicao1.calcular(10, 10));
		
		Subtracao subtracao1 = new Subtracao();
		System.out.println(subtracao1.calcular(10, 5));
		
		processar(adicao1,10,10);
		processar(subtracao1,10,10);
		*/
		
		processar(new Adicao(),10,10);
		
		processar(new Subtracao(),10,10);		
		
		
	}
	
	private static void processar(OperacaoMatematica operacao, double valor1, double valor2) {
		String tipoOperacao;
		
		if(operacao instanceof Adicao) {
			tipoOperacao = "Adição";
		} else if(operacao instanceof Subtracao) {
			tipoOperacao = "Subtração";
		} else {
			tipoOperacao = "Não definido";
		}
		
		
		System.out.println("Resultado da " + tipoOperacao + ": " + operacao.calcular(valor1,valor2));
	}

}

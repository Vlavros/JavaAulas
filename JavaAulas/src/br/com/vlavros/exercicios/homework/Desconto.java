package br.com.vlavros.exercicios.homework;

/**
 * Tabela de descontos Criar um programa que aplique um desconto no valor da
 * venda de acordo com a forma de pagamento escolhida pelo usuário. O programa
 * deverá solicitar o valor da venda e depois mostrar o menu de formas de
 * pagamento. O usuário deverá escolher uma das formas de pagamento e o programa
 * deverá mostrar o valor do desconto calculado. O programa deve mostrar o
 * seguinte menu.
 * 
 * @author Vlavros
 *
 */

public class Desconto {
	private final static String[] TPDESCONTO = { "1 - Venda a Vista - desconto de 10%",
			"2 - Venda a Prazo 30 dias - desconto 5%", "3 - Venda a Prazo 60 dias - desconto 3%",
			"4 - Venda a Prazo 90 dias - memso preço" };
	private final static Double[] VLDESCONTO = { 10.0, 5.0, 3.0, 0.0 };

	public static Double calcularDesconto(Double valor, Integer opcao) {
		if (opcao != null && opcao - 1 < VLDESCONTO.length && opcao > 0) {
			return valor - (valor * (VLDESCONTO[opcao - 1] / 100));
		} else {
			return null;
		}

	}

	public static void exibeMenu() {
		for (int i = 0; i < TPDESCONTO.length; i++) {
			System.out.println(TPDESCONTO[i]);
		}
	}

}

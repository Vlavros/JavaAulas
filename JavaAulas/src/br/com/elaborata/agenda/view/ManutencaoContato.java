package br.com.elaborata.agenda.view;

import br.com.elaborata.agenda.util.Leitor;

public class ManutencaoContato {

	public static void manterContato() {

		while (true) {
			// Menu
			System.out.println();
			System.out.println("Seleção de Contatos");
			System.out.println("1 - Inclusão de Contato");
			System.out.println("2 - Atualização de Contato");
			System.out.println("3 - Exclusão de Contato");
			System.out.println("4 - Consulta de Contato por Telefone");
			System.out.println("5 - Consulta de Contato por Nome");
			System.out.println("0 - Fim ");
			System.out.println();

			int tOpcao = Leitor.readInt("Entre com a opção desejada: ");

			System.out.println();

			switch (tOpcao) {
			case 0:
				return;
			case 1:
				
				incluirContato();
				break;
			case 2:
				
				alterarContato();
				break;
			case 3:
				
				excluirContato();
				break;
			case 4:
				
				consultarPorTelefone();
				break;
			case 5:
				
				consultarPorNome();
				break;
			default:
				System.err.println("Opção inválida");
				break;
			}

		}

	}

	private static void consultarPorNome() {
		// TODO Auto-generated method stub
		System.out.println("Consulta Nome");

	}

	private static void consultarPorTelefone() {
		// TODO Auto-generated method stub
		System.out.println("Consulta Telefone");

	}

	private static void excluirContato() {
		// TODO Auto-generated method stub
		System.out.println("Exclusão");

	}

	private static void incluirContato() {
		// TODO Auto-generated method stub
		System.out.println("Inclusão");

	}

	private static void alterarContato() {
		// TODO Auto-generated method stub
		System.out.println("Atualização");

	}

}

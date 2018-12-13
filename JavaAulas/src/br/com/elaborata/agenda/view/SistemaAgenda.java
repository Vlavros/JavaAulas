package br.com.elaborata.agenda.view;

import br.com.elaborata.agenda.util.Leitor;

public class SistemaAgenda {

	public static void main(String[] args) {
		
		
		while(true) {
			//Menu
			System.out.println();
			System.out.println("Sistema de Controle de Agenda/Compromisso");
			System.out.println();
			System.out.println("Seleção de Cadastro");
			System.out.println("C - Contato ");
			System.out.println("A - Agenda ");
			System.out.println("F - Fim ");
			System.out.println();
			
			String tOpcao = Leitor.readString("Entre com a opção desejada: ");
			
			System.out.println();
			
			switch (tOpcao.toUpperCase()) {
			case "C":
				System.out.println("Manutenção de Contato");
				ManutencaoContato.manterContato();
				break;
			case "A":
				System.out.println("Manutenção de Agenda");
				break;
			
			case "F":
				System.out.println("Fim de Execução");
				System.exit(0);
				
			default:
				System.err.println("Opção inválida");
				break;
			}
					
					
		}
	}

}

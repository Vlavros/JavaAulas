package br.com.professor.agenda.view;

import br.com.professor.agenda.util.Leitor;

public class SistemaAgenda
{
    public static void main(String[] args)
    {
        while (true)
        {
            // Mostrar o menu
            System.out.println();
            System.out.println("Sistema de Controle de Agenda/Compromisso");
            System.out.println("Sele��o de Cadastro");
            System.out.println();
            System.out.println("C - Contato");
            System.out.println("A - Agenda");
            System.out.println("F - Fim");
            System.out.println();

            // Ler a op��o desejada
            String tOpcao = Leitor.readString("Entre com a opcao desejada : ");
            switch (tOpcao.toUpperCase())
            {
                case "C":
                    ManutencaoContato.manterContato();
                    break;
                case "A":
                    System.out.println("Manutencao de Agenda");
                    break;
                case "F":
                    System.out.println("Fim de Execusao");
                    System.exit(0); // Encerra a aplica��o

                default:
                    System.err.println();
                    System.err.println("Opcao invalida. Reentre");
                    break;
            }
        }
    }
}

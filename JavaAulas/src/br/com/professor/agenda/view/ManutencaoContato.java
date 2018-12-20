package br.com.professor.agenda.view;

import br.com.professor.agenda.controller.ContatoController;
import br.com.professor.agenda.dto.ContatoDto;
import br.com.professor.agenda.model.Contato;
import br.com.professor.agenda.util.Leitor;

public class ManutencaoContato
{
    private static char[]    sSimNao   = {'S', 'N', 's', 'n'};

    public static void manterContato()
    {
        while (true)
        {
            mostrarMenu();
            System.out.println();
            System.out.println("1 - Inclusao de Contato");
            System.out.println("2 - Alteracao de Contato");
            System.out.println("3 - Exclusao de Contato");
            System.out.println("4 - Consulta de Contato por Telefone");
            System.out.println("5 - Consulta de Contato por Nome");
            System.out.println("9 - Fim");
            System.out.println();

            // Ler a op��o desejada
            int tOpcao = Leitor.readInt("Entre com a opcao desejada : ");
            switch (tOpcao)
            {
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
                case 9:
                    return;
                default:
                    System.err.println();
                    System.err.println("Opcao invalida. Reentre");
                    break;
            }
        }
    }

    private static void incluirContato()
    {
        mostrarMenu();
        System.out.println("Inclusao de Contatos");
        System.out.println();

        // Lendo as informa��es do contato
        long tTelefone = 0;
        String tNome = "";
        String tEmail = "";
        String tEndereco = "";

        while(true)
        {
            String tTelefoneStr = Leitor.readString("Telefone : ");
            tTelefoneStr = tTelefoneStr.replaceAll("[- ()]", "");
            String tErro = consistirTelefone(tTelefoneStr);
            if (tErro.isEmpty())
            {
                tTelefone = Long.parseLong(tTelefoneStr);
                break;
            }
            System.out.println();
            System.out.println(tErro);
        }

        while(true)
        {
            tNome = Leitor.readString("Nome.... : ");
            String tErro = consistirNome(tNome);
            if (tErro.isEmpty())
            {
                break;
            }
            System.out.println();
            System.out.println(tErro);
        }

        while(true)
        {
            tEmail = Leitor.readString("E-mail.. : ");
            String tErro = consistirEmail(tEmail);
            if (tErro.isEmpty())
            {
                break;
            }
            System.out.println();
            System.out.println(tErro);
        }

        while(true)
        {
            tEndereco = Leitor.readString("Endereco : ");
            String tErro = consistirEndereco(tEndereco);
            if (tErro.isEmpty())
            {
                break;
            }
            System.out.println();
            System.out.println(tErro);
        }

        System.out.println();
        char tConf = Leitor.readChar("Confirma a operacao (S/N) : ", sSimNao);

        if (Character.toUpperCase(tConf) == 'S')
        {
            // Chamando a camada de neg�cio
            ContatoController tController = new ContatoController();

            ContatoDto tDto = tController.inserirContato(tTelefone, tNome, tEmail, tEndereco);
            if (tDto.isOk())
            {
                System.out.println();
                System.out.println(tDto.getMensagem());
                Contato tContato = tDto.getContato();
                System.out.println("Id do Contato Gerado :" + tContato.getId());
            }
            else
            {
                System.out.println();
                System.out.println("Erro");
                System.out.println(tDto.getMensagem());
            }
        }
        else
        {
            System.out.println();
            System.out.println("Operacao cancelada pelo usuario");
        }
    }

    private static void alterarContato()
    {
        mostrarMenu();
        System.out.println("Alteracao de Contatos");
        System.out.println();
        
        long tTelefone = 0;
        String tNome;
        String tEmail;
        String tEndereco;

        while(true)
        {
            String tTelefoneStr = Leitor.readString("Telefone : ");
            tTelefoneStr = tTelefoneStr.replaceAll("[- ()]", "");
            String tErro = consistirTelefone(tTelefoneStr);
            if (tErro.isEmpty())
            {
                tTelefone = Long.parseLong(tTelefoneStr);
                break;
            }
            System.out.println();
            System.out.println(tErro);
        }
        
        System.out.println();
        
        ContatoController tController = new ContatoController();
        ContatoDto tDto = tController.consultarPorTelefone(tTelefone);
        
        if (tDto.isOk())
        {
            System.out.println();
            Contato tContato = tDto.getContato();
            
            System.out.println("Alterando as informacoes do Contato");
            
            while(true)
            {
                String tTelefoneStr = Leitor.readString("Telefone : ", String.valueOf(tContato.getTelefone()));
                tTelefoneStr = tTelefoneStr.replaceAll("[- ()]", "");
                String tErro = consistirTelefone(tTelefoneStr);
                if (tErro.isEmpty())
                {
                    tTelefone = Long.parseLong(tTelefoneStr);
                    break;
                }
                System.out.println();
                System.out.println(tErro);
            }

            while(true)
            {
                tNome = Leitor.readString("Nome.... : ", tContato.getNome());
                String tErro = consistirNome(tNome);
                if (tErro.isEmpty())
                {
                    break;
                }
                System.out.println();
                System.out.println(tErro);
            }

            while(true)
            {
                tEmail = Leitor.readString("E-mail.. : ", tContato.getEmail());
                String tErro = consistirEmail(tEmail);
                if (tErro.isEmpty())
                {
                    break;
                }
                System.out.println();
                System.out.println(tErro);
            }

            while(true)
            {
                tEndereco = Leitor.readString("Endereco : ", tContato.getEndereco());
                String tErro = consistirEndereco(tEndereco);
                if (tErro.isEmpty())
                {
                    break;
                }
                System.out.println();
                System.out.println(tErro);
            }
            
            char tConf = Leitor.readChar("Confirma a atualizacao do Contato (S/N) : ", sSimNao);

            if (Character.toUpperCase(tConf) == 'S')
            {
            	tContato.setTelefone(tTelefone);
            	tContato.setNome(tNome);
            	tContato.setEmail(tEmail);
            	tContato.setEndereco(tEndereco);
            	
            	// Chamando a camada de negocio
            	tDto = tController.alterarContato(tContato);
            	System.out.println(tDto.getMensagem());
            	
            	
            	
            	if(tDto.isOk()) {
            		System.out.println("Operacao realziada com sucesso");
            	} else {
            		System.err.println("Ocorreu um problema ao tentar atualizar, tente novamente.");
            	}
            	
            }
            else
            {
                System.out.println();
                System.out.println("Operacao cancelada pelo usuario");
            }       
            
        }
        else
        {
            System.out.println();
            System.out.println("Erro");
            System.out.println(tDto.getMensagem());
        }           
        
    }

    private static void excluirContato()
    {
        mostrarMenu();
        System.out.println("Exclusao de Contatos");
        System.out.println();
        
        // Lendo as informa��es do contato
        long tTelefone = 0;

        while(true)
        {
            String tTelefoneStr = Leitor.readString("Telefone : ");
            tTelefoneStr = tTelefoneStr.replaceAll("[- ()]", "");
            String tErro = consistirTelefone(tTelefoneStr);
            if (tErro.isEmpty())
            {
                tTelefone = Long.parseLong(tTelefoneStr);
                break;
            }
            System.out.println();
            System.out.println(tErro);
        }
        
        System.out.println();
        
        ContatoController tController = new ContatoController();

        ContatoDto tDto = tController.consultarPorTelefone(tTelefone);
        if (tDto.isOk())
        {
            System.out.println();
            Contato tContato = tDto.getContato();
            System.out.println("Telefone: " + tContato.getTelefone());
            System.out.println("Nome: " + tContato.getNome());
            System.out.println("E-mail: " + tContato.getEmail());
            System.out.println("Endereco: " + tContato.getEndereco());
            System.out.println(tContato.toString());
            System.out.println();
            
            char tConf = Leitor.readChar("Confirma a exclusão do Contato (S/N) : ", sSimNao);

            if (Character.toUpperCase(tConf) == 'S')
            {
                // Chamando a camada de neg�cio
            	tDto = tController.excluirContato(tContato.getId());
            	System.out.println(tDto.getMensagem());
            	
            	if(tDto.isOk()) {
            		System.out.println("Operacao realziada com sucesso");
            	} else {
            		System.err.println("Ocorreu um problema ao tentar excluir, tente novamente.");
            	}
            	
            }
            else
            {
                System.out.println();
                System.out.println("Operacao cancelada pelo usuario");
            }       
            
        }
        else
        {
            System.out.println();
            System.out.println("Erro");
            System.out.println(tDto.getMensagem());
        }   
              

        
        
    }

    private static void consultarPorTelefone()
    {
        mostrarMenu();
        System.out.println("Pesquisa de Contatos por Telefone");
        System.out.println();
        
        // Lendo as informa��es do contato
        long tTelefone = 0;

        while(true)
        {
            String tTelefoneStr = Leitor.readString("Telefone : ");
            tTelefoneStr = tTelefoneStr.replaceAll("[- ()]", "");
            String tErro = consistirTelefone(tTelefoneStr);
            if (tErro.isEmpty())
            {
                tTelefone = Long.parseLong(tTelefoneStr);
                break;
            }
            System.out.println();
            System.out.println(tErro);
        }
        
        System.out.println();
        char tConf = Leitor.readChar("Confirma a operacao (S/N) : ", sSimNao);

        if (Character.toUpperCase(tConf) == 'S')
        {
            // Chamando a camada de neg�cio
            ContatoController tController = new ContatoController();

            ContatoDto tDto = tController.consultarPorTelefone(tTelefone);
            if (tDto.isOk())
            {
                System.out.println();
                System.out.println(tDto.getMensagem());
                Contato tContato = tDto.getContato();
                System.out.println("Telefone consultado: " + tContato.getTelefone());
                //System.out.println("id:" + tContato.getId());
                System.out.println("Nome: " + tContato.getNome());
                System.out.println("E-mail: " + tContato.getEmail());
                System.out.println("Endereco: " + tContato.getEndereco());
                
                System.out.println(tContato.toString());
                
            }
            else
            {
                System.out.println();
                System.out.println("Erro");
                System.out.println(tDto.getMensagem());
            }
        }
        else
        {
            System.out.println();
            System.out.println("Operacao cancelada pelo usuario");
        }        
        
        
    }

    private static void consultarPorNome()
    {
        mostrarMenu();
        System.out.println("Pesquisa de Contatos por Nome");
        System.out.println();
    }

    private static void mostrarMenu()
    {
        System.out.println();
        System.out.println("Sistema de Controle de Agenda/Compromisso");
        System.out.println("Manutencao de Contatos");
    }

    private static String consistirTelefone(String pTelefoneStr)
    {
        if (!pTelefoneStr.matches("[0-9]{8,11}"))
            return "Telefone deve ter entre 8 e 11 digitos";

        return ""; // Telefone est� ok
    }

    private static String consistirNome(String pNome)
    {
        if (pNome.isEmpty())
            return "Nome obrigatorio";
        if (pNome.length() > 50)
            return "Nome deve ter no maximo 50 caracteres";

        return ""; // Nome est� Ok
    }

    private static String consistirEmail(String pEmail)
    {
        if (pEmail.isEmpty())
            return "E-mail obrigatorio";
        if (pEmail.length() > 50)
            return "E-Mail deve ter no maximo 50 caracteres";
        if (!pEmail.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
            return "Formato invalido do e-mail";

        return ""; // e-mail est� Ok
    }

    private static String consistirEndereco(String pEndereco)
    {
        if (pEndereco.isEmpty())
            return "Nome obrigatorio";
        if (pEndereco.length() > 100)
            return "Endereco deve ter no maximo 100 caracteres";

        return ""; // Endere�o est� Ok
    }
}

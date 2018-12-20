package br.com.professor.agenda.dao.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import br.com.professor.agenda.model.Contato;
import br.com.professor.agenda.util.GeradorNumero;

public class ContatoDaoArquivo implements lerObjeto
{
    public boolean create(Contato pContato)
    {
        try
        {
            // Gerando a chave para o registro
            pContato.setId(GeradorNumero.obterNumero());

            // Criando o arquivo para grava��o
            FileWriter tArquivo1 = new FileWriter(String.format("Contato_%08d.txt", pContato.getId()));
            PrintWriter tArquivo2 = new PrintWriter(tArquivo1);

            // Gravando o objeto no arquivo aberto
            gravarObjeto(pContato, tArquivo2);

            // Fechando o arquivo
            tArquivo2.close();

            // Criando o arquivo que servir� de "�ndice" por telefone para
            // facilitar os processos de neg�cio
            FileWriter tArquivo3 = new FileWriter(String.format("Contato_%011d.idx", pContato.getTelefone()));
            PrintWriter tArquivo4 = new PrintWriter(tArquivo3);
            tArquivo4.println(pContato.getId());
            tArquivo4.close();

            return true;
        }
        catch (IOException tExcept)
        {
            tExcept.printStackTrace();
            return false;
        }
    }

    public Contato recovery(int pId)
    {
        try
        {
            // Verificando se existe o arquivo referente ao Id passado
            File tArquivo1 = new File(String.format("Contato_%08d.txt", pId));
            if (!tArquivo1.exists())
                return null;

            // Abrindo o arquivo para leitura
            FileReader tArquivo2 = new FileReader(tArquivo1);
            BufferedReader tArquivo3 = new BufferedReader(tArquivo2);

            // Lendo cada informa��o de cada linha
            int tId = Integer.parseInt(tArquivo3.readLine());
            long tTelefone = Long.parseLong(tArquivo3.readLine());
            String tNome = tArquivo3.readLine();
            String tEmail = tArquivo3.readLine();
            String tEndereco = tArquivo3.readLine();

            // Fechando o arquivo
            tArquivo3.close();

            // Criando o objeto para retorno e populando ele
            Contato tContato = new Contato();
            tContato.setId(tId);
            tContato.setTelefone(tTelefone);
            tContato.setNome(tNome);
            tContato.setEmail(tEmail);
            tContato.setEndereco(tEndereco);

            // Retornando o objeto criado
            return tContato;
        }
        catch (IOException tExcept)
        {
            tExcept.printStackTrace();
            return null;
        }
    }

    public Contato recoveryByTelefone(long pTelefone)
    {
        try
        {
            // Verificando se existe o arquivo referente ao telefone passado
            File tArquivo1 = new File(String.format("Contato_%011d.idx",pTelefone));
            if (!tArquivo1.exists())
                return null;

            // Lendo o id referente ao telefone
            FileReader tArquivo2 = new FileReader(tArquivo1);
            BufferedReader tArquivo3 = new BufferedReader(tArquivo2);
            int tId = Integer.parseInt(tArquivo3.readLine());
            tArquivo3.close();

            // Verificando se existe o arquivo referente ao Id recuperado
            File tArquivo4 = new File(String.format("Contato_%08d.txt", tId));
            if (!tArquivo4.exists())
                return null;

            // Abrindo o arquivo para leitura
            FileReader tArquivo5 = new FileReader(tArquivo4);
            BufferedReader tArquivo6 = new BufferedReader(tArquivo5);

            // Lendo cada informa��o de cada linha
            tId = Integer.parseInt(tArquivo6.readLine());
            long tTelefone = Long.parseLong(tArquivo6.readLine());
            String tNome = tArquivo6.readLine();
            String tEmail = tArquivo6.readLine();
            String tEndereco = tArquivo6.readLine();

            // Fechando o arquivo
            tArquivo6.close();

            // Criando o objeto para retorno e populando ele
            Contato tContato = new Contato();
            tContato.setId(tId);
            tContato.setTelefone(tTelefone);
            tContato.setNome(tNome);
            tContato.setEmail(tEmail);
            tContato.setEndereco(tEndereco);

            // Retornando o objeto criado
            return tContato;
        }
        catch (IOException tExcept)
        {
            tExcept.printStackTrace();
            return null;
        }
    }

    public boolean update(Contato pContato)
    {
        try
        {
            // Verificando se existe o arquivo referente ao Id passado
            File tArquivo1 = new File(String.format("Contato_%08d.txt", pContato.getId()));
            if (!tArquivo1.exists())
                return false;

            // Criando o arquivo para grava��o
            FileWriter tArquivo2 = new FileWriter(tArquivo1);
            PrintWriter tArquivo3 = new PrintWriter(tArquivo2);

            // Gravando o objeto no arquivo aberto
            gravarObjeto(pContato, tArquivo3);

            // Fechando o arquivo
            tArquivo3.close();

            return true;
        }
        catch (IOException tExcept)
        {
            tExcept.printStackTrace();
            return false;
        }
    }

    public boolean delete(int pId)
    {
        try
        {
            // Verificando se existe o arquivo referente ao Id passado
            File tArquivo1 = new File(String.format("Contato_%08d.txt", pId));
            if (!tArquivo1.exists())
                return false;

            // Abrindo o arquivo para leitura
            FileReader tArquivo2 = new FileReader(tArquivo1);
            BufferedReader tArquivo3 = new BufferedReader(tArquivo2);

            // Lendo cada informa��o de cada linha
            tArquivo3.readLine();  // Desprezando a primeira linha
            long tTelefone = Long.parseLong(tArquivo3.readLine());

            // Fechando o arquivo
            tArquivo3.close();

            // Removendo o arquivo refente ao Id
            if (!tArquivo1.delete())
                return false;

            // Removendo o arquivo referente ao '�ndice'
            File tArquivo4 = new File(String.format("Contato_%011d.idx", tTelefone));
            if (!tArquivo4.exists())
                return false;

            // Removendo o arquivo refente ao '�ndice'
            if (!tArquivo4.delete())
                return false;

            return true;
        }
        catch (Exception tExcept)
        {
            tExcept.printStackTrace();
            return false;
        }
    }

    public List<Contato> search()
    {
        return null;
    }

    public List<Contato> searchByNome(String pNome)
    {
        return null;
    }

    public List<Contato> searchByEmail(String pEmail)
    {
        return null;
    }

    public int countByTelefone(long pTelefone)
    {
        // Verificando se o arquivo de '�ndice' existe
        File tArquivo1 = new File(String.format("Contato_%011d.idx", pTelefone));

        return tArquivo1.exists() ? 1 : 0;
    }

    private void gravarObjeto(Contato pContato, PrintWriter tArquivo2)
    {
        tArquivo2.println(pContato.getId());
        tArquivo2.println(pContato.getTelefone());
        tArquivo2.println(pContato.getNome());
        tArquivo2.println(pContato.getEmail());
        tArquivo2.println(pContato.getEndereco());
    }
}










package br.com.professor.agenda.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GeradorNumero
{
    private static final String sNOME_ARQUIVO = "NUMERO.TXT";

    // C�digo de inicializa��o do objeto
    {
        // Ser� executado antes de qualquer construtor
    }

    // C�digo de inicializa��o est�tico
    // Ser� executado somente uma vez quando o arquivo .class � carregado na
    // m�quina virtual
    static
    {
        try
        {
            File tArquivo = new File(sNOME_ARQUIVO);
            tArquivo.createNewFile();
        }
        catch (IOException tExcept)
        {
            tExcept.printStackTrace();
        }
    }

    public static int obterNumero()
    {
        try
        {
            FileReader tArquivo1 = new FileReader(sNOME_ARQUIVO);
            BufferedReader tArquivo2 = new BufferedReader(tArquivo1);
            String tNumeroStr = tArquivo2.readLine();
            if (tNumeroStr == null) // Arquivo criado pela primeira vez
                tNumeroStr = "0";
            tArquivo2.close();
            int tNumero = Integer.parseInt(tNumeroStr);
            tNumero++;
            FileWriter tArquivo3 = new FileWriter(sNOME_ARQUIVO);
            PrintWriter tArquivo4 = new PrintWriter(tArquivo3);
            tArquivo4.println(tNumero);
            tArquivo4.close();
            return tNumero;
        }
        catch (IOException tExcept)
        {
            tExcept.printStackTrace();
            return 0;
        }
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 100; i++)
            System.out.println(obterNumero());
    }
}

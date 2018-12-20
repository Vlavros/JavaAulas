package xunxo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.elaborata.agenda.util.Leitor;

public class GravarArquivo
{
    public static void main(String[] args) throws IOException
    {
        FileWriter tArquivo1 = new FileWriter("saida.txt");
        PrintWriter tArquivo2 = new PrintWriter(tArquivo1);

        while(true)
        {
            String tNome = Leitor.readString("Entre com um nome : ");
            if (tNome.equalsIgnoreCase("fim"))
                break;
            tArquivo2.println(tNome);
        }

        tArquivo2.close();
    }
}

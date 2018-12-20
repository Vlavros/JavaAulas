package xunxo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo
{
    public static void main(String[] args) throws IOException
    {
        FileReader tArquivo1 = new FileReader("Saida.txt");
        BufferedReader tArquivo2 = new BufferedReader(tArquivo1);

        while(true)
        {
            String tLinha = tArquivo2.readLine();
            if (tLinha == null)
                break;

            System.out.println("Linha lida : " + tLinha);
        }

        tArquivo2.close();
    }
}

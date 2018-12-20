package xunxo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Site
{
    public static void main(String[] args) throws Exception
    {
        URL tSite = new URL("http://www.valorizeseusite.com.br/");
        URLConnection tConexao = tSite.openConnection();
        InputStream tEntrada = tConexao.getInputStream();
        InputStreamReader tDados = new InputStreamReader(tEntrada);
        BufferedReader tHtml = new BufferedReader(tDados);
        while(true)
        {
            String tLinha = tHtml.readLine();
            if (tLinha == null)
                break;
            System.out.println("Linha : " + tLinha);
        }
        tHtml.close();
    }
}

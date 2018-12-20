package br.com.professor.agenda.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.professor.agenda.model.Contato;

public class Teste
{
    public static void main(String[] args)
    {
        Contato tContato1 = new Contato();
        tContato1.setId(1);
        tContato1.setNome("Jose Augusto");
        tContato1.setTelefone(41_9_8500_2577L);

        Contato tContato2 = new Contato();
        tContato2.setId(2);
        tContato2.setNome("Analice");
        tContato2.setTelefone(41_9_9887_5572L);

        System.out.println(tContato1 + " - " + tContato2);
        List<Contato> tLista = new ArrayList<>();
        tLista.add(tContato1);
        tLista.add(tContato2);

        Contato tContato3 = new Contato();
        tContato3.setId(2);
        tContato3.setNome("Ana alice");
        tContato3.setTelefone(41_9_9887_5572L);

        System.out.println(tContato1.equals(tContato3));
        System.out.println(tContato2.equals(tContato3));

        System.out.println(tContato1);

        System.out.println(tLista.contains(tContato3));

    }
}

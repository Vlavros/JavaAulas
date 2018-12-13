package br.com.elaborata.agenda.teste;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import br.com.elaborata.agenda.model.Agenda;
import br.com.elaborata.agenda.model.Contato;

public class Teste {

	public static void main(String[] args) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		Agenda agenda1 = new Agenda(1, format.parse("14/09/1999"), format.parse("27/05/2005"), 20, "Teste", null, null);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("");
				
		/*
		Contato contato1 = new Contato(1,419999999,"Nome Completo da Pessoa","email@host.com.br","Rua XYZ");
		Contato contato2 = new Contato(2,418888888,"Nome Completo da Pessoa 2","email@host.com.br","Rua XYZ");
		Contato contato3 = new Contato(2,418888888,"Nome Completo da Pessoa 2","email@host.com.br","Rua XYZ");
		
		System.out.println(contato1);
		
		List<Contato> lContatos = new ArrayList<>();
		lContatos.add(contato1);
		lContatos.add(contato2);
		
		System.out.println(lContatos.contains(contato3));
		
		System.out.println(contato2.equals(contato3));
		
		System.out.println();
		*/
		
	}

}

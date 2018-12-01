package br.com.vlavros.teste.polimorfismo;

import java.util.HashMap;
import java.util.Map;

public class TestePolimorfismo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		ClassePai cp = new ClasseFilho();
		ClasseFilho cf = new ClasseFilho();
		
		ClassePai cpv = new ClassePai();
		
		cp.nome = "Nome";
		cp.texto = "Texto";
		
		cf.nome = cp.nome;
		cf.texto = cp.texto;
		
		cpv.nome = cp.nome;
		cpv.texto = cp.texto;
		
		cp.msgTeste();
		System.out.println(cp.msgTexto());
		//cp.msgFilho();
		
		cf.msgTeste();
		System.out.println(cf.msgTexto());
		cf.msgFilho();
		
		cpv.msgTeste();
		System.out.println(cpv.msgTexto());
		
		
		
		
		
	}

}

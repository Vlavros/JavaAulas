package br.com.elaborata.exemplos.listas;

import java.util.HashMap;
import java.util.Map;

public class TesteMapas {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>(); //Polimorfismo Usando a classe pai Map
		
		map.put("tads", "Tec Análise e Desenvolvimento de Sistemas");
		map.put("tgq", "Tec Gestão da Qualidade");
		map.put("tni", "Tec Negócios Imbobiliários");
		map.put("ts", "Tec Secretariado");
		map.put("tci", "Tec Comunicação Institucional");
		map.put("tci", "Tec Comunicação Institucional A");
		
		System.out.println(map.get("tgq"));
		System.out.println(map.get("xxx")); //Não gera erro em list geraria
		System.out.println(map.get("tci"));
		
		
	}

}

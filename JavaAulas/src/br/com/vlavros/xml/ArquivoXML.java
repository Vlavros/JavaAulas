package br.com.vlavros.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ArquivoXML {
	private String elementName;
	private String elementValue;
	private LinkedHashMap<String, String> atribute = new LinkedHashMap<String, String>();
	private ArquivoXML subElement;
	private List<ArquivoXML> subElement2;


	public void carregarXML(String nomeArquivo) {
		try {
			File arq = new File(nomeArquivo);
			BufferedReader lerArq = new BufferedReader(new InputStreamReader(new FileInputStream(arq), "UTF-8"));
			
			String linha = lerArq.readLine(); 
			String arquivo = new String("");
			
			while (linha != null) {
				arquivo += linha;
				linha = lerArq.readLine();				
			}
			
			lerArq.close();
			
			arquivo = arquivo.replace("\t", "");
			
			String[] conteudo = arquivo.split("(?<=>)");
			
			this.lerConteudo(conteudo, 1);
			
			/*for (int i = 1; i < conteudo.length; i++) {
				System.out.println(conteudo[i]);
			}**/
			
			/*
			for (String string : conteudo) {
				System.out.println(string);
			}
			*/						
			
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
	}
	
	public void lerConteudo(String[] conteudo, Integer controle) {
		this.setElementName(conteudo[controle].substring(conteudo[controle].indexOf("<")+1, conteudo[controle].indexOf(">")).trim());
		controle++;
		
		for(; controle < conteudo.length; controle++) {
			if(conteudo[controle].trim().startsWith("<") && !conteudo[controle].trim().startsWith("</") ) {
				this.subElement = new ArquivoXML();
				this.subElement.lerConteudo(conteudo, controle);
				break;
			} else {
				if((conteudo[controle].trim().indexOf("</")) > 0) {
					this.setElementValue(conteudo[controle].substring(0, conteudo[controle].indexOf("</")).trim());
				} else {
					break;
				}				
			}			
		}
	}
	
	public void printConteudo() {
		System.out.print("\n<" + this.getElementName() + ">");
		System.out.print(this.getElementValue());
		if(this.getSubElement() != null) {
			this.getSubElement().printConteudo();
		}
		System.out.println("</" + this.getElementName() + ">\n");
	}

	public static void main(String[] args) throws IOException {
		/*
		 * // String nome = new String("C:\\temp\\pao.xml"); String nome = new
		 * String("C:\\temp\\regmeta4.xml"); FileReader arq = new FileReader(nome);
		 * BufferedReader lerArq = new BufferedReader(arq); //File arq = new File(nome);
		 * //BufferedReader lerArq = new BufferedReader(new InputStreamReader(new
		 * FileInputStream(arq), "UTF8"));
		 * 
		 * String linha = lerArq.readLine(); String arquivo = new String(""); while
		 * (linha != null) { System.out.println(linha); arquivo += linha; linha =
		 * lerArq.readLine(); }
		 * 
		 * System.out.println(arquivo.replace("\t", ""));
		 * 
		 * lerArq.close(); // arq.close();
		 * 
		 */

		/*
		 * LinkedHashMap<String, String> atribute1 = new LinkedHashMap<String,
		 * String>(); atribute1.put("AAAA", "7474"); atribute1.put("fdfs", "6996");
		 * atribute1.put("gfgff", "121"); atribute1.put("hggh", "787");
		 * atribute1.put("ioio", "4224"); Set<String> key = atribute1.keySet();
		 * 
		 * System.out.println();
		 * 
		 * for ( String key1 : atribute1.keySet()) { System.out.println( key1 ); }
		 * 
		 * for ( String val : atribute1.values() ) { System.out.println( val ); }
		 * 
		 * System.out.println(key.size());
		 * System.out.println(atribute1.keySet().toArray()[0]);
		 * System.out.println(atribute1.keySet().toArray()[1]);
		 * System.out.println(atribute1.keySet().toArray()[2]);
		 * System.out.println(atribute1.keySet().toArray()[3]);
		 * System.out.println(atribute1.keySet().toArray()[4]);
		 */
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getElementValue() {
		return elementValue;
	}

	public void setElementValue(String elementValue) {
		this.elementValue = elementValue;
	}

	public HashMap<String, String> getAtribute() {
		return atribute;
	}

	public void setAtribute(LinkedHashMap<String, String> atribute) {
		this.atribute = atribute;
	}

	public ArquivoXML getSubElement() {
		return subElement;
	}

	public void setSubElement(ArquivoXML subElement) {
		this.subElement = subElement;
	}
}

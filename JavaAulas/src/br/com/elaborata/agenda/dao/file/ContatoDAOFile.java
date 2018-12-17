package br.com.elaborata.agenda.dao.file;
import java.io.FileWriter;
import java.io.PrintWriter;

import br.com.elaborata.agenda.model.Contato;

public class ContatoDAOFile {
	
	public void create(Contato pContato) throws Exception {
		FileWriter tFile = new FileWriter("Contato_" + String.format("%011d", pContato.getIdContato()) + ".txt");
		PrintWriter tWriter = new PrintWriter(tFile);
		
		tWriter.println(pContato.getIdContato());
		tWriter.println(pContato.getNomeCompleto());
		tWriter.println(pContato.getTelefone());
		tWriter.println(pContato.getEmail());
		tWriter.println(pContato.getEndereco());
		
		tWriter.close();
		
		
	}
	
	public Contato recovery(Integer pIdContato) {
		
		return null;
	}
	
	public void update(Contato pContato) throws Exception {
		
	}
	
	public void delete(int pIdContato) throws Exception {
		
	}
	
}

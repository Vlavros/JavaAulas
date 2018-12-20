package br.com.professor.agenda.controller;

import br.com.professor.agenda.dao.file.ContatoDaoArquivo;
import br.com.professor.agenda.dto.ContatoDto;
import br.com.professor.agenda.model.Contato;

public class ContatoController
{
    public ContatoDto inserirContato(long pTelefone, String pNome, String pEmail, String pEndereco)
    {
        // Criando a classe de persist�ncia
        ContatoDaoArquivo tDao = new ContatoDaoArquivo();

        // Verificando se o telefone j� existe no cadastro
        if (tDao.countByTelefone(pTelefone) == 1)
        {
           return new ContatoDto(false, "Ja existe esse telefone na base de dados");
        }

        // Criar o objeto Contato
        Contato tContato = new Contato();
        tContato.setTelefone(pTelefone);
        tContato.setNome(pNome);
        tContato.setEmail(pEmail);
        tContato.setEndereco(pEndereco);

        // Inserir o contato na base de dados
        if (!tDao.create(tContato))
        {
            return new ContatoDto(false, "Erro no processo de criação do contato na base de dados");
        }

        // Retornando o objeto criado
        return new ContatoDto(true, "Contato inserido com sucesso", tContato);
    }
    
    public ContatoDto consultarPorTelefone(long pTelefone) {
    	ContatoDaoArquivo tDao = new ContatoDaoArquivo();
    	
    	Contato tContato = tDao.recoveryByTelefone(pTelefone);
    	
    	if(tContato == null) {
    		return new ContatoDto(false, "Telefone não existente.");
    	}
    	
    	return new ContatoDto(true, "Contato recuperado com sucesso.", tContato);
    }
    
    public ContatoDto excluirContato(int pId) {
    	
    	ContatoDaoArquivo tDao = new ContatoDaoArquivo();
    	
    	if(tDao.delete(pId)) {
    		return new ContatoDto(true, "Contato excluído.");
    	} else {
    		return new ContatoDto(false, "Nao foi possivel excluir o contato.");
    	}
    	
    }
    
    public ContatoDto alterarContato(Contato pContato) {
    	
    	ContatoDaoArquivo tDao = new ContatoDaoArquivo();
    	
    	if(tDao.update(pContato)) {
    		return new ContatoDto(true, "Contato alterado.");
    	} else {
    		return new ContatoDto(false, "Nao foi possivel alterar o contato.");
    	}
    	
    	
    }
    
}

package br.com.elaborata.atendimentotecnico.controller;

import br.com.elaborata.atendimentotecnico.dao.AtendimentoTecnicoDAO;
import br.com.elaborata.atendimentotecnico.model.AtendimentoTecnicoModel;

public class AtendimentoTecnicoController {
	
	private AtendimentoTecnicoDAO dao;
	
	public AtendimentoTecnicoController() {
		this.dao = new AtendimentoTecnicoDAO();
	}
	
	public void inserir(AtendimentoTecnicoModel atendimento) throws Exception {
		dao.inserir(atendimento);
	}

	public void alterar(AtendimentoTecnicoModel atendimento) throws Exception {
		
	}
	
}

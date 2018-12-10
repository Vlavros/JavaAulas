package br.com.elaborata.exemplos.dao;

import java.util.List;

public interface ClienteDAO {
	
	public boolean inserirCliente(Cliente c);
	
	public boolean atualizarCliente(Cliente c);
	
	public boolean removerCliente(Cliente c);
	
	public Cliente buscarPorCod(int cod);
	
	public List<Cliente> buscarTodos();
	
	
}

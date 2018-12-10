package br.com.elaborata.exemplos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
	
	public Connection con = null;
	PreparedStatement st = null;
	ConnectionFactory cf = new ConnectionFactory();
	

	@Override
	public boolean inserirCliente(Cliente c) {
		// TODO implementar
		
		
		try {
			con = cf.getConnection();
			st = con.prepareStatement("INSERT INTO cliente (nm_cliente,cpf) VALUES(1,2)");
			
			st.setString(1, c.getNmCliente() );
			st.setString(2, c.getCpf());
			
			return true;
			
		} catch(Exception e) {
			System.out.println(e);
			return false;
		} finally {
			//con.close();
		}
		
		
	}

	@Override
	public boolean atualizarCliente(Cliente c) {
		// TODO implementar
		return false;
	}

	@Override
	public boolean removerCliente(Cliente c) {
		// TODO implementar
		return false;
	}

	@Override
	public Cliente buscarPorCod(int cod) {
		// TODO implementar
		return null;
	}

	@Override
	public List<Cliente> buscarTodos() {
		// TODO implementar
		return null;
	}

}

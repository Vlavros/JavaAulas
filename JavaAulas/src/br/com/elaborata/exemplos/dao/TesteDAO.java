package br.com.elaborata.exemplos.dao;

public class TesteDAO {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.setCdCliente(10);
		c.setNmCliente("Vladimir");
		c.setEndereco("Rua Eduardo Sprada, nro 999");
		
		ClienteDAO dao = new ClienteDAOImpl();
		dao.inserirCliente(c);
		
	}

}

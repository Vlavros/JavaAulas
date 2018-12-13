package br.com.elaborata.agenda.model;

public class Contato {

	private Integer idContato;
	private Integer Telefone;
	private String nomeCompleto;
	private String email;
	private String endereco;

	public Integer getIdContato() {
		return idContato;
	}

	public void setIdContato(Integer idContato) {
		this.idContato = idContato;
	}

	public Integer getTelefone() {
		return Telefone;
	}

	public void setTelefone(Integer telefone) {
		Telefone = telefone;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}

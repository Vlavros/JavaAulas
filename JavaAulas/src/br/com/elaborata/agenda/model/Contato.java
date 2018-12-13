package br.com.elaborata.agenda.model;

import java.io.Serializable;

public class Contato implements Serializable {

	private static final long serialVersionUID = 1L; //Serializable - tranferir - session/socket	
	
	private Integer idContato;
	private Integer telefone;
	private String nomeCompleto;
	private String email;
	private String endereco;

	public Contato(Integer idContato, Integer telefone, String nomeCompleto, String email, String endereco) {
		super();
		this.idContato = idContato;
		this.telefone = telefone;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.endereco = endereco;
	}

	public Integer getIdContato() {
		return idContato;
	}

	public void setIdContato(Integer idContato) {
		this.idContato = idContato;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato [idContato=");
		builder.append(idContato);
		builder.append(", Telefone=");
		builder.append(telefone);
		builder.append(", nomeCompleto=");
		builder.append(nomeCompleto);
		builder.append(", email=");
		builder.append(email);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idContato == null) ? 0 : idContato.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (idContato == null) {
			if (other.idContato != null)
				return false;
		} else if (!idContato.equals(other.idContato))
			return false;
		return true;
	}


	

	
	
}

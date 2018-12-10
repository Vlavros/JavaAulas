package br.com.elaborata.exemplos.dao;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {
	private int cdCliente;
	private String nmCliente;
	private String cpf;
	private Date dtNascimento;
	private Double nroTeste;
	private String endereco;

	public Cliente() {

	}

	public int getCdCliente() {
		return cdCliente;
	}

	public void setCdCliente(int cdCliente) {
		this.cdCliente = cdCliente;
	}

	public String getNmCliente() {
		return nmCliente;
	}

	public void setNmCliente(String nmcliente) {
		this.nmCliente = nmcliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Double getNroTeste() {
		return nroTeste;
	}

	public void setNroTeste(Double nroTeste) {
		this.nroTeste = nroTeste;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}

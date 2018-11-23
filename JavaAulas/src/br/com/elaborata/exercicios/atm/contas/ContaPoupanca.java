package br.com.elaborata.exercicios.atm.contas;

import java.util.Date;

public class ContaPoupanca extends ContaBancaria {
	
	private Date dataAniversario;
	
	public ContaPoupanca() {
		super();
		this.dataAniversario = new Date();
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	
}

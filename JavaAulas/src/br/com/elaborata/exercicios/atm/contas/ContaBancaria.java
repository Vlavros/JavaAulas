package br.com.elaborata.exercicios.atm.contas;

public class ContaBancaria {
	protected String banco;
	protected String agencia;
	protected String numero;
	protected Double saldo;
	
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	

	public boolean sacar(Double valor) {
		if(this.saldo >= valor) {
			this.saldo += -valor;
			return true;
		} else {
			return false;
		}
	}
	
	public Double consultarSaldo(){
		return this.saldo;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}

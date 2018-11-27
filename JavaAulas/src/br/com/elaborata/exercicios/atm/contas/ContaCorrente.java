package br.com.elaborata.exercicios.atm.contas;

public class ContaCorrente extends ContaBancaria {

	private String gerente;
	private int limite;
	
	@Override
	public void sacar(Double valor) throws Exception {
		if((this.saldo + this.limite) >= valor) {
			this.saldo += -valor;
		} else {
			throw new Exception("Saldo insuficiênte.");
		}
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

}

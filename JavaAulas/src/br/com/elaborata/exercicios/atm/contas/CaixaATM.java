package br.com.elaborata.exercicios.atm.contas;

public class CaixaATM {

	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca();
		cp.setBanco("Itau");
		cp.setAgencia("0043");
		cp.setNumero("007555");
		cp.setSaldo(10000.0);
		
		boolean conseguiuSacar = cp.sacar(1000.0);
		if(conseguiuSacar) {
			System.out.println("Saque realizado!");
		} else {
			System.out.println("Saque não realizado. Saldo insuficiente");
		}
		
		cp.depositar(2000.0);
		
		System.out.println("Saldo atual: " + cp.consultarSaldo());
		
		System.out.println(cp.getDataAniversario());
		
		ContaCorrente cc = new ContaCorrente();
		cc.setBanco("Caixa");
		cc.setAgencia("0557");
		cc.setNumero("0007");
		cc.setSaldo(5000.0);
		cc.setLimite(1000);
		cc.setGerente("João Silva");
		
		if(cc.sacar(5500.0)){
			System.out.println("Saque realizado.");
		} else {
			System.out.println("Saque não realizado. Saldo insuficiente");
		}
		
		
			
		
	}

}

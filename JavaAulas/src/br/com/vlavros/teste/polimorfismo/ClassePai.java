package br.com.vlavros.teste.polimorfismo;

public class ClassePai {
	public String nome;
	public String texto;
	private Integer numero;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public void msgTeste( ) {
		System.out.println("Mensagem pai");
	}
	
	public String msgTexto() {
		return "Mensagem pai " + this.texto;
	}

}

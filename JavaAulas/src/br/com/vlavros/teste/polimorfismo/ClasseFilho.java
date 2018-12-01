package br.com.vlavros.teste.polimorfismo;

public class ClasseFilho extends ClassePai {
	@Override
	public void msgTeste( ) {
		System.out.println("Mensagem filho");
	}
	
	@Override
	public String msgTexto() {
		return "Mensagem filho " + this.nome;
	}	
	
	public void msgFilho() {
		System.out.println("Metodo filho msg");
	}
	
}

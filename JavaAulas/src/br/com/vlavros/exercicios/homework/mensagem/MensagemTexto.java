package br.com.vlavros.exercicios.homework.mensagem;

public class MensagemTexto extends Mensagem {
	
	private String msgTexto;

	public MensagemTexto(String emissor, String receptor, String titulo, String msgTexto) {
		super(emissor, receptor, titulo);
		this.msgTexto = msgTexto;
	}

	@Override
	public void tocar() {
		System.out.println("Mensagem de Texto");
	}

	@Override
	public void enviarMensagem() {
		System.out.println("Mensagem de texto enviada para: " + super.getReceptor());
		System.out.println("Mensagem de texto: " + this.msgTexto);		
	}
	
	public void enviarMensagem(String msgTexto) {
		System.out.println("Mensagem de texto enviada para: " + super.getReceptor());
		System.out.println("Mensagem de texto: " + msgTexto);		
	}

	public String getMsgTexto() {
		return msgTexto;
	}

	public void setMsgTexto(String msgTexto) {
		this.msgTexto = msgTexto;
	}
	
	

}

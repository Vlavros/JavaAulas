package br.com.vlavros.exercicios.homework.mensagem;

public class MensagemVoz extends Mensagem {
	
	private String msgVoz;

	public MensagemVoz(String emissor, String receptor, String titulo, String msgVoz) {
		super(emissor, receptor, titulo);
		this.msgVoz = msgVoz;
	}

	@Override
	public void tocar() {
		System.out.println("Mensagem de Voz");
	}

	@Override
	public void enviarMensagem() {
		System.out.println("Mensagem de voz enviada para: " + super.getReceptor());
		System.out.println("Mensagem de voz: " + this.msgVoz);
	}

}

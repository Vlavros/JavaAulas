package br.com.vlavros.exercicios.homework.mensagem;

public class MensagemVideo extends Mensagem {
	
	private String msgVideo;

	public MensagemVideo(String emissor, String receptor, String titulo, String msgVideo) {
		super(emissor, receptor, titulo);
		this.msgVideo = msgVideo;
	}

	@Override
	public void tocar() {
		System.out.println("Mensagem de Video");
	}

	@Override
	public void enviarMensagem() {
		System.out.println("Mensagem de video enviada para: " + super.getReceptor());
		System.out.println("Mensagem de video: " + this.msgVideo);		
	}

}

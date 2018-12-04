package br.com.vlavros.exercicios.homework.mensagem;

public class TesteMensagem {

	public static void main(String[] args) {
		Mensagem msg1 = new MensagemTexto("emisor@mail.com","receptor@mail.com","Titulo da Mensagem de Texto","TEXTO TEXTO TEXTO TEXTO TEXTO");
		msg1.tocar();
		//msg1.enviarMensagem();
		
		Mensagem msg2 = new MensagemVoz("emisor@mail.com","receptor@mail.com","Titulo da Mensagem de Voz","AUDIO AUDIO AUDIO AUDIO");
		msg2.tocar();
		//msg2.enviarMensagem();
		
		Mensagem msg3 = new MensagemVideo("emisor@mail.com","receptor@mail.com","Titulo da Mensagem de Video","VIDEO VIDEO VIDEO VIDEO");
		msg3.tocar();
		//msg3.enviarMensagem();
		
	}

}

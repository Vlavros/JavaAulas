package br.com.vlavros.exercicios.homework.mensagem;

public abstract class Mensagem {

	private String emissor;
	private String receptor;
	private String titulo;

	public Mensagem(String emissor, String receptor, String titulo) {
		super();
		this.emissor = emissor;
		this.receptor = receptor;
		this.titulo = titulo;
	}
	
	public abstract void tocar();
	
	public abstract void enviarMensagem();

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public String getReceptor() {
		return receptor;
	}

	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	

}

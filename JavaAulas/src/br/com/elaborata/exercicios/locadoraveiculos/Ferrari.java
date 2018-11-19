package br.com.elaborata.exercicios.locadoraveiculos;

public class Ferrari extends Veiculo {

	public Ferrari(String marca, String modelo, Double precoLocacao) {
		super(marca, modelo, precoLocacao);
	}

	@Override
	public void reajustarPrecoLocacao() {
		this.precoLocacao += this.precoLocacao*0.05;
	}

}

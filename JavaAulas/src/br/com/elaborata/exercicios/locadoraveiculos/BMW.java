package br.com.elaborata.exercicios.locadoraveiculos;

public class BMW extends Veiculo {

	public BMW(String marca, String modelo, Double precoLocacao) {
		super(marca, modelo, precoLocacao);
	}

	@Override
	public void reajustarPrecoLocacao() {
		this.precoLocacao += this.precoLocacao*0.09;
	}

}

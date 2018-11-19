package br.com.elaborata.exercicios.locadoraveiculos;

public class LocadoraVeiculos {

	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari("Marca Ferrari", "Modelo Ferrari", 1000.0);
		Mercedes mercedes = new Mercedes("Marca Mercedes", "Modelo Mercedes", 1000.0);
		BMW bmw = new BMW("Marca BMW", "Modelo BMW", 1000.0);
		
		reajustar(ferrari);
		reajustar(mercedes);
		reajustar(bmw);

		verValor(ferrari);
		verValor(mercedes);
		verValor(bmw);		
		
	}
	
	public static void reajustar(Veiculo veiculo) {
		veiculo.reajustarPrecoLocacao();
	}
	
	public static void verValor(Veiculo veiculo) {
		System.out.println(veiculo.getPrecoLocacao());
	}

}

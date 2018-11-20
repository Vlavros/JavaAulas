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
				
		Veiculo veiculo[] = {ferrari,mercedes,bmw};
		
		reajustar(veiculo);
		
		verValor(veiculo[0]);
		
		
	}
	
	public static void reajustar(Veiculo veiculo) {
		veiculo.reajustarPrecoLocacao();
	}
	
	public static void reajustar(Veiculo[] veiculo) {
		/*
		for (int i = 0; i < veiculo.length; i++) {
			if (veiculo[i] != null) { //evitar acessar um método inválido
				veiculo[i].reajustarPrecoLocacao();
			}			
		}
		*/
		
		//for each - só funciona com listas/vetores
		for(Veiculo v : veiculo) {
			v.reajustarPrecoLocacao();
		}
	}	
	
	public static void verValor(Veiculo veiculo) {
		System.out.println(veiculo.getPrecoLocacao());
	}

}

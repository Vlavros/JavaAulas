package br.com.vlavros.exercicios.homework;

/**
 * Exercício 01 – Data por extenso Criar uma classe chamada 'DataExtenso' para
 * retornar uma determinada data por extenso. Instruções: - Criar um projeto
 * chamado DataExtenso - Criar uma classe chamada DataExtenso - Criar um método
 * que receba o dia da semana como parâmetro e retorne o nome do dia - Criar um
 * método que receba o mês e retorne o nome do mês - Criar um método que receba
 * a data no formato string e retorne a data no seguinte formato: Curitiba,
 * <dia> de <nome-do-mês> de <ano>
 * 
 * @author Vlavros
 *
 */

public class DataExtenso {
	private static final String[] SEMANA = { "Sábado", "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta" };
	private static final String[] MES = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

	/**
	 * 0 = Sabado / 6 = Sexta
	 * @param dia
	 * @return
	 */
	public static String getDiaSemana(Integer posicao) {
		if (posicao != null && posicao >= 0 && posicao < SEMANA.length) {
			return SEMANA[posicao];
		} else {
			return null;
		}
	}
	
	/**
	 * 1 = JANEIRO / 12 =  DEZEMBRO
	 * @param mes
	 * @return
	 */
	public static String getNomeMes(Integer mes) {
		if (mes != null && mes > 0 && mes <= MES.length) {
			return MES[mes-1];
		} else {
			return null;
		}		
	}
	
	public static String getDiaSemana(Integer dia, Integer mes, Integer ano) {
		Integer posicao = null, k = null;
		
		k = dia + (2*mes) + ((3*(mes+1))/5) + ano + (ano/4) - (ano/100) + (ano/400) +2;
		posicao = k%7;
				
		return getDiaSemana(posicao);
	}
	
	public static String getDiaSemana(String data) {
		if(validarData(data)) {
			
			return getDiaSemana(Integer.parseInt(data.substring(0, 2)),Integer.parseInt(data.substring(3, 5)),Integer.parseInt(data.substring(6)));
			
		} else {
			return null;
		}
	}	
	
	//DD/MM/AAAA
	public static boolean validarData(String data) {
		if(data == null || data.length() != 10 || data.charAt(2) != '/' || data.charAt(5) != '/') {
			return false;
		}
		
		for (int i = 0; i < data.length(); i++) {
			if((!Character.isDigit(data.charAt(i))) && i != 2 && i != 5) {
				return false;
			}
		}		
		return true;		
	}
	
	//<nome-dia-semana>, <dia> de <nome-do-mês> de <ano> 
	public static String formatarData(String data) {
		if(validarData(data)) {
			return getDiaSemana(data) + ", " + data.substring(0, 2) + " de " + getNomeMes(Integer.parseInt(data.substring(3, 5))) + " de " + data.substring(6);
		} else {
			return "Data inválida";
		}
	}

}

package br.com.elaborata.exemplos.formulario.caixasdialogo;

import javax.swing.JOptionPane;

public class CaixasDialogo {

	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog(null, //pai da caixa de mensagem - tela pai
				"Mensagem advertencia",
				"Titulo",
				JOptionPane.WARNING_MESSAGE);		
		
		int result = JOptionPane.showConfirmDialog(null, //pai da caixa de mensagem - tela pai
				"Deseja realmente excluir o item selecionado",
				"Titulo",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);		
		
		System.out.println(result);
		
		if (result == JOptionPane.YES_OPTION) {
			System.out.println("SIM");
			JOptionPane.showMessageDialog(null,
					"Você apertou SIM.",
					"Titulo",
					JOptionPane.INFORMATION_MESSAGE);			
			
		} else {
			System.out.println("NÃO");
			JOptionPane.showMessageDialog(null,
					"Você apertou NÃO.",
					"Titulo",
					JOptionPane.INFORMATION_MESSAGE);				
		}

		
		
	}
	

	
}	



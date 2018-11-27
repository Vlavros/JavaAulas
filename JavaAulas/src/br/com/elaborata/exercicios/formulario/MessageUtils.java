package br.com.elaborata.exercicios.formulario;

import javax.swing.JOptionPane;

public class MessageUtils {
	
	public static void error(String msg, String title) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
	}

	public static void warning(String msg, String title) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.WARNING_MESSAGE);
	}
	
	public static void info(String msg, String title) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static String input(String msg, String title) {
		return JOptionPane.showInputDialog(null,msg,title,JOptionPane.QUESTION_MESSAGE);
	}
	
}

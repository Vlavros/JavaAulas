package br.com.elaborata.exemplos.formulario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextField fldCampo;
	private JTextField fldCampo2;
	
	
	public Formulario(){
		//configurando o formulário/tela
		this.setTitle("Primeiro Formulário");
		this.setSize(600, 400);
		//this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null); //centraliza o formulario na tela
		this.setLayout(null); //desativa layout gerenciado
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//adicionando componentes no formulário
		JLabel lblRotulo = new JLabel ();
		lblRotulo.setText("Digite um texto qualquer");
		lblRotulo.setBounds(10, 10, 200, 20);
		this.add(lblRotulo);

		fldCampo = new JTextField();
		fldCampo.setBounds(220, 10, 200, 20);
		this.add(fldCampo);
		
		JButton btmBotao = new JButton();
		btmBotao.setBounds(460, 10, 120, 20);
		btmBotao.setText("Aperte!");
		btmBotao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//fldCampo2.setText(fldCampo.getText());
				//fldCampo.setText("QUE MERDA VOCÊ ESCREVEU???");
				String numeroStr = fldCampo.getText();
				int numero = Integer.parseInt(numeroStr);
				int dobro = numero * 2;
				
				String dobroStr = String.valueOf(dobro);
				fldCampo2.setText(dobroStr);
				
				
			}
		});
		this.add(btmBotao);
		
		fldCampo2 = new JTextField();
		fldCampo2.setBounds(10, 40, 200, 20);
		fldCampo2.setEditable(false);
		this.add(fldCampo2);
	}

	
}

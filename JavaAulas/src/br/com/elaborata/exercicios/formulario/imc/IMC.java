package br.com.elaborata.exercicios.formulario.imc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class IMC extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField fldAltura;
	private JTextField fldPeso;
	private JTextField fldIMC;
		
	public IMC() {
		
		//configurando o formulário/tela
		this.setTitle("Cálculo de IMC");
		this.setSize(400, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null); //centraliza o formulario na tela
		this.setLayout(null); //desativa layout gerenciado
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Altura
		JLabel lblAltura= new JLabel ();
		lblAltura.setText("Digite a altura:");
		lblAltura.setBounds(10, 10, 120, 20);
		this.add(lblAltura);
		
		fldAltura = new JTextField();
		fldAltura.setBounds(140, 10, 200, 20);
		this.add(fldAltura);
		
		//Peso
		JLabel lblPeso = new JLabel();
		lblPeso.setText("Digite o peso:");
		lblPeso.setBounds(10, 40, 200, 20);
		this.add(lblPeso);
		
		fldPeso = new JTextField();
		fldPeso.setBounds(140, 40, 200, 20);
		this.add(fldPeso);
		
		//Botão
		JButton btnCalcular = new JButton();
		btnCalcular.setBounds(10, 70, 120, 20);
		btnCalcular.setText("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String altura = fldAltura.getText().trim();
				String peso = fldPeso.getText().trim();
				
				if(altura.isEmpty() || peso.isEmpty()) {
					fldIMC.setText("Altura e peso são obrigatórios.");
					JOptionPane.showMessageDialog(null, "Altura e peso são campos obrigatórios.","Alerta", JOptionPane.ERROR_MESSAGE);
				} else {
					try {
						
						IndiceMassaCorporal imc = new IndiceMassaCorporal(Double.valueOf(altura), Double.valueOf(peso));
						
						fldIMC.setText( imc.getClassificacao() + ": " + String.format("%.2f", imc.getImc()));
						
					} catch (Exception erro) {
						fldIMC.setText("Altura ou peso incorreto.");
						JOptionPane.showMessageDialog(null, "Altura ou peso estão incorretos.","Alerta", JOptionPane.ERROR_MESSAGE);
					}					
				}

			}
		});
		this.add(btnCalcular);
		
		//IMC
		fldIMC = new JTextField();
		fldIMC.setBounds(140, 70, 200, 20);
		fldIMC.setEditable(false);
		this.add(fldIMC);
		
		
		
	}
	
}

package br.com.elaborata.exercicios.formulario.atm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import br.com.elaborata.exercicios.atm.contas.ContaPoupanca;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FormularioATM {

	private JFrame frmCaixaAtm;
	private JTextField txtConta;
	private JButton btnAbrir;
	private JButton btnSacar;
	private JButton btnDepositar;
	private JButton btnSaldo;
	private JButton btnFinalizar;
	private JLabel lblBemVindo; 
	private JLabel lblConta;
	private JPanel panel;
	private ContaPoupanca conta;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioATM window = new FormularioATM();
					window.frmCaixaAtm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormularioATM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCaixaAtm = new JFrame();
		frmCaixaAtm.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		frmCaixaAtm.setTitle("Caixa ATM");
		frmCaixaAtm.setBounds(100, 100, 350, 300);
		frmCaixaAtm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCaixaAtm.getContentPane().setLayout(null);
		
		lblBemVindo = new JLabel("Bem Vindo");
		lblBemVindo.setBounds(0, 5, 348, 20);
		lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		frmCaixaAtm.getContentPane().add(lblBemVindo);
		
		lblConta = new JLabel("Conta");
		lblConta.setBounds(22, 45, 84, 15);
		frmCaixaAtm.getContentPane().add(lblConta);
		
		txtConta = new JTextField();
		txtConta.setBounds(79, 43, 106, 20);
		frmCaixaAtm.getContentPane().add(txtConta);
		txtConta.setColumns(10);
		
		btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirConta();
			}
		});
		btnAbrir.setBounds(201, 42, 117, 20);
		frmCaixaAtm.getContentPane().add(btnAbrir);
		
		btnSacar = new JButton("Sacar");
		btnSacar.setEnabled(false);
		btnSacar.setBounds(22, 95, 131, 50);
		frmCaixaAtm.getContentPane().add(btnSacar);
		
		btnDepositar = new JButton("Depositar");
		btnDepositar.setEnabled(false);
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDepositar.setBounds(187, 95, 131, 50);
		frmCaixaAtm.getContentPane().add(btnDepositar);
		
		btnSaldo = new JButton("Saldo");
		btnSaldo.setEnabled(false);
		btnSaldo.setBounds(22, 179, 131, 50);
		frmCaixaAtm.getContentPane().add(btnSaldo);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finalizarConta();
			}
		});
		btnFinalizar.setEnabled(false);
		btnFinalizar.setBounds(187, 179, 131, 50);
		frmCaixaAtm.getContentPane().add(btnFinalizar);
		
		panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(151, 241, 10, 10);
		frmCaixaAtm.getContentPane().add(panel);
	}
	
	private void abrirConta() {
		String numeroConta = txtConta.getText();
		if(numeroConta.trim().isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Informe o número da conta.",
					"Número da conta inválido",
					JOptionPane.ERROR_MESSAGE);
			return;
		} 
		
		conta = new ContaPoupanca();
		conta.setNumero(numeroConta);
		
		txtConta.setEnabled(false);;
		
		btnAbrir.setEnabled(false);
		btnSacar.setEnabled(true);
		btnDepositar.setEnabled(true);
		btnSaldo.setEnabled(true);
		btnFinalizar.setEnabled(true);
		
	}
	
	private void finalizarConta() {
		//TODO Finalizar o objeto
		
		txtConta.setEnabled(true);;
		txtConta.setText(null);
		
		btnAbrir.setEnabled(true);
		btnSacar.setEnabled(false);
		btnDepositar.setEnabled(false);
		btnSaldo.setEnabled(false);
		btnFinalizar.setEnabled(false);		
	}
	
	private void movePainel() {
		//panel.getLo
	}

}

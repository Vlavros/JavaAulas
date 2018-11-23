package br.com.elaborata.exemplos.formulario.windowbuildpro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela {

	private JFrame frmTela;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frmTela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTela = new JFrame();
		frmTela.getContentPane().setBackground(SystemColor.desktop);
		frmTela.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(324, 199, 42, 39);
		frmTela.getContentPane().add(panel);
		
		JLabel lblDigiteUmTexto = new JLabel("Digite um texto");
		lblDigiteUmTexto.setForeground(Color.RED);
		lblDigiteUmTexto.setFont(new Font("Courier 10 Pitch", Font.BOLD, 20));
		lblDigiteUmTexto.setBounds(46, 36, 249, 21);
		frmTela.getContentPane().add(lblDigiteUmTexto);
		
		textField = new JTextField();
		textField.setBounds(46, 61, 268, 19);
		frmTela.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//if(e.getKeyChar() == 's') {
					JOptionPane.showMessageDialog(null, "Mensagem advertencia", "Titulo", JOptionPane.WARNING_MESSAGE);	
				//}
			}
		});		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton.setBounds(46, 92, 249, 25);
		frmTela.getContentPane().add(btnNewButton);
		
		frmTela.setTitle("Window Build PRO");
		frmTela.setBounds(100, 100, 460, 298);
		frmTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

package br.com.elaborata.exemplos.formulario.entradadados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntradaDados {

	private JFrame frame;
	private JPasswordField txtSenha;
	private JTextField txtTexto;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntradaDados window = new EntradaDados();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EntradaDados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTexto = new JLabel("Texto");
		lblTexto.setBounds(28, 64, 86, 15);
		frame.getContentPane().add(lblTexto);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(28, 102, 86, 15);
		frame.getContentPane().add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(106, 100, 122, 19);
		frame.getContentPane().add(txtSenha);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(106, 62, 122, 19);
		frame.getContentPane().add(txtTexto);
		txtTexto.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("JTextArea");
		lblNewLabel.setBounds(28, 143, 86, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(28, 158, 379, 85);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnMostrar = new JButton("Mostrar...");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarDados();
			}
		});
		btnMostrar.setBounds(261, 59, 117, 25);
		frame.getContentPane().add(btnMostrar);
	}
	
	private void mostrarDados(){
		//String conteudoTexto = txtTexto.getText();
		//String conteudoSenha = txtSenha.getPassword().toString();
		String conteudoArea = textArea.getText();
		
		txtTexto.setText(conteudoArea);
		
		
		
		
	}
}

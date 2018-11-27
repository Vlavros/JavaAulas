package br.com.elaborata.exercicios.formulario.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import br.com.elaborata.exercicios.formulario.MessageUtils;
import br.com.elaborata.exercicios.login.Logar;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmAcesso;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmAcesso.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAcesso = new JFrame();
		frmAcesso.setTitle("Acesso");
		frmAcesso.setBounds(100, 100, 369, 300);
		frmAcesso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAcesso.getContentPane().setLayout(null);
		
		JLabel lblAcessoAoSistema = new JLabel("Acesso ao Sistema");
		lblAcessoAoSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcessoAoSistema.setFont(new Font("Dialog", Font.BOLD, 18));
		lblAcessoAoSistema.setBounds(12, 0, 343, 50);
		frmAcesso.getContentPane().add(lblAcessoAoSistema);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(22, 63, 71, 50);
		frmAcesso.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(22, 114, 71, 50);
		frmAcesso.getContentPane().add(lblSenha);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(80, 79, 237, 19);
		frmAcesso.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(80, 130, 237, 19);
		frmAcesso.getContentPane().add(txtSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnEntrar.setBounds(139, 185, 117, 25);
		frmAcesso.getContentPane().add(btnEntrar);
		
	}
	
	private void login() {
		Logar logar = new Logar(txtLogin.getText().trim(),new String(txtSenha.getPassword()));
		
		try {
			logar.loginValido();
			MessageUtils.info("Bem vindo ao sistema.","Login");
			
		} catch(Exception e) {
			MessageUtils.error("Login ou senha incorretos", "Login");
		}
		
	}
	
	
}

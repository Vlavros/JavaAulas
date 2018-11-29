package br.com.elaborata.atendimentotecnico.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TelaLogin {

	private JFrame frame;	
	private JTextField loginFld;
	private JPasswordField pssFld;
	private JButton btnAcessar;

	
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
		//frame.setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblAcessoAoSistema = new JLabel("Acesso ao sistema");
		lblAcessoAoSistema.setForeground(Color.BLUE);
		lblAcessoAoSistema.setBounds(149, 16, 144, 29);
		frame.getContentPane().add(lblAcessoAoSistema);

		JLabel lblDigiteOLogin = new JLabel("Digite o login: ");
		lblDigiteOLogin.setBounds(27, 87, 112, 15);
		frame.getContentPane().add(lblDigiteOLogin);

		JLabel lblDigiteASenha = new JLabel("Digite a senha: ");
		lblDigiteASenha.setBounds(27, 160, 112, 15);
		frame.getContentPane().add(lblDigiteASenha);

		loginFld = new JTextField();
		loginFld.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10) {
					//pssFld.setFoc
					//TODO focus na senha ao apertar ENTER
				}
			}
		});
		loginFld.setBounds(179, 85, 175, 19);
		frame.getContentPane().add(loginFld);
		loginFld.setColumns(10);

		pssFld = new JPasswordField();
		pssFld.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println(e.getKeyCode());
				if(e.getKeyCode() == 10) {
					login();
				}
				
			}
		});
		pssFld.setBounds(179, 156, 175, 19);
		frame.getContentPane().add(pssFld);

		btnAcessar = new JButton("Acessar");
		btnAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnAcessar.setBounds(165, 214, 117, 25);
		frame.getContentPane().add(btnAcessar);
	}

	private void login() {
		String login = loginFld.getText();
		String senha = new String(pssFld.getPassword());

		if (loginValido(login, senha)) {
			//System.out.println("Acesso realizado");
			RegistrarAtendimento ra = new RegistrarAtendimento();
			ra.setVisible(true);
			frame.setVisible(false);
		} else {
			//System.out.println("Acesso negado");
			JOptionPane.showMessageDialog(null, "Acesso negado, verifique seu Login e Senha.","Login",JOptionPane.ERROR_MESSAGE);
		}
	}

	private boolean loginValido(String login, String senha) {
		return login.trim().equals("admin") && senha.trim().equals("master");

	}
}

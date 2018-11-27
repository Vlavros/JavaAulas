package br.com.elaborata.exercicios.login;

public class Logar {
	private String login;
	private String password;
	
	public Logar(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	public void loginValido() throws Exception {
		if(login.equals("admin") && password.equals("master")) {
			//TODO create session
		} else {
			throw new Exception("Login ou senha inválidas");
		}
	}
}

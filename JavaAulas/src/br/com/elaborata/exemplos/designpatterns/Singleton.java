package br.com.elaborata.exemplos.designpatterns;

public final class Singleton {
	private static Singleton instance = null;
	private String testeString;
	private int a = 10;

	private Singleton() { //private ou protected
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}

	public void teste() {
		System.out.println(testeString);
	}

	public String getTesteString() {
		return testeString;
	}

	public void setTesteString(String testeString) {
		this.testeString = testeString;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

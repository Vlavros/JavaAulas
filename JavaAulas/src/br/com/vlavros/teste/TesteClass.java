package br.com.vlavros.teste;

import java.util.Scanner;

import br.com.vlavros.exercicios.homework.Carro;
import br.com.vlavros.exercicios.homework.Computador;
import br.com.vlavros.exercicios.homework.DataExtenso;
import br.com.vlavros.exercicios.homework.Desconto;
import br.com.vlavros.exercicios.homework.IndiceMassaCorporal;
import br.com.vlavros.exercicios.homework.Monitor;
import br.com.vlavros.exercicios.homework.Processador;
import br.com.vlavros.exercicios.homework.Vetores;

public class TesteClass {

	public static void main(String[] args) {
		// System.out.println("Hello World!");

		// homeworkPrecoConsumidor();
		// homeworkIMC();
		// tabelaDescontos();
		// manipularVetor();
		// pessoaMaisVelha();
		// validarLoginSenha();
		//preencherComputador();
		manipularData();

		 //String teste = "DD/MM/AAAA";
		// System.out.println(teste.substring(6));

	}

	public static void manipularData() {
		//System.out.println(DataExtenso.getDiaSemana(16, 5, 2011));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a data desejada (DD/MM/AAAA): ");
		String data = scanner.nextLine();
		
		System.out.println(DataExtenso.formatarData(data));
		
		scanner.close();
		
	}
	
	/**
	 * HOMEWORK 16/11/18 Exercício Preço Consumidor - Entrada de dados
	 */
	public static void homeworkPrecoConsumidor() {
		System.out.println("Informe o preço de fabrica: ");
		Scanner scanner = new Scanner(System.in);

		Carro carro = new Carro("Ford", "Mustang", "Branco", scanner.nextDouble());
		scanner.close();

		System.out.println("O preço do consumidor eh: " + carro.calcularPrecoConsumidor());
	}

	/**
	 * HOMEWORK 16/11/18 Exercício Classificação IMC - Estrutura de decisão
	 */
	public static void homeworkIMC() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o seu peso: ");
		Double peso = scanner.nextDouble();

		System.out.println("Informe a sua altura: ");
		Double altura = scanner.nextDouble();

		scanner.close();

		IndiceMassaCorporal imc = new IndiceMassaCorporal(altura, peso);

		System.out.println("Formula: IMC = " + imc.getPeso() + " / (" + imc.getAltura() + " ^ 2) ");
		System.out.println("Seu IMC eh: " + imc.getImc());
		System.out.println("Sua classificacao eh: " + imc.getClassificacao());

	}

	/**
	 * Tabela de descontos - Estrutura de decisão
	 */
	public static void tabelaDescontos() {
		Double valor = 1000.0;
		Double valorDesconto = null;
		Scanner scanner = new Scanner(System.in);

		System.out.println("O valor a se pagar eh: " + valor);

		do {
			System.out.println("Escolha uma opção do menu: ");
			Desconto.exibeMenu();
			valorDesconto = Desconto.calcularDesconto(valor, scanner.nextInt());
			if (valorDesconto == null) {
				System.out.println("Opção inválida");
			}

		} while (valorDesconto == null);

		scanner.close();

		System.out.println("O valor a pagar com desconto eh: " + valorDesconto);
	}

	public static void manipularVetor() {
		Double[] vetor = { 27.8, 26.9, 24.7, 26.9, 25.8, 27.6, 23.0, 21.2, 29.1, 25.4 };

		Vetores.printVetor(vetor);

		System.out.println();
		System.out.println("Menor número: " + Vetores.menorVetor(vetor));
		System.out.println("Maior número: " + Vetores.maiorVetor(vetor));

		Vetores.printVetor(Vetores.organizarVetor(vetor));

	}

	/**
	 * Exercício 01 – Pessoa mais velha Criar um programa que leia o nome e a idade
	 * de 3 pessoas, guardando-os numa matriz e depois mostre o nome da pessoa mais
	 * velha.
	 */
	public static void pessoaMaisVelha() {
		String[] nomes = new String[3];
		Integer[] idades = new Integer[3];
		Scanner scanner = null;

		for (int i = 0; i < nomes.length; i++) {
			scanner = new Scanner(System.in);

			System.out.println("Informe o nome da pessoa " + (i + 1) + ": ");
			nomes[i] = scanner.nextLine();

			System.out.println("Informe a idade de " + nomes[i] + ": ");
			idades[i] = scanner.nextInt();
		}

		scanner.close();

		System.out.println("O mais velho eh: " + nomes[Vetores.posicaoMaiorVetor(idades)]);

	}

	/**
	 * Login e senha Criar um programa que solicite ao usuário um login e uma senha
	 * e depois mostre na tela se o login e a senha são válidos. Para que um login e
	 * uma senha sejam válidos, as regras abaixo devem ser atendidas. - Login e
	 * senha devem ser diferentes - Login e senha devem ter entre 5 a 15 caracteres
	 * - Senha deve ter pelo menos um digite numérico e uma letra maiúscula
	 */
	public static void validarLoginSenha() {
		String login, senha;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o login: ");
		login = scanner.nextLine();

		System.out.println("Informe a senha: ");
		senha = scanner.nextLine();

		scanner.close();

		if (login.equals(senha)) {
			System.out.println("Login e senha devem ser diferentes.");
		} else if (login.length() < 5 || login.length() > 15 || senha.length() < 5 || senha.length() > 15) {
			System.out.println("Login e senha devem ter entre 5 a 15 caracteres ");
		} else {
			int numerico = 0;
			int maiuscula = 0;
			for (int i = 0; i < senha.length(); i++) {
				if (Character.isDigit(senha.charAt(i))) {
					numerico++;
				}
				if (Character.isUpperCase(senha.charAt(i))) {
					maiuscula++;
				}
				if (numerico > 0 && maiuscula > 0) {
					break;
				}
			}
			if (numerico == 0) {
				System.out.println("A senha precisa ter pelo menos um digito numérico.");
			}
			if (maiuscula == 0) {
				System.out.println("A senha precisa ter pelo menos uma letra maiúscula.");
			}
		}

	}

	/**
	 * Criar uma classe que represente um computador. 
	 * O atributo 'processador' deverá ser uma classe chamada 'Processador'
	 * O atributo 'monitor' deverá ser uma classe chamada 'Monitor' 
	 * Criar uma classe principal onde seja criado um objeto do tipo Computador e seja preenchido todos os dados do computador
	 */
	public static void preencherComputador() {
		
		Processador processador = new Processador("Intel", 3.5);
		Monitor monitor = new Monitor("Samsung", "20M37AA", "LED", 19.5);
		Computador computador = new Computador("Positivo", "DSI3667", processador, monitor);
		
		System.out.println(computador.getProcessador().getMarca());
		
	}

}

package br.com.atividade;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Informe sua idade: ");
		int idade = entrada.nextInt();

		System.out.println("********** Informações inseridas **********");
		System.out.println("Nome: " + nome + "\nIdade: " + idade);

	}
}

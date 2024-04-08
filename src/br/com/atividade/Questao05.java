package br.com.atividade;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Informe um número: ");
		int numero = entrada.nextInt();
		int numeroAbsoluto = numero;

		if (numero > 0) {
			int numeroPositivo = numero;
			System.out.println("O número informado é positivo. ");

		} else {
			System.out.println("O número informado é negativo.");
			numeroAbsoluto = -numero;
		}

		switch (numero % 2) {
		case 0:
			System.out.println("O número é par.");
			break;
		case 1:
		case -1:
			System.out.println("O número é ímpar.");
			break;
		}

		System.out.println("O valor absoluto do número é: " + numeroAbsoluto);
	}
}
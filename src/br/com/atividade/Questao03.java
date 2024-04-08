package br.com.atividade;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Informe um número: ");
		int numero = entrada.nextInt();

		if (numero == 0) {
			System.out.println("Você digitou o número zero.");
		} else if (numero < 0) {
			System.out.println("Você digitou um número negativo: " + numero);

		} else {
			System.out.println("Você digitou um número positivo: " + numero);
		}
	}
}

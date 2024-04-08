package br.com.atividade;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Informe um dia da semana de 1 a 7: ");
		int diaDaSemana = entrada.nextInt();

		switch (diaDaSemana) {
		case 1:
			System.out.println("O dia escolhido foi Domingo!");
			break;
		case 2:
			System.out.println("O dia escolhido foi Segunda!");
			break;
		case 3:
			System.out.println("O dia escolhido foi Terça!");
			break;
		case 4:
			System.out.println("O dia escolhido foi Quarta!");
			break;
		case 5:
			System.out.println("O dia escolhido foi Quinta!");
			break;
		case 6:
			System.out.println("O dia escolhido foi Sexta!");
			break;
		case 7:
			System.out.println("O dia escolhido foi Sábado!");
			break;
		default:
			System.out.println("Opção Invalida!!");
		}
	}
}
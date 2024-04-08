package br.com.atividade;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double desconto = 0.0;

		System.out.printf("Informe o valor de sua compra: ");
		double totalCompra = entrada.nextDouble();

		if (totalCompra > 200.00) {
			desconto = totalCompra * 0.10;
		} else if (totalCompra >= 100.00 && totalCompra <= 200.00) {
			desconto = totalCompra * 0.05;

		}

		double valorFinal = totalCompra - desconto;

		System.out.println("Valor total da compra R$: " + valorFinal);

		System.out.println(
				"********** Formas de Pagamento ********** \n 1 - Cartão de Crédito \n 2 - Boleto Bancário \n 3 - Transferência Báncaria");
		System.out.printf("Informe a forma de pagamento: ");
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("# Total das Compras R$: " + valorFinal + "\n# Forma de pagamento: Cartão de Crédito");
			break;
		case 2:
			System.out.println("# Total das Compras R$: " + valorFinal + "\n# Forma de pagamento: Boleto Bancário");
			break;
		case 3:
			System.out.println(
					"# Total das Compras R$: " + valorFinal + "\n# Forma de pagamento: Transferência Báncaria");
			break;
		default:
			System.out.println("Opção Inválida");
		}
	}
}

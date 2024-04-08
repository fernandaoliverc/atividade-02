package br.com.atividade;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double adicao;
        double subtracao;
        double multiplicacao;
        double divisao;

        System.out.print("Informe o primeiro número: ");
        double primeiroNumero = entrada.nextDouble();
        System.out.printf("Informe o segundo número: ");
        double segundoNumero = entrada.nextDouble();

        adicao = primeiroNumero + segundoNumero;
        subtracao = primeiroNumero - segundoNumero;
        multiplicacao = primeiroNumero * segundoNumero;
        divisao = primeiroNumero / segundoNumero;

        System.out.println("********** Resultado **********");
        System.out.println("Adição: " + primeiroNumero + " + " + segundoNumero + " = " + adicao);
        System.out.println("Subtração: " + primeiroNumero + " - " + segundoNumero + " = " + subtracao);
        System.out.println("Multiplicacao: " + primeiroNumero + " * " + segundoNumero + " = " + multiplicacao);
        System.out.println("Divisão: " + primeiroNumero + " / " + segundoNumero + " = " + divisao);

    }
}
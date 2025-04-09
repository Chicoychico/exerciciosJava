package br.com.guanabara.condicoescompostas;

import java.util.Scanner;

/**
 * 33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
 * de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
 * em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
 * ela não pode exceder 30% do salário ou então o empréstimo será negado.
 */
public class Question33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto voce precisa de emprestimo, qual o seu salario e em quantas anos para pagar? ");
        double totalEmprestimo = sc.nextDouble(), salario = sc.nextDouble(), prazo = sc.nextDouble();
        double salarioPrazo = salario*30/100 ;
        double prazoFinal = totalEmprestimo/prazo;
        if (prazoFinal>salarioPrazo){
            System.out.println("Emprestimo NEGADO, valor da parcela excedeu 30% do seu salário");
            System.out.printf("Valor máximo da parcela: R$ %.2f %n", salarioPrazo);
            System.out.printf("Valor total da parcela em %.0f anos será de: R$ %.2f", prazo, prazoFinal);
        } else {
            System.out.println("Emprestimo PERMITIDO, valor da parcela ABAIXO DE 30% do seu salário");
            System.out.printf("Valor máximo da parcela: R$ %.2f %n", salarioPrazo);
            System.out.printf("Valor total da parcela em %.0f anos será de: R$ %.2f", prazo, prazoFinal);
        }

    }
}

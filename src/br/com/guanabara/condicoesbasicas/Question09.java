package br.com.guanabara.condicoesbasicas;

import java.util.Scanner;
/** 9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 */
public class Question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto voce tem na carteira? ");
        double real = sc.nextDouble(),dolar = real/5.70;
        System.out.printf("Seu saldo em dolar é: %.2f", dolar);
    }
}

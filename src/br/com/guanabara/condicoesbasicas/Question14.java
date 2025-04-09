package br.com.guanabara.condicoesbasicas;

import java.util.Scanner;
/** 14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 */
public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos Km foram percorridos? ");
        double kmPercorridos = sc.nextDouble();
        System.out.println("Quantos dias o veiculo ficou alugado? ");
        double diasAlugados = sc.nextDouble();
        double diariaTotalCarro = diasAlugados*90, valorTotalKm= kmPercorridos*0.20, gastoTotal = diariaTotalCarro+valorTotalKm;

        System.out.printf("O valor total a ser pago será de R$ %.2f",gastoTotal);

    }
}

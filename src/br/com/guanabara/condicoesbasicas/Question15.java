package br.com.guanabara.condicoesbasicas;

import java.util.Scanner;
/**15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada. */

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas dias voce trabalhou nesse mês? ");
        double diasTrabalhados = sc.nextInt(), horasTrabalhadas = diasTrabalhados*8 ,valorTotalHoras= horasTrabalhadas*25;
        System.out.printf("Valor total a receber por %.0f horas trabalhadas é: R$ %.2f",horasTrabalhadas,valorTotalHoras);
    }
}

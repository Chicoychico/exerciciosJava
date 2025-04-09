package br.com.guanabara.condicoescompostas;

import java.util.Scanner;
/**
 * 36) Um programa de vida saudável quer dar pontos atividades físicas que podem
 * ser trocados por dinheiro. O sistema funciona assim:
 *  - Cada hora de atividade física no mês vale pontos
 *  - até 10h de atividade no mês: ganha 2 pontos por hora
 *  - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
 *  - acima de 20h de atividade no mês: ganha 10 pontos por hora
 *  - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
 */
public class Question36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas horas de atividade física você fez?");
        double horasDeAtiviadadeFisica = sc.nextInt(), pontos;

        if (horasDeAtiviadadeFisica<=10){
             pontos = horasDeAtiviadadeFisica*2;
        } else if(horasDeAtiviadadeFisica<=20){
             pontos = horasDeAtiviadadeFisica *5;
        }else {
             pontos = horasDeAtiviadadeFisica *10;
        }
        double valorTotal = pontos *0.05;

        System.out.printf("Voce fez %.0f horas de treinamento, sua bonificação será de: R$ %.2f",horasDeAtiviadadeFisica,valorTotal);
    }


}

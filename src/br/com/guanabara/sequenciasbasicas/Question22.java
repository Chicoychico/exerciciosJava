package br.com.guanabara.sequenciasbasicas;

import java.util.Scanner;
/**
 * 22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
 * situação em relação ao alistamento militar.
 *  - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
 * alistamento.
 *  - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
 * alistamento.
 */
public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sua data de nasc e em que ano estamos?");
        int anoNasc = sc.nextInt(),anoAtual = sc.nextInt();
        double  idade = anoAtual-anoNasc;

        if (idade<18){
            double alistamento = 18 - idade;
            System.out.printf("Sua idade é %.0f, voce podera se alistar em %.0f anos",idade,alistamento);
        }else {
             double alistado = idade - 18;
            System.out.printf("Sua idade é %.0f, voce poderia se alistar a %.0f anos",idade,alistado);
        }

    }
}

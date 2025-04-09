package br.com.guanabara.sequenciasbasicas;

import java.util.Scanner;
/** 19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
 média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
 não um bom aproveitamento (se ficou acima da média 7.0)
 */
public class Question18 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira sua no 1ª e 2ª nota:");
            double nota1 = sc.nextDouble(), nota2 = sc.nextDouble(), media = (nota1+nota2)/2;

            if (media>=7){
                System.out.printf("Media: %.2f parabens voce ficou acima da média!",media);
            } else {
                System.out.printf("Media: %.2f infelizmente voce ficou abaixo da média.",media);
            }

        }
}

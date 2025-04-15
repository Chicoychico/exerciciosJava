package br.com.guanabara.arrays;

import java.util.Scanner;

/**
 * 81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
 * final, mostre:
 * a) Qual é a média de idade das pessoas cadastradas
 * b) Em quais posições temos pessoas com mais de 25 anos
 * c) Qual foi a maior idade digitada (podem haver repetições)
 * d) Em que posições digitamos a maior idade
 */
public class Question81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[8];
        int soma = 0, maiorIdade =0;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Qual a sua idade? ");
            idades[i] = sc.nextInt();
            soma += idades[i];

            if(i==0){
                maiorIdade = idades[i];
            }else if (idades[i]>maiorIdade) {
                maiorIdade = idades[i];
            }
        }

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 25) {
                System.out.println("Na posição "+i+", temos alguem com mais de 25. ");
            }
            if (idades[i] == maiorIdade){
                System.out.println("Na posição "+i+", temos a maior idade. ");
            }
        }

        double media = (double) soma/idades.length;
        System.out.printf("Qual é a média de idade das pessoas cadastradas: %.2f\n",media);
        System.out.println("Qual foi a maior idade digitada (podem haver repetições): "+ maiorIdade);
    }
}

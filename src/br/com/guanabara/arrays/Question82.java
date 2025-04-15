package br.com.guanabara.arrays;

import java.util.Scanner;

public class Question82 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] notas = new int[10];
        int soma = 0, maiorNota = 0, acimaDaMedia = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas:");
            notas[i] = sc.nextInt();
            soma += notas[i];

            if (i == 0) {
                maiorNota = notas[i];
            } else if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        double media = (double) soma / notas.length;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            }
            if (notas[i] == maiorNota) {
                System.out.println("Na posição " + i + ", temos a maior nota. ");
            }
        }

        System.out.printf("A media da turma é: %.2f\n", media);
        System.out.println("Apenas " + acimaDaMedia + " estão acima da media.");
        System.out.println(maiorNota + " foi a maior nota digitada");

    }
}
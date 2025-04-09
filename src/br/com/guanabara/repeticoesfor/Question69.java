package br.com.guanabara.repeticoesfor;

import java.util.Scanner;

public class Question69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro termo: ");
        int primeiro = sc.nextInt();
        int inicio = primeiro;
        System.out.println("Razao da PA:");
        int razao = sc.nextInt(),soma = 0;

        for (int i = 1; i <= 10; i++) {

            if (i == 1) {
                System.out.print(inicio + " ");
                soma+=primeiro;
            } else {
                primeiro += razao;
                System.out.print(primeiro + " ");
                soma+=primeiro;
            }
            if (i == 10) {
                System.out.println("= " + soma);
            }
        }
    }
}

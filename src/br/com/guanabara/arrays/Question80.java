package br.com.guanabara.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * 80) Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e
 * 15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
 * número (chave) e seu programa deve mostrar em que posições essa chave foi
 * encontrada. Mostre também quantas vezes a chave foi sorteada.
 */
public class Question80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] inteiros = new int[30];
        for (int i = 0; i < inteiros.length; i++) {
            inteiros[i] = random.nextInt(15) + 1;
            System.out.println("_-_-_-_-_-_-");
            System.out.println(inteiros[i]);
        }

        System.out.println("Digite um numero de 1 a 15");
        int chave = sc.nextInt(), soma = 0;
        for (int i = 0; i < inteiros.length; i++) {
            if (chave == inteiros[i]) {
                System.out.println(" Chave na posição: " + i);
                soma++;
            }
        }
        System.out.println(" A chave foi sorteada um total de: " + soma + " vezes.");
    }
}

package br.com.guanabara.arrays;

import java.util.Random;

/**
 * 76) Crie um programa que preencha automaticamente um vetor numérico com 7
 * números gerados aleatoriamente pelo computador e depois mostre os valores
 * gerados na tela.
 */
public class Question76 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[7];

        for (int i = 0; i< array.length; i++){
            array[i] = random.nextInt(10) + 0;
            System.out.print(array[i]+" | ");
        }
    }
}

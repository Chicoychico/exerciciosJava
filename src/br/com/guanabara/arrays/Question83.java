package br.com.guanabara.arrays;
/*
 * ALGORITMO BUBBLE SORT
 */

import java.util.Random;


public class Question83 {
    public static void main(String[] args) {

        Random random = new Random();
        int aux;
        boolean controle;

        int[] randomico = new int[20];

        for (int i = 0; i < randomico.length; i++) {
            randomico[i] = random.nextInt(99) + 1;
            System.out.println(randomico[i] + " random");
            System.out.println("-=-=-=-=-");
        }

        for (int i = 0; i < randomico.length; i++) {
            controle = true;
            for (int j = 0; j < randomico.length - 1; j++) {
                if (randomico[j] > randomico[j + 1]) {
                    aux = randomico[j];
                    randomico[j] = randomico[j + 1];
                    randomico[j + 1] = aux;
                    controle = false;
                }
            }
            if (controle) {
                break;
            }
        }

        for (int num : randomico) {
            System.out.println("ORDEM CRESCENTE");
            System.out.println(num);
            System.out.println("-=-=-=-=-");
        }

    }
}

package br.com.guanabara.arrays;

/**
 * 71) Faça um programa que preencha automaticamente um vetor numérico com 8
 * posições, conforme abaixo:
 */
public class Question71 {
    public static void main(String[] args) {

        int [] array = new int[8];
        for (int i = 0; i < array.length; i++) {
                    array [i] = 999;
                    System.out.println("-------");
                    System.out.println(array[i]);
              }
    }
}

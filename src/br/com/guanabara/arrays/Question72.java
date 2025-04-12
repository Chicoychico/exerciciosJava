package br.com.guanabara.arrays;

/**
 * 72) Crie um programa que preencha automaticamente (usando lógica, não apenas
 * atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
 */
public class Question72 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (i+1)*5;
        }

        System.out.println("Indices: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" | ");
        }
        System.out.println("\n-------------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i+" | ");
        }

        System.out.println("===========");
        System.out.println(array[5]);
    }
}

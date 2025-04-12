package br.com.guanabara.arrays;

public class Question74 {
    public static void main(String[] args) {
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 5;
            } else {
                array[i] = 3;
            }
        }
        System.out.println("\nIndices: ");
        for (int num : array) {
            System.out.print(num + " | ");
        }

        for(int i = 0; i< array.length;i++){
            array[i]=i;
        }

        System.out.println("\nVetores: ");
        for(int num: array){
            System.out.print(num + " | ");
        }
    }
}

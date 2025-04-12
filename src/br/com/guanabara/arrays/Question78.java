package br.com.guanabara.arrays;

import java.util.Scanner;

/**
 * 78) Escreva um programa que leia 15 números e guarde-os em um vetor. No final,
 * mostre o vetor inteiro na tela e em seguida mostre em que posições foram
 * digitados valores que são múltiplos de 10.
 */
public class Question78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Numero:");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i< num.length;i++){

            if (num[i]%10==0){
                System.out.print("posição "+i);
                System.out.print(" é multiplo de 10. \n");
            }
        }

    }
}

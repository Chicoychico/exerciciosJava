package br.com.guanabara.arrays;

import java.util.Scanner;

/**
 * 79) Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
 * No final, mostre quais são os números pares que foram digitados e em que
 * posições eles estão armazenados.
 */
public class Question79 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int [] inteiros = new int[5];
        for (int i = 0; i < inteiros.length; i++){
            System.out.println("Inteiros: ");
            inteiros[i]= sc.nextInt();
        }
        System.out.println("Numero pares:");
        for (int i = 0; i< inteiros.length; i++){
            if(inteiros[i]%2 ==0){
                System.out.println(inteiros[i]+" é Par, posição: "+i);
            }
        }
    }
}

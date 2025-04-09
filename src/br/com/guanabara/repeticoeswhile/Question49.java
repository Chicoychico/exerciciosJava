package br.com.guanabara.repeticoeswhile;

import java.util.Scanner;
/**
 * 49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles
 * são pares e quantos são ímpares.
 */
public class Question49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 6, incremento,par=0,impar=0;

        while (i >= 1) {
            System.out.println("Digite um numero aleatorio:");
            incremento = sc.nextInt();
            if (incremento%2==0){
                par++;
            }
            else {
                impar++;
            }
            i--;
        }
        System.out.println("Voce digitou "+par+" numeros pares");
        System.out.println("Voce digitou "+impar+" numeros impares");
    }
}

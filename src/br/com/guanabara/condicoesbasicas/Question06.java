package br.com.guanabara.condicoesbasicas;

import java.util.Scanner;

/** Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
 Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10

 */
public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,antecessor,sucessor;
        System.out.println("Digite um numero qualquer: ");
        n = sc.nextInt();
        antecessor = n-1;
        sucessor = n+1;

        System.out.println("O Sucessor de "+n+" é: "+sucessor);
        System.out.println("O Antecessor de "+n+" é: "+antecessor);

    }
}

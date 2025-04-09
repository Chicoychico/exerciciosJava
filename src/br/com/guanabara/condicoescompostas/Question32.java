package br.com.guanabara.condicoescompostas;

import java.util.Random;
import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numSorteado = random.nextInt(5) + 1;
        System.out.println("Tente adivinhar o numero de 1 a 5, insira seu palpite:");
        int sorte = sc.nextInt();
        if (numSorteado == sorte) {
            System.out.println("Parabens voce acertou *_*");
            System.out.println("O numero da sorte é: "+numSorteado);
        } else {
            System.out.println("Voce perdeu, tente novamente '_' ");
            System.out.println("O numero da sorte é: "+numSorteado);
        }
    }
}

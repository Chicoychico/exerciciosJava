package br.com.guanabara.condicoesbasicas;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n1,n2;
        float media;
        System.out.println("N1");
        n1 = sc.nextInt();
        System.out.println("N2");
        n2 = sc.nextInt();
        media = (n1+n2) / 2;

        System.out.printf("Média de n1 e n2 é: %.2f",media);
    }
}

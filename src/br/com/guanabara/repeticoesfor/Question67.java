package br.com.guanabara.repeticoesfor;

import java.util.Scanner;

public class Question67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= numero; i++) {
            if (i < numero) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i+ " FIM");
            }
        }
    }
}

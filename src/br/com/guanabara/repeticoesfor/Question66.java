package br.com.guanabara.repeticoesfor;

import java.util.Scanner;

public class Question66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println(numero+" * "+i+" = "+ numero*i);
        }
    }
}

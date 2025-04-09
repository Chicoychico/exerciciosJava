package br.com.guanabara.repeticoeswhile;

/**
 * 46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
 * 8 + 10 + 12 + 14 + ... + 98 + 100.
 */

public class Question46 {
    public static void main(String[] args) {

        int inicial = 6, ultimo = 100, total = 0;
        while (inicial <= ultimo) {

            if (inicial < ultimo) {
                System.out.print(inicial + " + ");
                total = inicial + total;
            } else {
                System.out.print(inicial);
            }
            inicial += 2;
        }
        System.out.println(" = " + total);
    }
}

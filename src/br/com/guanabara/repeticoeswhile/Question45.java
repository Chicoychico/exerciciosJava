package br.com.guanabara.repeticoeswhile;

import java.util.Scanner;
/**
 * 45) O programa acima vai ter um problema quando digitarmos o primeiro valor
 * maior que o último. Resolva esse problema com um código que funcione em qualquer
 * situação.
 */
public class Question45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero inicial:");
        int incial = sc.nextInt();
        System.out.println("Digite o numero final:");
        int ultimoValor = sc.nextInt();
        System.out.println("Quanto será o incremento?");
        int incremento = sc.nextInt();


        if (incial < ultimoValor) {
            while (incial <= ultimoValor) {
                System.out.println(incial);
                incial += incremento;
            }
        } else {
            while (incial >= ultimoValor) {
                System.out.println(incial);
                incial -= incremento;
            }
        }

    }
}

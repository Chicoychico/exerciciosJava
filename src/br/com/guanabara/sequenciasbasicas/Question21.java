package br.com.guanabara.sequenciasbasicas;

import java.util.Scanner;
/**
 * 21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
 * BISSEXTO.
 */
public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano aleatório: ");
        double ano = sc.nextInt();
        boolean isBisexto = false;
        if((ano%400==0) ||(ano % 100 != 0 && ano % 4 == 0)){
            isBisexto = true;
        }
        if (isBisexto){
            System.out.printf("%.0f é um ano bisexto", ano);
        } else {
            System.out.printf("%.0f não é um ano bisexto", ano);
        }
    }
}

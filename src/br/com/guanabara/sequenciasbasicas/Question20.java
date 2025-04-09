package br.com.guanabara.sequenciasbasicas;

import java.util.Scanner;
/** 18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
 dela e depois mostre se ela pode ou não votar.
 */
public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Em que ano voce nasceu? ");
        int anoDeNascimento = sc.nextInt();
        System.out.println("Em que ano voce estamos? ");
        int anoAtual= sc.nextInt(), idade = anoAtual - anoDeNascimento;

        if (idade>=18){
            System.out.println("Voce pode votar!");
        } else {
            System.out.println("Voce não pode votar!");
        }
    }
}

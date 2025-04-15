package br.com.guanabara.arrays;
import java.util.Scanner;

/**
 * 84) Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
 * valores em dois vetores, em posições relacionadas. No final, mostre uma listagem
 * contendo apenas os dados das pessoas menores de idade.
 */
public class Question84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nome = new String[3];
        int [] idade = new int[3];

        for(int i = 0; i< idade.length; i++){
            System.out.println("Qual o seu nome? ");
            nome[i] = sc.next();
            System.out.println("Qual sua idade?");
            idade[i] = sc.nextInt();
        }

        for (int i = 0; i< idade.length; i++){
            if (idade[i]<=18){
                System.out.println(nome[i]+" tem "+idade[i]+" anos, menor de idade");
            }
        }
    }
}

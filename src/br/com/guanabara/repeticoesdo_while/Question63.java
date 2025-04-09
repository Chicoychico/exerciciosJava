package br.com.guanabara.repeticoesdo_while;

import java.util.Scanner;

/**
 * 63) Crie um programa usando a estrutura “faça enquanto” que leia vários números.
 * A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
 * tela:
 * a) O somatório entre todos os valores
 * b) Qual foi o menor valor digitado
 * c) A média entre todos os valores
 * d) Quantos valores são pares
 */
public class Question63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resposta;
        int somatorio = 0, unidades = 0, numero;
        System.out.println("Numero: ");
        int menorValor = sc.nextInt(), numPares=0;
        //boolean primeiroNumero = false;
        System.out.println("Deseja continuar? s/n");
        resposta = sc.next().toUpperCase().charAt(0);
        numero=menorValor;
        somatorio+=numero;

        do {
            System.out.println("Numero: ");
            numero = sc.nextInt();
            somatorio +=numero;
            unidades++;

            if(numero<menorValor){
                menorValor=numero;
                // primeiroNumero = true;
            }

            if(numero%2==0){
                numPares++;
            }
            System.out.println("Deseja continuar? s/n");
            resposta = sc.next().toUpperCase().charAt(0);
        } while (resposta == 'S');

        double media = (double) somatorio / unidades;

        System.out.println("a) O somatório entre todos os valores "+ somatorio);
        System.out.println("b) Qual foi o menor valor digitado "+ menorValor);
        System.out.printf("c) A média entre todos os valores %.2f %n", media);
        System.out.println("d) Quantos valores são pares "+numPares);
    }
}

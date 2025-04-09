package br.com.guanabara.repeticoeswhile;

import java.util.Scanner;

/**
 * 54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
 * no final:
 * a) Qual foi a média de altura do grupo
 * b) Quantas pessoas pesam mais de 90Kg
 * c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
 * d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
 */
public class Question54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1,noventaKg=0,baixinho=0, grandao =0;
        double mediaAltura, altura, somaAltura=0,peso;
        while (i<=3){

            System.out.println("Qual sua altura? ");
            altura = sc.nextDouble();
            System.out.println("Qual o seu peso? ");
            peso =  sc.nextDouble();

            if(peso>=90){
                noventaKg++;
            }else if (peso<50 && altura<1.60){
                baixinho++;
            }
            if (peso>100 && altura>1.90) {
                grandao++;
            }
            somaAltura +=altura;
            i++;
        }
        mediaAltura = somaAltura/7;
        System.out.printf("a) Qual foi a média de altura do grupo %.2f", mediaAltura);
        System.out.println("b) Quantas pessoas pesam mais de 90Kg "+ noventaKg);
        System.out.println("c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m "+baixinho);
        System.out.println("d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg. "+grandao);
    }
}

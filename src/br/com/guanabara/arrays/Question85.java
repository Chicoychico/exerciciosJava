package br.com.guanabara.arrays;
import java.util.Scanner;

/**
 * 85) Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
 * guarde esses dados em três vetores. No final, mostre uma listagem contendo
 * apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.
 */
public class Question85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] sexo = new char[5];
        double [] salario = new double[5];
        String [] nome = new String[5];

        for (int i = 0; i< nome.length; i++){
            System.out.println("Seu nome:");
            nome[i] = sc.next();
            System.out.println("Seu sexo: M ou F");
            sexo[i] = sc.next().toUpperCase().charAt(0);
            System.out.println("Seu salario:");
            salario[i] = sc.nextDouble();
        }

        for (int i = 0; i< nome.length; i++){
            if (sexo[i]=='F'){
                if(salario[i]>5000){
                    System.out.println(nome[i]+" é do sexo "+sexo[i]+" e recebe R$ "+salario[i]);
                }
            }
        }

    }
}

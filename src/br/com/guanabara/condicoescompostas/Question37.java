package br.com.guanabara.condicoescompostas;

import java.util.Scanner;

public class Question37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu sexo? Homem(1) Mulher(2)");
        int sexo = sc.nextInt();
        System.out.println("Qual o seu salário e a quanto tempo voce trabalha nessa empresa. ");
        double salario = sc.nextDouble(), tempo = sc.nextDouble(), aumento, novoSalario ;
        String genero = " Vazio";

        if (sexo == 1) {
            if (tempo < 20) {
                aumento = salario * 3 / 100;
                novoSalario = salario + aumento;
            } else if (tempo <= 30) {
                aumento = salario * 13 / 100;
                novoSalario = salario + aumento;
            } else {
                aumento = salario * 25 / 100;
                novoSalario = salario + aumento;
            }
            System.out.printf("Seu novo salário será de %.2f", novoSalario);
        } else if (sexo == 2) {
            if (tempo < 15) {
                aumento = salario * 5 / 100;
                novoSalario = salario + aumento;
            } else if (tempo <= 20) {
                aumento = salario * 12 / 100;
                novoSalario = salario + aumento;
            } else {
                aumento = salario * 23 / 100;
                novoSalario = salario + aumento;
            }
            System.out.printf("Seu novo salário será de %.2f", novoSalario);
        } else {
            System.out.println("ERRO " + genero);
        }
    }
}

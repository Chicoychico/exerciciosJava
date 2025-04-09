package br.com.guanabara.repeticoesdo_while;

import java.util.Scanner;

/**
 * 59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
 * perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
 * a) qual é a maior idade lida
 * b) quantos homens foram cadastrados
 * c) qual é a idade da mulher mais jovem
 * d) qual é a média de idade entre os homens
 */
public class Question59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maiorIdade = 0, idadeHomem = 0;
        double homem = 0, menorIdadeMulher = -1;
        boolean mulherCadastrada = false;

        while (true) {
            System.out.println("Sexo: 1 - HOMEM");
            System.out.println("Sexo: 2 - MULHER");
            int sexo = sc.nextInt();
            System.out.println("idade:");
            double idade = sc.nextDouble();

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (sexo == 1) {
                homem++;
                idadeHomem += idade;
            } else if (sexo == 2) {
                if (!mulherCadastrada || idade < menorIdadeMulher) {
                    menorIdadeMulher = idade;
                    mulherCadastrada = true;
                }
            } else {
                System.out.println("I N V A L I D O");
            }
            System.out.println("Deseja continuar? s/n");
            char resposta = sc.next().toUpperCase().charAt(0);
            if (resposta != 'S') {
                break;
            }
        }
        double mediaHomem = idadeHomem / homem;
        System.out.println("a) qual é a maior idade lida " + maiorIdade);
        System.out.println("b) quantos homens foram cadastrados " + homem);
        System.out.println("c) qual é a idade da mulher mais jovem " + menorIdadeMulher);
        System.out.println("d) qual é a média de idade entre os homens " + mediaHomem);
    }
}

package br.com.guanabara.condicoesbasicas;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int salario;

        System.out.println("Qual o seu nome?");
        nome = sc.next();
        System.out.println("Qual é o seu salário?");
        salario = sc.nextInt();

        System.out.println("Nome do funcionário: "+ nome);
        System.out.println("Salário do funcionário: R$"+ salario);
    }
}

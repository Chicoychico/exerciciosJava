package br.com.guanabara.repeticoesdo_while;

import java.util.Scanner;

public class Question57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, salarioTotalHomem = 0, salarioTotalMulher=0;
        byte sexo;

        while (true){
            System.out.println("Qual o seu sexo? 1=Homem 2=Mulhere");
            sexo = sc.nextByte();
            System.out.println("Qual o seu salario? ");
            salario = sc.nextDouble();

            if (sexo ==1){
                salarioTotalHomem+=salario;
            } else if(sexo==2){
                salarioTotalMulher+=salario;
            }else {
                System.out.println("Entrada invalida, tente novamente");
            }

            System.out.println("Deseja continuar ?");
            char resposta = sc.next().toUpperCase().charAt(0);
            if(resposta!='S' ){
                break;
            }

        }
        System.out.println("Salario masculino = R$"+salarioTotalHomem);
        System.out.println("Salario feminino = R$"+salarioTotalMulher);
    }
}

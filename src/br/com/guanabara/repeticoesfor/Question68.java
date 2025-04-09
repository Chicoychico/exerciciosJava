package br.com.guanabara.repeticoesfor;

import java.util.Scanner;

/**
 * 68) Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
 * “para”. No final, mostre na tela:
 * a) Quantas mulheres foram cadastradas
 * b) Quantos homens pesam mais de 100Kg
 * c) A média de peso entre as mulheres
 * d) O maior peso entre os homens
 */
public class Question68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mulher = 0, gordo=0;
        double pesoMulher=0, pesoHomem, maiorPesoHomem=0;
        boolean cadastro = false;

        for (int i = 1; i <= 8; i++) {
            System.out.println("Sexo: H/M");
            char sexo = sc.next().toUpperCase().charAt(0);
            System.out.println("Peso: ");
            double peso = sc.nextDouble();
            if (sexo == 'M'){
               mulher++;
               pesoMulher+=peso;
            }else if (sexo == 'H'){
                pesoHomem=peso;
                if(!cadastro || pesoHomem>maiorPesoHomem){
                    maiorPesoHomem=pesoHomem;
                    cadastro = true;
                }
                if(pesoHomem>100){
                    gordo++;
                }
            }

        }
        double mediaMulher = pesoMulher/mulher;

        System.out.println("a) Quantas mulheres foram cadastradas "+ mulher);
        System.out.println("b) Quantos homens pesam mais de 100Kg "+ gordo);
        System.out.printf("c) A média de peso entre as mulheres %.2f %n",mediaMulher);
        System.out.println("d) O maior peso entre os homens "+ maiorPesoHomem);
    }
}

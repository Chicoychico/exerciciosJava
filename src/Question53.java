import java.util.Scanner;

/**
 * 53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
 * a) Quantos homens foram cadastrados
 * b) Quantas mulheres foram cadastradas
 * c) A média de idade do grupo
 * d) A média de idade dos homens
 * e) Quantas mulheres tem mais de 20 anos
 */

public class Question53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, homem = 0, mulher = 0, idade, somaIdade = 0, idadeHomem = 0, idadeMulher = 0;
        double media, mediaHomem;
        byte sexo;
        while (i <= 5) {
            System.out.println("Qual o seu sexo ?");
            System.out.println("1 para Homem");
            System.out.println("2 para Mulher");
            System.out.println("----------------------------");
            sexo = sc.nextByte();
            System.out.println("Qual sua idade? ");
            System.out.println("----------------------------");
            idade = sc.nextInt();

            switch (sexo) {
                case 1: {
                    homem++;
                    idadeHomem += idade;
                    break;
                }

                case 2: {
                    mulher++;
                    if (idade >= 20) {
                        idadeMulher++;
                    }
                    break;
                }
                default:
                    System.out.println("Invalido.");
                    break;

            }
            somaIdade += idade;
            i++;
        }
        media = somaIdade / 5;
        mediaHomem = idadeHomem / homem;

        System.out.println("a)Quantos homens foram cadastrados:");
        System.out.println(homem);
        System.out.println("----------------------------");
        System.out.println("b)Quantas mulheres foram cadastradas");
        System.out.println(mulher);
        System.out.println("----------------------------");
        System.out.println("c)A média de idade do grupo");
        System.out.println(media);
        System.out.println("----------------------------");
        System.out.println("d)A média de idade dos homens");
        System.out.println(mediaHomem);
        System.out.println("----------------------------");
        System.out.println("e)Quantas mulheres tem mais de 20 anos");
        System.out.println(idadeMulher);
        System.out.println("----------------------------");

    }
}

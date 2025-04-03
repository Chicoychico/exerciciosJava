import java.util.Scanner;

/**
 * 60) Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
 * O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
 * a) O nome da pessoa mais velha
 * b) O nome da mulher mais jovem
 * c) A média de idade do grupo
 * d) Quantos homens tem mais de 30 anos
 * e) Quantas mulheres tem menos de 18 anos
 */
public class Question60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeMaisVelho = 0, mulherNova = -1, mulherMenorIdade = 0, homemMaioridade = 0, somador = 0, usuarios = 0;
        boolean mulherCadastrada = false;
        String nomeMulherMaisNova = "", nomePessoaMaisVelha = "";
        while (true) {
            System.out.println("Qual o seu nome? ");
            String nome = sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Sexo: M/F");
            char sexo = sc.next().toUpperCase().charAt(0);
            somador += idade;
            usuarios++;
            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomePessoaMaisVelha = nome;
            }
            if (sexo == 'M') {
                if (idade >= 30) {
                    homemMaioridade++;
                }
            } else if (sexo == 'F') {
                if (!mulherCadastrada || idade < mulherNova) {
                    nomeMulherMaisNova = nome;
                    mulherNova = idade;
                    mulherCadastrada = true;
                }
                if (idade <= 18) {
                    mulherMenorIdade++;
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
        double media = (double) somador / (double) usuarios;
        System.out.println("a) O nome da pessoa mais velha " + nomePessoaMaisVelha);
        System.out.println("b) O nome da mulher mais jovem " + nomeMulherMaisNova);
        System.out.println("c) A média de idade do grupo " + media);
        System.out.println("d) Quantos homens tem mais de 30 anos " + homemMaioridade);
        System.out.println("de) Quantas mulheres tem menos de 18 anos " + mulherMenorIdade);
    }
}

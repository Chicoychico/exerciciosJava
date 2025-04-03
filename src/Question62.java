import java.util.Scanner;

/**
 * 62) Faça um programa usando a estrutura “faça enquanto” que leia a idade de
 * várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
 * não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
 * na tela:
 * a) Quantas idades foram digitadas
 * b) Qual é a média entre as idades digitadas
 * c) Quantas pessoas tem 21 anos ou mais.
 */
public class Question62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resposta;
        int usuarios = 0, maioridade=0, somatorio =0;

        do {
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            usuarios++;
            somatorio+=idade;
            if(idade>=21){
                maioridade++;
            }
            System.out.println("Continua? ");
            resposta = sc.next().toUpperCase().charAt(0);
        } while (resposta == 'S');

        double media = (double) somatorio/usuarios;
        System.out.println("a) Quantas idades foram digitadas " + usuarios);
        System.out.println("b) Qual é a média entre as idades digitadas "+ media);
        System.out.println("c) Quantas pessoas tem 21 anos ou mais." + maioridade);
    }
}

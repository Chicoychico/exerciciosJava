import java.util.Scanner;

/**
 * 52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
 * a) Qual é a média de idade do grupo
 * b) Quantas pessoas tem mais de 18 anos
 * c) Quantas pessoas tem menos de 5 anos
 * d) Qual foi a maior idade lida
 */
public class Question52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, idade, somaIdade = 0, maiorIdade = 0, menorIdade = 0;
        int maisVelho = 0;
        while (i <= 10) {
            System.out.println("Insira a idade: ");
            idade = sc.nextInt();
            somaIdade += idade;
            i++;
            if (idade >= 18) {
                maiorIdade++;
            } else if (idade <= 5) {
                menorIdade++;
            }
            if (idade > maisVelho) {
                maisVelho = idade;
            }

        }
        double mediaIdade = (double) somaIdade / 10;

        System.out.printf("A media das idades lidas é: %.2f %n", mediaIdade);
        System.out.println("Existem " + maiorIdade + " pessoas maiores de 18 anos.");
        System.out.println("Existem " + menorIdade + " pessoas menores de 5 anos.");
        System.out.println("A maior idade lida foi:  " + maisVelho + " anos.");
    }
}

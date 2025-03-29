import java.util.Scanner;

/**
 * 29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
 * quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
 * acordo com a tabela a seguir:
 *  - Até 3 anos de empresa: aumento de 3%
 *  - entre 3 e 10 anos: aumento de 12.5%
 *  - 10 anos ou mais: aumento de 20%
 */

public class Question29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Qual o seu nome? ");
        String nome = sc.next();
        System.out.println("Qual o seu salário? Quanto tempo voce esta na empresa? ");
        double salario = sc.nextDouble(), tempo = sc.nextInt();

        if (tempo<3){
            System.out.println("Parabens "+ nome +" Voce vai ter um aumento de 3%");
            double aumento = salario*3/100, novoSalario = salario+aumento;
            System.out.printf("Seu aumento foi de R$ %.2f seu no salario será de R$ %.2f",aumento,novoSalario);
        } else if (tempo>3 && tempo<10) {
            System.out.println("Parabens "+ nome +" Voce vai ter um aumento de 12,5%");
            double aumento = salario*12.5/100, novoSalario = salario+aumento;
            System.out.printf("Seu aumento foi de R$ %.2f seu no salario será de R$ %.2f",aumento,novoSalario);
        } else {
            System.out.println("Parabens "+ nome +" Voce vai ter um aumento de 20%");
            double aumento = salario*20/100, novoSalario = salario+aumento;
            System.out.printf("Seu aumento foi de R$ %.2f seu no salario será de R$ %.2f",aumento,novoSalario);
        }
    }
}

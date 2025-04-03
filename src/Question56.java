import java.util.Scanner;

/**
 * 56) Crie um programa que leia vários números pelo teclado e mostre no final o
 * somatório entre eles.
 * Obs: O programa será interrompido quando o número 1111 for digitado
 */

public class Question56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0, numero, soma = 0;
        while (i != 1111) {
            System.out.println("Escreva um numero aleatorio: ");
            System.out.println("------------------------------");
            numero = sc.nextInt();
            if (numero == 1111) {
                System.out.println("Encerrado");
                break;
            }
            soma += numero;
            i++;
        }
        System.out.println("_______________________________");
        System.out.println("soma = "+soma);

    }
}

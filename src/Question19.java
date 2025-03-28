import java.util.Scanner;
/**
 * 20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
 * ÍMPAR.
 */
public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero qualquer: ");
        int n = sc.nextInt(), status = n%2;

        if(status==0){
            System.out.println("Numero digitado é par.");
        } else {
            System.out.println("Numero digitado é impar.");
        }

    }
}

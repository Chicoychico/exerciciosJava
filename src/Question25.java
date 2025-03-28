import java.util.Scanner;
/**
 * 25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
 * Analise seus comprimentos e diga se é possível formar um triângulo com essas
 * retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
 * de cada lado deve ser menor que a soma dos outros dois.
 */
public class Question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira respectivamente, os lados de um triangulo A, B e C: ");
        double tA= sc.nextDouble(),tB = sc.nextDouble(),tC= sc.nextDouble();

        if ((tA<tB+tC) && (tB<tA+tC) && (tC<tA+tB)){
            System.out.println("A B C é um triangulo!");
        }else {
            System.out.println("Não é um triangulo!");
        }
    }
}

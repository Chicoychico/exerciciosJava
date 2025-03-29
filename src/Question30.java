import java.util.Scanner;
/**
 * 30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
 * de triângulo será formado:
 *  - EQUILÁTERO: todos os lados iguais
 *  - ISÓSCELES: dois lados iguais
 *  - ESCALENO: todos os lados diferentes
 */
public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira respectivamente, os lados de um triangulo A, B e C: ");
        double tA= sc.nextDouble(),tB = sc.nextDouble(),tC= sc.nextDouble();

        if ((tA<tB+tC) && (tB<tA+tC) && (tC<tA+tB)){
            System.out.println("A B C é um triangulo!");
            if (tA==tB & tB==tC){
                System.out.println("- EQUILÁTERO: todos os lados iguais");
            } else if((tA == tB && tB!=tC)||(tB==tC && tC!=tA)||(tC==tA && tC!=tB)){
                System.out.println("- ISÓSCELES: dois lados iguais");
            } else {
                System.out.println("- ESCALENO: todos os lados diferentes");
            }
        }else {
            System.out.println("Não é um triangulo!");
        }
    }
}

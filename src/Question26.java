import java.util.Scanner;

/**
 * 26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
 * na tela uma das mensagens abaixo:
 *  - O primeiro valor é o maior
 *  - O segundo valor é o maior
 *  - Não existe valor maior, os dois são iguais
 */
public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira dois numeros inteiros: ");
        double  num1 = sc.nextInt(), num2 = sc.nextInt();

        if (num1>num2){
            System.out.printf("%.0f é maior que %.0f.", num1,num2);
        }else if (num2>num1){
            System.out.printf("%.0f é maior que %.0f.", num2,num1);
        }else {
            System.out.printf("%.0f é igual a %.0f.", num2,num1);
        }

    }
}

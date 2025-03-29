import java.util.Scanner;

/**
 * 34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
 * peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
 * indivíduo dentro de certas faixas.
 * - abaixo de 18.5: Abaixo do peso
 * - entre 18.5 e 25: Peso ideal
 * - entre 25 e 30: Sobrepeso
 * - entre 30 e 40: Obesidade
 * - acima de 40: Obseidade mórbida
 * Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
 * da altura)
 */
public class Question34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("---------------CALCULO DE IMC--------------");
        System.out.println("-------------------------------------------");
        System.out.println("----------------INSIRA ALTURA--------------");
        double altura = sc.nextDouble();
        System.out.println("-------------------------------------------");
        System.out.println("-----------------INSIRA PESO---------------");
        double peso = sc.nextDouble(), imc = peso / (altura * altura);
        System.out.println("-------------------------------------------");
        if (imc < 18.5) {
            System.out.printf("Seu imc é de %.2f, voce esta ABAIXO DO PESO", imc);
        } else if (imc >= 18.5 && imc < 25) {
            System.out.printf("Seu imc é de %.2f, voce esta NO PESO IDEAL", imc);
        } else if (imc >= 25 && imc < 30) {
            System.out.printf("Seu imc é de %.2f, voce esta com SOBREPESO", imc);
        } else if (imc >= 30 && imc < 40) {
            System.out.printf("Seu imc é de %.2f, voce esta com OBESIDADE", imc);
        } else if (imc >= 40) {
            System.out.printf("Seu imc é de %.2f, voce esta com OBESIDADE MÓRBIDA", imc);
        }
    }
}

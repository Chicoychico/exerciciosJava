import java.util.Scanner;

/**
 * 28) Faça um programa que leia a largura e o comprimento de um terreno
 * retangular, calculando e mostrando a sua área em m². O programa também
 * deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
 * - Abaixo de 100m² = TERRENO POPULAR
 * - Entre 100m² e 500m² = TERRENO MASTER
 * - Acima de 500m² = TERRENO VIP
 */
public class Question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a largura e comprimento do seu terreno, respectivamente: ");
        double largura = sc.nextDouble(), comprimento = sc.nextDouble(), area = largura * comprimento;

        if (area < 100) {
            System.out.printf("AREA do seu terreno é %.2f, TERRENO POPULAR.", area);
        } else if (area >= 100 && area < 500) {
            System.out.printf("AREA do seu terreno é %.2f, TERRENO MASTER.", area);
        } else {
            System.out.printf("AREA do seu terreno é %.2f, TERRENO VIP.", area);
        }

    }
}

import java.util.Scanner;
/** 10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
 mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
 sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
 */
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira Altura:");
        double altura = sc.nextDouble();
        System.out.println("Insira Largura:");
        double largura = sc.nextDouble(), area = altura * largura, tinta = area / 2;
        System.out.printf("A area de %.2f precisara de %.2f de litros de tinta para ser pintada", area, tinta);
    }
}

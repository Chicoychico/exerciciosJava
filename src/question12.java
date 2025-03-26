import java.util.Scanner;
/** 12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
        PREÇO PROMOCIONAL, com 5% de desconto.
*/
public class question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do produto? ");
        double produto = sc.nextDouble(), desconto = produto*5/100, produtoTotal = produto-desconto;
        System.out.printf("O valor total do produto é %.2f e com desconto fica: R$ %.2f", produto,produtoTotal);
    }
}

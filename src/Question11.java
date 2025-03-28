import java.util.Scanner;
/**11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta.
 */
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite em sequencia os valores de A,B,C referente a uma equação do segundo grau: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), delta = b*b-(4*a*c);
        System.out.printf("O resulado de delta -> b²-4ac = %.2f",delta);
    }
}

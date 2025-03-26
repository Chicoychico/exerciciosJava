import java.util.Scanner;
/**13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.
 */
public class question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite seu salário: ");
        double salario = sc.nextDouble(), bonus = salario*15/100, novoSalario = salario+bonus;
        System.out.printf("Seu novo salario com bonus é R$ %.2f", novoSalario);
    }
}

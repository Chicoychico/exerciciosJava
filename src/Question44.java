import java.util.Scanner;

/**
 * 44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
 * incremento, mostrando em seguida todos os valores no intervalo:
 * Ex: Digite o primeiro Valor: 3
 * Digite o último Valor: 10
 * Digite o incremento: 2
 * Contagem: 3 5 7 9 Acabou!
 */
public class Question44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero inicial:");
        int i = sc.nextInt();
        System.out.println("Digite o numero final:");
        int ultimoValor = sc.nextInt();
        System.out.println("Quanto será o incremento?");
        int incremento = sc.nextInt();


        while (i <= ultimoValor) {
            System.out.println(i);
            i += incremento;
        }

    }
}

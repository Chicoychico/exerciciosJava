import java.util.Scanner;

public class Question48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 4, incremento, total = 0;

        while (i >= 1) {
            System.out.println("Digite um numero aleatorio:");
            incremento = sc.nextInt();
            total+=incremento;
            i--;
        }
        System.out.println("O valor total é: "+total);
    }
}

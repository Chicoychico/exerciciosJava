import java.util.Scanner;
/**
 7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
 sua terça parte.
 Ex:
 Digite um número: 3.5
 O dobro de 3.5 é 7.0
 A terça parte de 3.5 é 1.16666

 */
public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number,dobro,terco;
        System.out.println("Escreva um numero aleatório");
        number = sc.nextInt();
        dobro = number*2;
        terco= number/3;
        System.out.println("O dobro de " +number+ " é: " +dobro);
        System.out.println("O terço de " +number+ " é: " +terco);
    }
}

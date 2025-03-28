import java.util.Scanner;

/**
 * 23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
 * para todos, mas especialmente para mulheres. Faça um programa que leia nome,
 * sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
 * que:
 * - Homens ganham 5% de desconto
 * - Mulheres ganham 13% de desconto
 */
public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu sexo? m/f");
        char sexo = sc.next().charAt(0);
        System.out.println("Qual o valor da suas compras? ");
        double valorCompras = sc.nextDouble(), desconto,valorComDesconto;
        String status = "Erro, Digite o sexo valido";

        if ((sexo == 'm' || sexo == 'M')) {
           desconto= valorCompras*5/100;
           valorComDesconto = valorCompras - desconto;
            System.out.println("Sexo masculino -- Desconto de 5% aplicado");
            System.out.println("Valor sem desconto: "+ valorCompras);
            System.out.println("Valor com desconto: "+ valorComDesconto);
        } else if ((sexo == 'f' || sexo == 'F')) {
            desconto= valorCompras*13/100;
            valorComDesconto = valorCompras - desconto;
            System.out.println("Sexo feminino -- Desconto de 13% aplicado");
            System.out.println("Valor sem desconto: "+ valorCompras);
            System.out.println("Valor com desconto: "+ valorComDesconto);
        }else {
            System.out.println(status);
        }


    }
}

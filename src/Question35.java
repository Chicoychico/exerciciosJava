import java.util.Scanner;

/**
 * 35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
 * aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
 * carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
 * que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
 * quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
 * tabela a seguir:
 * - Carros populares (aluguel de R$90 por dia)
 * - Até 100Km percorridos: R$0,20 por Km
 * - Acima de 100Km percorridos: R$0,10 por Km
 * - Carros de luxo (aluguel de R$150 por dia)
 * - Até 200Km percorridos: R$0,30 por Km
 * - Acima de 200Km percorridos: R$0,25 por Km
 */
public class Question35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual carro voce escolheu? LUXO (1) BÁSICO (2)");
        int tipoCarro = sc.nextInt();
        System.out.println("Quantos dias de aluguel?");
        double aluguel = sc.nextDouble();
        System.out.println("Quantos km foram percorridos?");
        double km = sc.nextDouble();
        if (tipoCarro == 2) {
            if (km < 100) {
                double valorKm = km * 0.20, valorAluguel = aluguel * 90, total = valorAluguel + valorKm;
                System.out.printf("O valor total a ser cobrado será de: %.2f", total);
            } else {
                double valorKm = km * 0.10, valorAluguel = aluguel * 90, total = valorAluguel + valorKm;
                System.out.printf("O valor total a ser cobrado será de: %.2f", total);
            }
        }else if(tipoCarro == 1){
            if (km < 200) {
                double valorKm = km * 0.30, valorAluguel = aluguel * 150, total = valorAluguel + valorKm;
                System.out.printf("O valor total a ser cobrado será de: %.2f", total);
            } else {
                double valorKm = km * 0.25, valorAluguel = aluguel * 150, total = valorAluguel + valorKm;
                System.out.printf("O valor total a ser cobrado será de: %.2f", total);
            }
        } else{
            System.out.println("INSIRA A OPÇAO DE VEICULO VÁLIDA!!");
        }
    }
}

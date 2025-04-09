package br.com.guanabara.condicoesbasicas;

import java.util.Scanner;
/**16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.
*/
public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos cigarros voce fuma por dia e a quantos anos?");
        double cigarrosPorDia = sc.nextDouble(), cigarrosAno = sc.nextDouble();
        double diasAnoTotal = 365*cigarrosAno;
        double cigarrosTotal = cigarrosPorDia* diasAnoTotal, minutosTotalCigarro = cigarrosTotal*10;
        double diastotalperdidos = minutosTotalCigarro/1440;

        System.out.printf("O total de dias perdidos foi de %.0f ", diastotalperdidos);
    }
}

package br.com.guanabara.sequenciasbasicas;

import java.util.Scanner;
/**
 * 24) Faça um algoritmo que pergunte a distância que um passageiro deseja
 * percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
 * viagens até 200Km e R$0.45 para viagens mais longas.
 */
public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos km voce deseja percorrer? ");
        double km = sc.nextDouble(),frete;

        if (km<=200){
            frete = km*0.50;
            System.out.printf("O valor da corrida vai custar R$ %.2f",frete);
        }else {
            frete = km*0.45;
            System.out.printf("O valor da corrida vai custar R$ %.2f",frete);
        }

    }
}

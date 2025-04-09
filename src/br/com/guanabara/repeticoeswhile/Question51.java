package br.com.guanabara.repeticoeswhile;

import java.util.Scanner;

public class Question51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =1, valorProduto, maiorProduto=0, menorProduto=0;
        while (i<=8){
            System.out.println("Insira o valor do produto: ");
            valorProduto= sc.nextInt();
            if (valorProduto>maiorProduto) {
                maiorProduto=valorProduto;
            }
            if(i==1){
                menorProduto = valorProduto;
            }else if (valorProduto<menorProduto){
                menorProduto=valorProduto;
            }
            i++;
        }

        System.out.println(maiorProduto+ " Foi o produto com maior valor");
        System.out.println(menorProduto+ " Foi o produto com menor valor");

    }
}

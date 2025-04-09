package br.com.guanabara.repeticoeswhile;

import java.util.Scanner;

public class Question42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor qualquer:");
        int test= sc.nextInt(), i=0;
        System.out.print("Contagem: ");
        while (i<=test){
            System.out.println(i+", ");
            i++;
        }
        System.out.println("Acabou!!");
    }
}

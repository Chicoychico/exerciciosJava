package br.com.guanabara.repeticoeswhile;

import java.util.Scanner;

public class Question43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 30;
        while (i>=1){

            if (i%4==0){
                System.out.print(" ["+i+"] ");
            }else {
                System.out.print(" "+i+" ");
            }
            i--;
        }
    }
}

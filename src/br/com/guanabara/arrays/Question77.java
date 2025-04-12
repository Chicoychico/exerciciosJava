package br.com.guanabara.arrays;
import java.util.Scanner;
/*
77) Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
final, mostre uma listagem com todos os nomes informados, na ordem inversa
daquela em que eles foram informados.
 */
public class Question77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomeArray = new String[7];
        System.out.println("______NOME______");
        for (int i = 0; i < nomeArray.length; i++) {
            System.out.print("\n Seu nome: ");
            nomeArray[i] = sc.next();
        }
        System.out.println("______CONTRÁRIO______");
        for (int i = 6; i>=0; i--){
            System.out.println(nomeArray[i]+" "+(i+1)+" ");
        }
    }
}

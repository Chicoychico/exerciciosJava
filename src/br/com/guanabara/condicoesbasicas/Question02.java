package br.com.guanabara.condicoesbasicas;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        String name;
        System.out.println("What your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Hello " + name + ", my name is Wanderson! How are you   ?");
    }
}

package br.com.guanabara.repeticoeswhile;

public class Question41 {
    public static void main(String[] args) {
        int count = 100;

        while (count>=0){
            System.out.print(count+", ");
            count-=5;
        }
        System.out.println("Acabou!!");
    }
}
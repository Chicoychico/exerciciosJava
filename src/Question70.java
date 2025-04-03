/**
 * 70) [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência
 * de Fibonacci:
 * 1 1 2 3 5 8 13 21...
 */
public class Question70 {
    public static void main(String[] args) {
        int primeiroTermo=0;
        int segundoTermo=1;
        System.out.println(primeiroTermo);
        System.out.println(segundoTermo);

        for(int i = 1; i<=8;i++){
            int terceiroTermo=segundoTermo+primeiroTermo;
            primeiroTermo=segundoTermo;
            segundoTermo=terceiroTermo;
            System.out.println(terceiroTermo);
        }
    }
}

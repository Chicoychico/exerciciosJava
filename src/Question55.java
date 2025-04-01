import java.util.Random;
import java.util.Scanner;

/**
 * 55) [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de
 * agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
 * tentativas para tentar acertar.
 */
public class Question55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numSorteado = random.nextInt(5) + 1,i=1,sorte, chances=4;
        while (i<=4){
            System.out.println("Tente adivinhar o numero de 1 a 5, insira seu palpite:");
            sorte = sc.nextInt();
            chances-=1;
            if (numSorteado == sorte) {
                System.out.println("Parabens voce acertou *_*");
                System.out.println("O numero da sorte é: "+numSorteado);
                i=4;
            } else {
                System.out.println("Voce perdeu, tente novamente '_' ");
                System.out.println("Voce ainda tem "+ chances+" chances.");
            }
            i++;
        }

    }
}

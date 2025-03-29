import java.util.Scanner;

/**
 * 31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
 */
public class Question31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("__________________________________");
        System.out.println("---------    Jogador 1   ---------");
        System.out.println("__ 1 Pd _____ 2 Pap ______ 3 Ts __");
        int jogador1 = sc.nextInt();
        System.out.println("__________________________________");
        System.out.println("---------    Jogador 2   ---------");
        System.out.println("__ 1 Pd _____ 2 Pap ______ 3 Ts __");
        int jogador2 = sc.nextInt();
        if (jogador1 == 1 && jogador2 == 1) {
            System.out.println("__________________________________");
            System.out.println("EMPATE! - PEDRA BATE EM PEDRA");
            System.out.println("__________________________________");
        } else if (jogador1 == 1 && jogador2 == 2) {
            System.out.println("__________________________________");
            System.out.println("Jogador2 Vence!");
            System.out.println("Papel ganha de Pedra");
            System.out.println("__________________________________");
        } else if (jogador1 == 1 && jogador2 == 3) {
            System.out.println("__________________________________");
            System.out.println("Jogador1 Vence!");
            System.out.println("Pedra ganha de Tesoura");
            System.out.println("__________________________________");
        } else if (jogador1==2 && jogador2==1) {
            System.out.println("__________________________________");
            System.out.println("Jogador2 Vence!");
            System.out.println("Papel ganha de Pedra");
            System.out.println("__________________________________");
        } else if (jogador1==2 && jogador2==2) {
            System.out.println("__________________________________");
            System.out.println("EMPATE! - PAPEL ENROLA PAPEL");
            System.out.println("__________________________________");
        } else if (jogador1==2 && jogador2==3) {
            System.out.println("__________________________________");
            System.out.println("Jogador2 Vence!");
            System.out.println("Tesoura ganha de Papel");
            System.out.println("__________________________________");
        } else if (jogador1==3 && jogador2==1) {
            System.out.println("__________________________________");
            System.out.println("Jogador2 Vence!");
            System.out.println("Pedra ganha de Tesoura");
            System.out.println("__________________________________");
        } else if (jogador1==3 && jogador2==2) {
            System.out.println("__________________________________");
            System.out.println("Jogador1 Vence!");
            System.out.println("Tesoura ganha de Papel");
            System.out.println("__________________________________");
        } else if (jogador1==3 && jogador2==3) {
            System.out.println("__________________________________");
            System.out.println("EMPATE! - TESOURA CORTA TESOURA");
            System.out.println("__________________________________");
        }
        System.out.println("__________________________________");

    }
}

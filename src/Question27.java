import java.util.Scanner;

/**
 * 27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
 * mostrando uma mensagem no final, de acordo com a média atingida:
 *  - Média até 4.9: REPROVADO
 *  - Média entre 5.0 e 6.9: RECUPERAÇÃO
 *  - Média 7.0 ou superior: APROVADO
 */
public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nota1 e nota2:");
        double nota1 = sc.nextDouble(), nota2 = sc.nextDouble(), media = (nota1+nota2)/2;
        if(media<=4.9){
            System.out.printf("Sua media foi %.2f, voce esta Reprovado.", media);
        } else if (media>=5 && media<6.9) {
            System.out.printf("Sua media foi %.2f, voce esta de Recuperação.", media);
        } else {
            System.out.printf("Sua media foi %.2f, voce esta Aprovado.", media);
        }

    }
}

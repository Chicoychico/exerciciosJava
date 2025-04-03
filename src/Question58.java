import java.util.Scanner;

/**
 * 58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
 * vai parar quando for digitada a idade 999. No final, mostre quantos alunos
 * existem na turma e qual é a média de idade do grupo.
 */
public class Question58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alunos = 0, idadeTotal=0;
        while (true){
            System.out.println("Qual a sua idade? ");
            int idade = sc.nextInt();
            if(idade==999){
                break;
            }
            alunos++;
            idadeTotal+=idade;
        }
        double media = idadeTotal/alunos;
        System.out.println("A quantidade de alunos é: "+alunos);
        System.out.println("A media de idade dos alunos é: "+media);
    }
}

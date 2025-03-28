import java.util.Scanner;
/** 17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
 o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
 */
public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a velocidade do seu veiculo? ");
        double  velocidade = sc.nextDouble(), velocidadeAcima, multa = 0;
            if (velocidade > 80){
                velocidadeAcima = velocidade -80;
                multa = velocidadeAcima * 5;
                System.out.printf("Voce estava %.2f Km acima da velocidade permitida, sua multa será de: R$ %.2f",velocidadeAcima,multa);
            } else {
                System.out.println("Muito bem, voce estava dentro da velocidade correta!! ");
            }
    }
}

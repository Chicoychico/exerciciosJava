import java.util.Random;

public class Question50 {
    public static void main(String[] args) {
        Random random = new Random();

        int i = 1, maiorQueCinco = 0, divisivelPorTres = 0;
        while (i <= 20) {
            int numeroSorteado = random.nextInt(10) + 0;
            System.out.println(numeroSorteado);
            if (numeroSorteado > 5) {
                maiorQueCinco++;
            }
            if (numeroSorteado % 3 == 0) {
                divisivelPorTres++;
            }
            i++;
        }

        System.out.println("Dos numeros sorteados, "+maiorQueCinco+" são maiores que 5.");
        System.out.println("Dos numeros sorteados, "+divisivelPorTres+" são divisiveis por 3.");
    }
}

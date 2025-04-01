/**
 * 47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
 * 450 + 400 + 350 + 300 + ... + 50 + 0
 */

public class Question47 {
    public static void main(String[] args) {

        int inicial = 500, ultimo = 0, total = 0;
        while (inicial >= ultimo) {

            if (inicial > ultimo) {
                System.out.print(inicial + " + ");
                total = inicial + total;
            } else {
                System.out.print(inicial);
            }
            inicial -= 50;
        }
        System.out.println(" = " + total);
    }
}

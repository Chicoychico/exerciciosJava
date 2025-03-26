import java.util.Scanner;
/** Desenvolva um programa que leia uma distância em metros e mostre os valores
 relativos em outras medidas.
 Ex:
 Digite uma distância em metros: 185.72
 A distância de 85.7m corresponde a:
 0.18572Km; 1.8572Hm; 18.572Dam; 1857.2dm; 18572.0cm; 185720.0mm
 */
public class question08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double metros,km,hm,dam,dm,cm,mm;
        System.out.println("Digite uma distencia em metros: ");
        metros = sc.nextDouble();

        km = metros/1000;
        hm = metros/100;
        dam = metros/10;
        dm = metros*10;
        cm = metros*100;
        mm = metros*1000;

        System.out.printf(metros+" Corresponde a %.2f km %n",km);
        System.out.printf(metros+" Corresponde a %.2f hm %n",hm);
        System.out.printf(metros+" Corresponde a %.2f dam %n",dam);
        System.out.printf(metros+" Corresponde a %.2f dm %n",dm);
        System.out.printf(metros+" Corresponde a %.2f cm %n",cm);
        System.out.printf(metros+" Corresponde a %.2f mm %n",mm);
    }
}

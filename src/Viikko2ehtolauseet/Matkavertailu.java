package Viikko2ehtolauseet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Matkavertailu {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Montako matkaa teet kuukaudessa: ");
        int matkat = lukija.nextInt();
        System.out.println("Anna yksittäisen lipun hinta: ");
        double yksiMatka = lukija.nextDouble();
        System.out.println("Anna kuukausilipun hinta: ");
        double kuukausilippu = lukija.nextDouble();

        double matkojenHinta = matkat * yksiMatka;

        if (matkojenHinta > kuukausilippu) {
            double erotus = matkojenHinta - kuukausilippu;
            System.out.println("Kuukausilippu on " + dec.format(erotus) + " euroa halvempi kuin yksittäinen");
        } else if (kuukausilippu > matkojenHinta) {
            double erotus = kuukausilippu - matkojenHinta;
            System.out.println("Yksittäinen on " + dec.format(erotus) + " euroa halvempi kuin kuukausilippu");
        } else {
            System.out.println("haista kaka");
        }
    }
}

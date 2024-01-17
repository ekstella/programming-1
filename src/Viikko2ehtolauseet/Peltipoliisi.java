package Viikko2ehtolauseet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Peltipoliisi {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna nopeutesi: ");
        int nopeus = lukija.nextInt();
        if (nopeus >= 100) {
            System.out.println("Päiväsakko");
            System.out.println("Anna nettokuukausitulosi: ");
            double kuukausitulo = lukija.nextDouble();
            double paivasakko = (kuukausitulo-255) / 60;
            if (paivasakko > 6) {
            System.out.println("Päiväsakon määrä on " + dec.format(paivasakko) + " euroa");}
            if (paivasakko < 6) {
                System.out.println("Päiväsakon määrä on 6,00 euroa"); }

        } else if (nopeus > 80 && nopeus < 100) {
            System.out.println("Rikesakko");
        } else {
            System.out.println("Ei sakkoja");
        }
    }
}

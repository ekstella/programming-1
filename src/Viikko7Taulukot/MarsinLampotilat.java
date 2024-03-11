package Viikko7Taulukot;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class MarsinLampotilat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat dec = new DecimalFormat("0.0", decimalFormatSymbols);

        final int MAX = 10;
        int[] lampotilat = new int[MAX];

        int lampotila;
        int lkm = 0;

        while (lkm < MAX) {
            System.out.println("Syötä mittaus " + (lkm + 1) + "/10: ");
           
            lampotila = sc.nextInt();
            if (lampotila <= -140 || lampotila >= 20) {
                System.out.println("Anna lämpötila väliltä -140 - +20!");
            } else {
                lampotilat[lkm] = lampotila;
                lkm++;
            }
        }
        int maximi = -9999;
        int minimi = 9999;
        double summa = 0;

        for (int i = 0; i < lampotilat.length; i++) {
            int lampo = lampotilat[i];

            if (lampo > maximi) {
                maximi = lampo;
            }

            if (lampo < minimi) {
                minimi = lampo;
            }

            summa = summa + lampo;

        }

        double keskiarvo = summa / 10;

        System.out.println("Mittausten keskiarvo: " + dec.format(keskiarvo));
        System.out.println("Pienin mittaustulos: " + minimi);
        System.out.println("Suurin mittaustulos: " + maximi);
    }
}

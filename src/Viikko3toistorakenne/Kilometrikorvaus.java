package Viikko3toistorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
        int kilometrit = lukija.nextInt();
        int syote = 1;

        while (syote > 0) {
            System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
            syote = lukija.nextInt();
            kilometrit = kilometrit + syote;
        }
        double korvaus = kilometrit * 0.43;
        System.out.println("Yhteensä " + kilometrit + " kilometriä");
        System.out.println("Korvaus on " + dec.format(korvaus) + " euroa");
    }
}

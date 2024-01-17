package Viikko2ehtolauseet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Matka {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna matka: ");
        int matka = lukija.nextInt();
        System.out.println("Anna nopeus: ");
        int nopeus = lukija.nextInt();
        double aika = (double)matka / nopeus;
        System.out.println("Aikaa menee " + dec.format(aika) + " tuntia");
    }
}

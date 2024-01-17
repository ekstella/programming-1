package Viikko2ehtolauseet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bensa {
    public static void main(String[] args) {
        Scanner lukija = new Scanner (System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna tankattu määrä: ");
        double tankattuMaara = lukija.nextDouble();
        System.out.println("Anna ajetut kilometrit: ");
        double kilometriMaara = lukija.nextDouble();
        System.out.println("Anna litrahinta: ");
        double litrahinta = lukija.nextDouble();
        double ajohinta = tankattuMaara / kilometriMaara * litrahinta;
        System.out.println("Ajo per kilometri maksaa " + dec.format(ajohinta));

    }
}

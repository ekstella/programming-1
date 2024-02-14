package Viikko4merkkijono;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tuotteet {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");

        System.out.println("Anna tuotenumero: ");
        int tuotenumero = lukija.nextInt();

        lukija.nextLine();

        System.out.println("Anna tuotteen nimi: ");
        String nimi = lukija.nextLine();

        System.out.println("Anna tuotteen hinta: ");
        double hinta = lukija.nextDouble();

        lukija.nextLine();

        System.out.println("Anna tuotteen kuvaus: ");
        String kuvaus = lukija.nextLine();

        System.out.println("");
        
        System.out.println("Numero: " + tuotenumero);
        System.out.println("Nimi: " + nimi.trim().toUpperCase());
        
        
        System.out.println("Hinta: " + dec.format(hinta).trim());

        if (kuvaus.length() > 0) {

        System.out.println("Kuvaus: " + kuvaus.trim());

        } else {
            System.out.println("");
        }


    }
}

package Viikko4merkkijono;

import java.util.Scanner;

public class Lumi {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int syotteet = 0;
        int lumit = 0;

        System.out.println("Anna nimi: ");
        String syote = lukija.nextLine();

        while (!syote.equals("LOPPU")) {
            syotteet = syotteet + 1;

            if (syote.toLowerCase().equals("lumi")) {
                lumit = lumit + 1;
            }
            System.out.println("Anna nimi: ");
            syote = lukija.nextLine();
        }

        System.out.println("Nimiä oli " + syotteet + " kappaletta.");
        System.out.println("Nimi Lumi esiintyi " + lumit + " kertaa.");
    }
}

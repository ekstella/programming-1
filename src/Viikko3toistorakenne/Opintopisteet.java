package Viikko3toistorakenne;

import java.util.Scanner;

public class Opintopisteet {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna lukukausien määrä: ");
        int lukukaudet = lukija.nextInt();
        int opintopisteet = 0;

        for (int i = 0; i < lukukaudet; i++) {
            System.out.println("Anna " + (i + 1) + ". lukukauden opintopisteesi: ");
            opintopisteet = opintopisteet + lukija.nextInt();
        }

        int opintopisteTavoite = lukukaudet * 30;
        System.out.println("Sinulla pitäisi olla tähän mennessä " + opintopisteTavoite + " opintopistettä.");

        System.out.println("Sinulla on " + opintopisteet + " opintopistettä.");

        if (opintopisteet < opintopisteTavoite) {
            System.out.println("Olet jäljessä tavoitteesta.");
        } else if (opintopisteTavoite < opintopisteet) {
            System.out.println("Olet edellä tavoitteesta.");
        } else {
            System.out.println("Olet tavoitteessa.");
        }

        if (opintopisteet < 210) {
            int puuttuvatOpintopisteet = 210 - opintopisteet;
            System.out.println("Tutkinnosta puuttuu vielä " + puuttuvatOpintopisteet + " opintopistettä.");
        }
    }
}

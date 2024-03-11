package Viikko7Taulukot;

import java.util.Scanner;

public class Koepisteet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 100;
        int[] koepisteet = new int[MAX];
        //ESITELLÄÄN JA LUODAAN TAULUKKO
        int koepiste;
        int lkm = 0;
        //LKM KERTOO, MONTAKO KOEPISTETTÄ ON ANNETTU VAPAAN PAIKAN TAULUKOSSA
        // ALUSTETAAN NOLLAKSI

        System.out.println("Anna koepisteet (-1 lopettaa): ");
        koepiste = sc.nextInt();

        while (koepiste != -1 && lkm < MAX) {
            //PYYDETÄÄN PISTEITÄ NIIN KAUAN, KUIN PISTE EI OLE -1
            // EIKÄ TAULUKKO OLE TÄYNNÄ.
            //TAULUKKOON EI SAA LAITTAA ENEMPÄÄ LUKUJA, KUIN SINNE MAHTUU
            koepisteet[lkm] = koepiste;
            //LAITETAAN KOEPISTE TAULUKKOON PAIKALLE LKM
            lkm++;

            if (lkm < MAX) {
                // JOA TAULUKKO EI OLE VIELÄ TÄYNNÄ, PYYDETÄÄN UUSI KOEPISTE
                System.out.println("Anna koepisteet (-1 lopettaa): ");
                koepiste = sc.nextInt();
            } else {
                System.out.println("Ei enää koepisteitä");
            }
        }
        System.out.println("\nKoepisteet ovat ");

        // NÄYTETÄÄN TAULUKON SISÄLTÖ
        for (int i = 0; i < lkm; i++) {
            // LKM KERTOO TAULUKON KOON. TÄTÄ TÄYTYY KÄYTTÄÄ, KOSKA KOKO
            // TAULUKKOA EI OLE TÄYTETTY. 
            // TIETOJA ON VAIN INDEKSEILLÄ 0-LKM-1
            System.out.println(koepisteet[i] + " ");
            // KÄYDÄÄN FOR-SILMUKALLA TAULUKKO LÄPI JA NÄYTETÄÄN TAULUKOSTA
            // VUOROLLAAN KUKIN KOEPISTE
        }
    }
}

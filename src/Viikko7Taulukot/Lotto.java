package Viikko7Taulukot;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        int[] numerot;
        // ESITELLÄÄN TAULUKKO

        int lkm = 0;
        int numero = lkm;
        Scanner sc = new Scanner(System.in);

        System.out.println("Montako numeroa annat (7-10): ");
        lkm = sc.nextInt();
        numerot = new int[lkm];
        // LUODAAN TAULUKKO, KOKONA ON LOTTONUMEROIDEN MÄÄRÄ

        for (int i = 0; i < numerot.length; i++) {
            // NUMEROT.LENGTH KERTOO LUODUN TAULUKON KOON
            System.out.println("Anna " + (i+1) + " lottonumerosi: ");
            numero = sc.nextInt(); 
            numerot[i] = numero;
            //SIJOITETAAN NUMERO TAULUKKOON INDEKSILLE i 
        }
        Arrays.sort(numerot, 0, lkm);
        // LAJITELLAAN ANNETUT LOTTONUMEROT NOUSEVAAN JÄRJESTYKSEEN.
        // OHJELMAN ALKUUN ON LISÄTTÄVÄ import java.util.Arrays
        // NUMEROT -> LAJITELTAVA TAULUKKO
        // 0 -> MISTÄ INDEKSISTÄ LAJITTELU ALKAA
        // lkm -> MIHIN INDEKSIIN LAJITTELU PÄÄTTYY
        //(KYSEINEN INDEKSI EI TULE MUKAAN LAJITTELUUN)

        System.out.println("Rivisi oli ");
        for (int i = 0; i < numerot.length; i++) {
            // numerot.length KERTOO TAULUKON KOON.
            // TÄTÄ VOIDAAN KÄYTTÄÄ, KOSKA KOKO TAULUKKO ON TÄYTETTY

            // KÄYDÄÄN FOR-SILMUKALLA TAULUKKO LÄPI JA NÄYTETÄÄN TAULUKOSTA VUOROLLAAN KUKIN LOTTONUMERO
            System.out.println(numerot[i] + " ");
        }
    }
}

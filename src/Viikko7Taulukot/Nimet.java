package Viikko7Taulukot;

import java.util.Arrays;
import java.util.Scanner;

public class Nimet {
    public static void main(String[] args) {
        final int MAX = 20;
        String[] nimet = new String[MAX];
        // ESITELLÄÄN JA LUODAAN TAULUKKO
        int lkm = 0;
        String nimi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna nimi (tyhjä lopettaa): ");
        nimi = sc.nextLine(); nimi = nimi.trim();

        while (lkm < MAX && nimi.length() != 0) {
            // TOISTETAAN NIIN KAUAN KUIN ANNETTU MERKKIJONO EI
            // OLE TYHJÄ EIKÄ TAULUKKO OLE TÄYNNÄ
            nimet[lkm] = nimi;
            // SIJOITETAAN NIMI TAULUKKOON
            lkm++;

            if (lkm < MAX) {
                // JOS TAULUKKO EI OLE TÄYNNÄ
                // LKM KERTOO, MONTAKO MERKKIJONOA ON JO ANNETTU
                System.out.println("Anna nimi: ");
                nimi = sc.nextLine(); nimi = nimi.trim();
            }
        }
        Arrays.sort(nimet, 0, lkm);

        System.out.println("Nimet ovat aakkosjärjestyksessä");
        for (int i = 0; i < lkm; i++) {
            // lkm KERTOO TAULUKON KOON. TÄTÄ TÄYTYY KÄYTTÄÄ,
            // KOSKA KOKO TAULUKKOA EI OLE TÄYTETTY.
            // TIETOJA ON VAIN INDEKSEILLÄ 0-lkm-1
            System.out.println(nimet[i] + " ");
        }
    }
}

package Viikko1perusteet;

import java.util.Scanner;

public class Paivasakko {
    public static void main(String[] args) {
        Scanner lukija = new Scanner (System.in);
        System.out.println("Anna nettotulot: ");
        int nettotulo = lukija.nextInt();
        int paivasakkoMaara = (nettotulo - 255) / 60;
        System.out.println("Nettotuloilla " + nettotulo + " päiväsakko on " + paivasakkoMaara + " euroa");
    }
}

package Viikko2ehtolauseet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kimppakyyti {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna ajetut kilometrit: ");
        double kilometrit = lukija.nextDouble();
        System.out.println("Anna kulutus per 100 km: ");
        double kulutus = lukija.nextDouble();
        System.out.println("Anna polttoaineen litrahinta: ");
        double litrahinta = lukija.nextDouble();
        System.out.println("Anna kimppakyytiläisten lukumäärä: ");
        int kimppakyytiläiset = lukija.nextInt();
        double bensakustannus = kilometrit * kulutus / 100.0 * litrahinta / (double)kimppakyytiläiset;
        System.out.println("Bensakustannus per henkilö on " + dec.format(bensakustannus) + " euroa");
    }
}

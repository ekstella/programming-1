package Viikko9oliot;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KirjaOhjelma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");

        System.out.println("Anna nimi: ");
        String nimi = sc.nextLine();

        System.out.println("Anna isbn: ");
        String isbn = sc.nextLine();

        System.out.println("Anna hinta: ");
        double hinta = sc.nextDouble();

        System.out.println("Anna julkaisuvuosi: ");
        int julkaisuvuosi = sc.nextInt();

        Kirja ekaKirja = new Kirja(nimi, isbn, hinta, julkaisuvuosi);

        System.out.println(ekaKirja.toString());

        Kirja tokaKirja = new Kirja();

        tokaKirja.setNimi(nimi);
        tokaKirja.setIsbn(isbn);
        tokaKirja.setHinta(hinta);
        tokaKirja.setJulkaisuvuosi(julkaisuvuosi);

        System.out.println("Nimi: " + tokaKirja.getNimi());
        System.out.println("Isbn: " + tokaKirja.getIsbn());
        System.out.println("Hinta: " + dec.format(tokaKirja.getHinta()));
        System.out.println("Julkaisuvuosi: " + tokaKirja.getJulkaisuvuosi());



    }
}

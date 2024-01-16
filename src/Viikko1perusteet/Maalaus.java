package Viikko1perusteet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Maalaus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna huoneen leveys, pituus ja korkeus: ");
        double leveys = lukija.nextDouble();
        double pituus = lukija.nextDouble();
        double korkeus = lukija.nextDouble();
        System.out.println("Paljonko litralla saadaan maalattua neliöitä: ");
        double litrallaNelioita = lukija.nextDouble();

        double vastaus = (leveys + leveys + pituus + pituus) * korkeus / litrallaNelioita;
        
        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println("Maalin tarve on " + decimal.format(vastaus) + " litraa");
        
    }
}

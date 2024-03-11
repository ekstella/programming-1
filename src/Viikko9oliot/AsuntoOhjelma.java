package Viikko9oliot;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AsuntoOhjelma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");

        System.out.println("Anna asunnon tyyppi: ");
        String tyyppi = sc.nextLine();

        System.out.println("Anna osoite: ");
        String osoite = sc.nextLine();

        System.out.println("Anna pinta-ala: ");
        double pintaAla = sc.nextDouble();

        System.out.println("Anna hinta: ");
        double hinta = sc.nextDouble();

        System.out.println("Anna kuvaus: ");
        sc.nextLine();
        String kuvaus = sc.nextLine();


        Asunto ekaAsunto = new Asunto();

        ekaAsunto.setTyyppi(tyyppi);
        ekaAsunto.setOsoite(osoite);
        ekaAsunto.setPintaAla(pintaAla);
        ekaAsunto.setHinta(hinta);
        ekaAsunto.setKuvaus(kuvaus);


        System.out.println("Tyyppi: " + ekaAsunto.getTyyppi());
        System.out.println("Osoite: " + ekaAsunto.getOsoite());
        System.out.println("Pinta-ala: " + dec.format(ekaAsunto.getPintaAla()));
        System.out.println("Hinta: " + dec.format(ekaAsunto.getHinta()) + " euroa");
        System.out.println("Kuvaus: " + ekaAsunto.getKuvaus());
    }
}

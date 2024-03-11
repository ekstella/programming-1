package Viikko6Poikkeukset;

import java.util.Scanner;

public class KysyUudestaan {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä kokonaisluku: ");

        String syote = lukija.nextLine();
        boolean loop = true;

        while (loop) {
            try {

                int syoteNumerona = Integer.parseInt(syote);

                System.out.println("Syötit luvun " + syoteNumerona + ".");
                break;
            } catch (Exception e) {
                System.out.println("Virheellinen luku!");
                System.out.println("Syötä kokonaisluku: ");
                syote = lukija.nextLine();
            }
        }

        lukija.close();
    }
}

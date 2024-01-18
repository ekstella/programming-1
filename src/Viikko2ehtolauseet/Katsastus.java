package Viikko2ehtolauseet;

import java.util.Scanner;

public class Katsastus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Onko 1=katsastus, 2=jälkitarkastus: ");
        int valinta = lukija.nextInt();
        if (valinta == 1) {
            valinta = 50;
        } else if (valinta == 2) {
            valinta = 30;
            System.out.println("Hinta on 30");
            return;
        }
        System.out.println("Mitataanko päästöt 0=ei, 1=kyllä: ");
        int paastot = lukija.nextInt();
        int polttoaine = 0;
        if (paastot == 1) {
            System.out.println("Onko auto 0=bensa, 1=diesel: ");
            polttoaine = lukija.nextInt();
            if (polttoaine == 0) {
                polttoaine = 22;
            } else if (polttoaine == 1) {
                polttoaine = 31;
            }
        } else if (paastot == 0) {
            paastot = 0;
            polttoaine = 0;
        }
        int hinta = valinta + polttoaine;
        System.out.println("Hinta on " + hinta);
    }
}

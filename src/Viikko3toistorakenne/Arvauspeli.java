package Viikko3toistorakenne;

import java.util.Random;
import java.util.Scanner;

public class Arvauspeli {
    static Random satunnaisgeneraattori = new Random(); // älä muuta tätä riviä!

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Arvaa ajattelemani luku väliltä 0-99: ");
        int arvaus = lukija.nextInt();
        // Tämän satunnaisen luvun on oltava ohjelmasi oikea vastaus!
        int satunnaisluku = satunnaisgeneraattori.nextInt(100);

        // ...toteuta koodisi tänne
        

        while (arvaus != satunnaisluku) {
            if (arvaus > satunnaisluku) {
                System.out.println("Oikea luku on pienempi kuin " + arvaus + "!");
            } else {
                System.out.println("Oikea luku on suurempi kuin " + arvaus + "!");
            }
            System.out.println("Arvaa uudelleen: ");
            arvaus = lukija.nextInt();
        } 
        System.out.println("Oikein!");
    }
}

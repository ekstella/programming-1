package Viikko3toistorakenne;

import java.util.Random;
import java.util.Scanner;

public class Arvaus {
  static Random satunnaisgeneraattori = new Random(); // älä muuta tätä riviä!

    public static void main(String[] args) {
        // Tämän satunnaisen luvun on oltava ohjelmasi oikea vastaus!
        int satunnaisluku = 78;
        // ...toteuta koodisi tänne
        int laskuri = 1;
        Scanner lukija = new Scanner(System.in);
        System.out.println("Arvaa lukua väliltä 1-100: ");
        int arvaus = lukija.nextInt();
        

        while (arvaus != satunnaisluku) {
            if (arvaus > satunnaisluku) {
                System.out.println("Arvaa pienempää: ");
            } else {
                System.out.println("Arvaa suurempaa: ");
            }
            
            arvaus = lukija.nextInt();
            laskuri = laskuri + 1;
        } 
        System.out.println("Arvasit oikein. Arvauksia oli " + laskuri);
    }
}


package Viikko1perusteet;

import java.util.Scanner;

public class Puoluetuki {
     public static void main(String[] args) {
        // on olemassa komento print ja println
        // print ei tee rivinvaihtoa
        System.out.println("Anna kansanedustajien lukumäärä: ");
        // scannerin luonti
        Scanner lukija = new Scanner(System.in);
        // luetaan kansanedustajien maara
        int kansanedustajienMaara = lukija.nextInt();
        int rahaTuki = kansanedustajienMaara * 148175;
        System.out.print("Puoluetuen määrä on ");
        System.out.println(rahaTuki + " euroa");
     }
}

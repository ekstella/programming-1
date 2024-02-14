package Viikko3toistorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Puhelinlasku {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        
        System.out.println("Anna rahasumma puhelinlaskulle 1");
        String lasku1 = lukija.nextLine();
        Double lasku1Luku = Double.parseDouble(lasku1);

        System.out.println("Anna rahasumma puhelinlaskulle 2");
        String lasku2 = lukija.nextLine();
        Double lasku2Luku = Double.parseDouble(lasku2);

        double yhteisSumma = lasku1Luku + lasku2Luku;

        System.out.println("Haluttu yhteissumma lukuna on " + dec.format(yhteisSumma) + " euroa");
    }
}

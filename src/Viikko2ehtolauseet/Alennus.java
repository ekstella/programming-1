package Viikko2ehtolauseet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Alennus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna alentamaton hinta: ");
        double alentamaton = lukija.nextDouble();
        System.out.println("Anna alennusprosentti: ");
        int alennusProsentti = lukija.nextInt();
        double alennettuHinta =  alentamaton * (100.0 - (double)alennusProsentti) / 100.0;
        System.out.println("Alennettu hinta on " + dec.format(alennettuHinta));
    }
}

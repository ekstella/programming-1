package Viikko1perusteet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Alv {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        System.out.println("Anna 1. tuotteen hinta: ");
        double hinta1 = lukija.nextDouble();
        System.out.println("Tuotteen 1 ALV on " + decimal.format(hinta1 - hinta1 / 1.14) + " euroa.");

        System.out.println("Anna 2. tuotteen hinta: ");
        double hinta2 = lukija.nextDouble();
        System.out.println("Tuotteen 2 ALV on " + decimal.format(hinta2 - hinta2 / 1.14) + " euroa.");

        System.out.println("Anna 3. tuotteen hinta: ");
        double hinta3 = lukija.nextDouble();
        System.out.println("Tuotteen 3 ALV on " + decimal.format(hinta3 - hinta3 / 1.14) + " euroa.");


    }
}

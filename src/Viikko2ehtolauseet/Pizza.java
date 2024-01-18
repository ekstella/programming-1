package Viikko2ehtolauseet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna pizzojen hinnat (3): ");
        double pizza1 = lukija.nextDouble();
        double pizza2 = lukija.nextDouble();
        double pizza3 = lukija.nextDouble();

        double halvin;
        if (pizza1 < pizza2 && pizza1 < pizza3) {
            halvin = pizza1;
        } else if (pizza2 < pizza1 && pizza2 < pizza3) {
            halvin = pizza2;
        } else if (pizza3 < pizza1 && pizza3 < pizza2) {
            halvin = pizza3;
        } else {
            halvin = pizza1;
        }
        double summa = pizza1 + pizza2 + pizza3 - halvin; 
        double keskihinta = summa / 3;

        System.out.println("Maksettavaa: " + dec.format(summa));
        System.out.println("Yksittäisen hinta: " + dec.format(keskihinta));
    }
}

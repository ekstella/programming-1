package Viikko8metodit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Laakarikorvaus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");

        System.out.println("Anna käynnin kesto: ");
        int kesto = sc.nextInt();

        double korvaus = laskeKorvaus(kesto);

        System.out.println("Kestoltaan " + kesto + " minuutin yleislääkärikäynnistä kelakorvaus on " + dec.format(korvaus) + " euroa");
    }

    public static double laskeKorvaus(int kesto) {

        double korvaus = 0;

        if (kesto <= 10) {
            korvaus = 8;
        } else if (kesto <= 20) {
            korvaus = 11.00;
        } else if (kesto <= 30) {
            korvaus = 13.50;
        }

        return korvaus;
    }
}

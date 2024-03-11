package Viikko8metodit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lahjavero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");

        System.out.println("Anna lahjan suuruus: ");
        double arvo = sc.nextDouble();

        Lahjavero lahjavero = new Lahjavero();

        double vero = laskeVero(arvo);

        System.out.println("Lahjavero on " + dec.format(vero) + " euroa");
    }

    public static double laskeVero(double arvo) {
        double vero = 0;

        if (arvo <= 5000) {
            vero = 0;
        } else if (arvo <= 25000) {
            vero = 100 + (arvo - 5000) * 0.08;
        } else if (arvo <= 55000) {
            vero = 1700 + (arvo - 25000) * 0.10;
        } else if (arvo <= 200000) {
            vero = 4700 + (arvo - 55000) * 0.12;
        } else if (arvo <= 1000000) {
            vero = 22100 + (arvo - 200000) * 0.15;
        } else {
            vero = 142100 + (arvo - 1000000) * 0.17;
        }

        return vero;
    }
}

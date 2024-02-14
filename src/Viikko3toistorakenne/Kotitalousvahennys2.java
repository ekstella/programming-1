package Viikko3toistorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys2 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
        double tyokorvaus = lukija.nextDouble();
        int summa = 0;

        while (tyokorvaus != 0) {
            summa = summa + (int) tyokorvaus;
            System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
            tyokorvaus = lukija.nextDouble();
        }

        double kotitalousvahennys = summa * 40 / 100.0 - 100;

        if (kotitalousvahennys > 2250) {
            System.out.println("Kotitalousvähennyksen määrä on 2250,00 euroa");

        } else if (kotitalousvahennys < 0) {
            System.out.println("Kotitalousvähennyksen määrä on 0,00 euroa");
        }
        else {
            System.out.println("Kotitalousvähennyksen määrä on " + dec.format(kotitalousvahennys) + " euroa");
        }





    }
}

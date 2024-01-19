package Viikko3toistorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
        double tyokorvaus = lukija.nextDouble();
        int syote = 1;
        int omavastuu = 100;

        while (syote > 0) {
            System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
            syote = (int) lukija.nextDouble();
            tyokorvaus = tyokorvaus + syote;
        }
        double kotitalousvahennys = tyokorvaus * 50 / 100.0 - omavastuu;
        if (kotitalousvahennys > 2400) {
            System.out.println("Kotitalousvähennyksen määrä on 2400,00 euroa");
            return;
        } else if (kotitalousvahennys < 0) {
            System.out.println("Kotitalousvähennyksen määrä on 0,00 euroa");
        } else {
            System.out.println("Kotitalousvähennyksen määrä on " + dec.format(kotitalousvahennys) + "euroa");
        }
    }
}

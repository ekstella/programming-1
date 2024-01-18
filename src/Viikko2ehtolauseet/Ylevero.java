package Viikko2ehtolauseet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ylevero {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna vuositulosi ja ikäsi: ");
        double palkka = lukija.nextDouble();
        int ika = lukija.nextInt();
        if (ika < 18) {
            System.out.println("Ylevero on 0,00");
            return;
        } 
        double ylevero = (palkka * 0.68) / 100;
        if (ylevero > 140) {
            System.out.println("Ylevero on 140,00");
        } else if (ylevero < 70) {
            System.out.println("Ylevero on 0,00");
        } else {
            System.out.println("Ylevero on " + dec.format(ylevero));
        }
    }
}

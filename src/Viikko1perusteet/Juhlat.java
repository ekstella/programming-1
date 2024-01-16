package Viikko1perusteet;

import java.util.Scanner;

public class Juhlat {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna juhliin tulevien aikuisten määrä: ");
        int aikuiset = lukija.nextInt();
        double pulloja = Math.ceil((double)aikuiset/7);
        int jaannos = 7 - aikuiset % 7;
        System.out.println("Pulloja tarvitaan " + (int)pulloja + " kappaletta");
        System.out.println("Viimeisestä pullosta jää " + jaannos + " lasia");

    }
}

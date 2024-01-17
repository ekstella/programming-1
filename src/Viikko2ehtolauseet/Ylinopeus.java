package Viikko2ehtolauseet;

import java.util.Scanner;

public class Ylinopeus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kerro nopeus: ");
        int nopeus = lukija.nextInt();
        if (nopeus > 120) {
            System.out.println("Ylinopeussakko!");
        } else {
            System.out.println("");
        }
    }
}

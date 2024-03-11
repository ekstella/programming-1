package Viikko6Poikkeukset;

import java.util.Scanner;

public class Summaaja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean loop = true;
        int summa = 0;

        while (loop) {
            try {
                System.out.println("Syötä seuraava luku (0 lopettaa): ");
                String syote = sc.nextLine();
                int syoteNumerona = Integer.parseInt(syote);
                if (syoteNumerona == 0) { break; }
                
                summa = summa + syoteNumerona;

            } catch (Exception e) {
                System.out.println("Virheellinen syöte!");
            }
        }
        System.out.println("Lukujen summa on " + summa + ".");
    }
}

package Viikko6Poikkeukset;

import java.util.Scanner;

public class ArvonTarkastus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Syötä luku väliltä 0-23: ");
        int syote = sc.nextInt();

        if (syote >= 0 && syote <= 23) {
            System.out.println("Luku " + syote + " on sallittu.");
        } else {
            throw new IllegalArgumentException();
        }
    }
}

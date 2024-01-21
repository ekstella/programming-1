package Viikko3toistorakenne;

import java.util.Scanner;

public class Alkuluku {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int eiOleAlkuluku = 0;
        System.out.println("Syötä jokin positiivinen kokonaisluku: ");
        int kokonaisluku = lukija.nextInt();

        for (int i = 2; i<kokonaisluku; i++) {
            if (kokonaisluku % i == 0) {
                eiOleAlkuluku = 1;
            } 
        } 
        if (eiOleAlkuluku == 1) {
            System.out.println("Luku " + kokonaisluku + " ei ole alkuluku.");
        } else {
            System.out.println("Luku " + kokonaisluku + " on alkuluku.");
        }
    }
}
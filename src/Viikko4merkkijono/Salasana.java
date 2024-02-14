package Viikko4merkkijono;

import java.util.Scanner;

public class Salasana {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna salasana: ");

        String annettuSalasana = lukija.nextLine();
        boolean salasanaKelpaa = true;
        if (annettuSalasana.length() < 8) {
            salasanaKelpaa = false;
        }
        String salasanaPienellä = annettuSalasana.toLowerCase();
        if (salasanaPienellä.equals(annettuSalasana) == true) {
            salasanaKelpaa = false;
        }

        boolean salasanastaLoytyiNumero = false;

        for (int i = 0; i < annettuSalasana.length(); i++) {
            char merkkiNyt = annettuSalasana.charAt(i);

            if (Character.isDigit(merkkiNyt) == true) {
                salasanastaLoytyiNumero = true;
            }
        }
        if (salasanastaLoytyiNumero == false) {
            salasanaKelpaa = false;
        }
        if (salasanaKelpaa == true) {
            System.out.println("Salasana kelpaa.");
        } else {
            System.out.println("Salasana ei käy.");
        }
    }
}

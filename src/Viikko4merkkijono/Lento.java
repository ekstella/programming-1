package Viikko4merkkijono;

import java.util.Scanner;

public class Lento {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna lennon numero: ");
        String lento = lukija.nextLine();
        boolean onFinnairinLento;

        String alkutunnus = lento.substring(0, 2);

        if (alkutunnus.equals("AY")) {
            String lentotyyppi = lento.substring(2, 3);

            int numero = Integer.parseInt(lentotyyppi);

            if (numero == 1) {
                System.out.println("Kaukolento");
            } else if (numero >= 2 && numero <= 6) {
                System.out.println("Kotimaan lento");
            } else if (numero == 7) {
                System.out.println("Venäjän lento");
            } 
        } else {
            System.out.println("Ei ole Finnairin lento");
        }

      

        
    }
}

package Viikko9oliot;

import java.util.Scanner;

public class RemonttiOhjelma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna vuosi: ");
        int vuosi = sc.nextInt();

        Remontti remontti = new Remontti();

        boolean onnistuiko = remontti.setVuosi(vuosi);


        if (onnistuiko == false) {
            System.out.println("Vuosi ei voi olla tulevaisuudessa");
            return;
        }

        System.out.println("Anna kuvaus: ");
        sc.nextLine();
        String kuvaus = sc.nextLine();

       remontti.setKuvaus(kuvaus);

       System.out.println("Vuonna " + remontti.getVuosi() + " tehtiin remontti " + remontti.getKuvaus());
        

    }
}

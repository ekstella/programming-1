package Viikko2ehtolauseet;

import java.util.Scanner;

public class Rikesakko {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna nopeusrajoitus: ");
        int nopeusrajoitus = lukija.nextInt();
        System.out.println("Anna nopeutesi: ");
        int nopeus = lukija.nextInt();

        int ylinopeus = nopeus - nopeusrajoitus;


        if (nopeusrajoitus <= 60 && nopeusrajoitus >= 10) {
            if (ylinopeus > 20) {
                System.out.println("Menee päiväsakoille");
            } else if (ylinopeus < 20 && ylinopeus > 15) {
                System.out.println("Rikesakko on 200");
            } else if (ylinopeus <= 15) {
                System.out.println("Rikesakko on 170");
            }
        } else if (nopeusrajoitus <= 120 && nopeusrajoitus >= 70) {
            if (ylinopeus > 20) {
                System.out.println("Menee päiväsakoille");
            } else if (ylinopeus <= 15) {
                System.out.println("Rikesakko on 140");
            } else if (ylinopeus < 20 && ylinopeus > 15) {
                System.out.println("Rikesakko on 200");
            }
        }
    }
}

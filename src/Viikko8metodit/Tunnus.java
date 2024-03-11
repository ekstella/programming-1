package Viikko8metodit;

import java.util.Scanner;

public class Tunnus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna sukunimi: ");
        String sukunimi = sc.nextLine();

        System.out.println("Anna etunimi: ");
        String etunimi = sc.nextLine();

        String tunnus = teeTunnus(etunimi, sukunimi);

        System.out.println("Tunnus on " + tunnus);
    }

    public static String teeTunnus(String etunimi, String sukunimi) {
        String etu = etunimi.substring(0, 3);
        String suku = sukunimi.substring(0, 3);

        return suku.toLowerCase() + etu.toLowerCase();
    }
}

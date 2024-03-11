package Viikko7Taulukot;

import java.util.Scanner;

public class MerkkijononPalat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kirjoita lause: ");

        String[] palat = sc.nextLine().split(" ");

        for (int i = 0; i < palat.length; i++) {
            System.out.println(palat[i] + " ");
        }
    }
}

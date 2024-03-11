package Viikko7Taulukot;

import java.util.Arrays;
import java.util.Scanner;

public class SanojenVaihtaminen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kirjoita lause: ");
        String lause = sc.nextLine();

        String[] sanat = lause.split(" ");

        System.out.println("Mitkä sanat vaihdetaan keskenään?");
        int sana1 = sc.nextInt();
        int sana2 = sc.nextInt();

        String ekaSana = sanat[sana1];
        String tokaSana = sanat[sana2];

        sanat[sana1] = tokaSana;
        sanat[sana2] = ekaSana;

        String uusiLause = String.join(" ", sanat);

        System.out.println(uusiLause);
    }
}

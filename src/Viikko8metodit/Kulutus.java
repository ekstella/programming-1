package Viikko8metodit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kulutus {
    public static void main(String[] args) {
        int kilometrit = kysyKilometrit();
        double tankattu = kysyTankkaus();
        double kulutus = laskeKulutus(kilometrit, tankattu);

        naytaKulutus(kulutus);
    }

    public static int kysyKilometrit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna ajetut kilometrit: ");
        int kilometrit = sc.nextInt();
        return kilometrit;
    }

    public static double kysyTankkaus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna tankattu määrä: ");
        double tankattu = sc.nextDouble();
        return tankattu;
    }

    public static double laskeKulutus(int kilometrit, double tankattu) {
       return tankattu / kilometrit * 100;
    }

    public static void naytaKulutus(double kulutus) {
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Kulutus/100km on " + dec.format(kulutus) + " litraa");
    }
}

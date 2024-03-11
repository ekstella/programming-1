package Viikko8metodit;

import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] lampotilat = new int[MAX];
        int lkm = kysyLampotilat(lampotilat, MAX);
        naytaLampotilat(lampotilat, lkm);
    }

    public static int kysyLampotilat(int[] lampotilat, final int MAX) {
        Scanner sc = new Scanner(System.in);
        int laskuri = 0;

        for (int i = 0; i < MAX; i++) {
            System.out.println("Anna lämpötila: ");
            int temp = sc.nextInt();

            if (temp == -999) {
                break;
            }

            lampotilat[i] = temp;
            laskuri = laskuri + 1;
        }

        return laskuri;

    }

    public static void naytaLampotilat(int[] lampotilat, int lkm) {
        Arrays.sort(lampotilat, 0, lkm);
        
        System.out.print("Annoit lämpötilat: " );
        for (int i = 0; i < lkm; i++) {
            System.out.print(lampotilat[i]);
            System.out.print(" ");
        }
    }
}

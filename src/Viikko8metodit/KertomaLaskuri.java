package Viikko8metodit;

import java.util.Scanner;

public class KertomaLaskuri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna luku: ");
        int luku = sc.nextInt();

        if (luku > 10) {
            throw new IllegalArgumentException("Liian suuri luku bro");
        } else if (luku < 0) {
            throw new IllegalArgumentException("Liian pieni luku broidi");
        }

        int vastaus = laskeKertoma(luku);

        System.out.println("Kertoma luvusta " + luku + " on " + vastaus);
    }

    public static int laskeKertoma(int luku) {

        if (luku == 1) {
            return 1;
        }

        int kertoma = laskeKertoma(luku - 1) * luku;
        return kertoma;
    }
}

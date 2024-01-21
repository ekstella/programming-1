package Viikko3toistorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kassakone {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna ostoksen hinta (0 lopettaa): ");
        
        double viimeisinHinta = lukija.nextDouble();
        double hinta = viimeisinHinta;
        

        while (viimeisinHinta > 0) {
            System.out.println("Anna ostoksen hinta (0 lopettaa): ");
            viimeisinHinta = + lukija.nextDouble();
            hinta = viimeisinHinta + hinta;
        }

        System.out.println("Ostosten verollinen hinta on " + dec.format(hinta));

        double alv = hinta * 24.0 / 124.0;

        System.out.println("ALV:n osuus on " + dec.format(alv));

        double veroton = hinta - alv;

        System.out.println("Veroton hinta on " + dec.format(veroton));
    }
}

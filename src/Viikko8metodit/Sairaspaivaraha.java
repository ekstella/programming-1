package Viikko8metodit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sairaspaivaraha {
    public static void main(String[] args) {
    DecimalFormat dec = new DecimalFormat("0.00");

        double vuosityotulo = kysyTulot();
        double sairaspaivaraha = laskeSairaspaivaraha(vuosityotulo);

        System.out.println("Vuosituloilla " + dec.format(vuosityotulo) + " sairaspäiväraha on " + dec.format(sairaspaivaraha) + " euroa/päivä.");
    }

    public static double kysyTulot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna vuositulosi: ");
        return sc.nextDouble();
    }

    public static double laskeSairaspaivaraha(double vuosityotulo) {
        
        double sairaspaivaraha = 0.0;
        
        if (vuosityotulo <= 1399) {
            sairaspaivaraha = 0.00;
        } else if (vuosityotulo <= 36419) {
            sairaspaivaraha =  0.7 * vuosityotulo / 300.0;
        } else if (vuosityotulo <= 56032) {
            sairaspaivaraha = 84.98 + 0.4 * (vuosityotulo - 36419) / 300.0;
        } else if (vuosityotulo > 56032) {
            sairaspaivaraha =  111.13 + 0.25 * (vuosityotulo - 56032) / 300.0;
        }

        return sairaspaivaraha;
    }
}

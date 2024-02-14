package Viikko5paivamaarat;

import java.time.LocalDate;
import java.util.Scanner;

public class Erapaiva {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna laskun päivämäärä (vvvv-kk-pp): ");
        String paivamaara = lukija.nextLine();

        LocalDate laskunPaivamaara = LocalDate.parse(paivamaara);

        LocalDate erapaiva = laskunPaivamaara.plusWeeks(2);
        System.out.println("Eräpäivä on " + erapaiva);
    }
}

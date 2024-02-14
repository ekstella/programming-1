package Viikko5paivamaarat;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Juhannus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä vuosi: ");
        int vuosiluku = lukija.nextInt();

        LocalDate vastaus;

        for (int index = 20; index < 27; index++) {
            LocalDate paiva = LocalDate.of(vuosiluku, 6, index);

            DayOfWeek viikonpaiva = DayOfWeek.from(paiva);

            if (viikonpaiva == DayOfWeek.SATURDAY) {

                DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.M.yyyy.");
                System.out.println("Juhannus on " + paiva.format(f));
            }
        }

    }
}

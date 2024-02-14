package Viikko5paivamaarat;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Kalenteri {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä vuosi: ");
        int vuosi = lukija.nextInt();

        System.out.println("Syötä kuukausi: ");
        int kuukausi = lukija.nextInt();

        System.out.println("Ma Ti Ke To Pe La Su");

        LocalDate eka = LocalDate.of(vuosi, kuukausi, 1);

        DayOfWeek ekaPaiva = DayOfWeek.from(eka);

        int tyhjia = ekaPaiva.getValue()-1;

        System.out.print(" ".repeat(tyhjia * 3));

        LocalDate viimeinenPaiva = eka.with(TemporalAdjusters.lastDayOfMonth()); 

        for (int i = 1; i <= viimeinenPaiva.getDayOfMonth(); i++) {
            LocalDate paiva = LocalDate.of(vuosi, kuukausi, i);

            DayOfWeek viikonpaiva = DayOfWeek.from(paiva);

            if (viikonpaiva == DayOfWeek.MONDAY) {
                System.out.println("");
            }
            
            System.out.print(i);
            System.out.print(" ");

            if (i < 10) {
                System.out.print(" ");
            }
        }
       

    }
}

package Viikko2ehtolauseet;



import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna palkka: ");
        double palkka = lukija.nextDouble();
        System.out.println("Anna veroprosentti: ");
        double veroprosentti = lukija.nextDouble();
        System.out.println("Anna ikä: ");
        int ika = lukija.nextInt();
        double tyoelakemaksu;
        if (ika >= 53 && ika <= 62) {
            tyoelakemaksu = 0.0825;
        } else {
            tyoelakemaksu = 0.0675;
        }
        double veronOsuus = palkka * veroprosentti / 100.0;
        double työeläkevakuutusmaksunOsuus = palkka * tyoelakemaksu;
        double työttömyysvakuutuksenOsuus = palkka * 0.015;

        System.out.println("Bruttopalkka " + (int)palkka);
        System.out.println("Veron osuus " + dec.format(veronOsuus));
        System.out.println("Työeläkevakuutusmaksun osuus " + dec.format(työeläkevakuutusmaksunOsuus));
        System.out.println("Työttömyysvakuutuksen osuus " + dec.format(työttömyysvakuutuksenOsuus));
        System.out.println("Käteen jää " + dec.format(palkka - veronOsuus - työeläkevakuutusmaksunOsuus - työttömyysvakuutuksenOsuus));
    }
}
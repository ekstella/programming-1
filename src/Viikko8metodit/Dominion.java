package Viikko8metodit;

import java.util.Scanner;

public class Dominion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna kirouskorttien määrä: ");
        int kirous = sc.nextInt();

        System.out.println("Anna tilakorttien määrä: ");
        int tila = sc.nextInt();

        System.out.println("Anna pitäjäkorttien määrä: ");
        int pitaja = sc.nextInt();

        System.out.println("Anna läänikorttien määrä: ");
        int laani = sc.nextInt();

        Dominion dominion = new Dominion();
        int pisteet = dominion.laskePisteet(kirous, tila, pitaja, laani);

        System.out.println("Pisteiden yhteismäärä on " + pisteet);

    }

    public int laskePisteet(int kirous, int tila, int pitaja, int laani) {

        int yhteispisteet = kirous * -1 + tila * 2 + pitaja * 3 + laani * 6;

        return yhteispisteet;

        }
}

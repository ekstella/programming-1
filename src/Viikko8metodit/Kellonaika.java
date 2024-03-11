package Viikko8metodit;

import java.util.Scanner;


public class Kellonaika {
    public static void main(String[] args) {
        String kellonaika = kysyKellonaika();
        boolean tarkastus = tarkastaKellonaika(kellonaika);

        if (tarkastus == true) {
            System.out.println("Kellonaika on oikein");
        } else {
            System.out.println("Kellonaika on väärin");
        }
    }

    public static String kysyKellonaika() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna kellonaika muodossa tt:mm: ");
        return sc.nextLine();
    }

    public static boolean tarkastaKellonaika(String kellonaika) {
       boolean isAMatch = kellonaika.matches("([01][0-9]|2[0-3]):[0-5][0-9]");
       return isAMatch; 
    }
}

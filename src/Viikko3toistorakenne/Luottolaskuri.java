package Viikko3toistorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Luottolaskuri {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Anna luotollisen ostoksen hinta: ");
        double luotto = lukija.nextDouble();
        System.out.println("Anna kuukausierien lukumäärä: ");
        int kuukausierat = lukija.nextInt();

        int kuukausiMaksut = (int)luotto / kuukausierat;
       

        for (int i = 0; i < kuukausierat; i++) {
            
            System.out.println((i + 1) + ". erä " + dec.format(kuukausiMaksut) + " euroa," +
            " luottoa jäljellä " + dec.format(((int)luotto - kuukausiMaksut))  + " euroa");
            luotto = luotto - kuukausiMaksut;
         
        }
    }
}

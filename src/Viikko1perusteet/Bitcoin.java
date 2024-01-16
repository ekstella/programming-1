package Viikko1perusteet;

import java.util.Scanner;

public class Bitcoin {
    
    public static void main(String[] args) {
        System.out.println("Anna Bitcoineihin investoidun rahan määrä: ");
        Scanner lukija = new Scanner (System.in);
        int bitcoin = lukija.nextInt();
        double bitcoinArvo = bitcoin * 15.06;
        bitcoinArvo = bitcoinArvo - bitcoin;
        System.out.println("Bitcoin tuotti vuodessa " + bitcoinArvo + " euroa");

    }
    

}

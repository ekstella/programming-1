package Viikko1perusteet;
// jos aikoo käyttää ohjelmassa scanneria eli
// lukea jotain näppäimistöltä on oltava tämä import
// ohjelman alussa
import java.util.Scanner;

public class Paakaupunki {
    public static void main(String[] args) {
        // luodaan scanner tyyppinen muuttuja jonka avulla pystytään
        // kysymään käyttäjältä tietoja
        // scanner luodaan aina samalla tavalla
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä on Suomen pääkaupunki?");
        // käyttäjän syöte, kun kyse on merkkijonosta eikä numeroista
        // luetaan nextline kommennolla
        String paakaupunki = lukija.nextLine();
        System.out.println("Vastasit: " + paakaupunki);
    }
}

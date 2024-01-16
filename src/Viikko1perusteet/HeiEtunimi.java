package Viikko1perusteet;
// jos aikoo käyttää ohjelmassa scanneria eli
// lukea jotain näppäimistöltä on oltava tämä import
// ohjelman alussa
import java.util.Scanner;

public class HeiEtunimi {
    public static void main(String[] args) {
        // luodaan scanner tyyppinen muuttuja jonka avulla pystytään
        // kysymään käyttäjältä tietoja
        // scanner luodaan aina samalla tavalla
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä etunimi: ");
        // käyttäjän syöte, kun kyse on merkkijonosta eikä numeroista
        // luetaan nextline kommennolla
        String etunimi = lukija.nextLine();
        System.out.println("Hei " + etunimi + "!");
    }
}

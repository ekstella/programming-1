import java.util.Scanner;

public class LukujenSumma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Kirjoita kaksi kokonaislukua: ");
        int eka = lukija.nextInt();
        int toka = lukija.nextInt();
        System.out.println("Lukujen summa on " + (eka + toka));
        lukija.close();
    }
}
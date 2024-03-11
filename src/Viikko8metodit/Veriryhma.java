package Viikko8metodit;

import java.util.Scanner;

public class Veriryhma {
    public static void main(String[] args) {
        final int MAX = 8;
        int[] veriryhmat = new int[MAX];

        int lkm = kysyVeriryhmat(veriryhmat);

        kerroVeriryhma(veriryhmat, lkm);
    }

    public static int kysyVeriryhmat(int[] veriryhmat) {
        Scanner sc = new Scanner(System.in);
        int laskuri = 0;

        while (true) {
            System.out.println("Anna veriryhmä (- lopettaa): ");
            String syote = sc.nextLine();

            if (syote.equals("-")) {
                break;
            }

            laskuri = laskuri + 1;

            // 0 = A+, 1 = A-, 2 = AB+, 3 = AB-
            // 4 = B+, 5 = B-, 6 = O+, 7 = 0-

            if (syote.equals("A+")) {
                veriryhmat[0] = veriryhmat[0] + 1;
            } else if (syote.equals("A-")) {
                veriryhmat[1] = veriryhmat[1] + 1;
            } else if (syote.equals("AB+")) {
                veriryhmat[2] = veriryhmat[2] + 1;
            } else if (syote.equals("AB-")) {
                veriryhmat[3] = veriryhmat[3] + 1;
            } else if (syote.equals("B+")) {
                veriryhmat[4] = veriryhmat[4] + 1;
            } else if (syote.equals("B-")) {
                veriryhmat[5] = veriryhmat[5] + 1;
            } else if (syote.equals("O+")) {
                veriryhmat[6] = veriryhmat[6] + 1;
            } else if (syote.equals("O-")) {
                veriryhmat[7] = veriryhmat[7] + 1;
            }

        }
        return laskuri;
    }

    public static void kerroVeriryhma(int[] veriryhmat, int lkm) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Luovutuksia oli yhteensä " + lkm);
        System.out.println("Minkä veriryhmän luovutusten määrän haluat tietää: ");

        String syote = sc.nextLine();
        int vastaus = 0;

        if (syote.equals("A+")) {
            vastaus = veriryhmat[0];
        } else if (syote.equals("A-")) {
            vastaus = veriryhmat[1];
        } else if (syote.equals("AB+")) {
            vastaus = veriryhmat[2];
        } else if (syote.equals("AB-")) {
            vastaus = veriryhmat[3];
        } else if (syote.equals("B+")) {
            vastaus = veriryhmat[4];
        } else if (syote.equals("B-")) {
            vastaus = veriryhmat[5];
        } else if (syote.equals("O+")) {
            vastaus = veriryhmat[6];
        } else if (syote.equals("O-")) {
            vastaus = veriryhmat[7];
        }

        System.out.println("Veriryhmän " + syote + " luovutuksia oli " + vastaus);
    }
}

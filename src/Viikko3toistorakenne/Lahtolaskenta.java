package Viikko3toistorakenne;

public class Lahtolaskenta {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 100; i > number - 1; i--) {
            if (i % 3 != 0) {
                System.out.println(i + " ");
            }

        }
    }
}

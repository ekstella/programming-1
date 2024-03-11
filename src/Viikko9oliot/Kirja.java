package Viikko9oliot;

public class Kirja {
    private String nimi;
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    private String isbn;
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    private double hinta;
    public double getHinta() {
        return hinta;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    private int julkaisuvuosi;

    public int getJulkaisuvuosi() {
        return julkaisuvuosi;
    }

    public void setJulkaisuvuosi(int julkaisuvuosi) {
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public Kirja() {

    }

    public Kirja(String nimi, String isbn, double hinta, int julkaisuvuosi) {
        this.nimi = nimi;
        this.isbn = isbn;
        this.hinta = hinta;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String toString() {
        return "Kirja [nimi=" + this.nimi + ", isbn=" + this.isbn + ", hinta=" + this.hinta + ", vuosi=" + this.julkaisuvuosi + "]";
    }
}

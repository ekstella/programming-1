package Viikko9oliot;

public class Asunto {
    private String tyyppi;

    public String getTyyppi() {
        return tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    private String osoite;

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    private double pintaAla;

    public double getPintaAla() {
        return pintaAla;
    }

    public void setPintaAla(double pintaAla) {
        this.pintaAla = pintaAla;
    } 

    private double hinta;

    public double getHinta() {
        return hinta;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }
    
    private String kuvaus;

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public Asunto() {

    }

    public Asunto(String tyyppi, String osoite, double pintaAla, double hinta, String kuvaus) {
        this.tyyppi = tyyppi;
        this.osoite = osoite;
        this.pintaAla = pintaAla;
        this.hinta = hinta;
        this.kuvaus = kuvaus;
    }

    public String toString() {
        return "Asunto";
    }
}

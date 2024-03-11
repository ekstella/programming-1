package Viikko9oliot;

import java.time.Year;

public class Remontti {
    private int vuosi;

    public int getVuosi() {
        return vuosi;
    }

    public boolean setVuosi(int vuosi) {
        
        if (vuosi > Year.now().getValue()) {
            return false;
        } else {
            this.vuosi = vuosi;
            return true;
        }
    }

    private String kuvaus;

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public Remontti() {
        int vuosiNyt = Year.now().getValue();
        this.vuosi = vuosiNyt;
    }

    public String toString() {
        return "Remontti";
    }
}

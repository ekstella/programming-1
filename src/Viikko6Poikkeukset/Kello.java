package Viikko6Poikkeukset;

public class Kello {
    private int tunti;
    private int minuutti;

    public void setMinuutit(int minuutti) {
        if (minuutti < 0 || minuutti > 59) {
            throw new IllegalArgumentException("Virheelliset minuutit");
        }
        this.minuutti = minuutti;
    }

    public int getMinuutit() {
        return minuutti;
    }

    public Kello(int tunti, int minuutti) {
        if (minuutti < 0 || minuutti > 59) {
            throw new IllegalArgumentException("Virheelliset minuutit");
        }

        if (tunti > 23 || tunti < 0) {
            throw new IllegalArgumentException("Virheelliset tunnit");
        }

        this.minuutti = minuutti;
        this.tunti = tunti;
    }

    public void viisari() {
        System.out.println("tiktok");
    }

    public int getTunnit() {
        return this.tunti;
    }

    public void setTunnit(int tunti) {
        if (tunti > 23 || tunti < 0) {
            throw new IllegalArgumentException("Virheelliset tunnit");
        }
        this.tunti = tunti;
    }

    public void lisaaMinuutit(int minuutti) {
        if (minuutti < 0) {
            throw new IllegalArgumentException("Virheelliset minuutit");
        }
    
        this.minuutti += minuutti;
    
        while (this.minuutti > 59) {
            int yli = this.minuutti / 60;
            this.minuutti -= yli * 60;
            this.tunti += yli;
    
            while (this.tunti >= 24) {
                this.tunti -= 24;
            }
        }
    }
    

    public String toString() {
        String tunti = String.format("%01d", this.tunti);
        String minuutti = String.format("%02d", this.minuutti);
        return tunti + ":" + minuutti;
    }
}
package Viikko9oliot;

public class Kappale {
    private String nimi;

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    private Artisti artisti;

    public Artisti getArtisti() {
        return artisti;
    }

    public void setArtisti(Artisti artisti) {
        this.artisti = artisti;
    }
    
    private int vuosi;

    public int getVuosi() {
        return vuosi;
    }

    public void setVuosi(int vuosi) {
        this.vuosi = vuosi;
    }

    private int kesto;

    public int getKesto() {
        return kesto;
    }

    public void setKesto(int kesto) {
        this.kesto = kesto;
    }

    
    public Kappale() {

    }


    public String toString() {
        
        if (artisti == null) {
            return this.nimi;
        }
        
        return this.nimi + " by " + this.artisti;
    }
}

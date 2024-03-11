package Viikko9oliot;

public class Artisti {
    private String nimi;
   private int syntymavuosi;

   public Artisti(String nimi, int syntymavuosi) {
      this.nimi = nimi;
      this.syntymavuosi = syntymavuosi;
   }
   public String getNimi() {
      return nimi;
   }
   public void setNimi(String nimi) {
      this.nimi = nimi;
   }
   public int getSyntymavuosi() {
      return syntymavuosi;
   }
   public void setSyntymavuosi(int syntymavuosi) {
     this.syntymavuosi = syntymavuosi;
   }
   @Override
   public String toString() {
      return this.nimi;
   }
}

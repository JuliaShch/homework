package main.java.homework5;

public class Main1 {
  public static void main(String[] args) {
    SellTheDoll<IntegrityToys1> sellTheDollAgnes = new SellTheDoll<>();
    setAgnesData();
    sellTheDollAgnes.priceBuyDoll(12000);
    var printSaleAgnes = sellTheDollAgnes.priceSaleDoll();
    System.out.println("She can be sale to: " + printSaleAgnes + ".");

    SellTheDoll<Mattel1> sellTheDollBarbie = new SellTheDoll<>();
    setBarbieData();
    sellTheDollBarbie.priceBuyDoll(2000);
    var printSaleBarbie = sellTheDollBarbie.priceSaleDoll();
    System.out.println("She can be sold for: " + printSaleBarbie + ".");
  }

  private static void setAgnesData() {
    IntegrityToys1 doll = new IntegrityToys1();
    doll.setDollName("Agnes.");
    doll.setType("a collectible doll.");
    doll.isLimited(true);
  }

  private static void setBarbieData() {
    Mattel1 doll2 = new Mattel1();
    doll2.setDollName("Barbie.");
    doll2.setType("a game doll.");
    doll2.isLimited(false);
  }
}

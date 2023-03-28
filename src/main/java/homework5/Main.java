package main.java.homework5;

public class Main {
  public static void main(String[] args) {
    SellTheDoll<FashionRoyalty> sellTheDollAgnes = new SellTheDoll<>();
    setAgnesData();
    sellTheDollAgnes.priceBuyDoll(12000);
    var printSaleAgnes = sellTheDollAgnes.priceSaleDoll();
    System.out.println("She can be sale to: " + printSaleAgnes + ".");

    SellTheDoll<MadeToMove> sellTheDollBarbie = new SellTheDoll<>();
    setBarbieData();
    sellTheDollBarbie.priceBuyDoll(2000);
    var printSaleBarbie = sellTheDollBarbie.priceSaleDoll();
    System.out.println("She can be sold for: " + printSaleBarbie + ".");
  }

  private static void setAgnesData() {
    FashionRoyalty doll = new FashionRoyalty();
    doll.setDollName("Agnes.");
    doll.setType("a collectible doll.");
    doll.isLimited(true);
  }

  private static void setBarbieData() {
    MadeToMove doll2 = new MadeToMove();
    doll2.setDollName("Barbie.");
    doll2.setType("a game doll.");
    doll2.isLimited(false);
  }
}

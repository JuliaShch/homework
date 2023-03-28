package main.java.homework5;

public class SellTheDoll<T extends FashionDollAbstract> {
  private int priceDoll;

  public void priceBuyDoll(int priceDoll) { // цена, за которую покупаем куклу
    this.priceDoll = priceDoll;
  }

  public double priceSaleDoll() { // цена, за которую продаём куклу
    return priceDoll * 3.0;
  }
}


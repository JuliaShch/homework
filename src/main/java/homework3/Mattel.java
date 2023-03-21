package main.java.homework3;


public class Mattel extends DollAbstract implements ICollected, FreelySold {

  {
    type = "Fashion doll";
  }

  private static String name;
  private static final int MIN_PRICE = 3000;

  Mattel(String name) {
    Mattel.name = name;
  }

  public String getName() {
    return name;
  }

  private static int getMinPrice() {
    return MIN_PRICE;
  }

  @Override
  public void easyToBuy() {
    setIsExpensive(false);
    System.out.println(type + " " + getName() + " easy to buy.");
  }

  @Override
  public void collect() {
    if (!isExpensive()) {
      System.out.println(type + " " + getName() + " is chip.");
    } else {
      System.out.println(type + " " + getName() + " is can be to buy.");
      System.out.println(type + " " + getName() + " bought by you.");
    }
  }

  @Override
  public void play() {
    System.out.println("You can play with the doll.");
  }

  @Override
  public void madeToMove() {
    System.out.println( type + " " + name + " can be moved and can't be moved too. =)");
  }

  @Override
  public void justStay() {
    System.out.println(type + " " + name + " is static.");
  }
  public void opportunityToBuyOneMore (int price) {
    if (price < getMinPrice()) {
      System.out.println("It's impossible, because max price is not " + price + ". " + getName() + " costs " + getMinPrice()  + "!");
    } else {
      System.out.println("You bought " + getName() + " for " + price + ". Congratulations!");
    }
  }
}

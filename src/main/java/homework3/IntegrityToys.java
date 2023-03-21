package main.java.homework3;

public class IntegrityToys extends DollAbstract implements ICollected, FreelySold {

  {
    type = "Fashion Royalty";
  }

  private static String name;
  private static final int MAX_LIMIT = 10;

  IntegrityToys(String name) {
    IntegrityToys.name = name;
  }

  public String getName() {
    return name;
  }

  private static short getMaxLimit() {
    return MAX_LIMIT;
  }

  @Override
  public void easyToBuy() {
    setIsLimited(true);
    System.out.println(type + " " + getName() + " not easy to buy.");
  }

  @Override
  public void collect() {
    if (isLimited()) {
      System.out.println("But " + getName() + " can be bought by you.");
    } else {
      System.out.println(getName() + " is rare and collection doll.");
    }
  }

  @Override
  public void play() {
    System.out.println("You shouldn't play with " + type + " " + name + ".");
  }

  @Override
  public void madeToMove() {
    System.out.println("She can move, but not much.");
  }

  @Override
  public void justStay() {
    System.out.println(type + " " + name + " can be pretty gift.");
  }
  public void opportunityToBuyOneMore (int limit) {
    if (limit > getMaxLimit()) {
      System.out.println("It's impossible, because max limit is " + getMaxLimit() + " dolls.");
    } else {
      System.out.println("You bought " + limit + " " + getName() + "! Congratulations!");
    }
  }
}

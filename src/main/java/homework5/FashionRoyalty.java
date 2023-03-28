package main.java.homework5;

public class FashionRoyalty extends FashionDollAbstract {
  @Override
  public void isLimited(boolean limited) {
    System.out.println("The doll is limited.");
  }

  @Override
  public void setDollName(String name) {
    System.out.println("Doll's name is " + name);
  }
}

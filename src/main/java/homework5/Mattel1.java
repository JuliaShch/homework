package main.java.homework5;

public class Mattel1 extends DollAbstract1 {
  @Override
  public void isLimited(boolean limited) {
  }

  @Override
  public void setDollName(String name) {
    System.out.println("Doll's name is " + name);
  }
}

package main.java.homework5;

public abstract class FashionDollAbstract {

  public void setType(String type) {
    System.out.println("She is " + type);
  }

  public abstract void setDollName(String dollName);

  public abstract void isLimited(boolean limited);
}

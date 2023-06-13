package main.java.homework7_factory;

public class DollsFactory {

  private Integer integrityToysCount = 0;
  private Integer fashionRoyaltyCount = 0;
  private Integer nuFaceCount = 0;
  public Doll getDoll(DollsName name) {
    Doll toReturn = null;
    switch (name) {
      case AGNES -> {
        fashionRoyaltyCount++;
        toReturn = new Agnes();
      }
      case ADONIS -> {
        integrityToysCount++;
        toReturn = new Adonis();
      }
      case KYORI -> {
        nuFaceCount++;
        toReturn = new Kyori();
      }
      default -> throw new IllegalArgumentException("Wrong doll name:" + name);
    }
    return toReturn;
    }

  public void countDolls(){
    System.out.println("Number of dolls produced (by name):");
    System.out.println("Agnes dolls: " + fashionRoyaltyCount);
    System.out.println("Adonis dolls: " + integrityToysCount);
    System.out.println("Kyori dolls: " + nuFaceCount);
    System.out.println("Total: " + (fashionRoyaltyCount + integrityToysCount + nuFaceCount));
  }
}
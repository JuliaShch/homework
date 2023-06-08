package main.java.homework7_factory;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    DollsFactory factory = new DollsFactory();
    for(int i = 0; i < 100; i++) {
      collectRandomDoll(factory);
    }
    factory.countDolls();
  }

  public static void collectRandomDoll(DollsFactory factory) {
    Doll randomDoll = getRandomDoll(factory);
    System.out.printf("Wow! ");
    randomDoll.collect();
  }

  public static Doll getRandomDoll(DollsFactory factory){
    Random random = new Random();
    DollsName type = DollsName.values()[random.nextInt(DollsName.values().length)];

    return(factory.getDoll(type));
  }
}

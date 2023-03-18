package main.java.homework3;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    IntegrityToys doll = new IntegrityToys("Agnes");
    doll.easyToBuy();
    doll.collect();
    doll.play();
    doll.madeToMove();
    doll.justStay();
    while (!doll.isExpensive()) {
      System.out.println("If you can buy " + doll.getName() +", enter quantity: ");
      int sum = scanner.nextInt();
      if (sum == 0) {
        System.out.println("You didn't choose " + doll.getName() +", try one more time");
        doll.setIsLimited(true);
        continue;
      }
      doll.opportunityToBuyOneMore(sum);
      break;
    }

    System.out.println();

    Mattel mattelDoll = new Mattel("Barbie");
    mattelDoll.easyToBuy();
    mattelDoll.collect();
    mattelDoll.play();
    mattelDoll.madeToMove();
    mattelDoll.justStay();
    while (!mattelDoll.isLimited()) {
      System.out.println("If you want to buy " + mattelDoll.getName() +", enter price: ");
      int sum = scanner.nextInt();
      if (sum == 0) {
        System.out.println("You didn't cost " + mattelDoll.getName() +", try one more time");
        mattelDoll.setIsExpensive(true);
        continue;
      }
      mattelDoll.opportunityToBuyOneMore(sum);
      break;
    }
  }
}

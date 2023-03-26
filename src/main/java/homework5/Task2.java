package main.java.homework5;

import java.util.Scanner;


public class Task2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите число: ");
    int input = scanner.nextInt();
    MyFunctionalInterface myFunctionalInterface = x -> (x % 13) == 0;
    System.out.println("Результат: " + myFunctionalInterface.checkResult(input));
  }
}

@FunctionalInterface
interface MyFunctionalInterface {
  boolean checkResult(Integer value);
}
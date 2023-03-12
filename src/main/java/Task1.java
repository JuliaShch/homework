package main.java;

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Вводим числовое значение: ");
    int enterNumber = sc.nextInt();
    int a = enterNumber / 100;
    int b = enterNumber / 10 % 10;
    int c = enterNumber % 10;

    if (enterNumber > 500 & enterNumber < 1000) {
      System.out.print(c);
      System.out.print(b);
      System.out.println(a);
    } else if (enterNumber <= 500) {
      System.out.println("Получаем: " + (a * 100 + c * 10 + b));
    }
  }
}
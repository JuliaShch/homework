package main.java.homework5;

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите число а: ");
    double A = scanner.nextInt();
    System.out.println("Введите число b: ");
    double B = scanner.nextInt();
    System.out.println("Введите число c: ");
    double C = scanner.nextInt();

    Result result = (double a, double b, double c) -> Math.pow(b, 2) - 4 * a * c;
    System.out.println("Результат вычисления: " + result.countResult(A, B, C));
  }
}

@FunctionalInterface
interface Result {
  double countResult(double a, double b, double c);
}

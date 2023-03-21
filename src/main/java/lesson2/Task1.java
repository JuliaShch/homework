package main.java.lesson2;
import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    circle();
  }

  public static void circle() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите координаты х: ");
    int x = scanner.nextInt();
    System.out.println("Введите координаты y: ");
    int y = scanner.nextInt();
    System.out.println("Введите значение радиуса: ");
    int radius = scanner.nextInt();

    if (pointInTheCircle(x, y, radius)) {
      System.out.println("Точка лежит на окружности или внутри");
    } else {
      System.out.println("Точка вне окружности");
    }
  }

  private static boolean pointInTheCircle(int x, int y, int radius) {
    double result = (Math.pow(x, 2) + Math.pow(y, 2));
    double res = Math.pow(radius, 2);
    return (result <= res);
  }
}

package main.java.homework2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите натуральное число: ");
      number(scanner.nextInt());
    }
    public static void number(int n) {
      if (n >= 10) number(n/10);
      System.out.println(n % 10 + " ");
    }
  }

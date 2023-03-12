package main.java;

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    int maxPeople = 0;
    int maxWeight = 0;

    while(maxPeople <= 6 || maxWeight <= 450){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение веса: ");
      int weight = scanner.nextInt();
      maxPeople++;
      maxWeight = weight + maxWeight;
      if(maxPeople > 6){
        System.out.println("Причина, по которой прекращен вход людей в лифт: максимальное количество человек");
        break;
      }
      if(maxWeight > 450){
        System.out.println("Причина, по которой прекращен вход людей в лифт: максимальный размер веса пассажиров");
        break;
      }
      System.out.println("Количество людей, вошедших в лифт: " + maxPeople);
      System.out.println("Общий вес пассажиров: " + maxWeight);
    }
  }
}

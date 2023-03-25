package main.java.homework4;

import java.util.Objects;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите логин: ");
    String inputLogin = scanner.nextLine();
    System.out.println("Введите пароль: ");
    String inputPassword = scanner.nextLine();
    System.out.println("Введите пароль ещё раз: ");
    String inputRepeatPassword = scanner.nextLine();

    System.out.println("Результат: " + result(inputLogin, inputPassword, inputRepeatPassword));

  }

  private static boolean result(String login, String password, String confirmPassword) {
    String regEx = "(?=.*[0-9])(?=.*_)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{1,20}";

    try {
      if (login.matches(regEx)) {
        System.out.println("Логин соответствует ТЗ.");
      } else throw new WrongLoginException("Логин не соответствует ТЗ.");
      if (password.matches(regEx)) {
        System.out.println("Пароль соответствует ТЗ.");
      } else throw new WrongPasswordException("Пароль не соответствует ТЗ.");
      if (Objects.equals(confirmPassword, password)) {
        System.out.println("Пароли совпадают");
      } else System.out.println("Пароли не совпадают.");
    } catch (WrongLoginException | WrongPasswordException e) {
      e.printStackTrace();
    }

    return (login.matches(regEx) && password.matches(regEx) && Objects.equals(confirmPassword, password));
  }
}

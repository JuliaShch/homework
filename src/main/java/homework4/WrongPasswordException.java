package main.java.homework4;

public class WrongPasswordException extends Exception{

  public WrongPasswordException(String message) {
    super(message);
  }

  public WrongPasswordException() {
    System.out.println("Исключение по умолчанию");
  }
}
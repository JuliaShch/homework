package main.java.homework4;

public class WrongLoginException extends Exception{

  public WrongLoginException(String message) {
    super(message);
  }

  public WrongLoginException() {
    System.out.println("Исключение по умолчанию");
  }
}

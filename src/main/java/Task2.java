package main.java;

public class Task2 {
  public static void main(String[] args) {
    for(int i=100; i <=999; i++){
      if(i%10 == 0) {
        if(i%1 == 0 & i%9 == 0){
          System.out.println(i);
        } else if (i%3 == 0 & i%7 == 0){
          System.out.println(i);
        }
      }
    }
  }
}

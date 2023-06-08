package main.java.homework7_builder;
public class Main {
  public static void main(String[] args) {
    Student myStudent = new Student.Builder()
        .withName("Ellie")
        .withGroup("Art")
        .withCourse(3)
        .build();
  }
}

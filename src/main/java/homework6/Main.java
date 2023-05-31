package main.java.homework6;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static List<Student> students = new ArrayList<>();
  public static List<Student> expelledStudents = new ArrayList<>();

  public static void main(String[] args) {
    for (int x = 0; x < 5; x++) {
      int group = 1 + ((int) (Math.random() * 5));
      int course = 3;
      ArrayList<Integer> results = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
        int result = (int) (Math.random() * 6);
        results.add(result);
      }
      students.add(new Student("Студент " + (x + 1), group, course, results));
    }

    removeExpelledStudents();
    upgradeStudents();
    printStudents(students, 4);
  }

  public static void removeExpelledStudents() {
    for (Student student : students) {
      if (student.getGPA() <= 3.0) {
        expelledStudents.add(student);
      }
    }

    students.removeAll(expelledStudents);
  }

  public static void upgradeStudents() {
    students.forEach(Student::upgradeCourse);
  }

  public static void printStudents(List<Student> students, int course) {
    for (Student student : students) {
      if (student.getCourse() == course) {
        System.out.println(student.getName() + " " + "перешёл на следующий курс: " + student.getCourse());
        System.out.println("Средний балл: " + student.getGPA());
      }
    }
  }
}

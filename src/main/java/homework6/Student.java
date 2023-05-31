package main.java.homework6;

import java.util.List;

public class Student {
  private final String name;
  private final int group;
  private int course;
  private final List<Integer> results;

  public Student(String name, int group, int course, List<Integer> results) {
    this.name = name;
    this.group = group;
    this.course = course;
    this.results = results;
  }

  public String getName() {
    return name;
  }

  public int getCourse() {
    return course;
  }

  public void upgradeCourse() {
    this.course++;
  }

  public double getGPA() {
    return results.stream().mapToInt(value -> value).average().orElse(-1);
  }
}
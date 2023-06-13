package main.java.homework7_builder;

import java.util.Set;

public class Student {

  public static class Builder {
    private Student newStudent;
    public Builder() {
      newStudent = new Student();
    }
    public Builder withName(String name) {
      return this;
    }
    public Builder withGroup(String group) {
      return this;
    }
    public Builder withCourse(int course) {
      return this;
    }
    public Builder withGPA(Set<Student> gpa) {
      return this;
    }
    public Student build() {
      return newStudent;
    }
  }
}

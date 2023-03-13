package main.java;

import java.util.Arrays;

public class Task4 {
  public static void main(String[] args) {
    int[] myArray1 = {10,20,40};
    int[] myArray2 = {5,10,15};
    int[] resultArray;
    boolean match = false;
    for (int j : myArray1) {
      for (int i : myArray2) {
        if (j == i) {
          match = true;
          break;
        }
      }
      if (!match) {
        resultArray = new int[]{j};
        System.out.println((Arrays.toString(resultArray)));
      } else {
        match = false;
      }
    }
  }
}

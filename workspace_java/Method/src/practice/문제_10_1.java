package practice;

import java.util.Arrays;

public class 문제_10_1 {
  public static void main(String[] args) {
    test1(2);
  }

  public static void test1(int num){
    System.out.println(num + " 단");

    int[] mul = new int[9];
    for (int i = 0; i < mul.length; i++){
      mul[i] = num * (i+1);
      System.out.println(2 + " * " + (i+1) + " = " + mul[i]);
    }
  }

}

package practice;

import java.util.Arrays;

public class 문제_10_10 {
  public static void main(String[] args) {
    int[] num = new int[2];
    num = test10(4, 5);
    System.out.println(Arrays.toString(num));
  }

  public static int[] test10(int num1, int num2){
    int num3 = 0;
    num3 = num1;
    num1 = num2;
    num2 = num3;
    int[] num = {num1, num2};
    return num;
  }

}

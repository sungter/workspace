package practice;

import java.util.Arrays;

public class 문제_10_11 {
  public static void main(String[] args) {
    int[] a = {3};
    int[] b = {5};
    int[] result = test11(a, b);
    System.out.println(Arrays.toString(result));

  }

  public static int[] test11 (int[] a, int[] b){
    int[] result = new int[2];
    int sum ;
    sum = a[0];
    a[0] = b[0];
    b[0] = sum;

    result[0] = a[0];
    result[1] = b[0];

    return result;
  }

}

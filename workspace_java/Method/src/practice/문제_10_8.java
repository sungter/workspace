package practice;

import java.util.Arrays;

public class 문제_10_8 {
  public static void main(String[] args) {
    int[] arr1 = {1, 3, 5};
    int[] arr2 = {7, 9, 11, 13};
    int[] arr = test8(arr1, arr2);
    System.out.println(Arrays.toString(arr));
  }

  public static int[] test8(int[] arr1, int[] arr2){
    int[] arr = new int[arr1.length + arr2.length];
    for (int i = 0; i < arr.length; i++){
      if (i < arr1.length){
        arr[i] = arr1[i];
      }
      else {
        arr[i] = arr2[i - arr1.length];
      }
    }
    return arr;
  }

}

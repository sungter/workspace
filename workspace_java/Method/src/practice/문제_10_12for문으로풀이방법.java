package practice;

import java.util.Arrays;

public class 문제_10_12for문으로풀이방법 {
  public static void main(String[] args) {
    int[] arr = {7, 3, 9, 5, 1};
    test12(arr);
  }

  public static void test12(int[] arr){

    for (int i = 0 ; i < arr.length; i++){
      for (int j = i+1; j < arr.length; j++){
        if (arr[i] < arr[j]){
          int sum = arr[i];
          arr[i] = arr[j];
          arr[j] = sum;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
    //함수로 풀려면 Integer로 정수배열(arr)을 변환후 Arrays.sort()사용
  }


}

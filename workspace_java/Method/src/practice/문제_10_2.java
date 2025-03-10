package practice;

import java.util.Arrays;

public class 문제_10_2 {
  public static void main(String[] args) {
    int[] result = test2(6);
    System.out.println(Arrays.toString(result));
    result2(5);
  }

  public static int[] test2(int num){
    int cnt = 0;
    for (int i = 1; i < 101; i++){
      if (i % num == 0){
        cnt++;
      }
    }

    int num2 = 0;
    int[] all = new int[cnt];
    for (int i = 0 ; i < all.length ; i++){
      all[i] = num * (i+1);
    }
    return all;
  }

  //풀이
  public static void result2(int num){
    for (int i = 1; i < 101; i++){
      if (i % num == 0){
        System.out.print(i + " ");
      }
    }
  }

}

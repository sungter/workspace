package practice;

import java.util.Arrays;

public class 문제_1_19 {
  public static void main(String[] args) {

    int[] arr = new int[10];

    int min = 0;
    int max = 0;

    for (int i = 0; i < arr.length; i++){
      arr[i] = (int)(Math.random()*100+1);
    }
    //배열 데이터 확인을 위한 출력 (for문 없이 출력하는 방법)
    System.out.println(Arrays.toString(arr));

    min = arr[0];
    max = arr[0];
    int sameCnt = -1;

    for (int i = 0; i < arr.length-1; i++){
      if (arr[i] < min){
        min = arr[i];
      }
      else if (min == arr[i]){
        sameCnt++;
      }
      else{
        max = arr[i];
      }
    }

    System.out.println("중복 수 : " + sameCnt);
    System.out.println("최소값 : " + min);
    System.out.println("최대값 : " + max);


  }
}

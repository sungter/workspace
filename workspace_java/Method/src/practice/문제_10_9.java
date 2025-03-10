package practice;

import java.util.Arrays;

public class 문제_10_9 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arr1 = test9(arr);
    System.out.println(Arrays.toString(arr1));

    //풀이
    int[] arr2 = result9(arr);
    System.out.println(Arrays.toString(arr2));
  }

  public static int[] test9(int[] arr){
    int[] arr1 = new int[arr.length/ 2];
    for (int i = 0 ; i < arr.length ; i++){
        if (arr[i] % 2 == 0){
          arr1[i/2] = arr[i];
        }
    }
    return arr1;
  }

  //풀이
  //배열은 배열 생성시 크기가 정해지면 크기 변경이 불가함!
  public static int[] result9(int[] arr){
    //매개변수로 전달된 배열에서 짝수만 갖는 새로운 배열 생성
    //0. 생성할 배열의 크기를 구함.
    // - 매개변수로 전달된 배열의 요소에서 짝수의 갯수를 파악
    int arrLength = 0;
    for (int i = 0 ; i < arr.length ; i++){
      if (arr[i] % 2 == 0){
        arrLength++;
      }
    }
    //1. 배열생성
    int[] newArr = new int[arrLength];
    int index = 0; //newArr의 index를 파악하기 위한 변수

    //2. 매개변수로 전달된 배열의 요소 중 짝수만 newArr배열에 저장
    for (int i = 0 ; i < arrLength ; i++){
      if (arr[i] % 2 == 0){
        newArr[index++] = arr[i];
      }
    }

    return newArr;
  }

}

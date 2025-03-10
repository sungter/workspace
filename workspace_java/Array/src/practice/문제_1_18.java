package practice;

public class 문제_1_18 {
  public static void main(String[] args){
    int[] arr = {1, 5, 3, 8, 2};

    int max = arr[0];
    for (int i = 0; i < arr.length -1; i++){
      max = arr[i] > max ? arr[i] : max;
    }
    System.out.println(max);

    //풀이
    int[] arr1 = {1, 5, 3, 8, 2};
    int max1 = arr1[0];

    for (int i = 0 ; i < arr1.length ; i++){
      if (arr1[i] > max1){
        max1 = arr1[i];
      }
    }
    System.out.println(max1);

  }
}

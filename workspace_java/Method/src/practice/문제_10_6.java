package practice;

public class 문제_10_6 {
  public static void main(String[] args) {
    int[] a = {3, 72, 5, 8, 15, 33};
    int b = test6(a);
    System.out.println(b);
  }

  public static int test6(int[] num){
    int max = num[0];
    for (int i = 0 ; i < num.length ; i++){
      if (max < num[i]){
        max = num[i];
      }
    }
    return max;
  }

  //풀이
  public static int result6(int[] arr){
    int max = arr[0];
    for (int i = 0 ; i < arr.length ; i++){
      if (max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }

}

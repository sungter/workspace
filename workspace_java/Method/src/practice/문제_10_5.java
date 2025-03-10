package practice;

public class 문제_10_5 {
  public static void main(String[] args) {
    int[] a = {1, 3, 5, 7, 9};
    test5(a);
  }

  public static void test5(int[] sum){
    for (int i = 0; i < sum.length; i++){
      System.out.print(sum[i] + " ");
    }
  }

  //풀이
  public static void result5(int[] arr){
    for (int i = 0 ; i < arr.length ; i++){
      System.out.print(arr[i] + " ");
    }
  }

}

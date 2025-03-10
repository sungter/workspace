package practice;

public class 문제_1_8 {
  public static void main(String[] args) {
    int[] arr = {1, 5, 7};

    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum = sum + arr[i];
    }

    System.out.println(sum);
  }
}

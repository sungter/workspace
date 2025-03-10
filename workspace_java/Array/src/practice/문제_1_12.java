package practice;

import java.util.Scanner;

public class 문제_1_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = 0;
    System.out.print("생성할 배열의 길이 입력 : ");
    a = sc.nextInt();

    int[] arr = new int[a];

    for (int i = 0; i < arr.length; i++){
      arr[i] = i + 1;
    }

    int all = 0;

    for (int sum : arr){
      all = all + sum;
    }

    System.out.println("총합 : " + all);
    System.out.println("평균 : " + ((double)all / arr.length));


  }
}

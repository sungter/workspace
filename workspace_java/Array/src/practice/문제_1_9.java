package practice;

import java.util.Scanner;

public class 문제_1_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];
    System.out.print("0 값 : ");
    arr[0] = sc.nextInt();
    System.out.print("1 값 : ");
    arr[1] = sc.nextInt();
    System.out.print("2 값 : ");
    arr[2] = sc.nextInt();
    System.out.print("3 값 : ");
    arr[3] = sc.nextInt();
    System.out.print("4 값 : ");
    arr[4] = sc.nextInt();



    //풀이
    int[] arr2 = new int[5];
    for (int i = 0; i < arr2.length; i++){
      System.out.print(i + " 번째 요소의 값 : ");
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr2.length; i++){
      System.out.println(arr[i]);
    }


  }
}

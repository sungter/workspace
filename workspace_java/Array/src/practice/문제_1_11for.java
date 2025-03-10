package practice;

import java.util.Scanner;

public class 문제_1_11for {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[3];

    for (int i = 0; i < arr.length; i++){
      System.out.print("국, 영, 수 값을 차례로 입력하시오 : ");
      arr[i] = sc.nextInt();
    }

    int allscore = 0;
    for (int i = 0; i < arr.length; i++){
      allscore = allscore + arr[i];
    }
    System.out.println("총점 : " + allscore);
    System.out.println("평균 : " + (allscore/arr.length));


  }
}

package practice;

import java.util.Scanner;

public class 문제_8_11to15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //11번 문제
    num11(6, 51);

    //12번 문제
    num12(10);

    System.out.println();

    //13번 문제
    num13(5, 10);

    System.out.println();

    //14번 문제
    num14(5,20);

    System.out.println();

    //15번 문제
    System.out.print("15번 문제 정수 입력 : ");
    int num = sc.nextInt();
    num15("뭐하지?", num);
  }

  //15번 매서드
  public static void num15(String etc, int num){
    for (int i = 0; i < num; i++){
      System.out.println(etc);
    }
  }

  //14번 매서드
  public static void num14(int num1, int num2){
    int min = 0;
    int max = 0;
    min = num1 < num2 ? num1 : num2;
    max = num1 < num2 ? num2 : num1;
    for (int i = min; i < max; i++){
      if (++min < max && min % 5 == 0){
        System.out.print(min + " ");
      }
    }
  }

  //13번 매서드
  public static void num13(int num1, int num2){
    int min = 0;
    int max = 0;
    min = num1 < num2 ? num1 : num2;
    max = num1 < num2 ? num2 : num1;

    while (true){
      if (min < max){
        System.out.print(min++ + " ");
      }
      else break;
    }
  }

  //12번 매서드
  public static void num12(int num){
    for (int i = 0; i < num +1; i++){
      System.out.print(i + " ");
    }
  }

  //11번 매서드
  public static void num11(int num1, int num2){
    if (num1 % 2 == 0 && num2 % 2 ==0){
      System.out.println("두 수는 짝수입니다.");
    }
    else if (num1 % 2 == 0 || num2 % 2 == 0){
      System.out.println("한 수만 짝수입니다.");
    }
    else {
      System.out.println("두 수는 홀수입니다.");
    }
  }

}

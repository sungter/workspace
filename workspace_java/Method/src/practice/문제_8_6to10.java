package practice;

import java.util.Scanner;

public class 문제_8_6to10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //6번 문제
    num6(50, 4);
    //7번 문제
    num7("어떤걸", "입력하지?");
    //8번 문제
    System.out.print("첫 정수 입력 : ");
    int num1 = sc.nextInt();
    System.out.print("둘 정수 입력 : ");
    int num2 = sc.nextInt();
    num8(num1, num2);

    //9번 문제
    num9(num1, num2);

    //10번 문제
    num10(5);
  }

  public static void num10(int num){
    if (num % 2 == 0){
      System.out.println("짝수입니다.");
    }
    else {
      System.out.println("홀수입니다.");
    }
  }

  public static void num9(int num1, int num2){
    System.out.println(num1 + num2);
  }

  public static void num8(int num1, int num2){
    System.out.println(num1 + " " + num2);
  }

  public static void num7(String etc1, String etc2){
    System.out.println(etc1 + etc2);
  }

  public static void num6(int num1 , int num2){
    System.out.println("나눗셈 : " + (num1/num2) + " 나머지 : " + (num1 % num2));
  }

}

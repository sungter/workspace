package practice;

import java.util.Scanner;

public class 문제_9_1to5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //문제 1
    int num = test1(1, 5);
    System.out.println(num);
    //문제 2
    System.out.print("문제 2 첫 정수 : ");
    int mul1 = sc.nextInt();
    System.out.print("문제 2 둘 정수 : ");
    int mul2 = sc.nextInt();
    int mul = test2(mul1, mul2);
    System.out.println(mul);
    //문제 3
    int max = test3(7, 3);
    System.out.println(max);
    //문제 4
    String str = test4("어떤걸", "적지?");
    System.out.println(str);
    //문제 5
    String result = test5(92);
    System.out.println(result);
  }

  //문제 5
  public static String test5(int num1){
    if(num1 > 89){
      return "A";
    }
    else if (num1 > 69){
      return "B";
    }
    else {
      return "c";
    }
  }

  //문제 4
  public static String test4(String str1, String str2){
    return str1 + str2;
  }

  //문제 3
  public static int test3(int num1, int num2){
    if (num1 > num2){
      return num1;
    }
    else {
      return num2;
    }
  }

  //문제 2
  public static int test2(int num1 , int num2){
    return num1 * num2;
  }

  //문제 1
  public static int test1(int num1 , int num2){
    return num1 + num2;
  }

}

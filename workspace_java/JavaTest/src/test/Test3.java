package test;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("1~999 중 입력받을 정수 :");
    int num = sc.nextInt();

    int cnt = 0 ;


    if (num / 100 == 3 || num / 100 == 6 || num / 100 == 9){
      cnt++;
    }

    if (num % 100 / 10 == 3 || num % 100 / 10 == 6 || num % 100 / 10 == 9){
      cnt++;
    }

    if (num % 100 % 10 == 3 || num % 100 % 10 == 6 || num % 100 % 10 ==9){
      cnt++;
    }

    System.out.println("박수 " + cnt + "번");
  }
}

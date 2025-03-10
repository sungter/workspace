package practice;

import java.util.Scanner;

public class CalculatorTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 숫자 : ");
    int first = sc.nextInt();
    System.out.print("둘 숫자 : ");
    int second = sc.nextInt();
    System.out.print("연산자 : ");
    String setting = sc.next();

    Calculator one = new Calculator();
    one.setAll(first, second, setting);
    one.printInfo();


  }
}

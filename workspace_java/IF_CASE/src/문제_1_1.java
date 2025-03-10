import java.util.Scanner;

public class 문제_1_1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;

    System.out.print("첫 번째 정수 : ");
    num1 = sc.nextInt();

    System.out.print("첫 번째 정수 : ");
    num2 = sc.nextInt();

    if((num1 + num2) > 50){
      System.out.println("두 수의 합이 50보다 큽니다.");
    }
    else {
      System.out.println("두 수의 합이 50이하 입니다.");
    }

  }
}

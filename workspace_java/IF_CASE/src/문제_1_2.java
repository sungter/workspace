import java.util.Scanner;

public class 문제_1_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수 하나 입력 : ");
    int num = sc.nextInt();

    if (num % 2 == 0){
      System.out.println("짝수입니다.");
    }
    else {
      System.out.println("홀수입니다.");
    }


  }
}

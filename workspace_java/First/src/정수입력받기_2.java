import java.util.Scanner;

public class 정수입력받기_2 {
  public static void main(String[] args) {
    //두 정수를 키보드로 입력받아,
    //입력받은 두 수의 합을 출력
    Scanner sc = new Scanner(System.in);

    System.out.print("a 정수를 입력하시오 : ");
    int a = sc.nextInt();

    System.out.print("b 정수를 입력하시오 : ");
    int b = sc.nextInt();

    System.out.println("a+b 두 정수의 합 = " + (a + b));

  }
}

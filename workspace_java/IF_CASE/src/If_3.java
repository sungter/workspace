import java.util.Scanner;

public class If_3 {
  public static void main(String[] args) {
    //키보드로 정수 두 개를 입력받아,
    //입력받은 두 수의 합이 10 이상이면서
    //짝수는 아닐 경우에만 "참"이라는 문자열을 출력

    //자료형이 같을때, 입력 방법
    // int num1, num2, num3 .... ; 이 가능함

    Scanner sc = new Scanner(System.in);

    //값 입력받기
    System.out.print("첫 번째 정수를 입력하시오 : ");
    int num1 = sc.nextInt();
    System.out.print("두 번째 정수를 입력하시오 : ");
    int num2 = sc.nextInt();

    //변수 선언
    if ((num1 + num2) >= 10 && (num1 + num2) % 2 != 0 ){
      System.out.println("참");
    }

    if ((num1 + num2) >= 10 && (num1 + num2) % 2 == 0 || (num1 + num2) < 10 ){
      System.out.println("거짓");
    }



  }
}

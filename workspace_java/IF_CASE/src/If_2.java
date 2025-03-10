import java.util.Scanner;

public class If_2 {
  public static void main(String[] args) {
    //키보드로 정수를 하나 입력받아,
    //해당 정수가 짝수 일때만 '참'이라는 문자열을 출력하는 코드

    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력하시오 : ");
    int num = sc.nextInt();

    if (num % 2 == 0){
      System.out.println("참");
    }

    if (num % 2 != 0){
      System.out.println("거짓");
    }

  }
}

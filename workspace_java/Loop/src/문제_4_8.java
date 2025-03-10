import java.util.Scanner;

public class 문제_4_8 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int sum1 = 0;
    int sum2 = 0;
    System.out.print("정수 입력 : ");
    sum1 = sc.nextInt();

    for (int i = 1; i < sum1 + 1; i++){
      if(i % 2 == 0){
        sum2++;
      }
    }
    System.out.println("1~입력받은 수까지 중 짝수 갯수 : " + sum2);

    System.out.println();

    int num1 = 1;
    int cnt = 0;
    while (num1 < sum1 +1){
      if (num1 % 2 == 0){
        cnt++;
      }
      num1++;
    }
    System.out.println("1~입력받은 수까지 중 짝수 갯수 : " + cnt);

  }
}

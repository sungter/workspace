import java.util.Scanner;

public class 문제_4_11 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


    System.out.print("첫 정수 : ");
    int num1 = sc.nextInt();
    System.out.print("둘 정수 : ");
    int num2 = sc.nextInt();

    //두 수 중 큰수와 작은 수를 구분
    //if 문이 아닌 삼항 연산자 사용
    //노란 밑줄 : 더 쉬운 방법 권고
    //참고 : Math.min(num1, num2) , 해석 : num1과 num2 중 작은수를 변수 min에 저장하겠다.
    int min = num1 < num2 ? num1:num2;
    int max = num1 < num2 ? num2:num1;

    int fan = ++min;
    int sum = 0;

    while (fan < max){
      sum = sum + fan;
      fan++;
    }
    System.out.println("입력한 두 정수 사이의 모든 정수의 합 : " + sum);



    System.out.println();



    System.out.print("첫 정수 : ");
    int sum1 = sc.nextInt();
    System.out.print("둘 정수 : ");
    int sum2 = sc.nextInt();
    int cnt = 0;

    for(int i = ++sum1; i < sum2; i++){
      cnt = cnt + i;
    }
    System.out.println("입력한 두 정수 사이의 모든 정수의 합 : " + cnt);


  }
}

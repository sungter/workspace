import java.util.Scanner;

public class 문제_1_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1 ;
    int num2 ;

    System.out.print("첫 정수 : ");
    num1 = sc.nextInt();
    System.out.print("둘 정수 : ");
    num2 = sc.nextInt();

    int min; //num1과 num2 중 작은 수를 저장할 변수
    int max; //num1과 num2 중 큰 수를 저장할 변수

    if(num1 > num2){
      min = num2;
      max = num1;
    }
    else{
      min = num1;
      max = num2;
    }

    System.out.println(max + " > " + min);

  }
}

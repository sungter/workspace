import java.util.Scanner;

public class 문제_1_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("1번 정수 : ");
    int num1 = sc.nextInt();
    System.out.print("2번 정수 : ");
    int num2 = sc.nextInt();
    System.out.print("3번 정수 : ");
    int num3 = sc.nextInt();

    if (num1 > num2 && num2 > num3){
      System.out.println(num1 + ">" + num2 + ">" + num3);
    }
    else if (num1 > num3 && num3 > num2) {
      System.out.println(num1 + ">" + num3 + ">" + num2);
    }
    else if(num2 > num1 && num1 > num3){
      System.out.println(num2 + ">" + num1 + ">" + num3);
    }
    else if(num2 > num3 && num3 > num1){
      System.out.println(num2 + ">" + num3 + ">" + num1);
    }
    else if(num3 > num1 && num1 > num2){
      System.out.println(num3 + ">" + num1 + ">" + num2);
    }
    else if(num3 > num2 && num2 > num1){
      System.out.println(num3 + ">" + num2 + ">" + num1);
    }
    else {
      System.out.println("같은 수가 있습니다.");
    }

    //풀이
    int min, mid, max;

    //숫자 크기 비교
    //num1이 가장 클 경우
    if (num1 > num2 && num1 > num3){
      max = num1;
      //num2가 num3보다 클 경우
      if (num2 > num3){
        mid = num2;
        min = num3;
      }
      //그렇지 않을 경우
      else {
        mid = num3;
        min = num2;
      }
    }
    //그렇지 않고 num2가 가장 클 경우
    else if(num2 > num1 && num2 > num3){
      max = num2;

      if (num1 > num3){
        mid = num1;
        min = num3;
      }
      else {
        mid = num3;
        min = num1;
      }
    }
    //num3가 가장 클 경우
    else{
      max = num3;
        if (num2 > num1){
          mid = num2;
          min = num1;
        }
        //그렇지 않을 경우
        else {
          mid = num1;
          min = num2;
        }
    }

    //출력
    System.out.println(max + " > " + mid + " > " + min);


  }
}

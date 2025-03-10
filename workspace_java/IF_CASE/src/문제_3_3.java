import java.util.Scanner;

public class 문제_3_3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //풀이
    int num1,num2; // 두 정수 변수
    String oper; //문자열 변수

    //정보 입력
    System.out.print("첫 번째 수 : ");
    num1 = sc.nextInt();
    System.out.print("두 번째 수 : ");
    num2 = sc.nextInt();
    System.out.print("연산자 : ");
    oper = sc.next();

    if (oper.equals("+")){
      System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    else if (oper.equals("-")){
      System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
    else if (oper.equals("*")){
      System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
    else if (oper.equals("/")){
      System.out.println(num1 + " / " + num2 + " = " + (num1 / (double) num2));
      //나눗셈에서 소수점이 나올 수 있기에 형변환하여 (double) 추가
    }
    else {
      System.out.println("연산자를 잘못 입력하였습니다.");
    }


    //혼자
    System.out.print("첫 번째 수 : ");
    int fir = sc.nextInt();
    System.out.print("두 번째 수 : ");
    int sec = sc.nextInt();
    System.out.print("연산자 입력 : ");
    String math = sc.next();

    if (math.equals("+")){
      System.out.println(fir + " + " + sec + " = " + (fir+sec));
    }
    else if (math.equals("-")) {
      System.out.println(fir + " - " + sec + " = " + (fir-sec));
    }
    else if (math.equals("*")){
      System.out.println(fir + " * " + sec + " = " + (fir*sec));
    }
    else if (math.equals("/")){
      System.out.println(fir + " / " + sec + " = " + (fir/(double)sec));
    }
    else {
      System.out.println("연산자를 잘못 입력하였습니다.");
    }


  }
}

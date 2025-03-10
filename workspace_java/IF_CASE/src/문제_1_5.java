import java.util.Scanner;

public class 문제_1_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String grade;

    int num;
    System.out.print("성적을 입력하시오 : ");
    num = sc.nextInt();

    if(num > 90 && num <= 100){
      grade = "A";
    }
    else if (num > 80 && num <= 90) {
      grade = "B";
    }
//    if문에서 먼저 해석해서 값을 입력하면 밑에 코드는 실행 안되기에 조건을 감축할 수 있다.
//    else if (num > 80) {
//      System.out.println("학점은 B입니다.");
//    }
    else if(num >=0 && num <= 80){
      grade = "C";
    }
    else {
      grade = "오류";
    }

    System.out.println("학점은 " + grade + "입니다.");


  }
}

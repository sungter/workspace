import java.util.Scanner;

public class 문제_3_2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String gender;
    System.out.print("성별을 입력하시오 : ");
    gender = sc.next();

    switch (gender){
      case "남":
        System.out.println("남자입니다.");
        break;
      case "여":
        System.out.println("여자입니다.");
        break;
      default:
        System.out.println("다시 입력하세요.");
    }

  }
}

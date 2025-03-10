import java.util.Scanner;

public class 문제_3_4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 수 : ");
    int fir = sc.nextInt();
    System.out.print("두 번째 수 : ");
    int sec = sc.nextInt();
    System.out.print("연산자 입력 : ");
    String math = sc.next();

    switch (math){
      case "+":
        System.out.println(fir + " + " + sec + " = " + (fir+sec));
        break;
      case "-":
        System.out.println(fir + " - " + sec + " = " + (fir-sec));
        break;
      case "*":
        System.out.println(fir + " * " + sec + " = " + (fir*sec));
        break;
      case "/":
        System.out.println(fir + " / " + sec + " = " + (fir/(double)sec));
        break;
      default:
        System.out.println("연산자를 잘못 입력하였습니다.");
    }


  }
}

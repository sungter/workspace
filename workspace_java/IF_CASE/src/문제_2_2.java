import java.util.Scanner;

public class 문제_2_2 {
  public static void main(String[] args) {

    Scanner sc = new  Scanner(System.in);

    int x;
    int y;
    System.out.print("x값을 입력 : ");
    x = sc.nextInt();
    System.out.print("y값을 입력 : ");
    y = sc.nextInt();

    if((x > 50 && x < 100) && (y > 50 && y < 100)){
      System.out.println("사각형 안에 있음.");
    }
    else {
      System.out.println("사각형 안에 없음.");
    }

  }
}

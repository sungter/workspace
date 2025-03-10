import java.util.Scanner;

public class If_Else_1 {
  public static void main(String[] args) {
    //정수가 짝수이면 1을 출력, 그렇지 않으면 2를 출력
    Scanner sc = new Scanner(System.in);
    System.out.print("x : ");
    int x = sc.nextInt();


    //if와 else를 동시에 사용하면 둘 중 반드시 하나만 실행, 둘다 실행되는 경우는 없다.
    //만약에 ~~라면...
    if(x % 2 == 0){
      System.out.println(1);
    }
    //그렇지 않으면...
    else {
      System.out.println(2);
    }

  }
}

import java.util.Scanner;

public class 무한루프_2 {
  public static void main(String[] args) {
    //무한루프 사용 예시
    //반복 횟수가 정해져 있지 않을때 사용한다.
    //국어점수(0 ~ 100)를 입력받으세요~

    //0~100점 사이의 점수를 입력할 때까지 계속 입력 받게하기
    Scanner sc = new Scanner(System.in);
    int score;

    while (true){
      System.out.print("국어 점수 입력(0~100) : ");
      score = sc.nextInt();
      if (score > -1 && score < 101){
        break;
      }
    }

  }
}

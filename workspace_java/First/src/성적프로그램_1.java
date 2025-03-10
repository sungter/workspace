import java.util.Scanner;
/*
* 키보드로 국어, 영어, 수학 점수를 입력받은 후
* 입력받은 국어, 영어, 수학 점수 및 총점, 평균을 출력
* 단, 국어, 영어, 수학 점수는 정수만 저장된다고 가정
* */



public class 성적프로그램_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int korScore;
    int engScore;
    int mathScore;
    int totalScore;
    double avg;

    //국, 영, 수 점수 입력
    System.out.print("국어 점수 : ");
    korScore = sc.nextInt();

    System.out.print("영어 점수 : ");
    engScore = sc.nextInt();

    System.out.print("수학 점수 : ");
    mathScore = sc.nextInt();

    //총점 및 평균 계산
    totalScore = korScore + engScore + mathScore;

    //정수끼리의 연산 결과는 무조건 정수로 나온다.
    avg = (double) totalScore / 3;

    //결과 출력
    System.out.println("국어 점수 = " + korScore);
    System.out.println("영어 점수 = " + engScore);
    System.out.println("수학 점수 = " + mathScore);
    System.out.println("총 점수 = " + totalScore);
    System.out.println("평균 = " + avg);



    // 자습시간 연습


    if (avg >=80) {
      System.out.println("합격입니다.");
    }

    if (avg <=80) {
      System.out.println("불합격입니다.");
    }



    /*  혼자 연습

    System.out.print("국어 점수를 입력 : ");
    int korscore = sc.nextInt();

    System.out.print("영어 점수를 입력 : ");
    int engscore = sc.nextInt();

    System.out.print("수학 점수를 입력 : ");
    int matscore = sc.nextInt();

    System.out.println("수학 = " + korscore);
    System.out.println("영어 = " + engscore);
    System.out.println("수학 = " + matscore);

    System.out.println("총 점수 = " + (korscore + engscore + matscore));

    double kem = (double) (matscore + engscore + korscore)/3;
    System.out.println("평균 = " + kem);
    */

  }
}

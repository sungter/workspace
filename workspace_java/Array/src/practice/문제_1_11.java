package practice;

import java.util.Arrays;
import java.util.Scanner;

public class 문제_1_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int korscore, engscore, mathscore;

    System.out.print("국어 : ");
    korscore = sc.nextInt();
    System.out.print("영어 : ");
    engscore = sc.nextInt();
    System.out.print("수학 : ");
    mathscore = sc.nextInt();

    int[] arr = new int[3];
    arr[0] = korscore;
    arr[1] = engscore;
    arr[2] = mathscore;

    System.out.println("총점 : " + (arr[0] + arr[1] + arr[2]));
    System.out.println("평균 : " + (arr[0] + arr[1] + arr[2])/3);

    System.out.println();



    //풀이

    //---------------------- 변수 --------------------------//
    //0 : 국어, 1 : 영어, 2 : 수학, 3 : 총점
    int[] scores = new int[4];
    //과목명을 저장하고 있는 배열
    String[] subjects = {"국어", "영어", "수학", "총"};
    //평균
    double avg = 0.0;

    //------------------- 점수 입력 ------------------------//
    //0~100점 사이의 값을 입력 받을 때 까지 반복(과목수만큼 반복)
    for (int i = 0 ; i < scores.length - 1 ; i++ ){
      while (true){
        System.out.print(subjects[i] + " " + "점수 입력 : ");
        scores[i] = sc.nextInt();

        if (scores[i] >= 0 && scores[i] <=100){
          break;
        }

        System.out.println("범위를 벗어났습니다. 다시 입력하시오. ");

      }
    }

    //--------------- 총점 및 평균 입력 --------------------//

    for (int i = 0 ; i < scores.length - 1 ; i++){
      scores[scores.length - 1] += scores[i];
    }
    //평균
    avg = scores[scores.length - 1] / (double) (scores.length -1);

    //------------------ 결과 출력 ------------------------//
    System.out.println();
    System.out.println("***** 입력하신 정보로 점수 정보를 출력합니다. *****");

    //각 과목의 점수 및 총점 출력
    for (int i = 0 ; i < scores.length ; i++){
      System.out.println(subjects[i] + " 점수 : " + scores[i]);
    }

    //평균 출력
    System.out.println("평균 : " + avg);

  }
}

package practice;

import java.util.Scanner;

public class 문제_1_21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    boolean run = true;
    int studentNum = 0;
    int[] scores = null;

    int max = 0;
    double ave = 0;

    while (run){
      System.out.println("---------------");
      System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
      System.out.println("---------------");
      System.out.print("선택 : ");

      int selecNo = sc.nextInt();

      switch (selecNo){
        case 1:
          System.out.print("학생 수 : ");
          studentNum = sc.nextInt();
          scores = new int[studentNum];
          break;
        case 2:
          for (int i = 0; i < scores.length; i++){
            System.out.print("scores[" + i + "] >" );
            scores[i] = sc.nextInt();
          }
          break;
        case 3:
          for (int i = 0; i < scores.length; i++){
            System.out.println("scores[i] > " +scores[i]);
          }
          break;
        case 4:
          max = scores[0];
          ave = 0;

          for (int i = 0; i < scores.length; i++){
           if (scores[i] > max){
             max = scores[i];
           }
          }

          for (int i = 0; i < scores.length; i++){
            ave = ave + scores[i];
          }

          System.out.println("최고 점수 : " + max);
          System.out.println("평균 점수 : " + (ave / scores.length));
          break;
        case 5:
        default:
          run = false;
      }
    }
    System.out.println("프로그램 종료");


  }
}

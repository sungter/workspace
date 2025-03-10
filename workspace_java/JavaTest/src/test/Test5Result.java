package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test5Result {
  public static void main(String[] args) {
    //문제 해결을 위한 변수
    Scanner sc = new Scanner(System.in);
    int[] baseball = new int[3];
    int[] answer = new int[3];
    int tryCnt = 1;
    int strike = 0;
    int ball = 0;

    //중복되지 않는 1~9 까지의 랜덤한 정수가 담긴 배열 생성
    for (int i = 0 ; i < baseball.length ; i++){
      baseball[i] = (int)(Math.random() * 9 + 1);
      //중복 검사
      for (int j = 0 ; j < i ; j++){
        if (baseball[i] == baseball[j]){
          i--;
          break;
        }
      }
    }

    System.out.println("만들어진 숫자" + Arrays.toString(baseball));
    System.out.println("숫자를 정했습니다. 게임을 시작합니다.");

    //키보드로 입력받은 세 수를 담는 배열 생성
    //두 배열의 값을 비교
    while (true){
      System.out.print(tryCnt + " >> ");

      for (int i = 0 ; i < answer.length ; i++){
        answer[i]= sc.nextInt();
      }

      for (int i = 0 ; i < baseball.length ; i++){
        for (int j = 0 ; j < baseball.length ; j++){
          if (answer[i] == baseball[j]){
            if (i == j){
              strike++;
            }
            else {
              ball++;
            }
          }
        }
      }
      System.out.println(strike + "스트라이크" + ball + "볼");

      if (strike == 3){
        System.out.println(tryCnt + "회만에 정답을 맞췄습니다.");
        break;
      }
      else {
        strike = 0;
        ball = 0;
      }
      tryCnt++;
    }
  }
}

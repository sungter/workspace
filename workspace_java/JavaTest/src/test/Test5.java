package test;

import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] numbers = new int[3];
    int[] resultNumbers = new int[3];
    int strike = 0;
    int ball = 0;
    int loopCnt = 0;

    for (int i = 0 ; i < numbers.length ; i++){
      numbers[i] = (int)(Math.random() * 9 +1);
      for (int j = 0 ; j < i ; j++){
        if (numbers[j] == numbers[i]){
          i--;
          break;
        }
      }
    }

    for (int i = 0 ; i < numbers.length ; i++){
      System.out.print(numbers[i] + " ");
    }

    while (true){

      for (int i = 0 ; i < resultNumbers.length ; i++){
        System.out.print("숫자 입력 : ");
        resultNumbers[i] = sc.nextInt();
      }

      for (int i = 0 ; i < numbers.length ; i++){
        for (int j = 0 ; j < resultNumbers.length ; j++) {
          if (numbers[i] == resultNumbers[j] && i == j) {
            strike++;
          } else if (numbers[i] == resultNumbers[j] && i != j) {
            ball++;
          }
        }
      }

      System.out.println(strike + "스트라이크" + ball + "볼");
      loopCnt++;

      if (strike == 3){
        System.out.println(loopCnt + "번 만에 정답을 맞췄습니다.");
        break;
      }

      strike = 0;
      ball = 0;

    }

  }
}

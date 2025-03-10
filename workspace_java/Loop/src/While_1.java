
/*
* 반복문 (while, for)
* 특정 코드를 원하는 횟수만큼 반복적으로 실행하는 코드
*
*
* 반복 시작 조건
*
* while(반복 조건){
*   반복 실행할 코드
*   반복 실행할 코드...
*   반복을 파기할 조건
* }
*
*
* */

public class While_1 {
  public static void main(String[] args) {
    int num = 1; //반복 시작 조건 !

    //num이 3보다 작을동안 반복하겠다.
    while (num < 3){ //반복조건
      System.out.println("java");
      num++; //반복 파기 조건
    }


  }
}

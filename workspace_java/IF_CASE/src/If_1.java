
// 조건문 : 조건이 맞을 때만 코드를 실행하는 문법
// 조건문 : if문

/*
*
* if(참 또는 거짓을 판단할 수 있는 조건){
*   실행코드...
*   실행코드...
* }
*
* */

public class If_1 {
  public static void main(String[] args) {
    System.out.println("시작");

    int num = 3;
    if(num == 3){
      System.out.println("aaaaa");
      System.out.println("aaaaa");
    }
    //; if문 마지막에 세미콜론이 안들어감


    //조건에 따른 실행 코드가 하나라면 중괄호 생략 가능
    if(num > 5)
      System.out.println("bbb");

    System.out.println("bbb");
    // 2번째 bbb는 if문 밖에 있어서 출력 가능하나 첫번째줄은 거짓이기에 출력 안됨.



    System.out.println("끝");
  }
}

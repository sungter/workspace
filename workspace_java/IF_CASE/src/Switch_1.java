/*
*
* 조건문 : switch case break 문
* 조건이 범위라면 if문 사용이 코딩에 수월
* 조건이 특정값이라면 switch 문 사용이 수월
*
* */

public class Switch_1 {
  public static void main(String[] args) {
    int num = 2;

    //들여쓰기, 내어쓰기 중요!
    //조건이 맞는 수식부터 아래로 모든 내용 실행한다.
    //조건이 맞는 수식에서 아래 내용을 실행하기 싫을때, 쓰는 명령어 : break
    switch (num){
      case 1:
        System.out.println(1);
        break;
      case 2:
        System.out.println(2);
        System.out.println(2);
        break;
      case 3:
        System.out.println(3);
        break;
      default:
        System.out.println(4);
    }


  }
}

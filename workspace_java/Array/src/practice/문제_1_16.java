package practice;

public class 문제_1_16 {
  public static void main(String[] args) {
    //자바에서 랜덤 숫자를 발생시키고 싶을 때는...
    //Math.random()명령어를 사용!
    //Math.random() -> 0.0 <= x <1.0 사이의 랜덤한 실수값 생성

    double r = Math.random();
    System.out.println(r);
    //0부터 10까지의 랜덤한 정수를 생성
    int d = (int)(Math.random() * 10);
    System.out.println(d);

    int I;   //0.0   51.0
    I = (int)(Math.random() * 51) + 50;

    System.out.println(I);




    /*
    double i = Math.random() * 100;

    int a = 0;

    while (true){
      if (i > 49 && i < 100){
        a = (int)i;
        System.out.println(a);
        break;
      }
    }
    */

  }
}

package study;

public class CakeTest1 {
  public static void main(String[] args) {
    StrawberryCheeseCake c1 = new StrawberryCheeseCake();
    //c1.eatStrawberryCheeseCake();
    //c1.eatCheeseCake();
    //c1.eatCake();

    //다형성
    //다형성을 통해 생성된 객체는 부모클래스의 변수와 매서드만 사용 가능!
    //StrawberryCheeseCake c2 = new Cake();
    CheeseCake c3 = new StrawberryCheeseCake();
    //c3.eatCheeseCake();
    //c3.eatCake();
    Cake c4 = new StrawberryCheeseCake();
    //c4.eatCake();

    //c4 객체를 딸기치즈케잌으로 변환
    StrawberryCheeseCake c5 = (StrawberryCheeseCake)c4;

    Cake c6 = new Cake();
    //StrawberryCheeseCake c7 = (StrawberryCheeseCake)c6;

    //형변환
    int a = (int)10.5;

  }
}

package object_stringClass;

//클래스가 명시적으로 상속을 받고 있지 않으면
//자동으로 Object 클래스를 상속 받는다.
//결론, 모든 클래스는 Object(최상위 클래스) 클래스를 상속받고 있다.
//모든 클래스의 객체는 Object로 다 받을 수 있다.(다형성 개념)
public class Tv extends Object{
  int num;
  String name;

  public void turnOn(){
    System.out.println("Tv 전원 켬");
  }

  //Object 클래스의 toString() 메서드 오버라이딩
  //@Override : 메서드가 오버라이딩 문법에 맞는지 확인 !


  @Override
  public String toString() {
    return "Tv{" +
            "num=" + num +
            ", name='" + name + '\'' +
            '}';
  }
}

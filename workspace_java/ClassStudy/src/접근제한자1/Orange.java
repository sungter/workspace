package 접근제한자1;

/*
* 접근제한자
*  - 맴버변수, 매서드, 클래스의 사용 범위를 지정
* 종류 : public > default > protected > private
* public 선언된 변수와 메서드 : 같은 프로젝트라면 접근 가능
* default : 같은 패키지 내에서 접근 가능 (아무것도 안적으면 사용중 ex> int sum 은 default 접근 제한자를 쓰고 있던것)
* protected : 상속 배우면..
* private : 변수, 메서드를 선언한 클래스 안에서만 접근 가능, 클래스에서 사용 불가
*
* 맴버변수에는 무조건 private
* 메서드에는 무조건 public
*
* */
public class Orange {
  private int a;
  int b;
  public int c;
  private int price;

  public void setPrice(int price){
    this.price = price;
  }


  private void aaa(){}
  void bbb(){}
  public void ccc(){}
}



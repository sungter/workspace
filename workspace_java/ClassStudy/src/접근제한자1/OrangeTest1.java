package 접근제한자1;

public class OrangeTest1 {
  public static void main(String[] args) {
    Orange orange = new Orange();

    //orange.a; a변수는 private라서 다른 클래스에서는 접근 불가
    //orange.aaa();
    orange.b = 10;
    orange.c = 20;

    //orange.price = -100; 직접적으로 값을 가져오는걸 방지하기 위해 private를 설정하였기에 오류
    orange.setPrice(100); //setter 사용

  }
}

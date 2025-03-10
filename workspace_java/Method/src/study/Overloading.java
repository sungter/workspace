package study;

//메서드 오버로딩
//메서드명은 중복 불가한다. 하지만, 매서드의 매개변수 정보(매개변수의 갯수, 매개변수의 자료형)가 다르면
//중복된 이름으로 메서드명 작성을 허용!
public class Overloading {
  public static void main(String[] args) {
    System.out.println(true);
//    println(문자열, 정수, 정수2개); 내가 만든 메서드에 오버로딩 값 입력 모두 가능
  }

  public static void println(String ar){
    System.out.println(ar);
  }

  public static void println(int num){
    System.out.println(num);
  }

  public static void println(int num, int num1){
    System.out.println(num);
  }

}

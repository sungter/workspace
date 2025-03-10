public class 상수 {
  public static void main(String[] args) {
    // 상수 : 변하지 않는 값

    //변수는 값을 지속적으로 변경할 수 있음
    int num = 10;
    num = 20;

    //자료형 앞에 final 키워드를 추가하면 상수가 된다.
    // final : 상수 표기
    //상수는 대문자로 명명한다.
    //더 이상 NUM2의 값 변경이 불가능함.
    final int NUM2 = 10;
    //NUM2 = 20; 값 변경시 오류

    final double PI = 3.14;
  }
}

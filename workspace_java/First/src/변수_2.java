public class 변수_2 {
  public static void main(String[] args) {
    //변수는 필요하면 여러개 사용할 수 있다.
    int num1;
    num1 = 10;

    int num2;
    num2 = 20;

    //int num2; 변수명은 중복불가
    //int Num2; 대소문자 취급하기에 입력은 가능하지만 사용하지 않는다.

    //num1 변수와 num2 변수에 저장된 정수의 합을 출력
    System.out.println(num1 + num2);

    num2 = 50;
    System.out.println(num2);

  }
}

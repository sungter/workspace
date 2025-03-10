package study;


//변수는 사용 가능한 (인식 가능한) 범위가 존재한다.
//변수의 사용 영역은 해당 변수가 선언된 중괄호{} 안에서만 가능 !
public class 변수의사용영역 {
  public static void main(String[] args) {

    int a = 5;
    if (a > 3){
      //변수 b는 if문 안에서만 사용 가능 !
      int b = 10;
      System.out.println(a);
      System.out.println(b);
    }

    System.out.println(a);
//    System.out.println(b); b선언이 if문 안이라 밖에서 인식 안됨.

    System.out.println();
    /// ////////////////////////////////////////////////////
    if (10 > 5){
      int num2 = 5;
    }

    if (3 > 1){
      int num2 = 10;
    }
    /// ///////////////////////////////////////////////////
    for (int i = 0 ; i < 10 ; i++){
      //for문의 ()안에서 정의돈 변수 i 는 for문 안에서만 사용 가능
    }
    /// ///////////////////////////////////////////////////
    for (int i = 0 ; i < 10 ; i++){
      int data = 1;
      System.out.println("data = " + data);
      data++;
    }

  }



}

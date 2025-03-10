package practice;

public class 문제_10_4 {
  public static void main(String[] args) {
    boolean result = test4(11);
    System.out.println(result);

    //풀이
    System.out.println(isEven(5));
  }

  public static boolean test4(int num){
    if (num % 2 == 0){
      return true;
    }
    else {
      return false;
    }
//    return num % 2 == 0; 연산자 사용시
  }

  //풀이
  //boolean일때, 메소드명을 is를 자주 같이 작명한다.
  public static boolean isEven(int num){
    return num % 2 == 0;
  }

}

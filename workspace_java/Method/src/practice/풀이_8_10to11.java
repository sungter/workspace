package practice;

public class 풀이_8_10to11 {
/// //////////////////////////////////////////////////////////
  public static void main(String[] args) {
    //test10() 메서드의 '인자'로 5가 전달되었다.
    test10(5);
    test11(7, 5);
  }

  public static void test11(int a, int b){
    if (a % 2 == 0 && b % 2 == 0){
      System.out.println("두 수는 짝수입니다.");
    }
    else if (a % 2 == 1 && b % 2 == 1){
      System.out.println("두 수는 홀수입니다.");
    }
    else {
      System.out.println("한 수만 짝수입니다.");
    }
  }

  public static void test10(int a){
    System.out.println(a % 2 == 0 ? "짝수입니다." : "홀수입니다.");
  }

/// /////////////////////////////////////////////////////////
}

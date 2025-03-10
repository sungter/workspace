package practice;

public class 문제_9_10 {
  public static void main(String[] args) {
    boolean a = test10("안녕하세요");
    System.out.println(a);
  }

  public static boolean test10(String str){
    int num = str.length();
    if (num % 2 == 0){
      return true;
    }
    else {
      return false;
    }
//    return str.length() % 2 == 0 ? true: false;
//    return str.length() % 2 == 0; 리턴값이 boolean이기에 연산 결과 출력
  }

}

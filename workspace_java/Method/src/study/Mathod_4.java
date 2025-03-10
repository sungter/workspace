package study;


public class Mathod_4 {
  public static void main(String[] args) {
    printSum(10, 20);
//    printSum(10); 매개변수 갯수 불일치 오류 !!
//    printSum(20, "java"); 매개변수 자료형 불일치 오류 !!
  }

  public static void printSum(int num1, int num2){
    System.out.println(num1 + num2);
  }

}

package practice;

public class 문제_8_1to5 {
  public static void main(String[] args) {
    //1번 문제
    printHello();
    //2번 문제
    printNum(5);
    //3번 문제
    printString("안녕");
    //4번 문제
    printSum(5, 10);
    //5번 문제
    printMulti(3, 5, 10);
  }

  public static void printHello(){
    System.out.println("안녕하세요");
  }

  public static void printNum(int num){
    System.out.println(num);
  }

  public static void printString(String hi){
    System.out.println(hi);
  }

  public static void printSum(int num1, int num2){
    System.out.println(num1 + num2);
  }

  public static void printMulti(int num1, int num2, int num3){
    System.out.println(num1 * num2 * num3);
  }
}

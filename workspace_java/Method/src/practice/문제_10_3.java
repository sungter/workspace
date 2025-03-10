package practice;

public class 문제_10_3 {
  public static void main(String[] args) {
    int result = test3();
    System.out.println(result);
    //풀이
    int num = result3();
    System.out.println(num);

    //다른 출력문
    System.out.println(result3());
  }

  public static int test3(){
    double num = Math.random() * 50 + 1;
    int num2 = (int)num;
    return num2;
  }

  //풀이
  public static int result3(){
    return (int)(Math.random() * 50 + 1);
  }

}

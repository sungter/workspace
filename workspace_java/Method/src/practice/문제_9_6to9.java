package practice;

public class 문제_9_6to9 {
  public static void main(String[] args) {
    //문제 6
    String a = test6(50);
    System.out.println(a);
    //문제 7
    double b = test7(7.5);
    System.out.println(b);
    //문제 8
    double c = test8(2, 8, 10);
    System.out.println(c);
    //문제 9
    int d = test9(11);
    System.out.println(d);
  }

  //문제 9
  public static int test9 (int num){
    int all = 0;
    for (int i = 0; i < num + 1; i++){
      if(i % 2 != 0){
        all = all + i;
      }
    }
    return all;
  }

  //문제 8
  public static double test8 (int num1, int num2, int num3){
    double avg = (num1 + num2 + num3)/3.0;
    return avg;
  }

  //문제 7
  public static double test7(double num){
    return num * num;
  }

  //문제 6
  public static String test6 (int num){
    //html에서 자바로 input태그안 내용을 가져올때, 문자열로 가져온다.
    //숫자 - > 문자열
    String a = String.valueOf(num);

    //문자열 -> 정수
    int b = Integer.parseInt(a);
    //문자화된 숫자를 정수로 바꾸어 줌 (문자는 출력 안됨.)

    return num + "";
    //다른 방법
//    return String.valueOf(num);
  }

}

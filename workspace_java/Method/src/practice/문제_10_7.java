package practice;

public class 문제_10_7 {
  public static void main(String[] args) {
    String[] a = {"집에", "가고", "싶은", "마음", "입니다."};
    String b = test7(a);
    System.out.println(b);
  }

  public static String test7(String[] str){
    String a = "";
    for (int i = 0 ; i < str.length ; i++){
      a = a + str[i];
    }
    return a;
  }

  //풀이
  public static String result7(String[] arr){
    String result = "";
    for (int i = 0 ; i < arr.length ; i++){
      result += arr[i];
    }
    return result;
  }

}

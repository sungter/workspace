package practice;

public class 풀이_8_14 {
  public static void main(String[] args) {
    test14(17, 2);
  }

  public static void test14(int a, int b){
    int max = a > b ? a : b;
    int min = a > b ? b : a;
    int cnt = 0;

    for (int i = min + 1 ; i < max ; i++){
      if (i % 5 == 0){
        cnt++;
      }
    }
    System.out.println(cnt);
  }

}

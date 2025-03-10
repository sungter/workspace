package practice;

public class 풀이_8_12to13 {
  public static void main(String[] args) {
    test12(5);
    System.out.println();
    int a = 5;
    int b = 15;
    test13(a, b);
  }

  public static void test13(int first, int second){
    int max = first > second ? first : second;
    int min = first > second ? second : first;

    for (int i = min + 1 ; i < max ; i++){
      System.out.print(i + " ");
    }
  }




  public static void test12(int num){
    for (int i = 0 ; i < num + 1 ; i++){
      System.out.print(i + " ");
    }
  }

}

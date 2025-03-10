public class 변수문제_4 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    System.out.println(a);
    System.out.println(b);

    int c = b;
    b = a;
    a = c;

    System.out.println(a);
    System.out.println(b);

  }
}

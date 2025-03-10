package practice2.num6;

public class resultTest {
  public static void main(String[] args) {
    result r = new result();
    result s = new result(1, 1, 2, 3);

    r.show();
    s.show();
    System.out.println(s.square());
    r.set(-2, 2, -1, 4);
    r.show();
    System.out.println(r.square());
    if (r.equals(s)){
      System.out.println("두 사각형은 같습니다.");
    }

  }
}

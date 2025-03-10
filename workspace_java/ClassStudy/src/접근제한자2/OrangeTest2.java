package 접근제한자2;

import 접근제한자1.Orange;

public class OrangeTest2 {
  public static void main(String[] args) {
    Orange orange = new Orange();

    //orange.b = 1; default 이기 때문에 같은 패키지에만 가능

  }
}

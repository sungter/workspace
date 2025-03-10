


public class Break_Continue {
  public static void main(String[] args) {
    //반복문에 break, continue 라는 명령어를 사용할 수 있다.

    //break
    // !중요! 가장 가까운 반복문을 종료(벗어남)
    // 가장 가까운 반복문이기에 while이 종료.
    int i = 1;
    while (i < 6){
      if (i == 3){
        break;
      }

      System.out.println(i);
      i++;
    }

    System.out.println();

    /// //////////////////////////////////
    //continue
    //가장 가까운 반복문의 마지막으로 이동한다.
    // * 잘 안쓰지만 개념만 공부 *
    int a = 0;

    while (a < 5){
      a++;

      if (a == 3){
        continue;
      }

      System.out.println(a);
      //continue 조건에서 멈추어 출력문을 건너뛰고, 이 위치에서 다시 시작
    }


  }
}

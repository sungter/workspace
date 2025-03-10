

public class For_1 {
  public static void main(String[] args) {

/*    int i = 0;
    while (i < 5){
      System.out.println(i);
      i++;
    }
*/

    /*
    *
    * for (반복시작조건;, 반복조건;, 반복파기조건){
    *   반복 실행할 코드
    * }
    *
    * */

    //while문은 모두 for문으로 교체 가능
    // !중요! 해석 순서 : int i = 0; -> i < 5; -> System.out.println(i); -> i++ -> i < 5 ...
    for(int i = 0; i < 5; i++){
      System.out.println(i);
    }

  }
}

public class 출력문_1 {
  public static void main(String[] args){
    /* 소괄호 안의 내용을 출력 + 한 줄 개행 */
    System.out.println("hello~");
    System.out.println("hello~");

    //소괄호 안의 내용을 출력
    System.out.print("hello~");
    System.out.print("hello~");

    //한 줄 개행
    System.out.println();

    //숫자를 출력할 때는 쌍따옴표를 넣지 않는다.
    //문자를 출력할 때는 무조건 쌍따옴표를 넣는다.
    System.out.println(5+5);
    //숫자를 쌍따옴표에 감싸면 연산이 불가능한 문자로 인식한다.
    System.out.println("5");

  }
}


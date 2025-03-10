package static_study;

public class Count2 {
  static int cnt;
  int number;

  public void aaa(){
    System.out.println(cnt);
    bbb();
  }

  public static void bbb(){
    //aaa(); 오류!
    //System.out.println(number); 오류!
    //이유 : 생성자보다 static 초기화가 먼저 진행 된다. (객체가 없어도 사용가능함)
  }

  public static void main(String[] args) {
    //aaa(); 오류!
  }

}

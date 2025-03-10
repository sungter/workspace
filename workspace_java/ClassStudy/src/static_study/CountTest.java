package static_study;

//static이 붙은 맴버변수(== 공용 변수)는
//객체에 종속적이지 않고, 모든 객체가 공유하는 데이터
//static 은 변수는 메서드에 적용이 가능 ex) main메서드
//static 변수는 생성자에서 초기화하지 않는다.
//static 변수는 초기화 구문이 따로 존재함.
//생성자보다 static 초기화가 먼저 진행 된다. (객체가 없어도 사용가능함, 그 이유)
//static 변수는 객체명.맴버변수; 문법으로 호출 권장x
//static 변수는 클래스명.변수명;

public class CountTest {
  public static void main(String[] args) {
    Count count = new Count();
    Count count1 = new Count();
    Count count2 = new Count();

    System.out.println(count.cnt);
    count1.cnt = 10;
    System.out.println(count.cnt);

    //static 변수는 클래스명.변수명;
    System.out.println(Count.cnt);

    //예시) PI변수와 max 메서드 둘다 static/ 클래스명 뒤에 왔기때문
    System.out.println(Math.PI);
    System.out.println(Math.max(10, 20));
  }
}

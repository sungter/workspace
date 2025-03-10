package practice2.num6;

public class result {
  private int x1;
  private int y1;
  private int x2;
  private int y2;

  //생성자
  public result(){}
  //모든 매개변수를 자동 초기화하는 방법
  //우클릭 -> Generate -> Constructor -> 매개변수 선택 -> Ok
  public result(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  //좌표 설정
  public void set(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  //사각형의 넓이를 리턴하는 메서드
  public int square(){
    return (x2 - x1) * (y2 - y1);
  }

  //좌표의 넓이 등 직사각형 정보의 화면 출력
  // ex> 좌표 : (1, 3), (2, 5), 넓이 : 2
  public void show(){
    System.out.println("좌표 : (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ") 넓이 : " + square());
  }

  //인자로 전달된 객체 r과 현 객체가 동일한 넓이라면 true 리턴
  public boolean equals(result r){
    return square() == r.square() ? true : false;
//    if (square() == r.square()){
//      return true;
//    }
//    else {
//      return false;
//    }
  }

}

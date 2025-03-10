package practice2.num6;

public class Rectangle {
  private int x1;
  private int y1;
  private int x2;
  private int y2;
  private int xy;

  public Rectangle(){}
  public Rectangle(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  void set(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public int square(){
    int xMax = x1 > x2 ? x1 : x2;
    int xMin = x1 > x2 ? x2 : x1;
    int x = 0;
    for (int i = xMin; i < xMax +1; i++){
      x++;
    }

    int yMax = y1 > y2 ? y1 : y2;
    int yMin = y1 > y2 ? y2 : y1;
    int y = 0;
    for (int i = yMin; i < yMax +1; i++){
      y++;
    }
    xy = x*y;

    return xy;
  }

  void show(){
    System.out.println("좌표 : " + "x1,y1 = " + x1 + " " + y1);
    System.out.println("좌표 : " + "x2,y2 = " + x2 + " " + y2);
    System.out.println("넓이 : " + square());
  }

  boolean equals(int s){
    if (xy == s){
      return true;
    }
    else {
      return false;
    }
  }

}

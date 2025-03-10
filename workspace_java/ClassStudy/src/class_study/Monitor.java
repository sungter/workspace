package class_study;

public class Monitor {
  String brand;
  String color;
  double inch;

  //default 생성자
  public Monitor(){
    brand = "삼성";
  }
  //오버로딩 개념을 통해 여러개 생성 가능
  public Monitor(String brand){
    this.brand = brand;
  }
  public Monitor(String brand, String color){
    this.brand = brand;
    this.color = color;
    inch = 24.0;
  }


  public void printInfo(){
    System.out.println("브랜드 : " + brand);
    System.out.println("색상 : " + color);
    System.out.println("인치 : " + inch);
  }

}

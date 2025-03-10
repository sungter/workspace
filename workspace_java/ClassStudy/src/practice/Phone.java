package practice;

public class Phone {
  //문제 6
  String maker;
  String modelName;
  String color;
  int price;
  String phoneNumber;
  //

  //문제 7
  public void setMaker(String name){
    maker = name;
  }
  public void setModelName(String name){
    modelName = name;
  }
  public void setColor(String name){
    color = name;
  }
  public void setPrice(int num){
    price = num;
  }
  public void setPhoneNumber(String number){
    phoneNumber = number;
  }
  //

  //문제 8
  public void printInfo(){
    System.out.println(maker);
    System.out.println(modelName);
    System.out.println(color);
    System.out.println(price);
    System.out.println(phoneNumber);
  }
  //
}

package practice;

public class Man {
  String name;
  int age;
  String add;

  public void setAllInfo(String name1, int age1, String add1){
    name = name1;
    age = age1;
    add = add1;
  }

  public void setName(String name1){
    name = name1;
  }
  public void setAge(int age1){
    age = age1;
  }
  public void setAdd(String add1){
    add = add1;
  }

  public void printInfo(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("주소 : " + add);
  }

}

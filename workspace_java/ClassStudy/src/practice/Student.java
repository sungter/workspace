package practice;

public class Student {
  String name;
  int age;
  String add;
  int studentNum;
  String phoneNumber;

  public void setAllInfo(String name1, int age1, String add1, int studentNum1, String phoneNumber1){
    name = name1;
    age = age1;
    add = add1;
    studentNum = studentNum1;
    phoneNumber = phoneNumber1;
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
  public void setStudentNum(int studentNum1){
    studentNum = studentNum1;
  }
  public void setPhoneNumber(String phoneNumber1){
    phoneNumber = phoneNumber1;
  }

  public void printAll(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("주소 : " + add);
    System.out.println("학번 : " + studentNum);
    System.out.println("전화번호 : " + phoneNumber);
  }

}

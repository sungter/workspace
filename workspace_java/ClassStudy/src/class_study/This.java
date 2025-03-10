package class_study;

public class This {
  //클래스 기초 9번문제
  String name;
  String id;
  String pw;
  int age;

  //회원의 모든 정보를 변경하는 기능
  public void setAllInfo(String name, String id, String pw, int age){
    //this.name : 이 클래스에서 정의된 name이라 해석 (this -> 가장 중요한(Class) 정보를 따라감.)
    this.name = name; //this.name은 클래스 안 name을 의미
    //name = name; //둘다 매서드 안 매개변수 name으로 인식함.
    this.id = id;
    this.pw = pw;
    this.age = age;
  }


  public void printAll(){
    System.out.println("이름 : " + name);
    //System.out.println("이름 : " + this.name); //위의 코드와 같은 코드지만 this가 생략된 것일 뿐이다.
    System.out.println("id : " + id);
    System.out.println("pw : " + pw);
    System.out.println("나이 : " + age);
  }

}

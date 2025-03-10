package test;

public class Member {
  private String id;
  private String pw;
  private String name;
  private int age;


  //매개변수로 전달된 데이터로 모든 맴버변수의 값을 변경하는 기능
  public void setInfo(String id, String pw, String name, int age){
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.age = age;
  }

  //모든 맴버변수의 값을 출력하는 기능
  public void showInfo(){
    System.out.println("id = " + id);
    System.out.println("pw = " + pw);
    System.out.println("name = " + name);
    System.out.println("age = " + age);
  }

  //로그인이 가능할 경우에만 true를 리턴하는 메서드
  public boolean isLogin(String id, String pw){
    return this.id.equals(id) && this.pw.equals(pw);
  }

}

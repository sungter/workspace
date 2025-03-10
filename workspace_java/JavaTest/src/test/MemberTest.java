package test;

public class MemberTest {
  public static void main(String[] args) {
    boolean login;
    Member member = new Member();
    member.setInfo("java", "1234", "kim", 20);
    member.showInfo();
    login = member.isLogin("java", "1234");
    if (login){
      System.out.println("로그인 가능");
    }
    else System.out.println("로그인 불가능");

    login = member.isLogin("java", "1111");
    if (login){
      System.out.println("로그인 가능");
    }
    else System.out.println("로그인 불가능");


  }
}

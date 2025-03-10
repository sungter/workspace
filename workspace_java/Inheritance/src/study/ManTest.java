package study;

public class ManTest {
  public static void main(String[] args) {
    //BusinessMan 클래스에 대한 객체 생성
    BusinessMan man = new BusinessMan("삼성");

    System.out.println(man.company);
    man.tellCompany();

    System.out.println(man.name);
    man.tellName();

  }
}

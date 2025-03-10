package class_study;

public class GetterSetterTest {
  public static void main(String[] args) {
    GetterSetter man = new GetterSetter();

    man.setName("홍길동");
    man.setAge(30);
    man.setAddress("울산시");
    man.printAllInfo();

    //이름 데이터 출력
    System.out.println(man.getName());


  }
}

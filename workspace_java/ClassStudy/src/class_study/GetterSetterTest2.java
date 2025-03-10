package class_study;

public class GetterSetterTest2 {
  public static void main(String[] args) {
    GetterSetter m1 = new GetterSetter();
    m1.initMember("홍길동", 30, "울산시");
    GetterSetter m2 = new GetterSetter();
    m2.initMember("유관순", 20, "서울시");

    //m1과 m2 중 나이가 많은 사람의 이름을 출력
    System.out.println(m1.getAge() > m2.getAge() ? m1.getName() : m2.getName());

    //m1 객체의 나이가 30이면
    //m1 객체의 이름을 "이순신"으로 변경하세요
    if (m1.getAge() == 30){
      m1.setName("이순신");
    }

  }
}

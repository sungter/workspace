package class_study;

public class StudentTest {
  public static void main(String[] args) {
    //Student 클래스 객체 stu1 생성
    Student stu1 = new Student();
    //Student 클래스 객체 stu2 생성
    Student stu2 = new Student();

    //stu1 객체의 이름을 '홍길동', 나이는 20살로 변경
    stu1.name = "홍길동";
    stu1.age = 20;

    stu1.setName("이순신");

    //stu1 객체의 모든 정보 출력
    System.out.println(stu1.name);
    System.out.println(stu1.age);
    System.out.println(stu1.score);
    stu1.printInfo();

    stu2.printInfo();

  }
}

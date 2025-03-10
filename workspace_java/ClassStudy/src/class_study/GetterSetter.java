package class_study;

//클래스 기초 문제 15번으로 예시

//멤버변수 각각의 값을 변경하는 메서드
// == setter 만드세요~ 와 동일
//setter -> 맴버변수 '하나'의 값을 변경시키는 메서드 : 리턴타입은 void
//       -> setter 메서드는 이름이 정해져 있음(set맴버변수명)

//각 맴버변수의 값을 리턴하는 메서드
//getter -> 맴버변수 '하나'의 값을 리턴하는 메서드
//       -> return값을 받아오는 메서드로 이름을 가진다. (get맴버변수명)
public class GetterSetter {
  String name;
  int age;
  String address;

  public void initMember(String name, int age, String address){
    this.name = name;
    this.age = age;
    this.address = address;
  }

  //우클릭 -> generate -> getter and setter -> 항목 선택 후 ok
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void printAllInfo(){
    System.out.println("이름 : " + getName());
    System.out.println("나이 : " + age);
    System.out.println("주소 : " + address);
  }

}

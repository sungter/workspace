package practice;

public class PhoneTest {
  public static void main(String[] args) {
    Phone apple = new Phone();

    apple.setMaker("Apple");
    apple.setModelName("아이폰");
    apple.setColor("White");
    apple.setPrice(120);
    apple.setPhoneNumber("010-0000-0000");
    apple.printInfo();

  }
}

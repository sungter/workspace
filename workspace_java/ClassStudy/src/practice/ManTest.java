package practice;

public class ManTest {
  public static void main(String[] args) {
    Man manInfo = new Man();

    manInfo.setName("Kim");
    manInfo.setAge(50);
    manInfo.setAdd("울산 동구");
    manInfo.printInfo();

    System.out.println();

    manInfo.setAllInfo("Lee", 35, "울산 중구");
    manInfo.printInfo();
  }
}

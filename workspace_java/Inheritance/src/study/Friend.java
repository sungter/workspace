package study;

public class Friend {
  private String name;
  private String tel;

  public Friend(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }

  public void showInfo(){
    System.out.println("이름 : " + name);
    System.out.println("연락처 : " + tel);
  }

}

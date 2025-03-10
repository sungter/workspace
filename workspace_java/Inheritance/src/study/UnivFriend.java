package study;

//대학동창정보
public class UnivFriend extends Friend {
//  private String name;
//  private String tel;
  private String major;

  public UnivFriend(String name, String tel, String major) {
    super(name,tel);
    this.major = major;
  }

  public void showInfo(){
    super.showInfo();
    System.out.println("전공 : " + major);
  }

}


package study;

//직장 동료
public class CompFriend extends Friend{
//  private String name;
//  private String tel;
  private String dept;

  public CompFriend(String name, String tel, String dept) {
    super(name, tel);
    this.dept = dept;
  }

  public void showInfo(){
    super.showInfo();
    System.out.println("부서 : " + dept);
  }

}

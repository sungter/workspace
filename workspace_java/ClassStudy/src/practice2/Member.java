package practice2;

public class Member {
  String name;
  String id;
  int pw;

  public Member(){}

  public Member(String name, String id, int pw){
    this.name = name;
    this.id = id;
    this.pw = pw;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getPw() {
    return pw;
  }

  public void setPw(int pw) {
    this.pw = pw;
  }

  public void displayInfo(){
    System.out.println("이름 : " + name);
    System.out.println("id : " + id);
    System.out.println("pw : " + pw);
  }

}

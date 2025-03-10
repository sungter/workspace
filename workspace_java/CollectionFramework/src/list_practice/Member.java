package list_practice;

public class Member {
  String id;
  String pw;
  String name;
  int age;


  public Member(String id, String pw, String name, int age) {
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.age = age;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

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

  @Override
  public String toString() {
    return "Collection15_5to8{" +
            "id='" + id + '\'' +
            ", pw='" + pw + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}

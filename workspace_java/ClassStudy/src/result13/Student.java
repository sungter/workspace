package result13;

public class Student {
  private String name;
  private int age;
  private String grade;
  private String tel;

  public Student(String name, int age, String grade, String tel) {
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.tel = tel;
  }

  public void printStudent(){
    System.out.print("이름 : " + name);
    System.out.print("  나이 : " + age);
    System.out.print("  학점 : " + grade);
    System.out.print("  연락처 : " + tel);
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

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }
}

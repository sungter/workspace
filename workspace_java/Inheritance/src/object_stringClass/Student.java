package object_stringClass;

public class Student {
  int stuNum;
  String name;

  public Student(int stuNum, String name) {
    this.stuNum = stuNum;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    Student student = (Student)obj;
    if (stuNum == student.stuNum){
      return true;
    }
    else {
      return false;
    }
  }
}

package practice;

public class StudentTest {
  public static void main(String[] args) {
    Student stu1 = new Student("Kim", 80, 90, 82);
    Student stu2 = new Student("Lee", 87, 96, 78);
    Student stu3 = new Student("Hong", 85, 92, 75);
    Student[] allStu = new Student[3];
    allStu[0] = stu1;
    allStu[1] = stu2;
    allStu[2] = stu3;

    MyStudent st = new MyStudent();
    System.out.println(st.getTotalScore(stu2));

    System.out.println(st.getHighScoreStudent(stu1, stu2).getName());

    System.out.println(st.getGradeByStudentName(allStu, "park"));


    for (int i = 0 ; i < allStu.length ; i++){
      System.out.println(st.getTotalScoresToArray(allStu)[i]);
    }

  }
}

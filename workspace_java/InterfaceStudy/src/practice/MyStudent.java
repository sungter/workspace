package practice;

public class MyStudent implements StudentUtil {

  //매개변수로 들어온 학생의 총점을 리턴
  @Override
  public int getTotalScore(Student stu) {
    return stu.getEngScore() + stu.getKorScore() + stu.getMathScore();
  }

  //매개변수로 들어온 두 학생 중
  //총점이 높은 학생을 리턴
  @Override
  public Student getHighScoreStudent(Student stu1, Student stu2) {
    int sum1 = stu1.getEngScore() + stu1.getMathScore() + stu1.getKorScore();
    int sum2 = stu2.getEngScore() + stu2.getMathScore() + stu1.getKorScore();
    if (sum1 > sum2){
      return stu1;
    }
    else {
      return stu2;
    }

    // 풀이 : return getTotalScore(stu1) > getTotalScore(stu2) ? stu1 : stu2;
  }

  //학생 여러명을 매개변수로 받아, 또 다른 매개변수로
  //받은 학생의 이름과 일치하는 학생의 점수 등급을 문자열로 리턴
  //학생의 점수 등급은 총점의 평균으로 계산.
  //만약, 매개변수로 받은 이름과 일치하는 학생이 없다면
  //"학생 정보 없음"이라는 문자열을 리턴
  // 90 <= 총점 <= 100 -> A
  // 80 <= 총점 <= 89 -> B
  // 70 <= 총점 <= 79 -> C
  // 70 > 총점 -> D
  @Override
  public String getGradeByStudentName(Student[] stuAll, String name) {
    //풀이
    String grade = "학생 정보 없음";

    for (int i = 0 ; i < stuAll.length ; i++){
      if (stuAll[i].getName().equals(name)){
        double avg = getTotalScore(stuAll[i]) / 3.0;
        grade = getGradeByAvg(avg);
        break;
      }
    }
    return grade;
  }

    //혼자
//    String print = "";
//
//    for (int i = 0 ; i < stuAll.length ; i++){
//
//      if (stuAll[i].getName().equals(name)){
//        int sumAll = (int)((stuAll[i].getEngScore() + stuAll[i].getKorScore() + stuAll[i].getMathScore()) / 3);
//
//        if (sumAll > 89 && sumAll < 101){
//          print = "A";
//          break;
//        }
//        else if (sumAll > 79 && sumAll < 90){
//          print = "B";
//          break;
//        }
//        else if (sumAll > 69 && sumAll < 80){
//          print = "C";
//          break;
//        }
//        else {
//          print = "D";
//          break;
//        }
//      }
//      else {
//        print = "학생 정보 없음";
//      }
//    }
//    return print;


  //4번 문제 풀이에 필요한 평균점수로 등급을 문자열로 리턴하는 메서드
  public String getGradeByAvg(double avg){
    String grade = "";
    if (avg >= 90 && avg <= 100){
      grade = "A";
    }
    else if (avg >= 80){
      grade = "B";
    }
    else if (avg >= 70){
      grade = "C";
    }
    else {
      grade = "D";
    }

    return grade;
  }




  //매개변수로 학생 여러명을 받아,
  //해당 학생들의 총점을 배열로 리턴
  //예를 들어 매개변수로 학생 3명이 들어오고,
  //각각의 학생의 총점이 270, 280, 250점 이면
  //270, 280, 250의 값을 갖는 배열을 리턴해야 함
  @Override
  public int[] getTotalScoresToArray(Student[] stuAll) {
    int[] allScore = new int[stuAll.length];

    for (int i = 0 ; i < stuAll.length ; i++){
      allScore[i] = getTotalScore(stuAll[i]);
    }

    return allScore;
  }
}

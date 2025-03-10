package practice2;

import java.util.Scanner;

public class StudentSetting {
  Scanner sc = new Scanner(System.in);

  /// ///////////////////////////////////
  //모든 자료형은 배열형으로 만들수있다. (Class도 자료형)
  Student[] stu = new Student[3];


  public void arrSetting(){
    for (int i = 0; i < stu.length; i++){
      stu[i] = new Student();
    }
  }



  private int arr = 0;

  public void sumStuArr(){
    if (arr == 0){
      System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");
    }

    System.out.print("이름 : ");
    stu[arr].setA(sc.next());
    System.out.print("나이 : ");
    stu[arr].setB(sc.nextInt());
    System.out.print("연락처 : ");
    stu[arr].setC(sc.next());
    System.out.print("학점 : ");
    stu[arr].setD(sc.next());
    arr++;

    if (arr > 3){
      arr = arr -1;
      System.out.println("등록할 수 있는 학생 수를 초과하였습니다.");
    }
  }

  public void phoneNumber(String studentName){
    System.out.print("연락처 : ");
    if (stu[0].getA().equals(studentName)){
      stu[0].setC(sc.next());
      System.out.println("변경 완료 되었습니다.");
    }
    else if (stu[1].getA().equals(studentName)){
      stu[1].setC(sc.next());
      System.out.println("변경 완료 되었습니다.");
    }
    else if (stu[2].getA().equals(studentName)){
      stu[2].setC(sc.next());
      System.out.println("변경 완료 되었습니다.");
    }
    else {
      System.out.println("변경할 학생 이름을 다르게 입력하셨습니다.");
    }
  }

  public void studentInfo(String studentName){
    System.out.println("요청하신 학생의 정보입니다.");

    for (int i = 0; i < arr; i++){
      if (stu[i].getA().equals(studentName)){
        System.out.print("이름 : " + stu[i].getA() + ", ");
        System.out.print("나이 : " + stu[i].getB() + ", ");
        System.out.print("연락처 : " + stu[i].getC() + ", ");
        System.out.println("학점 : " + stu[i].getD());
      }

      if (i > 3){
        System.out.println("열람할 학생 이름을 다르게 입력하셨습니다.");
      }
    }

  }

  public void allStudentInfo(){
    System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 " + (arr) + "명입니다.");
    for (int i = 0; i < arr; i++){
      System.out.println("이름 : " + stu[i].getA() + ", 나이 : " + stu[i].getB() + ", 학점 : " + stu[i].getD());
    }
  }

}

package practice2;

import java.util.Scanner;

public class StudentTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



    StudentSetting studentSetting = new StudentSetting();

    System.out.println("학생관리 프로그램을 실행합니다.");
    studentSetting.arrSetting();

    int number;

    while (true){
      System.out.print("1)학생등록  2)학생정보변경(연락처)  3)학생정보출력  4)모든학생정보출력  5)프로그램 종료 : ");
      number = sc.nextInt();


      if (number == 1){
        studentSetting.sumStuArr();
      }
      else if (number == 2){
        System.out.println("학생의 연락처를 변경합니다.");
        System.out.print("변경 학생 : ");
        studentSetting.phoneNumber(sc.next());
      }
      else if (number == 3){
        System.out.print("정보를 열람할 학생 : ");
        studentSetting.studentInfo(sc.next());
      }
      else if (number == 4){
        studentSetting.allStudentInfo();
      }
      else {
        break;
      }

    }

    System.out.println("프로그램을 종료합니다.");


  }
}

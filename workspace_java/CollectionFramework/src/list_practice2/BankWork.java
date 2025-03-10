package list_practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankWork {
  Scanner sc = new Scanner(System.in);

  List<PersonInfo> personInfosList = new ArrayList<>();
  List<BankInfo> bankInfoList = new ArrayList<>();

  public void makeBank(){
    System.out.print("이름 : ");
    String name = sc.next();
    System.out.print("주민등록번호 : ");
    int regNum = sc.nextInt();
    System.out.print("연락처 : ");
    String phoneNum = sc.next();
    System.out.print("계좌번호 : ");
    int accNum = sc.nextInt();

  }

  public void num1(){
    System.out.println("계좌개설을 시작합니다.");
    System.out.print("이름 : ");
    String name = sc.next();
    System.out.print("주민등록번호 : ");
    int regNum = sc.nextInt();
    System.out.print("연락처 : ");
    String phoneNum = sc.next();
    System.out.print("계좌번호");
    String accNum = sc.next();

    personInfosList.add(new PersonInfo(name, regNum, phoneNum));
    bankInfoList.add(new BankInfo(regNum, accNum));
  }



}

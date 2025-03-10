package list_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
  Scanner sc = new Scanner(System.in);

  List<Emp> list = new ArrayList<>();

  public EmpService(){
    Emp p1 = new Emp(1001, "홍길동", "개발부", "010-0000-0000", 1000);
    list.add(p1);
    Emp p2 = new Emp(1002, "장길동", "인사과", "010-0000-1111", 2000);
    list.add(p2);
    Emp p3 = new Emp(1003, "이길동", "인사과", "010-0000-3333", 3000);
    list.add(p3);
    Emp p4 = new Emp(1004, "조길동", "개발부", "010-0000-4444", 4000);
    list.add(p4);
    Emp p5 = new Emp(1005, "김길동", "개발부", "010-0000-5555", 5000);
    list.add(p5);
  }


  public void login(){
    boolean login = true;

    while (login){
      System.out.print("사번 : ");
      int empNum = sc.nextInt();
      System.out.print("비밀번호(연락처의 마지막 4자리) : ");
      String pw = sc.next();

      for (int i = 0 ; i < list.size() ; i++){
        if (empNum == list.get(i).getEmpNum() && pw.equals(list.get(i).getPw())){
          System.out.println("로그인 하였습니다.");
          System.out.println(list.get(i).getName() + "님 반갑습니다.");
          login = false;
          break;
        }
        else {
          System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
          break;
        }
      }
    }
  }



  public void comName(){
    System.out.print("부서명 : ");
    String name = sc.next();
    System.out.println("==개발부 월급 현황==");
    int sum = 0;
    int cnt = 0;
    for (Emp e : list){
      if (e.getComName().equals(name)){
        System.out.print("이름 : " + e.getName() + ",  ");
        System.out.println("월급 : " + e.getMoney());
        cnt++;
        sum = sum + e.getMoney();
      }
    }
    int avg = sum / cnt;
    System.out.println("개발부서의 월급 총액은 " + sum + "원이며, 평균 급여는 " + avg + "원입니다.");
  }

  public void money(){
    System.out.print("부서명 : ");
    String name = sc.next();
    System.out.print("인상급여 : ");
    int moneyUp = sc.nextInt();
    System.out.println(name + " 각 사원의 급여가 각각 " + moneyUp + "원씩 인상됩니다.");
    System.out.println("==월급 인상 후 개발부 월급 현황==");

    for (Emp e : list){
      if (e.getComName().equals(name)){
        System.out.print("이름 : " + e.getName());
        System.out.println("  월급 : " + (e.getMoney() + moneyUp));
      }
    }
  }


}

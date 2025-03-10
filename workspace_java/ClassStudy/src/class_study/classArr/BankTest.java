package class_study.classArr;

public class BankTest {
  public static void main(String[] args) {

    //bank클래스에 대한 객체를 5개 저장할 수 있는 배열 bankArr을 생성
    Bank[] bankArr = new Bank[5];

    //bank 클래스에 대한 객체 5개 생성
    //bankArr 배열에 객체를 저장
    bankArr[0] = new Bank("김자바", 10000, "111-222");
    bankArr[1] = new Bank("이자바", 20000, "222-222");
    bankArr[2] = new Bank("박자바", 30000, "222-223");
    bankArr[3] = new Bank("최자바", 40000, "222-224");
    bankArr[4] = new Bank("정자바", 50000, "222-225");

    //bankArr 배열에 저장된 모든 계좌의 예금액 합을 출력
    int sum = 0;
    //for 문
    for (int i = 0 ; i < bankArr.length ; i++){
      sum = sum + bankArr[i].getBalance();
    }

    //for-each
//    for (Bank bank : bankArr){
//      sum = sum + bank.getBalance();
//    }
    System.out.println("모든 계좌액 합 : " + sum);
    /// ///////////////////////////////////////////////////////////////////////

    //bankArr 배열에 저장된 모든 계좌정보 중에서
    //계좌주가 "최자바" 인 계좌정보를 찾고 그 정보 중 예금액을 20% 인상시키는 코드 작성

    //for 문
    for (int i = 0 ; i < bankArr.length ; i++){
      if (bankArr[i].getOwner().equals("최자바")){
        bankArr[i].setBalance((int)(bankArr[i].getBalance() * 1.2));
      }
    }

    //for-each 문
    for (Bank bank : bankArr){
      if (bank.getOwner().equals("최자바")){
        bank.setBalance((int)(bank.getBalance() * 1.2));
      }
    }



  }
}

package class_study;

//맴버변수 초기값을 갖는 것이 좋은 코드이다.

//계좌 정보
public class Account {
  String accNumber;
  int money;
  String owner;

  //생성자(constructor) -> 리턴타입이 없고, 메서드명은 클래스 명과 동일, 매서드 오버로딩도 가능
  //맴버변수의 초기값을 할당할 목적으로 사용함.
  //생성자는 하나의 매서드이다.(메서드의 일종이라 정의)
  //만약 클래스에 생성자가 하나도 없다면 자동으로 기본생성자를 생성함.
  //내용이 없는 기본 생성자(default 생성자) : public Account(){}
  public Account(){
    accNumber = "지정되지 않음";
    money = 10000;
    owner = "지정되지 않음";
  }

  //맴버변수의 값을 초기화하는 기능
  public void initAcc(String accNumber, int money, String owner){
    this.accNumber = accNumber;
    this.money = money;
    this.owner = owner;
  }

  //매개변수로 전달된 금액을 예금액에 더하는 메서드
  public void sumMoney(int money){
    this.money += money;
  }

  public void printAccInfo(){
    System.out.println("계좌번호 : " + accNumber);
    System.out.println("예금액 : " + money);
    System.out.println("계좌주 : " + owner);
  }


}

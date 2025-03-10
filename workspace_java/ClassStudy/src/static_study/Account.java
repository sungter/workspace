package static_study;

public class Account {
  String owner;
  int money;
  static double iyul;

  static {
    iyul = 5.0;
  }

  public Account(String owner){
    this.owner = owner;
    money = 50000;
  }

}

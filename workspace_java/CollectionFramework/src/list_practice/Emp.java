package list_practice;

public class Emp {
  private int empNum;
  private String name;
  private String comName;
  private String phoneNum;
  private int money;
  private String pw;

  public Emp(int empNum, String name, String comName, String phoneNum, int money) {
    this.empNum = empNum;
    this.name = name;
    this.comName = comName;
    this.phoneNum = phoneNum;
    this.money = money;
    pw = phoneNum.substring(9);
  }

  public int getEmpNum() {
    return empNum;
  }

  public void setEmpNum(int empNum) {
    this.empNum = empNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getComName() {
    return comName;
  }

  public void setComName(String comName) {
    this.comName = comName;
  }

  public String getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  @Override
  public String toString() {
    return "Emp{" +
            "empNum=" + empNum +
            ", name='" + name + '\'' +
            ", comName='" + comName + '\'' +
            ", phoneNum='" + phoneNum + '\'' +
            ", money=" + money +
            ", pw='" + pw + '\'' +
            '}';
  }
}

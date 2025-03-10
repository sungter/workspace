package practice;

public class Calculator {
  int first;
  int second;
  String setting;

  public void setAll(int first, int second, String setting){
    this.first = first;
    this.second = second;
    this.setting = setting;
  }

  public void printInfo(){
    if (setting.equals("+")){
      System.out.println(first + " + " + second + " = " + (first + second));
    }
    else if (setting.equals("-")){
      System.out.println(first + " - " + second + " = " + (first - second));
    }
    else if (setting.equals("*")){
      System.out.println(first + " * " + second + " = " + (first * second));
    }
    else {
      System.out.println(first + " / " + second + " = " + ((double)first / second));
    }
  }

}

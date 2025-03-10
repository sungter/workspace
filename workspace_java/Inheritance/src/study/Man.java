package study;

import javax.naming.Name;

public class Man {
  //protected : private + 해당 클래스의 자식 클래스는 접근 허용
  protected String name;

  //public Man(){}

  public Man(String name){
    this.name = name;
  }

  public void tellName(){
    System.out.println("name is " + name);
  }

}

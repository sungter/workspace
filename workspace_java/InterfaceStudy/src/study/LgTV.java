package study;

public class LgTV implements TV{

  public void turnOn(){
    System.out.println("엘지티비 - 전원켬");
  }

  public void turnOff(){
    System.out.println("엘지티비 - 전원끔");
  }

  public void volumeUp(){
    System.out.println("엘지티비 - 볼륨 업");
  }

  public void volumeDown(){
    System.out.println("엘지티비 - 볼륨 다운");
  }

}

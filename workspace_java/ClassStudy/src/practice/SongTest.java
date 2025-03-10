package practice;

public class SongTest {
  public static void main(String[] args) {
    Song songAll = new Song();

    String[] composers = {"GD", "Hola", "Main"};
    songAll.setAllInfo("무제", "GD", "무제_1", 2020,composers);
    //songAll.setAllInfo("무제", "GD", "무제_1", 2020,new String[]{"이렇게", "도", "가능함"});

    songAll.printAllInfo();

  }
}

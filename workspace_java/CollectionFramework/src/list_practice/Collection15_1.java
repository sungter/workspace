package list_practice;

import java.util.ArrayList;
import java.util.List;

public class Collection15_1 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    String a = "1";
    String b = "2";
    String c = "3";
    list.add(a);
    list.add(b);
    list.add(c);

    for (String e : list){
      System.out.println(e);
    }


  }
}

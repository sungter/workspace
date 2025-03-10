package list_practice;

import java.util.ArrayList;
import java.util.List;

public class Collection15_3 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    String a = "홍길동";
    String b = "장길동";
    String c = "신길동";

    list.add(a);
    list.add(b);
    list.add(c);

    for (int i = 0 ; i < list.size() ; i++){
      if (list.get(i).equals("홍길동")){
        System.out.println("'해당 이름이 존재합니다.'");
      }
    }

  }


}

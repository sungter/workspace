package list_practice;

import java.util.ArrayList;
import java.util.List;

public class Result_4 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0 ; i < 10 ; i++){
      list.add((int)(Math.random() * 100 + 1));
    }

    int cnt = 0;

    for (int e : list){
      if (e % 2 == 0){
        System.out.print(e + " ");
        cnt++;
      }
    }

    System.out.println("짝수 갯수 : " + cnt);
  }
}

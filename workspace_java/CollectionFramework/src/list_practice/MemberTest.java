package list_practice;

import java.util.ArrayList;
import java.util.List;

public class MemberTest {
  public static void main(String[] args) {
    List<Member> list = new ArrayList<>();

    Member p1 = new Member("aaa", "111", "kim", 10);
    Member p2 = new Member("bbb", "222", "lee", 20);
    Member p3 = new Member("ccc", "222", "su", 30);

    list.add(p1);
    list.add(p2);
    list.add(p3);

    for (Member e : list){
      System.out.println(e);
    }

    /// ///////////////////////////////////////////////////

    int sum = 0 ;
    for (int i = 0 ; i < list.size() ; i++){
      sum += list.get(i).getAge();
    }
    System.out.println(sum);

    /// //////////////////////////////////////////////////////////

    for (int i = 0 ; i < list.size() ; i++){
      if (list.get(i).getName().equals("java")){
        list.remove(i);
        break;
      }
    }


  }
}

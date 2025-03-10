package list_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_2 {
  public static void main(String[] args) {
    //정수를 다수 저장할 수 있는 list1 객체를 생성
    //배열과 다르게 데이터 저장 공간 갯수 제한이 없다.
    List<Integer> list1 = new ArrayList<>();

    //list1에 데이터 추가
    list1.add(5); //넣는 순서대로 0부터 index가 설정
    list1.add(10);
    list1.add(3);
    list1.add(5);

    //list1에 저장된 데이터 읽기
    //get() 메서드의 안에서 index가 들어감
    System.out.println( list1.get(1) );

    //list1에 저장된 데이터 삭제
    list1.remove(1);

    //list1에 저장된 데이터의 갯수
    System.out.println( list1.size() );

    //데이터 변경
    list1.set(2, 11);

    //list1의 모든 데이터 출력
    for (int i = 0 ; i < list1.size() ; i++){
      System.out.println(list1.get(i));
    }

  }
}

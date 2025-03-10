package list_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Result_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();

    for (int i = 0 ; i < 5 ; i++){
      System.out.print(i + "번째 : ");
      list.add(sc.nextInt());
    }

    int sum = 0 ;

    for (int a : list){
      sum += a;
    }
    System.out.println("합 : " + sum);

  }
}

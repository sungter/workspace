package test;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 수 입력 : ");
    int first = sc.nextInt();
    System.out.print("둘 수 입력 : ");
    int second = sc.nextInt();
    System.out.print("셋 수 입력 : ");
    int third = sc.nextInt();

    int max, mid, min;

    if (first > second && first > third){
      max = first;
      if (second > third){
        mid = second;
        min = third;
      }
      else {
        min = second;
        mid = third;
      }
    }
    else if (second > first && second > third){
      max = second;
      if (first > third){
        mid = first;
        min = third;
      }
      else {
        mid = third;
        min = first;
      }
    }
    else {
      max = third;
      if (first > second){
        mid = first;
        min = second;
      }
      else {
        mid = second;
        min = first;
      }
    }

    System.out.println( max + " > " + mid + " > " + min );


  }
}

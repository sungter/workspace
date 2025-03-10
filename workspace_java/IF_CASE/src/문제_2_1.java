import java.util.Scanner;

public class 문제_2_1 {
  public static void main(String[] args) {
    Scanner sc = new  Scanner(System.in);

    System.out.println("1 정수 : ");
    int num1 = sc.nextInt();
    System.out.println("2 정수 : ");
    int num2 = sc.nextInt();
    System.out.println("3 정수 : ");
    int num3 = sc.nextInt();

    String fin;

    if (num1 > (num2 + num3)){
      fin = "가능";
    }
    else if(num2 > (num1 + num3)){
      fin = "가능";
    }
    else if(num3 > (num1 + num2)){
      fin = "가능";
    }
    else if(num1 == num2 && num2 == num3){
      fin = "가능";
    }
    else{
      fin = "불가능";
    }

    System.out.println(fin);



  }
}

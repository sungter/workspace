package practice2.num7;

import java.util.Scanner;

public class CalulateTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 수 : ");
    int first = sc.nextInt();
    System.out.print("두 번째 수 : ");
    int second = sc.nextInt();
    System.out.print("연산자 : ");
    String cal = sc.next();

    switch (cal){
      case "+" :
        Add add = new Add();
        add.setValue(first,second);
        System.out.println(first + cal + second + " = " + add.calculate());
        break;
      case "-" :
        Sub sub = new Sub();
        sub.setValue(first,second);
        System.out.println(first + cal + second + " = " + sub.calculate());
        break;
      case "*" :
        Mul mul = new Mul();
        mul.setValue(first,second);
        System.out.println(first + cal + second + " = " + mul.calculate());
        break;
      case "/" :
        Div div = new Div();
        div.setValue(first,second);
        System.out.println(first + cal + second + " = " + div.calculate());
        break;
      default:
        System.out.println("연산자를 잘 못 입력하였습니다.");
    }

//    if (cal.equals("+")){
//      Add add = new Add();
//      add.setValue(first, second);
//      System.out.println(first + cal + second + " = " + add.calculate());
//    }
//    else if (cal.equals("-")){
//      Sub sub = new Sub();
//      sub.setValue(first,second);
//      System.out.println(first + cal + second + " = " + sub.calculate());
//    }
//    else if (cal.equals("*")){
//      Mul mul = new Mul();
//      mul.setValue(first,second);
//      System.out.println(first + cal + second + " = " + mul.calculate());
//    }
//    else if (cal.equals("/")){
//      Div div = new Div();
//      div.setValue(first,second);
//      System.out.println(first + cal + second + " = " + div.calculate());
//    }



  }
}

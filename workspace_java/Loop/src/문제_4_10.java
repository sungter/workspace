

public class 문제_4_10 {
  public static void main(String[] args){

    int num1 = 0, num2 = 0;

    while (num1 < 100){
      num2 = num2 + num1;
      if (num2 > 100){
        break;
      }
      num1++;
    }

    System.out.println(num1);

    System.out.println("i = " + 14);

  }
}

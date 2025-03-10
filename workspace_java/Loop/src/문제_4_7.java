

public class 문제_4_7 {
  public static void main(String[] args){

    int sum = 0;

    System.out.print("1~100 숫자 중 5의 배수 : ");
    for (int i = 1; i < 101; i++){
      if(i % 5 ==0){
        sum++;
        System.out.print(i + " ");
      }
    }
    System.out.println();
    System.out.println("1~100 숫자 중 5의 배수의 갯수 : " + sum);

    System.out.println();


    int num1 = 1;
    int num2 = 0;

    System.out.print("1~100 숫자 중 5의 배수 : ");
    while (num1 < 101){
      if (num1 % 5 == 0){
        num2++;
        System.out.print(num1 + " ");
      }
      num1++;
    }
    System.out.println();
    System.out.println("1~100 숫자 중 5의 배수의 갯수 : " + num2);


  }
}

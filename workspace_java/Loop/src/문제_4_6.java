public class 문제_4_6 {
  public static void main(String[] args){
    int sum = 0;

    for (int i = 1; i < 101; i++){
      if (i % 3 == 0){
        sum++;
      }
    }
    System.out.println("1~100 숫자 중 3의 배수의 갯수 : " + sum);

    System.out.println();

    int num1 = 1;
    int all = 0;
    while (num1 < 101){
      if (num1 % 3 == 0){
        all++;
      }
      num1++;
    }
    System.out.println("1~100 숫자 중 3의 배수의 갯수 : " + all);


  }
}

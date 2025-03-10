public class 문제_4_5 {
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; i < 11; i++){
      sum = sum + i;
    }
    System.out.println("1~10까지 총 합 : " + sum);

    System.out.println();

    int num1 = 1;
    int num2 = 0;
    while (num1 < 11){
      num2 = num2 + num1;
      num1++;
    }
    System.out.println("1~10까지 총 합 : " + num2);


  }
}

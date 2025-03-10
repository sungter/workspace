public class 문제_4_6 {
  public static void main(String[] args){
    int sum = 0;

    for (int i = 1; i <= 100; i++){
      if (i % 3 == 0){
        sum++;
      }
    }
    System.out.println("1~100 숫자 중 3의 배수의 갯수 : " + sum);

  }
}

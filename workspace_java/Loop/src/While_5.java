
public class While_5 {
  public static void main(String[] args) {
    //1 ~ 5까지의 합
    int num = 1;
    int sum = 0; // 1~5까지의 합 결과를 저장할 변수

    while (num < 6){
      sum = sum + num;
      num++;
    }

    System.out.println(sum);

  }
}

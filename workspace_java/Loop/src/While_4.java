public class While_4 {
  public static void main(String[] args) {

    //2 4 6 8 10을 while을 사용하여 출력

    int num = 1;
    while (num < 11){
      if (num % 2 == 0){
        System.out.println(num);
      }
      num++;
    }

  }
}

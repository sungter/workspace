public class 문제_4_3 {
  public static void main(String[] args) {

    for (int i = 1; i < 11; i++ ){
      if(i % 2 == 0){
        System.out.print(i + " ");
      }

    }

    System.out.println();

    int num1 = 1;
    while (num1 < 11){
      if (num1 % 2 == 0){
        System.out.print(num1 + " ");
      }
      num1++;
    }

  }
}

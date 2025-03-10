package practice;

public class 문제_1_10 {
  public static void main(String[] args) {
    int[] arr ={1, 2, 3, 4, 5, 6 ,7 ,8};

    int evenCnt = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] % 2 == 0){
        evenCnt++;
      }
    }
    System.out.println("짝수의 개수 : " + evenCnt);

    System.out.println();

    int evenCnt2 = 0;
    //for-each 문
    for (int a:arr){
      if (a % 2 == 0){
        evenCnt2++;
      }
    }

    System.out.println("짝수의 개수 : " + evenCnt2);
  }
}

public class 문제_4_12 {
  public static void main(String[] args) {
    int num = 0, sum=0;

    for(num = 1; num >0; num++){
      sum = sum + num;
      if(sum > 300){
        break;
      }
    }

    System.out.println("총 합 : " + sum);
    System.out.println("마지막 값 : " + num);
    //변수는 해당 변수가 선언된 중괄호( {} ) 안에서만 사용 가능 !
    //num을 for문 안에서 변수를 선언하면,
    //반복문 안에서만 적용 가능하기에 미리 변수 선언한 후에 반복문에 넣음.

    System.out.println();

    int i = 1;
    int cnt = 0;
    while (i < 300){
      cnt = cnt + i;
      if (cnt > 300){
        break;
      }
      i++;
    }
    System.out.println("총 합 : " + cnt);
    System.out.println("마지막 값 : " + i);


  }
}

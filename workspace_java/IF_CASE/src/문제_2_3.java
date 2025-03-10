import java.util.Scanner;

public class 문제_2_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //풀이

    int num;
    int clapCnt = 0; //박수의 갯수

    System.out.print("1~99사이의 정수를 입력하시오 : ");
    num = sc.nextInt();

    //입력받은 정수를 1의자리와 10의 자리 수로 분리
    //십의 자리
    int tens = num / 10;
    //일의 자리
    int ones = num % 10;

    //만약 십의 자리 수가 3,6,9면 박수 수를 1증가
    if (tens == 3 || tens == 6 || tens == 9) {
      clapCnt++;
    }
//      clapCnt = clapCnt + 1;
//      clapCnt += 1;
//      ++clapCnt;

//  if(tens % 3 ==0 && tens != 0){
//  }

    //만약 일의 자리 수가 3,6,9면 박수 수를 1증가
    if (ones == 3 || ones == 6 || ones == 9){
      clapCnt++;
    }

    //clapCnt = 0, 1, 2 의 값만 가진다.
    //0이면 박수 없음, 1이면 박수짝, 2이면 박수짝짝
    switch (clapCnt){
      case 0:
        System.out.println("없음");
        break;
      case 1:
        System.out.println("박수짝");
        break;
      default:
        System.out.println("박수짝짝");
    }


//    int num;
//
//    System.out.print("정수를 입력하세요 : ");
//    num = sc.nextInt();
//
//    int fir = (int)num/10;
//    int sec = (int)num%10;
//    int aa = 0;
//    int bb = 0;
//
//    if(fir == 3 || fir == 6 || fir == 9){
//      aa = 1;
//    }
//    else if (sec == 3 || sec == 6 || sec == 9) {
//      bb = 1;
//    }
//    else{
//      System.out.println("없음");
//    }
//
//    if ((bb + aa) == 1){
//      System.out.println("박수짝");
//    }
//
//    if (aa+bb == 2){
//
//    }


  }
}

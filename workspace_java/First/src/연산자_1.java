public class 연산자_1 {
  public static void main(String[] args){
    //산술 연산자 (+, -, *, /, %)
    // '%' : mod (모드) 연산자 : 나눗셈의 나머지
    System.out.println(6 % 2);
    System.out.println(8 % 3);
    System.out.println();

    // 정수끼리의 연산은 무조건 정수로 결과가 나옴
    // 다만, 실수가 포함되면 결과는 실수로 나옴
    System.out.println(8 / 3);
    System.out.println(8 / 3.0);

    int a = 8;
    System.out.println((double)a / 3);
    System.out.println();

    //비교연산자(>, <, >=, <=, ==, !=)
    //'==' : 같다, '!=' : 같지 않다.

    System.out.println(5 > 1);
    System.out.println(5 == 1);
    System.out.println(5 != 1);

    //복합 대입 연산자
    int num = 3;

    //num 값을 1증가 시키는 코드
    num = num +1;
    num += 1;// '+=' : 복합연산자
    System.out.println(num);

    num *= 3;
    num -= 4;
    num /= 2;
    num %=2;
    System.out.println(num);

    //논리연산자
    //and(그리고) 연산자 : &&,  or(이거나) : || (버티컬 바 2개 : 쉬프트 + 엔터키 위)
    //&, | (한개) 와 &&, || (두개) 차이점 : 의미는 같지만 ex) 2 > 1 | 3 < 1; 의 코드 해석시 3 < 1까지 무조건 해석한다.

    System.out.println(3 > 1 && 2 < 4);
    System.out.println(3 > 1 && 2 > 4);
    System.out.println((1 == 1 && 2 > 1) || (3 > 5 && 1 < 4));
    System.out.println(1 == 1 && 2 > 1 || 3 > 5 && 1 < 4);
    //&&와 ||연산이 동시에 있을시 && 연산이 우선순위가 높다.

  }
}

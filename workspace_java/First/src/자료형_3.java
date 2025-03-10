public class 자료형_3 {
  public static void main(String[] args) {
    // 형(data type) 변환
    // 정수 -> 실수, 실수 -> 정수
    int num1 = 5;

    // 자동 형변환(promotion) : (int인 정수가 자동적으로 실수인 double에 적용되는 형태 )
    double num2 = num1;
    System.out.println(num2);

    double num3 = 5.5;
    //강제 형 변환(casting)
    int num4 = (int)num3;
    System.out.println("num4 = " + num4);

  }
}

/*
*
* 자료형 (data type)
* 자바의 자료형은 큰 틀로 기본자료형, 참조자료형으로 구분
* 기본 자료형(primivite type) 8개 존재, 8개 모두 소문자
*   참과 거짓 : boolean (1byte) -> true, false
*   정수 : byte(1byte), short(2byte), int(4byte), long(8byte)
*   실수 : float(4byte), double(8byte)
*   문자 : char(2byte, 정수가 될수도 있다.) / 한 글자 + 홀따옴표로 감싸짐
           ex) 'java' -> 오류뜸, 'a' -> 정상표기
* 문자열 : 여러글자를 나열, 쌍따옴표에 싸여진 글자
* 자바의 기본자료형에는 문자열을 저장할 '기본'자료형을 제공하지 않는다.
* 문자열 참조 자료형 : String
*
* 참조자료형은 무한대, 모두 대문자
*
* */

public class 자료형_1 {
  public static void main(String[] args){
    //참과 거짓
    boolean a = true;
    boolean b = false;
//    boolean c = "true"; !!주의 : 쌍따옴표 있으면 안됨
    System.out.println(a);

    int d = 1;
    byte e = 1;
    short f = 1;
    long g = 1L;

    double h = 1.5;
    float i = 1.5f;
    System.out.println(h);

    //문자열
    String s = "hello";
    System.out.println(s);

  }
}

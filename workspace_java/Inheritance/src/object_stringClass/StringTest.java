package object_stringClass;

import java.util.Arrays;

public class StringTest {
  public static void main(String[] args) {
    String s1 = "Simple";
    String s2 = "Java";

    //concat() : 두 문자열을 나열한 결과를 리턴하는 메서드
    String s3 = s1.concat(s2); // s1 + s2도 concat() 근본으로...
    System.out.println(s3);

    //length() : 문자열의 길이를 정수로 리턴
    int len = s3.length();

    //valueOf() : 매개변수로 전달된 데이터를 문자열로 바꿔서 리턴
    String result = String.valueOf(10.5); // result = "10.5"

    String data = "hi java";
    //substring() : 매개변수 한개 혹은 두개 기준으로 일부 문자열을 추출할 때 사용
    String r1 = data.substring(3);
    System.out.println(r1); //java

    String r2 = data.substring(1,4);
    System.out.println(r2); //i j

    String data2 = "a,b,c";
    //split() : 매개변수로 전달된 문자열을 기준으로 문자열을 조각내어 문자열 배열 데이터를 리턴
    String[] r3 = data2.split(",");
    System.out.println(Arrays.toString(r3));

    String r4 = data2.replace(",","-");
    System.out.println(r4);

  }
}

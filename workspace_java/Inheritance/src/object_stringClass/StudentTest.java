package object_stringClass;

public class StudentTest {
  public static void main(String[] args) {
    Student s1= new Student(2, "김자바");
    Student s2= new Student(2, "김자바");

    System.out.println(s1.equals(s2));


    /// String//////////////////////////
    int[] arr1 = {1,2,3};
    int[] arr2 = arr1;
    arr2[0] = 5;
    System.out.println(arr1[0]); //5
    System.out.println(arr2[0]); //5

    String a = "java";
    String b = a;
    b = "python";
    System.out.println(a); //java
    System.out.println(b); //python

    //String 데이터는 메모리 공간 낭비를 최소화할 수 있도록 설계
    String str1 = "react";
    String str2 = "react";
    str2 = "coffee";
    String str5 = "react";

    String str3 = new String("java");
    String str4 = new String("java");

    // == 두 객체가 주소값이 같은지 비교하는 연산
    // 숫자 비교 연산에서 사용(추가적인 기능)
    if (str1 == str5){
      System.out.println("str1과 str5는 같습니다.");
    }


    if (str3 == str4){
      System.out.println("str3과 str4는 같습니다.");
    }

  }
}

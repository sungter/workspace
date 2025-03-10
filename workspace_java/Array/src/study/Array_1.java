package study; //새로 생성한 폴더명

//배열의 선언과 생성 방법
public class Array_1 {
  public static void main(String[] args){
    //배열의 기본 형태
    //정수를 저장할 공간 5개를 생성
    int[] a = new int[5];
    /// ///////////////////////////////////////////////

    //배열 사용을 위한 조건
    //1. 배열을 선언
    // - 자료형[] 변수명; (변수명 : 참조변수라 부름)
    // ex> int[] aaa;
    // ex> double[] bbb;
    //2. 배열을 생성한다 (변수에서는 초기화라 부름.)
    // - 참조변수명 = new 자료형[공간의 크기];
    // 공간의 크기는 배열 생성 시 결정하며, 한 번 크기가 정해지면 수정불가 !
    // ex> aaa = new int[5];
    // ex> bbb = new double[10];

    //정수를 다수 저장할 수 있는 배열 arr1 선언
    int[] arr1;
    //arr1 배열을 정수가 5개 저장할 수 있게 생성
    arr1 = new int[5];

    //문자열을 다수 저장할 수 있는 배열 arr2를 선언
    String[] arr2;
    //arr2 배열을 문자열 4개 저장할 수 있게 생성
    arr2 = new String[4];

    //배열의 선언 및 생성 동시 진행
    //실수를 5개 저장할 수 있는 배열 arr3를 생성 !
    double[] arr3 = new double[5];


  }
}

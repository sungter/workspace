package class_study.classArr;

//클래스 자료형을 배열로 활용하기
public class SmartPhoneTest {
  public static void main(String[] args) {
    //스마트폰 5개를 저장할 수 있는 배열 phoneArr를 생성
    SmartPhone[] phoneArr = new SmartPhone[5];

    SmartPhone p1 = new SmartPhone("s1", 10000, 12.5);
    SmartPhone p2 = new SmartPhone("s2", 20000, 13.5);
    SmartPhone p3 = new SmartPhone("s3", 30000, 14.5);
    SmartPhone p4 = new SmartPhone("s4", 40000, 15.5);
    SmartPhone p5 = new SmartPhone("s5", 50000, 16.5);
    phoneArr[0] = p1;
    phoneArr[1] = p2;
    phoneArr[2] = p3;
    phoneArr[3] = p4;
    phoneArr[4] = p5;

    //phoneArr 배열에 저장된 모든 폰의 모델명, 가격, 크기를 출력
//    for (int i = 0 ; i < phoneArr.length ; i++){
//      phoneArr[i].printInfo();
//      System.out.println();
//    }

    //phoneArr 배열에서 0번째에 저장된 폰의 가격 출력
//    System.out.println(phoneArr[0].getPrice());

    //phoneArr 배열에서 크기가 13inch 이상인 폰의 모델명을 모두 출력
    //for문
    for (int i = 0 ; i < phoneArr.length ; i++){
      if (phoneArr[i].getInch() >= 13.0){
        System.out.println(phoneArr[i].getModelName());
      }
    }

    //for-each문
    for (SmartPhone sp : phoneArr){
      if (sp.getInch() >= 13.0){
        System.out.println(sp.getModelName());
      }
    }




  }
}

package list_practice;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
  public static void main(String[] args) {
    Student stu1 = new Student("kim", 70, 80);
    Student stu2 = new Student("lee", 80, 90);
    Student stu3 = new Student("hong", 70, 90);

    List<Student> list = new ArrayList<>();
    list.add(stu1);
    list.add(stu2);
    list.add(stu3);

    for (Student e : list){
      System.out.println(e);
    }

    /// ////////////////////////////////////////
    //2번
    //for
    for (int i = 0 ; i < list.size() ; i++){
      if (list.get(i).getSum() > 149){
        System.out.println(list.get(i));
      }
    }
    //for-each
//    for (Student e : list){
//      if (e.getSum() > 149){
//        System.out.println(e);
//      }
//    }

    /// ///////////////////////////////////////

    //3번
    int sum = 0;
    for (Student e : list){
      sum += e.getSum();
    }
    System.out.println("모든 학생에 평균 : " + ((double)sum/list.size()));

    /// ////////////////////////////////////////

    //4번
    int max = list.get(0).getSum();

    for (int i = 0 ; i < list.size() ; i++){
      if (max < list.get(i).getSum()){
        max = list.get(i).getSum();
      }
    }

    for (Student e : list){
      if (e.getSum() == max){
        System.out.println("1등 : " + e);
      }
    }


  }
}

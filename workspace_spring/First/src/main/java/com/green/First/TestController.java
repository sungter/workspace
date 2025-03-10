package com.green.First;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//anotation 어노테이션
@RestController

public class TestController {

  //localhost:8080/t1
  @GetMapping("/t1")
  public String test1(){
    return "java";
  }

  @GetMapping("/t2")
  public int test2(){
    return 10;
  }

  @GetMapping("/t3")
  public Person test3(){
    //Person 클래스에 대한 객체를 하나 생성
    Person p = new Person("홍길동", 30, "울산시");
    return p;
  }

  @GetMapping("/t4")
  public List<Person> test4(){
    //person 클래스에 대한 객체를 다수 저장할 수 있는 리스트 생성
    List<Person> list = new ArrayList<>();

    Person p1 = new Person("Kim", 20, "울산시");
    Person p2 = new Person("Lee", 30, "부산시");
    Person p3 = new Person("Ji", 40, "경주시");

    list.add(p1);
    list.add(p2);
    list.add(p3);

    return list;
  }


  @GetMapping("/t5")
  public List<Student> test5(){
    List<Student> studentList = new ArrayList<>();

    studentList.add(new Student("Kim", 80, 50 ,65));
    studentList.add(new Student("Lee", 70, 60 ,75));
    studentList.add(new Student("Hong", 60, 90 ,85));
    studentList.add(new Student("Park", 50, 80 ,95));
    studentList.add(new Student("Choi", 40, 70 ,45));

    return studentList;
  }

  //react에서 전달하는 데이터를 자바에서 받는 문법은 2가지 존재
  //1. 클래스를 활용하는 방법
  //react에서 전달하는 객체의 key와
  //java에서 데이터를 받기위해 매개변수에 선언한 클래스의 변수명이
  //동일하면 데이터를 자동으로 받아옴
  //2. Collection Framework의 Map을 활용하는 방법
  @PostMapping("/t6")
  public void test6(@RequestBody Student student){
    System.out.println(student);
  }

  @PostMapping("/t7")
  public void test7(@RequestBody PhoneDTO phone){
    System.out.println(phone);
  }

  @PostMapping("/t8")
  public int test8(@RequestBody Student student){
    System.out.println(student);
    //Post에서 return 사용시 react에서 then()로 데이터를 받을 수 있다.
    return (student.getEngScore() + student.getKorScore() + student.getMathScore());
  }

  @PostMapping("/t9")
  public void test9(@RequestBody FoodInfo foodInfo){
    System.out.println(foodInfo);
  }

  @GetMapping("/getLottoNum")
  public int getLottoNum(){
    return (int)(Math.random() * 45 + 1);
  }

  @GetMapping ("/t10")
  public int test10(){
    int random = (int)(Math.random() * 45 + 1);
    return random;
  }

  @GetMapping ("/t11")
  public int[] test11(){
    int[] arr = new int[6];
    for (int i = 0 ; i < arr.length ; i++){
      arr[i] = (int)(Math.random() * 45 + 1);
    }
    return arr;
  }


  @GetMapping ("/getBoardList")
  public List<BoardResult> sendBoardList(){
    List<BoardResult> boardList = new ArrayList<>();
    boardList.add(new BoardResult(1, "제목 1", "김자바", 5, "제목 1 내용입니다."));
    boardList.add(new BoardResult(2, "제목 2", "김자바", 2, "제목 2 내용입니다."));
    boardList.add(new BoardResult(3, "제목 3", "김자바", 6, "제목 3 내용입니다."));
    boardList.add(new BoardResult(4, "제목 4", "김자바", 8, "제목 4 내용입니다."));
    boardList.add(new BoardResult(5, "제목 5", "김자바", 7, "제목 5 내용입니다."));

    return boardList;
  }








}

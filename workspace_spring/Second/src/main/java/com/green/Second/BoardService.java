package com.green.Second;

import org.springframework.stereotype.Component;

//BoardService service = new BoardService(); : 어노테이션 옆 소괄호 안 내용을 객체명으로 지정
@Component("service")
public class BoardService {
  public void bbb(){
    System.out.println("bbb 메서드 실행");
  }
}

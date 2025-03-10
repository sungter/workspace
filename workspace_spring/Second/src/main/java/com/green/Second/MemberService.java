package com.green.Second;

import org.springframework.stereotype.Component;

//객체생성 어노테이션
//MemberService memberService = new MemberService(); : 객체명은 앞글자만 소문자로 생성됨
@Component
public class MemberService {
  public void aaa(){
    System.out.println("aaa 메서드 실행~");
  }
}

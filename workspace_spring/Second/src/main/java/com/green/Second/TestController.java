package com.green.Second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  private MemberService memberService;

  // DI : 생성자 주입 (의존성 주입) 어노테이션
  @Autowired
  public TestController(MemberService memberService){
    this.memberService = memberService;
  }

  @GetMapping("/a")
  public void aaa(){
    System.out.println("aaa 메서드 실행");
    memberService.aaa();
  }

}

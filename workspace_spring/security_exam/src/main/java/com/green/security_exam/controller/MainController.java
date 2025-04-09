package com.green.security_exam.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {

  @GetMapping("/test1")
  public String test1(){
    log.info("test1() 메서드 실행~");
    return "test1";
  }

  @GetMapping("/test2")
  public String test2(){
    log.info("test2() 메서드 실행~");
    return "test2";
  }

}

package com.green.security_exam.controller;

import com.green.security_exam.dto.MemberDTO;
import com.green.security_exam.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;
  private final PasswordEncoder passwordEncoder;

  //비밀번호 암호화 연습 메서드
  @GetMapping("/test")
  public void testEncode(){
    String str1 = "java";
    String str2 = "java";

    //암호화
    String encoded_str1 = passwordEncoder.encode(str1);
    String encoded_str2 = passwordEncoder.encode(str2);

    System.out.println("암호화된 str1 = " + encoded_str1);
    System.out.println("암호화된 str2 = " + encoded_str2);

    //matches(원본 문자열, 암호화된 문자열) <= 기본 문법 true, false 리턴
    boolean result1 = passwordEncoder.matches("java", encoded_str1); //true
    boolean result2 = passwordEncoder.matches("python", encoded_str2); //false
    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);

  };

  //회원가입
  @PostMapping("/join")
  public ResponseEntity<?> join(@RequestBody MemberDTO memberDTO){
    log.info("회원가입 기능 실행~");

    //비밀번호 암호화
    String encoded_pw = passwordEncoder.encode(memberDTO.getMemPw());
    memberDTO.setMemPw(encoded_pw);

    userService.join(memberDTO);

    return ResponseEntity.status(HttpStatus.OK).build();
  }

}

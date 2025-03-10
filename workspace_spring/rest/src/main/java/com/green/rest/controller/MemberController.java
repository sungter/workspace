package com.green.rest.controller;

import com.green.rest.dto.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

//객체 생성 + 관제탑(controller) 역할을 부여
//-> 이 클래스는 모든 요청(url)을 받는 클래스
@RestController
@RequestMapping("/members")
@Slf4j
public class MemberController {

  @GetMapping("")
  public void getMemberList(){
    System.out.println("getMemberList() 메서드 실행");
  }

  //회원 등록 -> localhost:8080/members
  @PostMapping("")
  public void insertMember(@RequestBody MemberDTO memberDTO){
    System.out.println("insertMember() 메서드 실행");
    System.out.println(memberDTO);
  }

  //회원 한 명을 조회하는 기능
  //rest -> localhost:8080/members/aaa
  //url에 {}로 표현되는 내용은 값을 받아올 때 사용
  //@PathVariable -> url변수({...})를 의미
  //@PathVariable("memId") String id -> url memId에 값을 id에 추가
  @GetMapping("/{memId}")
  public void getMember(@PathVariable("memId") String id ){
    System.out.println("getMember 메서드 실행");
    System.out.println("id = " + id);
  }

  @GetMapping("/{memId}/{memAge}")
  public void getMember2(@PathVariable("memId") String memId , @PathVariable("memAge") int memAge){
    System.out.println("memId = " + memId);
    System.out.println("memAge = " + memAge);
  }

  //회원 한 명을 삭제하는 기능을 제공하는 REST API
  @DeleteMapping("/{memId}")
  public void deleteMember(@PathVariable("memId") String memId){
    log.info("회원 한 명 정보 삭제 기능");
    log.info("memId = " + memId);
  }

  //회원 한 명의 이름과 나이를 변경하는 기능을 제공하는 REST API
  @PutMapping("/{memId}")
  public void putMember(@PathVariable("memId") String memId, @RequestBody MemberDTO memberDTO){
    log.info(memId);
    log.info(memberDTO.toString());
  }

}

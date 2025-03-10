package com.green.member_manager.controller;

import com.green.member_manager.dto.MemberDTO;
import com.green.member_manager.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberManagerController {
  private MemberService memberService;

  public MemberManagerController(MemberService memberService){
    this.memberService = memberService;
  }

  @GetMapping("")
  public List<MemberDTO> getMemberList(){
    return memberService.getMemberList();
  }

  @PostMapping("")
  public int insertMember(@RequestBody MemberDTO memberDTO){
    return memberService.insertMember(memberDTO);
  }

  @GetMapping("/{memId}")
  public MemberDTO getMember(@PathVariable("memId") String memId){
    return memberService.getMember(memId);
  }

  @DeleteMapping("/{memId}")
  public void deleteMember(@PathVariable("memId") String memId){
    memberService.deleteMember(memId);
  }

  @PutMapping("/{memId}")
  public void updateMember(@RequestBody MemberDTO memberDTO , @PathVariable("memId") String memId){
    memberDTO.setMemId(memId);
    memberService.updateMember(memberDTO);
  }

}

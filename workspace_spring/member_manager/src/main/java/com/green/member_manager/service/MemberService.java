package com.green.member_manager.service;

import com.green.member_manager.dto.MemberDTO;

import java.util.List;

public interface MemberService {
  //모든 정보 조회 기능
  public List<MemberDTO> getMemberList();

  //정보 한개 추가 기능
  public int insertMember(MemberDTO memberDTO);

  //멤버 한개 정보 조회 기능
  public MemberDTO getMember(String memId);


  //멤버 한명 삭제 쿼리
  public void deleteMember(String memId);

  //멤버 한명 정보 변경 쿼리
  public void updateMember(MemberDTO memberDTO);
}

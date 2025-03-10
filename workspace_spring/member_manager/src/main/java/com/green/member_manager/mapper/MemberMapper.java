package com.green.member_manager.mapper;

import com.green.member_manager.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
  //모든 정보 조회 쿼리
  public List<MemberDTO> getMemberList();

  //정보 한개 추가 쿼리
  public int insertMember(MemberDTO memberDTO);

  //멤버 한개 정보 조회 쿼리
  public MemberDTO getMember(String memId);

  //멤버 한명 삭제 쿼리
  public void deleteMember(String memId);

  //멤버 한명 정보 변경 쿼리
  public void updateMember(MemberDTO memberDTO);
}

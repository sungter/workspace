package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.ReplyDTO;
import com.green.board.dto.SearchDTO;

import java.util.List;

public interface ReplyService {
  //댓글 목록 조회 기능
  public List<ReplyDTO> selectReplyList(int boardNum);

  //댓글 추가 기능
  public void insertReply(ReplyDTO replyDTO);

  //댓글 삭제 기능
  public void deleteReply(int replyNum);

  //검색 쿼리
//  public List<BoardDTO> searchData(SearchDTO searchDTO);
}

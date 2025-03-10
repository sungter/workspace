package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.ReplyDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.mapper.ReplyMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {
  private ReplyMapper ReplyMapper;

  public ReplyServiceImpl(ReplyMapper ReplyMapper){
    this.ReplyMapper = ReplyMapper;
  }

  @Override
  public List<ReplyDTO> selectReplyList(int boardNum) {
    return ReplyMapper.selectReplyList(boardNum);
  }

  @Override
  public void insertReply(ReplyDTO replyDTO) {
    ReplyMapper.insertReply(replyDTO);
  }

  @Override
  public void deleteReply(int replyNum) {
    ReplyMapper.deleteReply(replyNum);
  }

//  @Override
//  public List<BoardDTO> searchData(SearchDTO searchDTO) {
//    return ReplyMapper.searchData(searchDTO);
//  }
}

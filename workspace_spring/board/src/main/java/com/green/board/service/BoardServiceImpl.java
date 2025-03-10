package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
  private BoardMapper boardMapper;

  public BoardServiceImpl(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

  @Override
  public List<BoardDTO> getBoardList(SearchDTO searchDTO) {
    return boardMapper.getBoardList(searchDTO);
  }

  @Override
  public int regBoard(BoardDTO boardDTO) {
    return boardMapper.regBoard(boardDTO);
  }

  @Override
  public BoardDTO getBoard(int boardNum) {
    //조회수 증가 쿼리 실행
    boardMapper.addCnt(boardNum);
    //상세 정보 조회 쿼리
    return boardMapper.getBoard(boardNum);
  }

  @Override
  public void deleteBoard(int boardNum) {
    boardMapper.deleteBoard(boardNum);
  }

  @Override
  public int updateBoard(BoardDTO boardDTO) {
    return boardMapper.updateBoard(boardDTO);
  }


}

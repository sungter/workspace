package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;

import java.util.List;

public interface BoardService {

  //모든 정보 조회 기능
  public List<BoardDTO> getBoardList(SearchDTO searchDTO);

  //하나의 정보 추가 기능
  public int regBoard(BoardDTO boardDTO);

  //하나의 정보 조회 기능
  public BoardDTO getBoard(int boardNum);

  //한개의 정보 삭제 기능
  public void deleteBoard(int boardNum);

  //정보 수정 기능
  public int updateBoard(BoardDTO boardDTO);


}

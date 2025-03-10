package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

  //모든 정보 조회 쿼리
  public List<BoardDTO> getBoardList(SearchDTO searchDTO);

  //하나의 정보 추가 쿼리
  public int regBoard(BoardDTO boardDTO);

  //하나의 정보 조회 쿼리
  public BoardDTO getBoard(int boardNum);

  //한개의 정보 삭제 쿼리
  public void deleteBoard(int boardNum);

  //정보 수정 쿼리
  public int updateBoard(BoardDTO boardDTO);

  //READ_CNT 증가 쿼리
  public void addCnt(int boardNum);
}

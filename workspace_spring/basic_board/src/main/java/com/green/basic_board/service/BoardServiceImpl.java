package com.green.basic_board.service;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//서비스 클래스에서 어노테이션
@Service
public class BoardServiceImpl implements BoardService{
  private BoardMapper boardMapper;

  //생성자 주입(DI)
  @Autowired
  public BoardServiceImpl(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }


  //게시글 목록 조회 기능 실행 메서드
  @Override
  public List<BoardDTO> selectBoardList() {
    System.out.println("게시글 조회를 시작합니다.");
    //게시글 목록 조회 쿼리 실행
    List<BoardDTO> boardList = boardMapper.selectBoardList();
    System.out.println("게시글 조회를 완료했습니다.");
    return boardList;
  }

  //하나의 게시글 조회 기능 실행 메서드
  @Override
  public BoardDTO getBoard(int boardNum) {
    //게시글 하나 조회 쿼리 실행
    return boardMapper.getBoard(boardNum);
  }

  //게시글 등록 기능 메서드
  @Override
  public int insertBoard(BoardDTO boardDTO) {
    return boardMapper.insertBoard(boardDTO);
  }


}

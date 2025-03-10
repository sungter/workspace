package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService;

  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

  @GetMapping("")
  public List<BoardDTO> getBoardList(SearchDTO searchDTO){
    return boardService.getBoardList(searchDTO);
  }

  @PostMapping("")
  public int insertBoard(@RequestBody BoardDTO boardDTO){
    return boardService.regBoard(boardDTO);
  }

  @GetMapping("/{boardNum}")
  public BoardDTO getBoard(@PathVariable("boardNum") int boardNum){
    return boardService.getBoard(boardNum);
  }

  @DeleteMapping("/{boardNum}")
  public void deleteBoard(@PathVariable("boardNum") int boardNum){
    boardService.deleteBoard(boardNum);
  }

  @PutMapping("")
  public int updateBoard(@RequestBody BoardDTO boardDTO){
    return boardService.updateBoard(boardDTO);
  }

}

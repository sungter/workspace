package com.green.rest.controller;

import com.green.rest.dto.BoardDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/boards")
public class BoardController {

  //1. 모든 게시글을 조회하는 기능을 제공하는 REST API
  @GetMapping("")
  public void getBoardList(){
    //@Slf4j를 사용해 log.info를 쓰면 출력문과 다르게 로그 기록 저장됨
    log.info("게시글 목록 조회");
  }

  //2. 하나의 게시글 정보를 조회하는 기능을 제공하는 REST API
  @GetMapping("/{boardNum}")
  public void getBoard(@PathVariable("boardNum") int boardNum){
    log.info("게시글 하나 정보 조회");
    log.info("boardNum = " + boardNum);
  }

  //3. 하나의 게시글을 등록하는 기능을 제공하는 REST API
  @PostMapping("")
  public void postBoard(@RequestBody BoardDTO boardDTO){
    log.info("게시글 정보 삽입");
    log.info(boardDTO.toString());
  }

}

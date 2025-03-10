package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.ReplyDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.dto.TestDTO;
import com.green.board.service.ReplyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/replys")
public class ReplyController {
  private ReplyService ReplyService;

  public ReplyController(ReplyService ReplyService){
    this.ReplyService = ReplyService;
  }

  @GetMapping("/{boardNum}")
  public List<ReplyDTO> selectReplyList(@PathVariable("boardNum") int boardNum){
    return ReplyService.selectReplyList(boardNum);
  }

  @PostMapping("")
  public void insertReply(@RequestBody ReplyDTO replyDTO){
    ReplyService.insertReply(replyDTO);
  }

  @DeleteMapping("/{replyNum}")
  public void deleteReply(@PathVariable("replyNum") int replyNum){
    ReplyService.deleteReply(replyNum);
  }


  /// query string 연습////////////////////////////////////////////////////////////
  //query string 방식으로 데이터를 받는 방식 2개
  // 방법 1
//  @GetMapping("/test")
//  public void test(@RequestParam("age") int age, @RequestParam("name") String name){
//    System.out.println("age = " + age);
//    System.out.println("name = " + name);
//  }

  //방법 2 -> 새로운 객체 TestDTO 생성 후 같은 변수명을 가진 변수 선언 후 매개변수 입력
  @GetMapping("/test")
  public void test(TestDTO testDTO){
    System.out.println(testDTO);
  }

  /// /////////////////////////////////////////////////////////////////////////////
//  @GetMapping("/search")
//  public List<BoardDTO> searchData(SearchDTO searchDTO){
//    return ReplyService.searchData(searchDTO);
//  }
}

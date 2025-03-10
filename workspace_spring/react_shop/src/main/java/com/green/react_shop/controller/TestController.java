package com.green.react_shop.controller;

import com.green.react_shop.dto.BoardDTO;
import com.green.react_shop.dto.EmpDTO;
import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
  private final TestService testService;

  @GetMapping("/1")
  public List<EmpDTO> getEmpList(){
    return testService.getEmpList();
  }

  @GetMapping("/2")
  public List<BoardDTO> getBoardList(){
    return testService.getBoardList();
  }

  @GetMapping("/{boardNum}")
  public BoardDTO getBoard(@PathVariable("boardNum") int boardNum){
    return testService.getBoard(boardNum);
  }

  @GetMapping("/3")
  public List<BoardDTO> joinList(){
    return testService.joinList();
  }

  @GetMapping("/4")
  public List<OrderDTO> getOrderList(){
    return testService.getOrderList();
  }

}




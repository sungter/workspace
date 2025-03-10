package com.green.react_shop.service;

import com.green.react_shop.dto.BoardDTO;
import com.green.react_shop.dto.EmpDTO;
import com.green.react_shop.dto.OrderDTO;

import java.util.List;

public interface TestService {
  public List<EmpDTO> getEmpList();

  public List<BoardDTO> getBoardList();

  public BoardDTO getBoard(int boardNum);

  public List<BoardDTO> joinList();

  public List<OrderDTO> getOrderList();

}

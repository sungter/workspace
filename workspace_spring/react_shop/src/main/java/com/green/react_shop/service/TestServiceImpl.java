package com.green.react_shop.service;

import com.green.react_shop.dto.BoardDTO;
import com.green.react_shop.dto.EmpDTO;
import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
  private final TestMapper testMapper;

  @Override
  public List<EmpDTO> getEmpList() {
    return testMapper.getEmpList();
  }

  @Override
  public List<BoardDTO> getBoardList() {
    return testMapper.getBoardList();
  }

  @Override
  public BoardDTO getBoard(int boardNum) {
    return testMapper.getBoard(boardNum);
  }

  @Override
  public List<BoardDTO> joinList() {
    return testMapper.joinList();
  }

  @Override
  public List<OrderDTO> getOrderList() {
    return testMapper.getOrderList();
  }


}

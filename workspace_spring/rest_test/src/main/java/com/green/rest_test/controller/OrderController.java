package com.green.rest_test.controller;

import com.green.rest_test.dto.OrderDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

  @GetMapping("")
  public List<OrderDTO> getOrderList(){
    System.out.println("모든 주문정보를 조회");
    List<OrderDTO> orderList= new ArrayList<>();
    orderList.add(new OrderDTO(101, "데님 청바지", 15000, 2, "aaa"));
    orderList.add(new OrderDTO(102, "맨투맨 반팔 티셔츠", 10000, 3, "bbb"));
    orderList.add(new OrderDTO(103, "오버핏 니트", 25000, 2, "ccc"));
    orderList.add(new OrderDTO(104, "롱 패딩", 55000, 1, "ddd"));
    orderList.add(new OrderDTO(105, "맨투맨 긴팔 티셔츠", 12000, 3, "eee"));

    return orderList;
  }

  @GetMapping("/{itemNum}")
  public void getItem(@PathVariable("itemNum") int itemNum){
    System.out.println("하나의 주문정보 조회");
  }

  @PostMapping("")
  public void insertItem(@RequestBody OrderDTO orderDTO){
    System.out.println("하나의 주문정보 등록");
  }

  @DeleteMapping("/{itemNum}")
  public void deleteItem(@PathVariable("itemNum") int itemNum){
    System.out.println("하나의 주문정보 삭제");
  }

  @PutMapping("/{itemNum}")
  public void updateItem(@RequestBody OrderDTO orderDTO, @PathVariable("itemNum") int itemNum){
    System.out.println("하나의 주문정보 수정");
  }

}

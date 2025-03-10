package com.green.react_shop.service;

import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.dto.ShopItemDTO;

import java.util.List;

public interface OrderService {
  //주문시 상품 정보를 가져가는 기능
  public ShopItemDTO getOrderItem(String itemName);

  //주문 정보 등록 기능
  public void insertOrder(OrderDTO orderDTO);

  //주문 리스트 조회 기능
  public List<OrderDTO> getOrderList();

  //주문 삭제 기능
  public void deleteOrder(int orderNum);
}

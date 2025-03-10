package com.green.react_shop.service;

import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.dto.ShopItemDTO;
import com.green.react_shop.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
  private OrderMapper orderMapper;

  public OrderServiceImpl(OrderMapper orderMapper){
    this.orderMapper = orderMapper;
  }

  @Override
  public ShopItemDTO getOrderItem(String itemName) {
    return orderMapper.getOrderItem(itemName);
  }

  @Override
  public void insertOrder(OrderDTO orderDTO) {
    orderMapper.insertOrder(orderDTO);
  }

  @Override
  public List<OrderDTO> getOrderList() {
    return orderMapper.getOrderList();
  }

  @Override
  public void deleteOrder(int orderNum) {
    orderMapper.deleteOrder(orderNum);
  }
}

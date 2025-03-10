package com.green.react_shop.mapper;

import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.dto.ShopItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

  //주문시 상품 정보를 가져가는 쿼리
  public ShopItemDTO getOrderItem(String itemName);

  //주문 정보 등록 쿼리
  public void insertOrder(OrderDTO orderDTO);

  //주문 리스트 조회 쿼리
  public List<OrderDTO> getOrderList();

  //주문 삭제 쿼리
  public void deleteOrder(int orderNum);

}

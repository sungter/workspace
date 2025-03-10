package com.green.rest_test.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDTO {
  private int itemNum;
  private String itemName;
  private int itemPrice;
  private int itemCnt;
  private String id;

  public OrderDTO(){}

  public OrderDTO(int itemNum, String itemName, int itemPrice, int itemCnt, String id) {
    this.itemNum = itemNum;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.itemCnt = itemCnt;
    this.id = id;

  }

}

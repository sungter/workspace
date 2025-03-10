package com.green.react_shop.service;

import com.green.react_shop.dto.ShopItemDTO;

import java.util.List;

public interface ShopService {

  //모든 상품 리스트 조회 쿼리
  public List<ShopItemDTO> selectItemList();

  //상품 한 개 조회 쿼리
  public ShopItemDTO selectItem(int itemNum);

  //상품 등록 쿼리
  public void insertItem(ShopItemDTO shopItemDTO);

  //상품 정보 수정 쿼리
  public void updateItem(ShopItemDTO shopItemDTO);

  //상품 삭제 쿼리
  public void deleteItem(int itemNum);

}

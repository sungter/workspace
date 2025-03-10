package com.green.react_shop.mapper;

import com.green.react_shop.dto.ShopItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopMapper {

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

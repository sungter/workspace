package com.green.shop.service;

import com.green.shop.dto.ShopDTO;

import java.util.List;

//핵심 기능을 정의한 인터페이스 (= 쿼리 작업하는 기능을 정의)
public interface ShopService {
  //아이템 등록 기능 실행 코드
  public int insertItem(ShopDTO shopDTO);


  //모든 상품의 번호,상품명,가격,등록일 조회 기능 실행 코드
  public List<ShopDTO> selectShopList();

  //상품 하나의 모든 컬럼 조회 기능 실행 코드
  public ShopDTO selectItem(int itemCode);

  //상품 하나의 컬럼 삭제 기능 실행 코드
  public int deleteItem(int itemCode);

  //상품 하나의 정보 변경하는 기능 실행 코드
  public int updateItem(ShopDTO shopDTO);

}

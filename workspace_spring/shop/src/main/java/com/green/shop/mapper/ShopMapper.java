package com.green.shop.mapper;

import com.green.shop.dto.ShopDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopMapper {
  //아이템 등록 쿼리 실행 코드
  public int insertItem(ShopDTO shopDTO);

  //모든 상품의 번호,상품명,가격,등록일 조회 쿼리 실행 코드
  public List<ShopDTO> selectShopList();

  //상품 하나의 모든 컬럼 조회 쿼리 실행 코드
  public ShopDTO selectItem(int itemCode);

  //상품 하나의 컬럼 삭제 쿼리 실행 코드
  public int deleteItem(int itemCode);

  //상품 하나의 정보 변경하는 쿼리 실행 코드
  public int updateItem(ShopDTO shopDTO);


}

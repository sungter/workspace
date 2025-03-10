package com.green.shop.service;

import com.green.shop.dto.ShopDTO;
import com.green.shop.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//핵심 기능 구현
//핵심 기능은 현재 쿼리 실행과 같다.
//-> 쿼리 실행을 위해서는 ShopMapper인터페이스의 객체가 있어야한다.
@Service
public class ShopServiceImpl implements ShopService{

  private ShopMapper shopMapper;

  @Autowired //안써도됨 1개뿐이라
  public ShopServiceImpl(ShopMapper shopMapper){
    this.shopMapper = shopMapper;
  }

  //아이템 등록 쿼리 실행 코드
  @Override
  public int insertItem(ShopDTO shopDTO) {
    return shopMapper.insertItem(shopDTO);
  }

  @Override
  public List<ShopDTO> selectShopList() {
    return shopMapper.selectShopList();
  }

  @Override
  public ShopDTO selectItem(int itemCode) {
    return shopMapper.selectItem(itemCode);
  }

  @Override
  public int deleteItem(int itemCode) {
    return shopMapper.deleteItem(itemCode);
  }

  @Override
  public int updateItem(ShopDTO shopDTO) {
    return shopMapper.updateItem(shopDTO);
  }


}

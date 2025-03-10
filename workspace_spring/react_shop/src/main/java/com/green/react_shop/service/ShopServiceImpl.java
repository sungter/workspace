package com.green.react_shop.service;

import com.green.react_shop.dto.ShopItemDTO;
import com.green.react_shop.mapper.ShopMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
  private ShopMapper shopMapper;

  public ShopServiceImpl(ShopMapper shopMapper){
    this.shopMapper = shopMapper;
  }

  @Override
  public List<ShopItemDTO> selectItemList() {
    return shopMapper.selectItemList();
  }

  @Override
  public ShopItemDTO selectItem(int itemNum) {
    return shopMapper.selectItem(itemNum);
  }

  @Override
  public void insertItem(ShopItemDTO shopItemDTO) {
    shopMapper.insertItem(shopItemDTO);
  }

  @Override
  public void updateItem(ShopItemDTO shopItemDTO) {
    shopMapper.updateItem(shopItemDTO);
  }

  @Override
  public void deleteItem(int itemNum) {
    shopMapper.deleteItem(itemNum);
  }


}

package com.green.shop.controller;

import com.green.shop.dto.ShopDTO;
import com.green.shop.service.ShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {
  private ShopService shopService;

  public ShopController(ShopService shopService){
    this.shopService = shopService;
  }

  //(POST) localhost:8080/shop
  @PostMapping("")
  public int insertItem(@RequestBody ShopDTO shopDTO){
    return shopService.insertItem(shopDTO);
  }

  @GetMapping("")
  public List<ShopDTO> selectShopList(){
    return shopService.selectShopList();
  }

  @GetMapping("/{itemCode}")
  public ShopDTO selectItem(@PathVariable("itemCode") int itemCode){
    return shopService.selectItem(itemCode);
  }

  @DeleteMapping("/{itemCode}")
  public int deleteItem(@PathVariable("itemCode") int itemCode){
    return shopService.deleteItem(itemCode);
  }

  //업데이트 2가지 방법 => post는 옛날에 쓴 방식, put은 REST문법
  @PutMapping("/{itemCode}")
  public int updateItem(@RequestBody ShopDTO shopDTO, @PathVariable("itemCode") int itemCode){
    shopDTO.setItemCode(itemCode);
    return shopService.updateItem(shopDTO);
  }

  @PostMapping("/update")
  public int updateItem2(@RequestBody ShopDTO shopDTO){
    return shopService.updateItem(shopDTO);
  }

}

package com.green.react_shop.controller;

import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.dto.ShopItemDTO;
import com.green.react_shop.service.OrderService;
import com.green.react_shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {

  //상품 정보 기능
  private final ShopService shopService;

  //주문하기 기능
  private final OrderService orderService;

  @Autowired
  public ShopController(ShopService shopService , OrderService orderService){
    this.shopService = shopService;
    this.orderService = orderService;
  }




  @GetMapping("")
  public List<ShopItemDTO> selectItemList(){
    return shopService.selectItemList();
  }

  @GetMapping("/{itemNum}")
  public ShopItemDTO selectItem(@PathVariable("itemNum") int itemNum){
    return shopService.selectItem(itemNum);
  }

  @PostMapping("")
  public void insertItem(@RequestBody ShopItemDTO shopItemDTO){
    shopService.insertItem(shopItemDTO);
  }

  @PutMapping("/{itemNum}")
  public void updateItem(@RequestBody ShopItemDTO shopItemDTO , @PathVariable("itemNum") int itemNum){
    shopService.updateItem(shopItemDTO);
  }

  @DeleteMapping("/{itemNum}")
  public void deleteItem(@PathVariable("itemNum") int itemNum){
    shopService.deleteItem(itemNum);
  }

  /// order 파트//////////////////////////////////////////////////////////////////////////////////////////
  @GetMapping("/order/{itemName}")
  public ShopItemDTO getOrderItem(@PathVariable("itemName") String itemName){
    return orderService.getOrderItem(itemName);
  }

  @PostMapping("/order")
  public void insertOrder(@RequestBody OrderDTO orderDTO , @RequestParam("itemPrice") int itemPrice){
    orderDTO.setBuyPrice(orderDTO.getBuyCnt() * itemPrice);
    orderService.insertOrder(orderDTO);
  }

  @GetMapping("/order")
  public List<OrderDTO> getOrderList(){
    return orderService.getOrderList();
  }

  @PostMapping("/sumPrice")
  public int sumBuyPrice(@RequestBody OrderDTO[] orderDTOS){
    int sum = 0;
    for (int i = 0 ; i < orderDTOS.length ; i++){
      sum = sum + orderDTOS[i].getBuyPrice();
    }
    return sum;
  }

  @DeleteMapping("")
  public void deleteOrder(@RequestParam("orderNum") int orderNum){
    orderService.deleteOrder(orderNum);
  }

}

package com.green.rest.controller;

import com.green.rest.dto.ItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@Slf4j
public class ItemController {

  @GetMapping("")
  public void getItemList(){
    log.info("itemList 출력 기능");
  }

  @GetMapping("/{itemCode}")
  public void getItem(@PathVariable("itemCode") int itemCode){
    log.info("item 한 개 정보만 출력");
  }

  @PutMapping("/{itemCode}")
  public void putItem(@PathVariable("itemCode") int itemCode, @RequestBody ItemDTO itemDTO){
    log.info("" + itemCode);
    log.info(itemDTO.toString());
  }

  @DeleteMapping("/{itemCode}")
  public void deleteItem(@PathVariable("itemCode") int itemCode){
    log.info("" + itemCode);
  }
}

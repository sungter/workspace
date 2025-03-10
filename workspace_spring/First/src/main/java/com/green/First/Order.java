package com.green.First;

public class Order {
  private int productNum;
  private String productName;
  private int price;
  private int number;
  private String id;
  private int sumPrice;

  public Order(int productNum, String productName, int price, int number, String id) {
    this.productNum = productNum;
    this.productName = productName;
    this.price = price;
    this.number = number;
    this.id = id;
    setSumPrice((price * number));
  }

  public int getProductNum() {
    return productNum;
  }

  public void setProductNum(int productNum) {
    this.productNum = productNum;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getSumPrice() {
    return sumPrice;
  }

  public void setSumPrice(int sumPrice) {
    this.sumPrice = sumPrice;
  }
}

package com.green.First;

//DTO : Data Transfer Object
//react에서 객체로 데이터를 받을때 사용
public class PhoneDTO {
  private String brand;
  private int price;
  private String color;

  @Override
  public String toString() {
    return "PhoneDTO{" +
            "brand='" + brand + '\'' +
            ", price=" + price +
            ", color='" + color + '\'' +
            '}';
  }

  public PhoneDTO(String brand, int price, String color) {
    this.brand = brand;
    this.price = price;
    this.color = color;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}

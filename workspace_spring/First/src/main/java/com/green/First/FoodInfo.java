package com.green.First;

public class FoodInfo {
  private String foodName;
  private int foodCnt;
  private String foodSum;
  private String etc;
  private String date;

  @Override
  public String toString() {
    return "FoodInfo{" +
            "foodName='" + foodName + '\'' +
            ", foodCnt=" + foodCnt +
            ", foodSum='" + foodSum + '\'' +
            ", etc='" + etc + '\'' +
            ", date='" + date + '\'' +
            '}';
  }

  public FoodInfo(String foodName, int foodCnt, String foodSum, String etc, String date) {
    this.foodName = foodName;
    this.foodCnt = foodCnt;
    this.foodSum = foodSum;
    this.etc = etc;
    this.date = date;
  }

  public String getFoodName() {
    return foodName;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }

  public int getFoodCnt() {
    return foodCnt;
  }

  public void setFoodCnt(int foodCnt) {
    this.foodCnt = foodCnt;
  }

  public String getFoodSum() {
    return foodSum;
  }

  public void setFoodSum(String foodSum) {
    this.foodSum = foodSum;
  }

  public String getEtc() {
    return etc;
  }

  public void setEtc(String etc) {
    this.etc = etc;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}

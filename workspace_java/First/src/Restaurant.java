public class Restaurant {
  private String addr;
  private Cookable chef = new Chef();

  public void takeOrder(){
    chef.cook(); //결합도가 높음, 메서드명을 바꿀때 쉐프도 같이 바꿔야함.
  }

}

public class Result_2 {
  public static void main(String[] args) {
    int[] num = new int[6];

    for (int i = 0 ; i < num.length ; i++){
      num[i] = (int)((Math.random() * 45) + 1);
      System.out.print(num[i] + " ");
    }


  }
}

package practice;

public class 문제_1_20 {
  public static void main(String[] args) {

    int[] arr = new int[99];


    String clap1 = "박수 한번";
    String clap2 = "박수 두번";


    for (int i = 0; i < arr.length; i++){
      arr[i] = i + 1;
    }


    int cnt = 0;


    for (int i = 0; i < arr.length; i++){

      if( (arr[i] / 10) == 3  || (arr[i] / 10)  == 6 || (arr[i] / 10) == 9 ){
        cnt++;
      }

      if ( (arr[i] % 10) == 3  || (arr[i] % 10) == 6  || (arr[i] % 10) == 9 ){
        cnt++;
      }


      switch (cnt){
        case 1:
          System.out.println((i+1) + " = " + clap1);
          break;
        case 2:
          System.out.println((i+1) + " = " + clap2);
          break;
      }

      cnt = 0;

    }


  }
}

package com.bit.javaex.practice02;

public class Problem01 {
   
   public static void Problem01() {
      
      int data[] = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
      int sum = 0;
      int gesu = 0;
      for(int i=0; i<data.length; i++) {
         
         if( data[i] % 3 == 0) {
            gesu ++;         
            sum += data[i];
         }
      }
      System.out.println("주어진 배열에서 3의 배수의 개수 = " + gesu);
      System.out.println("주어진 배열에서 3의 배수의 합 = " + sum);
      
   }
   
   public static void main (String[] args) {
      
      Problem01();
   }

}

//   배열데이터를 이용해 3의 배수의 개수와 배수의 합을 출력하시오
//   int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31}
//   주어진 배열에서 3의 배수의 개수 = 6
//   주어진 배열에서 3의 배수의 합 = 108
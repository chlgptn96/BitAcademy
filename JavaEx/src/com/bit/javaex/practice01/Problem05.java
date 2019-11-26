package com.bit.javaex.practice01;

import java.util.Scanner;

public class Problem05 {
   
   public static void Problem05() {
      System.out.println("숫자를 입력하세요");
      int i[]= new int[5];
      Scanner scanner = new Scanner(System.in);
      for(int j=0; j<i.length; j++) {
         int num = scanner.nextInt(); 
          i[j] = num;
      }
      int a = 0;
      a = i[0];
      for(int b=1; b<i.length; b++) {
         if(a<i[b]) {
            a=i[b];
         }
         
      }
      
      
      System.out.println("최대값은"+a+"입니다.");
      scanner.close();
   }

   public static void main(String[] args) {
      Problem05();
   }

}
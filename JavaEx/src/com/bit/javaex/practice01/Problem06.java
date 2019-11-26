package com.bit.javaex.practice01;

import java.util.Scanner;

public class Problem06 {
   
   public static void Problem06() {
      
      System.out.println("숫자를 입력하세요");
      Scanner scanner = new Scanner(System.in);
      int r = scanner.nextInt(); // r = result 10
      int answer=0;
      
      for (int i=1; i<=r; i++) {
         if(r%2==0) {
            if(i%2==0) {
               answer +=i;
            }
         }else {
            if(i%2==1) {
               answer +=i;
            }   
         }
         
      }
      System.out.println(answer);
      scanner.close();
   }

   public static void main(String[] args) {
      Problem06();
   }

}

//   등차수열  : 첫째항 + (n-1)공차 
//   등차수열 합 : (1/2)항수*(첫째항+끝항)
//   짝수면 입력한 숫자까지 나오는 짝수 모두 더하기
//   홀수면 입력한 숫자까지 나오는 홀수 모두 더하기
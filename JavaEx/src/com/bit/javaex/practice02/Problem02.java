package com.bit.javaex.practice02;
import java.util.Scanner;

public class Problem02 {
   public static void Problem02() {
      
      int five[] = new int [5];
      double sum=0;
      double average=0;
      Scanner scanner = new Scanner(System.in);
      for(int i = 0; i<five.length; i++) {
         double a = scanner.nextInt();
         sum += a;
         average = sum/five.length;
      }
      System.out.println("평균은 " + average + "입니다.");
      scanner.close();
      
   }

   public static void main(String[] args) {
      Problem02();

   }

}

//   5개의 숫자를 키보드로 입력받아 배열에 저장한 후, 평균을 구하는 프로그램



package com.bit.javaex.practice01;


import java.util.Scanner;

public class Problem08 {

   public static void Problem08() {

      int money = 0;
      int sum = 0;

      Scanner scanner = new Scanner(System.in);
      while (true) {
         System.out.println("------------------------------");
         System.out.println("1. 예금 : 2.출금 : 3. 잔고 : 4. 종료");
         System.out.println("------------------------------");
         System.out.println("선택 >>");
         int choice = scanner.nextInt();
         if(choice == 1) {
            System.out.println("예금액  :  ");
            money = scanner.nextInt();
            sum += money;
            
         }else if(choice == 2) {
            System.out.println("출금액  :  ");
            money = scanner.nextInt();
            sum -= money;
            
         }else if(choice == 3 ) {
            System.out.println("잔고액  :  " + sum);
            
         }else if (choice == 4) {
            System.out.println("프로그램 종료");
            break;
         }else {
            System.out.println("다시 입력해주세요");
            
         }
      }

   }

   public static void main(String[] args) {
      Problem08();

   }

}